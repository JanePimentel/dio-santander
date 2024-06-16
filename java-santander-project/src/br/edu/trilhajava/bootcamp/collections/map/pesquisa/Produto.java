package br.edu.trilhajava.bootcamp.collections.map.pesquisa;

public class Produto {
    private long cod;
    private String nome;
    private Integer quantidade;
    private Double preco;

    public Produto(long cod, String nome, Integer quantidade, Double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "nome ='" + nome + '\'' +
                ", codigo =" + cod +
                ", preco =" + preco +
                ", quantidade =" + quantidade +
                '}';
    }
}
