package aula06.tiposvariaveis;

public class Galinha {

	String nome;
	int quantidadeOvos;
	static int quantidadeOvosGranja;
	
	public Galinha(String nome) {
		this.nome = nome;
	}
	
	public void botar() {
		
		this.quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
