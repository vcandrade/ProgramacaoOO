package aula14;

public class Comissionado extends Funcionario {

	private double totalVendas;
	private double taxaComissao;

	public Comissionado(String nome, int cpf, double salarioBase, double totalVendas, double taxaComissao) {

		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	public void calcularSalario() {

		double salarioTotal = this.salarioBase + (this.totalVendas * this.taxaComissao);
		System.out.println("Comissionado: R$" + salarioTotal);
	}
}
