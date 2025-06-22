package ordermanager;

import inventario.Inventario.AtualizacaoRequest;
import inventario.Inventario.AtualizacaoResponse;
import inventario.Inventario.CargaRequest;
import inventario.Inventario.CargaResponse;
import inventario.Inventario.EstoqueRequest;
import inventario.Inventario.EstoqueResponse;
import inventario.Inventario.PedidoRequest;
import inventario.Inventario.PedidoResponse;
import inventario.OrderManagerGrpc;
import inventario.WarehouseGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class OrderManagerServiceImpl extends OrderManagerGrpc.OrderManagerImplBase {

    private final WarehouseGrpc.WarehouseBlockingStub deposito1Stub;
    private final WarehouseGrpc.WarehouseBlockingStub deposito2Stub;

    public OrderManagerServiceImpl() {
        ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();

        this.deposito1Stub = WarehouseGrpc.newBlockingStub(channel1);
        this.deposito2Stub = WarehouseGrpc.newBlockingStub(channel2);
    }

    @Override
    public void fazerPedido(PedidoRequest request, StreamObserver<PedidoResponse> responseObserver) {
        System.out.println("Recebido pedido: " + request.getProdutoId() + " x" + request.getQuantidade());

        EstoqueRequest estoqueReq = EstoqueRequest.newBuilder()
            .setProdutoId(request.getProdutoId())
            .setQuantidadeDesejada(request.getQuantidade())
            .build();

        EstoqueResponse resp1 = deposito1Stub.verificarEstoque(estoqueReq);
        EstoqueResponse resp2 = deposito2Stub.verificarEstoque(estoqueReq);

        WarehouseGrpc.WarehouseBlockingStub escolhido = null;
        String nomeDeposito = "";

        int estoque1 = resp1.getQuantidadeAtual();
        int estoque2 = resp2.getQuantidadeAtual();

        if (estoque1 >= request.getQuantidade() || estoque2 >= request.getQuantidade()) {
            if (estoque1 >= request.getQuantidade() && estoque1 >= estoque2) {
                escolhido = deposito1Stub;
                nomeDeposito = "Deposito1";
            } else {
                escolhido = deposito2Stub;
                nomeDeposito = "Deposito2";
            }

            AtualizacaoRequest atualizacaoReq = AtualizacaoRequest.newBuilder()
                .setProdutoId(request.getProdutoId())
                .setQuantidade(-request.getQuantidade()) // Remover
                .build();

            AtualizacaoResponse atualizacaoResp = escolhido.atualizarEstoque(atualizacaoReq);

            PedidoResponse response = PedidoResponse.newBuilder()
                .setSucesso(true)
                .setMensagem(atualizacaoResp.getMensagem())
                .setDepositoResponsavel(nomeDeposito)
                .build();

            responseObserver.onNext(response);
        } else {
            PedidoResponse response = PedidoResponse.newBuilder()
                .setSucesso(false)
                .setMensagem("Estoque insuficiente em todos os depósitos.")
                .setDepositoResponsavel("Nenhum")
                .build();

            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }


    @Override
    public void adicionarEstoque(AtualizacaoRequest request, StreamObserver<AtualizacaoResponse> responseObserver) {
        AtualizacaoResponse resp = deposito1Stub.atualizarEstoque(request);
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void removerEstoque(AtualizacaoRequest request, StreamObserver<AtualizacaoResponse> responseObserver) {
        AtualizacaoRequest remReq = AtualizacaoRequest.newBuilder()
                .setProdutoId(request.getProdutoId())
                .setQuantidade(-Math.abs(request.getQuantidade()))
                .build();

        AtualizacaoResponse resp = deposito1Stub.atualizarEstoque(remReq);
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
