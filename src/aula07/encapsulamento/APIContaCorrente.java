package aula07.encapsulamento;

public class APIContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente(111, "João da Silva");
		
		conta1.imprimirSaldo();
		
		conta1.depositar(100.00);
		conta1.imprimirSaldo();
		
		conta1.sacar(101.00);
		conta1.imprimirSaldo();
		
		System.out.println("MÉTODOS DE ACESSO");
		
		// getters -> métodos para a obteção de valores do objeto
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getNomeTitular());
		System.out.println(conta1.getSaldo());
		
		// setters -> métodos para a atribuição de valores ao objeto
		conta1.setNomeTitular("João da Silva Ferraz");

		System.out.println(conta1.getNumero());
		System.out.println(conta1.getNomeTitular());
		System.out.println(conta1.getSaldo());
		
	}
}
