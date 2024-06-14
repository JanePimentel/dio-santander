package br.edu.trilhajava.bootcamp.collections.listas.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(13);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(27);
        numeros.adicionarNumero(40);

        numeros.exibirNumeros();
       System.out.println(numeros.ordenarAscendente());
       System.out.println(numeros.ordenarDescendente());

    }
}
