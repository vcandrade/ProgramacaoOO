package aula10.collections.contabancaria;

public class ContaBancaria {

	private int numeroConta;
	private double saldo;
	private String nomeTitular;
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public void verificarSaldo() {
		
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
	}
	
	public void realizarSaque(double valor) {
		
		if(valor <= this.saldo) {
			
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso.");
			
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void realizarDeposito(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
