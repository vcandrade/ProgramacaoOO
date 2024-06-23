package aula16.classemetodofinal.exemplo01;

public class Horista extends Funcionario {

	private int horasTrabalhadas;
	private double precoHora;

	public Horista(String nome, int cpf, double salarioBase, int horasTrabalhadas, double precoHora) {

		super(nome, cpf, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.precoHora = precoHora;
	}

	@Override
	public double calcularSalario() {

		return this.salarioBase + (this.horasTrabalhadas * this.precoHora);
	}
}
