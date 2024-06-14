package br.edu.trilhajava.bootcamp.collections.listas.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public void obterDescricoesTarefas() {
        //for (Tarefa tarefa : tarefas) {
            System.out.println(tarefas);
        //}
    }

    // Main method to test the class
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println(lista.obterNumeroTotalTarefas());
        
        // Add some tasks
        lista.adicionarTarefa("Estudar");
        lista.adicionarTarefa("Comer");
        lista.adicionarTarefa("Comer");
        lista.adicionarTarefa("Comer");
        lista.adicionarTarefa("Dormir");

        // Remove a task
        lista.removerTarefa("Comer");

        // Print the number of tasks
        System.out.println("Numero de tarefas: " + lista.obterNumeroTotalTarefas());

        // Print the task descriptions
        System.out.println("Descricoes das tarefas:");
        lista.obterDescricoesTarefas();

       System.out.println();
        
       
    }
}

