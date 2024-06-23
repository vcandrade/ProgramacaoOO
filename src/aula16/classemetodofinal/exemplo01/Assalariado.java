package aula16.classemetodofinal.exemplo01;

public class Assalariado extends Funcionario {

	private double adicional;

	public Assalariado(String nome, int cpf, double salarioBase, double adicional) {

		super(nome, cpf, salarioBase);
		this.adicional = adicional;
	}

	@Override
	public double calcularSalario() {

		return this.salarioBase + this.adicional;
	}
}
