
package br.edu.trilhajava.bootcamp.sintaxe;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 23;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println(" Mudando Canal.:"+ canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println(" Mudando Canal.:"+ canal);
    }

    public void mudarCanalPorValor(int c){
        canal = c;
        System.out.println(" Mudando Canal.:"+ canal);
    }
    
    public void aumentarVolume(){
        volume ++;
        System.out.println(" Aumentando Volume.:"+ volume);
    }

    public void DiminuirVolume(){
        volume --;
        System.out.println(" Diminuindo Volume.:"+ volume);
    }

}