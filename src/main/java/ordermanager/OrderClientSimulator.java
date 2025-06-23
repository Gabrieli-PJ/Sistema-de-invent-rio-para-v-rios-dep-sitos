package ordermanager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import inventario.Inventario.AtualizacaoRequest;
import inventario.Inventario.AtualizacaoResponse;
import inventario.Inventario.EstoqueRequest;
import inventario.Inventario.EstoqueResponse;
import inventario.Inventario.PedidoRequest;
import inventario.Inventario.PedidoResponse;
import inventario.Inventario.RelatorioTextoRequest;
import inventario.Inventario.RelatorioTextoResponse;
import inventario.OrderManagerGrpc;
import inventario.WarehouseGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class OrderClientSimulator {

    private static WarehouseGrpc.WarehouseBlockingStub stub1;
    private static WarehouseGrpc.WarehouseBlockingStub stub2;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagedChannel ch1 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        ManagedChannel ch2 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        stub1 = WarehouseGrpc.newBlockingStub(ch1);
        stub2 = WarehouseGrpc.newBlockingStub(ch2);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ver estoque e salvar relatório");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            switch (scanner.nextLine()) {
                case "1" -> mostrarEstoque(true);
                case "2" -> atualizarEstoque(true);
                case "3" -> removerProduto();
                case "0" -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private static void mostrarEstoque(boolean salvar) {
        System.out.println("\n[Deposito1]");
        exibir(stub1);
        System.out.println("\n[Deposito2]");
        exibir(stub2);

        if (salvar) salvarRelatorio(stub1, "Deposito1"); salvarRelatorio(stub2, "Deposito2");
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

    private static void exibir(WarehouseGrpc.WarehouseBlockingStub stub) {
        for (String pid : new String[]{"P123", "P456", "P789"}) {
            EstoqueResponse r = stub.verificarEstoque(EstoqueRequest.newBuilder().setProdutoId(pid).setQuantidadeDesejada(0).build());
            System.out.printf("- %s: %d unidades\n", pid, r.getQuantidadeAtual());
        }
    }

    private static void salvarRelatorio(WarehouseGrpc.WarehouseBlockingStub stub, String nome) {
        RelatorioTextoResponse resp = stub.exportarRelatorioTexto(RelatorioTextoRequest.newBuilder().build());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resp.getNomeArquivo()))) {
            writer.write(resp.getConteudo());
            System.out.printf("Relatório salvo: %s\n", resp.getNomeArquivo());
        } catch (IOException e) {
            System.out.println("Erro ao salvar relatório: " + e.getMessage());
        }
    }

    private static void atualizarEstoque(boolean add) {
        System.out.print("Produto ID: ");
        String id = scanner.nextLine();
        System.out.print("Quantidade: ");
        int qtd = Integer.parseInt(scanner.nextLine());
        if (!add) qtd = -Math.abs(qtd);
        System.out.print("Depósito (1 ou 2): ");
        WarehouseGrpc.WarehouseBlockingStub stub = scanner.nextLine().equals("1") ? stub1 : stub2;

        AtualizacaoResponse r = stub.atualizarEstoque(AtualizacaoRequest.newBuilder().setProdutoId(id).setQuantidade(qtd).build());
        System.out.println(r.getMensagem());
    }
}
