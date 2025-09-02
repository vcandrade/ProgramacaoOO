package aula06.variaveis;

public class Galinha {

	// variáveis de instância
	String nome;
	int quantidadeOvos = 0;

	// variável de classe
	static int quantidadeOvosGranja = 0;

	public void botar() {

		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
