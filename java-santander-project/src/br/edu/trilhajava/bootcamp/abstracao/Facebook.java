package br.edu.trilhajava.bootcamp.abstracao;

public class Facebook extends ServicoEnvioMensagem {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
