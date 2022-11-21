package aula14.classemetodoabstrato;

public abstract class Funcionario {

	protected String nome;
	protected int cpf;
	protected double salarioBase;

	public Funcionario(String nome, int cpf, double salarioBase) {

		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public abstract void calcularSalario();
}
