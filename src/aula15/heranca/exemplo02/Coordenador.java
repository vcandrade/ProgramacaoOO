package aula15.heranca.exemplo02;

public class Coordenador extends Professor {

	private double salarioAdicional;

	public Coordenador(int numeroRegistro, String nome, String dataNomeacao, double salario, double salarioAdicional) {

		super(numeroRegistro, nome, dataNomeacao, salario);
		this.salarioAdicional = salarioAdicional;
	}

	public void analisarPedidosSegundaChamada() {

		System.out.println(this.nome + " está analisando pedidos de 2a chamada.");
	}

	public void analisarPedidoSuficiencia() {

		System.out.println(this.nome + " está analisando pedidos de suficiência.");
	}

	public void participarReunioesDirecao() {

		System.out.println(this.nome + " está participando de reuniões da direção do campus.");
	}

	public void imprimirDadosCoordenador() {

		super.imprimirDadosProfessor();
		System.out.println("Salário Adicional: R$" + this.salarioAdicional);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	private double calcularSalario() {

		return this.salario + this.salarioAdicional;
	}
}
