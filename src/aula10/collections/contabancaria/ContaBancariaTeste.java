package aula10.collections.contabancaria;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco(987, "NewBank");
		
		banco1.criarNovaConta(111, "João da Silva");
		banco1.criarNovaConta(222, "Maria de Oliveira");
		banco1.criarNovaConta(333, "Ricardo Carvalho");

		banco1.solicitarDeposito(222, 100.00);
		banco1.solicitarSaldo(222);		
		banco1.solicitarSaque(222, 100.00);
	}
}
