package br.edu.trilhajava.bootcamp.collections.map.ordenacao;

public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "\nEvento{" +
        "Tipo ='" + nomeEvento + '\'' +
        ", Atração =" + nomeAtracao +
        '}';
    }

}
