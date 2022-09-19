package aula07.encapsulamento;

public class ContaCorrente {

	private int numero;
	private String nomeTitular;
	private double saldo;

	public ContaCorrente(int numero, String nomeTitular) {
		
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}
	
	public void sacar(double valor) {
		
		if(valor <= this.saldo) {
			
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso.");
			
		} else {
			
			System.out.println("Saldo indisponível.");
		}
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
		
		this.calcularRendimento();
	}
	
	public void imprimirSaldo() {
		
		System.out.println("============ SALDO ============");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("===============================");
	}
	
	private void calcularRendimento() {
		
		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		
		if(!nomeTitular.equals("")) {
			
			this.nomeTitular = nomeTitular;
		}
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
