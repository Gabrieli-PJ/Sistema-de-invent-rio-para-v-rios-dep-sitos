package ordermanager;

import java.util.Scanner;

import inventario.Inventario.AtualizacaoRequest;
import inventario.Inventario.AtualizacaoResponse;
import inventario.Inventario.EstoqueRequest;
import inventario.Inventario.EstoqueResponse;
import inventario.Inventario.PedidoRequest;
import inventario.Inventario.PedidoResponse;
import inventario.OrderManagerGrpc;
import inventario.WarehouseGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class OrderClientSimulator {

    private static final Scanner scanner = new Scanner(System.in);

    private static WarehouseGrpc.WarehouseBlockingStub deposito1Stub;
    private static WarehouseGrpc.WarehouseBlockingStub deposito2Stub;

    public static void main(String[] args) {
        ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();

        deposito1Stub = WarehouseGrpc.newBlockingStub(channel1);
        deposito2Stub = WarehouseGrpc.newBlockingStub(channel2);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ver estoque de todos os depósitos");
            System.out.println("2 - Adicionar produto em um depósito");
            System.out.println("3 - Remover produto de um depósito");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    mostrarEstoque();
                    break;
                case "2":
                    atualizarEstoque(true);
                    break;
                case "3":
                	removerProduto();
                    break;
                case "0":
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void mostrarEstoque() {
        System.out.println("\n[Deposito1]");
        exibirEstoqueDeposito(deposito1Stub);
        System.out.println("\n[Deposito2]");
        exibirEstoqueDeposito(deposito2Stub);
    }

    private static void exibirEstoqueDeposito(WarehouseGrpc.WarehouseBlockingStub stub) {
        String[] produtos = {"P123", "P456", "P789"};
        String[] nomes = {"Teclado", "Mouse", "Monitor"};

        for (int i = 0; i < produtos.length; i++) {
            EstoqueRequest req = EstoqueRequest.newBuilder()
                .setProdutoId(produtos[i])
                .setQuantidadeDesejada(0)
                .build();
            EstoqueResponse resp = stub.verificarEstoque(req);
            System.out.printf("- %s (%s): %d unidades%n", nomes[i], produtos[i], resp.getQuantidadeAtual());
        }
    }

    private static void removerProduto() {
        System.out.print("Código do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Quantidade: ");
        int qtd = Integer.parseInt(scanner.nextLine());

        PedidoRequest request = PedidoRequest.newBuilder()
            .setProdutoId(codigo)
            .setQuantidade(qtd)
            .build();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        OrderManagerGrpc.OrderManagerBlockingStub stub = OrderManagerGrpc.newBlockingStub(channel);

        PedidoResponse response = stub.fazerPedido(request);

        System.out.printf("Pedido: %s | Depósito: %s%n", response.getMensagem(), response.getDepositoResponsavel());
        channel.shutdown();
    }

    private static void atualizarEstoque(boolean adicionar) {
        System.out.print("Código do produto: ");
        String codigo = scanner.nextLine();

        System.out.print("Quantidade: ");
        int qtd = Integer.parseInt(scanner.nextLine());
        if (!adicionar) qtd = -Math.abs(qtd);

        System.out.print("Depósito (1 ou 2): ");
        String deposito = scanner.nextLine();

        WarehouseGrpc.WarehouseBlockingStub stub = deposito.equals("1") ? deposito1Stub : deposito2Stub;

        AtualizacaoRequest request = AtualizacaoRequest.newBuilder()
            .setProdutoId(codigo)
            .setQuantidade(qtd)
            .build();

        AtualizacaoResponse response = stub.atualizarEstoque(request);

        String acao = adicionar ? "Adição" : "Remoção";
        System.out.printf("%s no depósito %s: %s%n", acao, deposito, response.getMensagem());
    }
}
