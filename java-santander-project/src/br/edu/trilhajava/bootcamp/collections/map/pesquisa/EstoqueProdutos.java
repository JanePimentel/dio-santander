package br.edu.trilhajava.bootcamp.collections.map.pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    Map<String, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtos.put(nome, new Produto(cod, nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque() {
        double total = 0.0;
        if (!produtos.isEmpty()) {
            for (Produto value : produtos.values()) {
                total += value.getPreco() * value.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto maisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtos.isEmpty()) {
            for (Produto value : produtos.values()) {
                if (value.getPreco() > maiorPreco) {
                    maiorPreco = value.getPreco();
                    maisCaro = value;
                }
            }
        }

        return maisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        double preco = Double.MAX_VALUE;
        Produto maisBarato = null;
        for (Produto value : produtos.values()) {
            if (value.getPreco() < preco) {
                preco = value.getPreco();
                maisBarato = value;
            }
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!produtos.isEmpty()) {
            for (Map.Entry<String, Produto> entry : produtos.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1, "Produto 1", 10, 9.99);
        estoque.adicionarProduto(2, "Produto 2", 5, 19.99);
        estoque.adicionarProduto(3, "Produto 3", 15, 14.99);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());   
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro()); // Produto 3
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto de maior quantidade no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
