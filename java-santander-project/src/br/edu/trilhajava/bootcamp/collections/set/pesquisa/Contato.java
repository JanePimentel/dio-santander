package br.edu.trilhajava.bootcamp.collections.set.pesquisa;

import java.util.Objects;

import br.edu.trilhajava.bootcamp.collections.set.operacoesbasicas.Convidado;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nContato{" +
                "nome ='" + nome + '\'' +
                ", telefone =" + numero +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public boolean equals(Object obj) {
         if (obj == null || !(obj instanceof Contato)) {
            return false;
        }
        Contato other = (Contato) obj;
        return this.nome == other.nome;
    }



}
