package aula16.classemetodofinal.exemplo01;

public abstract class Funcionario {

	protected String nome;
	protected int cpf;
	protected double salarioBase;

	public Funcionario(String nome, int cpf, double salarioBase) {

		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();
}
