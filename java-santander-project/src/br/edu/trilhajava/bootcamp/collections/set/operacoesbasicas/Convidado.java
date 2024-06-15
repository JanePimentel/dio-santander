package br.edu.trilhajava.bootcamp.collections.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    @Override
    public String toString() {
        return "\nConvidado{" +
                "nome ='" + nome + '\'' +
                ", Código Convite =" + codConvite +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Convidado)) {
            return false;
        }
        Convidado other = (Convidado) obj;
        return this.codConvite == other.codConvite;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub 
        return Objects.hash(getCodConvite());
    }

}
