package aula18.classeabstrata.exemplo02;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {
		
		super(nome, raca);
	}

	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " está relinchando.");
	}
}
