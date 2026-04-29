package aula12.listas.exemplo02;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco(123456, "UTFBank");
		
		banco1.listarContas();
		
		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");
		
		banco1.excluirConta(999);
		
		banco1.realizarDepositoConta(222, 100.00);		
		banco1.verificarSaldoConta(222);
		
		banco1.realizarSaqueConta(222, 50.00);
		banco1.verificarSaldoConta(222);
	}
}
