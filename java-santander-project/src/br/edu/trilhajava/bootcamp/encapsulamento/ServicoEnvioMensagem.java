package br.edu.trilhajava.bootcamp.encapsulamento;

public class ServicoEnvioMensagem {
    
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}