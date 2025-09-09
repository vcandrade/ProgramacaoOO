package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria cb1 = new ContaBancaria(111, "João da Silva");
		cb1.imprimirSaldo();

		cb1.depositar(100.00);
		cb1.imprimirSaldo();

		cb1.sacar(60.00);
		cb1.imprimirSaldo();

		cb1.setTitular("José Carvalho");

		System.out.println("Conta: " + cb1.getNumeroConta());
		System.out.println("Titular: " + cb1.getTitular());
	}
}
