package aula09.encapsulamentodados;

public class ContaCorrenteTeste {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente(111, "João da Silva");

		conta1.imprimirSaldo();

		conta1.setNomeTitular("Maria de Oliveira");

		System.out.println(conta1.getNumeroConta());
		System.out.println(conta1.getNomeTitular());

	}
}
