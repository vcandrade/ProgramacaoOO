package aula07.encapsulamento;

public class APIContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente(111, "Jo�o da Silva");
		
		conta1.imprimirSaldo();
		
		conta1.depositar(100.00);
		conta1.imprimirSaldo();
		
		conta1.sacar(101.00);
		conta1.imprimirSaldo();
		
		System.out.println("M�TODOS DE ACESSO");
		
		// getters -> m�todos para a obte��o de valores do objeto
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getNomeTitular());
		System.out.println(conta1.getSaldo());
		
		// setters -> m�todos para a atribui��o de valores ao objeto
		conta1.setNomeTitular("Jo�o da Silva Ferraz");

		System.out.println(conta1.getNumero());
		System.out.println(conta1.getNomeTitular());
		System.out.println(conta1.getSaldo());
		
	}
}
