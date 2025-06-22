package warehouse;

import java.util.HashMap;
import java.util.Map;

import inventario.Inventario.AtualizacaoRequest;
import inventario.Inventario.AtualizacaoResponse;
import inventario.Inventario.CargaRequest;
import inventario.Inventario.CargaResponse;
import inventario.Inventario.EstoqueRequest;
import inventario.Inventario.EstoqueResponse;
import inventario.WarehouseGrpc.WarehouseImplBase;
import io.grpc.stub.StreamObserver;

public class WarehouseServiceImpl extends WarehouseImplBase {

    private final String nomeDeposito;
    private final Map<String, Integer> estoque;

    public WarehouseServiceImpl(String nomeDeposito) {
        this.nomeDeposito = nomeDeposito;
        this.estoque = new HashMap<>();

        switch (nomeDeposito) {
            case "Deposito1":
                estoque.put("P123", 100);
                estoque.put("P456", 50);
                break;
            case "Deposito2":
                estoque.put("P123", 60);
                estoque.put("P456", 80);
                estoque.put("P789", 40);
                break;
            default:
                throw new IllegalArgumentException("Depósito desconhecido: " + nomeDeposito);
        }
    }

    @Override
    public void verificarEstoque(EstoqueRequest request, StreamObserver<EstoqueResponse> responseObserver) {
        int quantidadeAtual = estoque.getOrDefault(request.getProdutoId(), 0);
        boolean disponivel = quantidadeAtual >= request.getQuantidadeDesejada();

        EstoqueResponse response = EstoqueResponse.newBuilder()
                .setDisponivel(disponivel)
                .setQuantidadeAtual(quantidadeAtual)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void atualizarEstoque(AtualizacaoRequest request, StreamObserver<AtualizacaoResponse> responseObserver) {
        String produtoId = request.getProdutoId();
        int quantidadeAtual = estoque.getOrDefault(produtoId, 0);
        int novaQuantidade = quantidadeAtual + request.getQuantidade();

        String mensagem;
        boolean sucesso;

        if (novaQuantidade < 0) {
            sucesso = false;
            mensagem = "Quantidade insuficiente no estoque para remover.";
        } else {
            estoque.put(produtoId, novaQuantidade);
            sucesso = true;
            mensagem = (request.getQuantidade() > 0 ? "[+]" : "[-]") +
                    " Estoque do produto " + produtoId + " atualizado. Quantidade atual: " + novaQuantidade + " no " + nomeDeposito;
        }

        AtualizacaoResponse response = AtualizacaoResponse.newBuilder()
                .setSucesso(sucesso)
                .setMensagem(mensagem)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void consultarCarga(CargaRequest request, StreamObserver<CargaResponse> responseObserver) {
        int cargaAtual = estoque.values().stream().mapToInt(Integer::intValue).sum();

        CargaResponse response = CargaResponse.newBuilder()
                .setCargaAtual(cargaAtual)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
