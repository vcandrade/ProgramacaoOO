package aula13.heranca.exemplo02;

public class Professor {

	protected int numeroRegistro;
	protected String nome;
	protected String dataNomeacao;
	protected double salario;
	
	public Professor(int numeroRegistro, String nome, String dataNomeacao, double salario) {
		
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNomeacao = dataNomeacao;
		this.salario = salario;
	}
	
	public void lancarFrequencia() {
		
		System.out.println(this.nome + " est� lan�ando frequ�ncia.");
	}
	
	public void aplicarAvaliacao() {
		
		System.out.println(this.nome + " est� aplicando avalia��o.");
	}
	
	public void imprimirDadosProfessor() {
		
		System.out.println("N�mero Registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data da Nomea��o: " + this.dataNomeacao);
		System.out.println("Sal�rio: R$" + this.salario);
	}
}
