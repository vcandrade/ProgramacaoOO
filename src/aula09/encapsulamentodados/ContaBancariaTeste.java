package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria contaBancaria1 = new ContaBancaria(111, "João da Silva");
		contaBancaria1.imprimirSaldo();
		
		contaBancaria1.depositar(100.00);
		contaBancaria1.imprimirSaldo();
		
		contaBancaria1.sacar(60.00);

		// alteração de dados da conta bancária por meio do método set
		contaBancaria1.setTitular("João da Silva Macedo");

		// obtenção de dados da conta bancária por meio dos métodos getters
		System.out.println("Número da Conta: " + contaBancaria1.getNumero());
		System.out.println("Nome do Titular: " + contaBancaria1.getTitular());
	}
}
