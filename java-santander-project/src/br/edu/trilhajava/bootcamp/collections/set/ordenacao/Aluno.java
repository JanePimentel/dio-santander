package br.edu.trilhajava.bootcamp.collections.set.ordenacao;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long numeroMatricula;
    private double nota;

    public Aluno(String nome, long numeroMatricula, double nota) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareTo(o.getNome());
    }
    // Getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public long getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "nome ='" + nome + '\'' +
                ", matrícula =" + numeroMatricula +
                ", nota =" + nota +
                '}';
    }

    //Garantir que nao seja inserido aluno com a mesma matricula
    @Override
    public int hashCode() {
        return Objects.hash(getNumeroMatricula());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) obj;
        return this.numeroMatricula == other.numeroMatricula;
    }
}
