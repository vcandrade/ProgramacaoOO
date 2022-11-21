package aula14.classemetodoabstrato;

public class Horista extends Funcionario {

	private double precoHora;
	private int horasTrabalhadas;

	public Horista(String nome, int cpf, double salarioBase, double precoHora, int horasTrabalhadas) {

		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void calcularSalario() {

		double salarioTotal = this.salarioBase + (precoHora * horasTrabalhadas);
		System.out.println("Horista: R$" + salarioTotal);
	}
}
