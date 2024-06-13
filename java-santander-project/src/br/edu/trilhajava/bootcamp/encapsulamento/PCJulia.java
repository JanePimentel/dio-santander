package br.edu.trilhajava.bootcamp.encapsulamento;

public class PCJulia {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		Messenger msn = new Messenger();
		//msn.validarConectadoInternet();
		msn.enviarMensagem();
		//msn.salvarHistoricoMensagem();
		msn.receberMensagem();

        FacebookMessenger face = new FacebookMessenger();
		face.enviarMensagem();
		face.receberMensagem();
	}
}