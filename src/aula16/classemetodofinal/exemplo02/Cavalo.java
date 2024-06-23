package aula16.classemetodofinal.exemplo02;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {

		super(nome, raca);
	}

	@Override
	public void emitirSom() {

		System.out.println("Relinchando.");
	}
}
