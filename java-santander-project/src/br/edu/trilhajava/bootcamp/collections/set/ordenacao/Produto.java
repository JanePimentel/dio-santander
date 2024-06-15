package br.edu.trilhajava.bootcamp.collections.set.ordenacao;

import java.util.Objects;

import br.edu.trilhajava.bootcamp.collections.set.operacoesbasicas.Convidado;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "nome ='" + nome + '\'' +
                ", codigo =" + codigo +
                ", preco =" + preco +
                ", quantidade =" + quantidade +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) obj;
        return this.codigo == other.codigo;
    }

}
