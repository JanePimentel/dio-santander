package br.edu.trilhajava.bootcamp.estruturacondicional;

import javax.sound.midi.Soundbank;

public class CaixaEletronico {
    public static void main(String[] args) {
        /**
         * Condicional simples
         */
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println("Saldo Remanescente: " + saldo);

        /**
         * Condicional composta
         */
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        /**
         * Estrutura encadeada
         * 
         */

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        /**
         * Ternário
         */

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
        }

        double alturaJoao = 1.46;
        double alturaMarcos = 1.37;

       if(alturaMarcos > alturaJoao)
        System.out.println("João é mais alto que Marcos");
       else
        System.out.println("Marcos é mais baixo que João");
    }

}