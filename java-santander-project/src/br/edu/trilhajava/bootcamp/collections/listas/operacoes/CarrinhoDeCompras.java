package br.edu.trilhajava.bootcamp.collections.listas.operacoes;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    
    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
  }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList();

        if(!itens.isEmpty()){
            for(Item item : itens){
                if(item.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(item);
                }
            }
        }
    
        itens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double total = 0.0 ;
        for(Item item : itens){
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println(total);
    }
    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Caju",23.50,7);
        carrinhoDeCompras.adicionarItem("Uva",83.50,9);
        carrinhoDeCompras.adicionarItem("Uva",83.50,9);
        carrinhoDeCompras.adicionarItem("Jaca",123.50,87);


        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Uva");
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.exibirItens();


    }
}
