package aula12.listas;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco("123456789", "Banco UTFPR");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");
		banco1.adicionarNovaConta(444, "Bruna Camargo");

		banco1.excluirConta(333);

		banco1.verificarSaldoConta(222);
		banco1.efetuarDepositoConta(222, 100.00);
		banco1.verificarSaldoConta(222);

		banco1.efetuarSaqueConta(222, 110.00);
		banco1.verificarSaldoConta(222);
	}
}
