package aula17.polimorfismo.sobreposicao.exemplo1;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {
		
		super(nome, raca);
	}

	@Override
	public void emitirSom() {
		
		System.out.println(this.nome + " está relinchando.");
	}
}
