package br.edu.trilhajava.bootcamp.collections.listas.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadasIdade = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasOrdenadasIdade);
        return pessoasOrdenadasIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenadasAltura = new ArrayList<>(this.pessoas);
        Collections.sort(pessoasOrdenadasAltura, new ComparatorPorAltura());
        return pessoasOrdenadasAltura;
    }

    public void exibirLista(){
        System.out.println(pessoas);
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();

        ordenacao.adicionarPessoa("João", 25, 1.75);
        ordenacao.adicionarPessoa("Maria", 30, 1.65);
        ordenacao.adicionarPessoa("Pedro", 20, 1.80);
        ordenacao.adicionarPessoa("Ana", 35, 1.60);
        ordenacao.adicionarPessoa("Carlos", 28, 1.70);

        ordenacao.exibirLista();
        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());

    }
}
// se nao definir um comparator ele usa o comparable
class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}