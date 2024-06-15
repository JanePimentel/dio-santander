package br.edu.trilhajava.bootcamp.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
            } else {
                System.out.println("A palavra " + palavra + " não existe no conjunto.");
            }
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            System.out.println("A palavra " + palavra + " existe no conjunto.");
        } else {
            System.out.println("A palavra " + palavra + " não existe no conjunto.");
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("teste");
        conjunto.adicionarPalavra("teste");
        conjunto.adicionarPalavra("teste2");
        conjunto.adicionarPalavra("teste3");
        conjunto.adicionarPalavra("teste4");
        conjunto.adicionarPalavra("teste5");

        conjunto.exibirPalavras();
        conjunto.removerPalavra("teste2");
        conjunto.exibirPalavras();

        conjunto.verificarPalavra("teste3");
        

    }
}
