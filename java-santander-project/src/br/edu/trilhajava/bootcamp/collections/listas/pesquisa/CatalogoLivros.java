package br.edu.trilhajava.bootcamp.collections.listas.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro v : livros) {
                if (v.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(v);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro v : livros) {
                if(v.getAno() >= anoInicial && v.getAno() <= anoFinal){
                    livrosPorIntervaloAnos.add(v);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()) {
            for (Livro v : livros) {
                if (v.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = v;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2020);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2015);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2018);

        System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2015));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 4"));

    }
}
