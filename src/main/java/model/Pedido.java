package model;

public class Pedido {
    private String produtoId;
    private int quantidade;

    public Pedido(String produtoId, int quantidade) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
