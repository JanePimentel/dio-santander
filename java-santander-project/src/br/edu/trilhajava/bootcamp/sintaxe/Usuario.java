package br.edu.trilhajava.bootcamp.sintaxe;

public class Usuario {
    public static void main(String[] args) {
        // Ela tenha as características: ligada (boolean), canal (int) e volume (int);
       //Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
       //Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
       //Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

       SmartTV tv = new SmartTV();

       System.out.println(" TV ligada?" + ( tv.ligada == false? "Não" : "Sim"));
       System.out.println(" Canal.:" + tv.canal);
       System.out.println(" Volume.:" + tv.volume);

        tv.ligar();
        System.out.println(" TV ligada?" + ( tv.ligada == false? " Não " : " Sim "));
    
        tv.aumentarVolume();
        tv.DiminuirVolume();
        tv.aumentarCanal();
        tv.diminuirCanal();
        tv.mudarCanalPorValor(13);
      
    }
}
