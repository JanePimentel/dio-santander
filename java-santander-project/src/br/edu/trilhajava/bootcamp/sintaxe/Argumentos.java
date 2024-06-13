package br.edu.trilhajava.bootcamp.sintaxe;

public class Argumentos {

        public static void main(String[] args) {
            //os argumentos começam com indice 0
            //forma de obter os valores de forma dinâmica ao executar uma aplicação java
            String nome = args [0];
            String sobrenome = args [1];
            int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
            double altura = Double.valueOf(args[3]);
    
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        }
    
}
