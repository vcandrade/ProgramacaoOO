package aula18.classeabstrata.exemplo02;

public class Gato extends Mamifero {

	public Gato(String nome, String raca) {
		
		super(nome, raca);
	}

	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " está miando.");
	}
}
