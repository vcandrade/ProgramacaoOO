package aula13.exemplo01;

public class Cavalo extends Mamifero {
	
	public Cavalo(String nome, String raca) {
		
		this.nome = nome;
		this.raca = raca;
	}

	@Override
	public void emitirSom() {
		
		System.out.println(nome + " está relinchando");
	}
}
