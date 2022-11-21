package aula13.polimorfismo.sobreposicao;

public class Gato extends Mamifero {

	public Gato(String nome, String raca) {

		this.nome = nome;
		this.raca = raca;
	}

	@Override
	public void emitirSom() {

		System.out.println(nome + " está miando");
	}
}
