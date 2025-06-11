package aula17.realizacao.exemplo02;

public class Pato implements Voo, Caminho, Nado {

	public void emitirSom() {
		
		System.out.println("O pato está grasnando.");
	}
	
	@Override
	public void nadar() {
		
		System.out.println("O pato está nadando.");
	}

	@Override
	public void caminhar() {
		
		System.out.println("O pato está caminhando.");
	}

	@Override
	public void voar() {
		
		System.out.println("O pato está voando.");
	}
}
