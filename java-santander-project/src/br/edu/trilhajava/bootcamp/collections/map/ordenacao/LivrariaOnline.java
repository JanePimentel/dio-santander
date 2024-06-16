package br.edu.trilhajava.bootcamp.collections.map.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

import br.edu.trilhajava.bootcamp.collections.set.ordenacao.ComparatorPorNota;

public class LivrariaOnline {
    Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livraria.put(link, livro);
    }

    public void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livraria.remove(entry.getKey());
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livraria.entrySet());
        Collections.sort(livrosParaOrdenar, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosMap = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenar) {
            livrosOrdenadosMap.put(entry.getKey(), entry.getValue());
            // System.out.println(entry.getValue().getTitulo() + " - " +
            // entry.getValue().getPreco());
        }
        return livrosOrdenadosMap;
    }


    public void exibirLivros(){
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            System.out.println(entry.getValue().getTitulo() + " - " + entry.getValue().getPreco());
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(String autor) {
        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livraria.entrySet());
        Collections.sort(livrosParaOrdenar, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosMap = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenar) {
            if (entry.getValue().getAutor().equals(autor)) {
                livrosOrdenadosMap.put(entry.getKey(), entry.getValue());
            }
            // System.out.println(entry.getValue().getTitulo() + " - " +
            // entry.getValue().getPreco());
        }
        return livrosOrdenadosMap;
    }

    public List<Livro> obterLivrosMaisCaros() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisCaro = Double.MIN_VALUE;

        if (!livraria.isEmpty()) {
            for (Livro livro : livraria.values()) {
                if (livro.getPreco() > precoMaisCaro) {
                    precoMaisCaro = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("Livraria vazia!");
        }

        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisCaro) {
                Livro livroComPrecoMaisAlto = livraria.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        // System.out.println("Preco mais caro: " + precoMaisCaro
        return livrosMaisCaros;

    }

    public List<Livro> obterLivrosMaisBaratos() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBarato = Double.MAX_VALUE;
        if (!livraria.isEmpty()) {
            for (Livro livro : livraria.values()) {
                if (livro.getPreco() < precoMaisBarato) {
                    precoMaisBarato = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("Livraria vazia!");
        }

        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBarato) {
                Livro livroComPrecoMaisBaixo = livraria.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("https://example.com/livro1", "Livro 2", "Autor 1", 19.99);
        livraria.adicionarLivro("https://example.com/livro2", "Livro 1", "Autor 1", 24.99);
        livraria.adicionarLivro("https://example.com/livro3", "Livro 3", "Autor 3", 14.99);
        livraria.adicionarLivro("https://example.com/livro4", "Livro 4", "Autor 4", 9.99);
        livraria.adicionarLivro("https://example.com/livro5", "Livro 5", "Autor 5", 29.99);
        livraria.adicionarLivro("https://example.com/livro6", "Livro 6", "Autor 6", 212.99);
        livraria.adicionarLivro("https://example.com/livro7", "Livro 7", "Autor 7", 8.99);

        livraria.exibirLivros();
        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println(livraria.exibirLivrosOrdenadosPorAutor("Autor 1"));
        System.out.println(livraria.obterLivrosMaisCaros());    
        System.out.println(livraria.obterLivrosMaisBaratos());


    }
}
