package br.edu.trilhajava.bootcamp.polimorfismo.apps;

public class Messenger extends ServicoEnvioMensagem{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}

	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando mensagem do Messenger");
	}

}