package br.edu.trilhajava.bootcamp.collections.set.ordenacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {

    Set<Aluno> alunosSet;

    public GerenciadorAluno() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getNumeroMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Aluno não encontrado");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosSetOrdenadoPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosSetOrdenadoPorNome);   
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosSetOrdenadoPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunosSet.isEmpty()){
            alunosSetOrdenadoPorNota.addAll(alunosSet);
            System.out.println(alunosSetOrdenadoPorNota);
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
    }


    public static void main(String[] args) {
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

        gerenciadorAluno.adicionarAluno("João", 123, 7.5);
        gerenciadorAluno.adicionarAluno("Maria", 456, 8.0);
        gerenciadorAluno.adicionarAluno("Pedro", 789, 6.5);
        gerenciadorAluno.adicionarAluno("Joca", 123, 7.5);
        gerenciadorAluno.adicionarAluno("Mari", 56, 8.0);
        gerenciadorAluno.adicionarAluno("Pedro", 789, 9.5);

        gerenciadorAluno.exibirAlunos();
        gerenciadorAluno.exibirAlunosPorNome();
        gerenciadorAluno.exibirAlunosPorNota();
        gerenciadorAluno.removerAluno(456);
        gerenciadorAluno.exibirAlunos();
    
    }
}
