package br.edu.trilhajava.bootcamp.collections.map.pesquisa;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    // Adiciona uma palavra à contagem.
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    // Remova uma palavra da contagem, se estiver presente.
    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
            System.out.println("A palavra " + palavra + " foi removida do texto.");
        } else {
            System.out.println("Não há palavras para remover");
        }
    }

    // Exibe todas as palavras e suas respectivas contagens.
    public int exibirContagemPalavras() {
        int total = 0;
        for (int cont : palavras.values()) {
            total += cont;
        }
        return total;
    }


    public void exibirPalavras() {
        for (String palavra : palavras.keySet()) {
            System.out.println(" * " + palavra);
        }
    }

    // Encontra a palavra mais frequente no texto e retorna a palavra e sua
    // contagem.
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = "";
        int contagemMaisFrequente = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > contagemMaisFrequente) {
                palavraMaisFrequente = entry.getKey();
                contagemMaisFrequente = entry.getValue();
            }
        }
        return "A palavra mais frequente é " + palavraMaisFrequente + ". Consta " + contagemMaisFrequente + " vezes no texto.";
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("bola", 2);
        contagem.adicionarPalavra("mesa", 3);
        contagem.adicionarPalavra("cama", 1);
        contagem.adicionarPalavra("banco", 1);
        contagem.adicionarPalavra("lua", 23);
        contagem.adicionarPalavra("sol", 1);

        contagem.exibirPalavras();
        System.out.println("Total de contagem.: " + contagem.exibirContagemPalavras());
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        contagem.removerPalavra("bola");
        contagem.exibirPalavras();

    }

}
