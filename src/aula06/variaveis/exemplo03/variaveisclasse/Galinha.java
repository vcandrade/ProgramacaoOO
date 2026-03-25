package aula06.variaveis.exemplo03.variaveisclasse;

public class Galinha {

	// Variáveis de Instância
	String nome;
	int quantidadeOvos;

	// Variáveis de Classe
	static int quantidadeOvosGranja;

	public void botar() {

		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
