package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria cb1 = new ContaBancaria(111, "João da Silva");
		
		cb1.imprimirSaldo();
		
		cb1.depositar(100.00);
		cb1.imprimirSaldo();
		
		cb1.sacar(110.00);
		cb1.imprimirSaldo();
		
		// utilização dos métodos getters e setters
		cb1.setTitular("João da Silva Medeiros");

		System.out.println();
		System.out.println("Obtendo os valores por meio dos métodos getters");
		System.out.println(cb1.getNumero());
		System.out.println(cb1.getTitular());
	}
}
