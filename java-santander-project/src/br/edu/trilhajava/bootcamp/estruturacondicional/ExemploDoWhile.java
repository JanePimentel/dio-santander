package br.edu.trilhajava.bootcamp.estruturacondicional;
// ExemploDoWhile.java

import java.util.Random;
import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");

		do {
			// excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");

		} while (tocando());

		System.out.println("Alô !!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3) == 1;
		System.out.println("Atendeu? " + atendeu);
		// negando o ato de continuar tocando
		return !atendeu;
	}

	Scanner scanner = new Scanner(System.in);

	double saldo = scanner.nextDouble();
	double saque = scanner.nextDouble();

	// Define um limite para o cheque especial
	double limiteChequeEspecial = 500;

	
}