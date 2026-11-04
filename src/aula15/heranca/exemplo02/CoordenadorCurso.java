package aula15.heranca.exemplo02;

public class CoordenadorCurso extends Professor {

	private double adicionalSalario;

	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double adicionalSalario) {

		super(numeroRegistro, nome, dataNomeacao, salario);
		this.adicionalSalario = adicionalSalario;
	}

	public void analisarPedidosSegundaChamada() {

		System.out.println(this.nome + " está analisando pedidos de segunda chamada");
	}

	public void analisarPedidoSuficiencia() {

		System.out.println(this.nome + " está analisando pedidos de exame de suficiência.");
	}

	public void participarReunioesDirecao() {

		System.out.println(this.nome + " está participando das reuniões da direção.");
	}

	public void imprimirDadosCoordenador() {

		super.imprimirDadosProfessor();

		System.out.println("Salário Adicional: R$" + this.adicionalSalario);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	private double calcularSalario() {

		return this.salario + this.adicionalSalario;
	}
}
