package br.edu.trilhajava.bootcamp.abstracao;

public class Messenger extends ServicoEnvioMensagem{
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}