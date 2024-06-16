package br.edu.trilhajava.bootcamp.collections.map.operacoesbasicas;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String definicao) {
        if (!palavras.isEmpty()) {
            palavras.remove(definicao);
        } else {
            System.out.println("Dicionário vazio");
        }
    }

    // Exibe todas as palavras e suas definições do dicionário, mostrando cada
    // palavra seguida de sua respectiva definição.
    public void exibirPalavras() {
        System.out.println(palavras);
    }

    // Pesquise uma palavra no dicionário e retorna sua definição correspondente.
    public String pesquisarPorPalavra(String palavra) {
        String definicao = palavras.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Palavra não encontrada!";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Linguagem de programação");
        dicionario.adicionarPalavra("Python", "Linguagem de programação");
        dicionario.adicionarPalavra("C++", "Linguagem de programação");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Java"));
        dicionario.removerPalavra("Java");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Java"));

    }
}
