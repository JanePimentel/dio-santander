package br.edu.trilhajava.bootcamp.collections.set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco,int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }


    public void exibirPorNome(){
        Set<Produto> ordenadoPorNome = new TreeSet<>(produtos);
        System.out.println("Produtos ordenados por nome: " + ordenadoPorNome);
    }
    
    //Hashset nao deixa organizar
    public void exibirPorPreco(){
        Set<Produto> ordenadoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        ordenadoPorPreco.addAll(produtos);
        System.out.println("Produtos ordenados por preco: " + ordenadoPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("TV", 1, 2245.78, 3);
        cadastroProdutos.adicionarProduto("Radio", 2, 1000.12, 5);
        cadastroProdutos.adicionarProduto("Notebook", 3, 6799.99, 2);
        cadastroProdutos.adicionarProduto("Mouse", 4, 89.90, 10);
        cadastroProdutos.adicionarProduto("Teclado", 5, 149.90, 8);
        cadastroProdutos.adicionarProduto("Monitor", 6, 789.90, 4);


        cadastroProdutos.exibirPorNome();
        cadastroProdutos.exibirPorPreco();

    }

}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}