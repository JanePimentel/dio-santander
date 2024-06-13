package br.edu.trilhajava.bootcamp.abstracao;

public class PCJulia {
	public static void main(String[] args) {
		Messenger msn = new Messenger();
		msn.enviarMensagem();
		msn.receberMensagem();

        Facebook face = new Facebook();
		face.enviarMensagem();
		face.receberMensagem();
	}
}