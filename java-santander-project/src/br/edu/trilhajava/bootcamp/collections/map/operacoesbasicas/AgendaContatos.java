package br.edu.trilhajava.bootcamp.collections.map.operacoesbasicas;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatos.isEmpty()) {
            contatos.remove(nome);
        } else {
            System.out.println("Agenda vazia");
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!contatos.isEmpty()) {
            return contatos.get(nome);
        } 
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456);    
        agenda.adicionarContato("Maria", 987654);
        agenda.exibirContatos();
        agenda.removerContato("João");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Maria"));
        System.out.println(agenda.pesquisarPorNome("João"));
    }
}
