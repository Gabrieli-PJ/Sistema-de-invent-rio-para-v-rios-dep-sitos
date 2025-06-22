package utils;

import java.util.HashMap;
import java.util.Map;

public class EstoqueUtils {
    private static final Map<String, Integer> estoque = new HashMap<>();

    static {
        estoque.put("P123", 100);
        estoque.put("P456", 50);
        estoque.put("P789", 75);
    }

    public static synchronized boolean verificarDisponibilidade(String produtoId, int quantidade) {
        return estoque.getOrDefault(produtoId, 0) >= quantidade;
    }

    public static synchronized int consultarEstoque(String produtoId) {
        return estoque.getOrDefault(produtoId, 0);
    }

    public static synchronized void removerDoEstoque(String produtoId, int quantidade) {
        estoque.put(produtoId, estoque.getOrDefault(produtoId, 0) - quantidade);
    }

    public static synchronized void adicionarAoEstoque(String produtoId, int quantidade) {
        estoque.put(produtoId, estoque.getOrDefault(produtoId, 0) + quantidade);
    }

    public static synchronized Map<String, Integer> listarEstoque() {
        return new HashMap<>(estoque);
    }
}
