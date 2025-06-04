package aula15.polimorfismo.sobreposicao.exemplo01;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {

		super(nome, raca);
	}

	@Override
	public void emitirSom() {

		System.out.println(this.nome + " está relinchando.");
	}
	
	@Override
	public void brincar() {

		System.out.println(this.nome + " está correndo.");
	}
	
	public void cavalgar() {
		
		System.out.println(this.nome + " está cavalgando.");
	}
}






