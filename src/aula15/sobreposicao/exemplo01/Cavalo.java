package aula15.sobreposicao.exemplo01;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {

		super(nome, raca);
	}

	@Override
	public void emitirSom() {

		System.out.println("Relinchando.");
	}
}
