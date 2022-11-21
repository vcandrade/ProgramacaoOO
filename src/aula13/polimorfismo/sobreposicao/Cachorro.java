package aula13.polimorfismo.sobreposicao;

public class Cachorro extends Mamifero {

	public Cachorro(String nome, String raca) {

		this.nome = nome;
		this.raca = raca;
	}

	@Override
	public void emitirSom() {

		System.out.println(nome + " está latindo");
	}
}
