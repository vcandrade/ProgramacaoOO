package aula09.encapsulamentodados;

public class ContaBancaria {

	private int numero;
	private String titular;
	private double saldo;

	public ContaBancaria(int numero, String titular) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		System.out.println("===============================");

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("===============================");
		System.out.println("Depósito realizado com sucesso.");

		this.calcularRendimento();
	}

	public void imprimirSaldo() {

		System.out.println("===============================");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do titular: " + this.titular);
		System.out.println("Saldo da Conta: R$" + this.saldo);
	}

	private void calcularRendimento() {

		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	// métodos de acesso (getters e setters)
	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {

		if (!titular.equals("")) {

			this.titular = titular;
		}
	}
}
