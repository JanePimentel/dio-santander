package br.edu.trilhajava.bootcamp.collections.listas.pesquisa;

public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return anoPublicacao;
    }

    //sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "\nLivro{" +
        "nome='" + titulo + '\'' +
        ", autor =" + autor +
        ", ano = " + anoPublicacao +
        '}';     }
    
}
