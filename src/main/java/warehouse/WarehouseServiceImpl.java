package warehouse;

import inventario.Inventario;
import inventario.Inventario.*;
import inventario.WarehouseGrpc.WarehouseImplBase;
import io.grpc.stub.StreamObserver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class WarehouseServiceImpl extends WarehouseImplBase {

    private final String nomeDeposito;
    private final Map<String, Integer> estoque;
    private final Deque<String> historico;

    public WarehouseServiceImpl(String nomeDeposito) {
        this.nomeDeposito = nomeDeposito;
        this.estoque = new HashMap<>();
        this.historico = new ArrayDeque<>();

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
        }
    }

    @Override
    public void verificarEstoque(EstoqueRequest request, StreamObserver<EstoqueResponse> responseObserver) {
        int atual = estoque.getOrDefault(request.getProdutoId(), 0);
        boolean disponivel = atual >= request.getQuantidadeDesejada();
        responseObserver.onNext(EstoqueResponse.newBuilder().setDisponivel(disponivel).setQuantidadeAtual(atual).build());
        responseObserver.onCompleted();
    }

    @Override
    public void atualizarEstoque(AtualizacaoRequest request, StreamObserver<AtualizacaoResponse> responseObserver) {
        String produtoId = request.getProdutoId();
        int atual = estoque.getOrDefault(produtoId, 0);
        int novo = atual + request.getQuantidade();
        String mensagem;
        boolean sucesso;

        if (novo < 0) {
            sucesso = false;
            mensagem = "Estoque insuficiente.";
        } else {
            estoque.put(produtoId, novo);
            sucesso = true;
            mensagem = String.format("[%s] %s: %d -> %d", nomeDeposito, produtoId, atual, novo);
            registrarHistorico(mensagem);
        }

        responseObserver.onNext(AtualizacaoResponse.newBuilder().setSucesso(sucesso).setMensagem(mensagem).build());
        responseObserver.onCompleted();
    }

    @Override
    public void consultarCarga(CargaRequest request, StreamObserver<CargaResponse> responseObserver) {
        int carga = estoque.values().stream().mapToInt(Integer::intValue).sum();
        responseObserver.onNext(CargaResponse.newBuilder().setCargaAtual(carga).build());
        responseObserver.onCompleted();
    }

    @Override
    public void exportarRelatorioTexto(RelatorioTextoRequest request, StreamObserver<RelatorioTextoResponse> responseObserver) {
        String nomeArquivo = nomeDeposito + "_relatorio.txt";
        StringBuilder relatorio = new StringBuilder();

        relatorio.append("=== Relatório de Estoque - ").append(nomeDeposito).append(" ===\n");
        estoque.forEach((produto, qtd) -> relatorio.append(String.format("- %s: %d unidades\n", produto, qtd)));

        relatorio.append("\n=== Últimas Modificações ===\n");
        historico.forEach(entry -> relatorio.append("- ").append(entry).append("\n"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write(relatorio.toString());
        } catch (IOException e) {
            responseObserver.onError(e);
            return;
        }

        responseObserver.onNext(RelatorioTextoResponse.newBuilder()
            .setNomeArquivo(nomeArquivo)
            .setConteudo(relatorio.toString())
            .build());
        responseObserver.onCompleted();
    }

    private void registrarHistorico(String msg) {
        if (historico.size() == 5) historico.removeFirst();
        historico.add(LocalDateTime.now() + " - " + msg);
    }
}