package br.edu.trilhajava.bootcamp.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidados) {
            if (convidado.getCodConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        this.convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        // Adicionar convidados
        conjunto.adicionarConvidado("João", 123);
        conjunto.adicionarConvidado("Maria", 456);
        conjunto.adicionarConvidado("Pedro", 789);
        conjunto.adicionarConvidado("Lucas", 123);

        // Exibir convidados
        conjunto.exibirConvidados();

        // Remover convidado por código de convite
        conjunto.removerConvidadoPorCodigoConvite(456);

        System.out.println(conjunto.contarConvidados());

        // Exibir convidados atualizados
        conjunto.exibirConvidados();

    }

}
