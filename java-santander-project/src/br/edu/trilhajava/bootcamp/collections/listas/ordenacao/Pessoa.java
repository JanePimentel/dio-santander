package br.edu.trilhajava.bootcamp.collections.listas.ordenacao;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa o) {
       return Integer.compare(idade, o.getIdade());
    }

    public Double getAltura() {
        return altura;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "\nLivro{" +
        "nome='" + nome + '\'' +
        ", idade =" + idade +
        ", altura = " + altura +
        '}';     
    }

 

 
}
