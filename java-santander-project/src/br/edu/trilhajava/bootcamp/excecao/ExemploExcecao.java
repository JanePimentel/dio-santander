package br.edu.trilhajava.bootcamp.excecao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ExemploExcecao {
    public static void main(String[] args) {
        // criando o objeto scanner
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Idade e altura precisam ser númericos!");
        }
        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
       
    }
}
