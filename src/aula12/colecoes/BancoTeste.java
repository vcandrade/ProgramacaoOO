package aula12.colecoes;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco(987654, "PG Banco");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");

		banco1.realizarDepositoConta(222, 1000.00);

		banco1.listarContas();

		banco1.realizarSaqueConta(222, 500.00);
		banco1.listarContas();
	}
}
