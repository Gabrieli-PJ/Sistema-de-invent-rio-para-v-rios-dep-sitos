package model;

import utils.EstoqueUtils;

public class Produto {
    private String id;
    private String nome;

    public Produto(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return EstoqueUtils.consultarEstoque(this.id);
    }
}
