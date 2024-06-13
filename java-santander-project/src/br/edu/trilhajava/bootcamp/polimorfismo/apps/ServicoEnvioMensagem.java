package br.edu.trilhajava.bootcamp.polimorfismo.apps;

public abstract class ServicoEnvioMensagem {	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	protected abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}