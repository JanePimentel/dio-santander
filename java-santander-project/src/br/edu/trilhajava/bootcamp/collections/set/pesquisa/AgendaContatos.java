package br.edu.trilhajava.bootcamp.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero) {
        Contato novoContato = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                novoContato = c;
                break;
            }
        }
        return novoContato;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João", "87 98123456");
        agendaContatos.adicionarContato("Maria", "81 989654321");
        agendaContatos.adicionarContato("Pedro", "87 98123456");
        agendaContatos.adicionarContato("Ana", "87 98123456");
        agendaContatos.adicionarContato("Lucas", "87 98123456");
        agendaContatos.adicionarContato("João", "87 98123456"); 
        agendaContatos.adicionarContato("José", "87 97777456");
        agendaContatos.adicionarContato("Joca", "87 98123456");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Jo"));
        System.out.println(agendaContatos.atualizarNumeroContato("Maria","87 98888-4573"));
        agendaContatos.exibirContatos();
    }
}
