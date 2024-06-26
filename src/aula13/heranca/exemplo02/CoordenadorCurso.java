package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {

	private double adicionalSalario;
	
	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double adicionalSalario) {
		
		super(numeroRegistro, nome, dataNomeacao, salario);
		this.adicionalSalario = adicionalSalario;
	}

	public void analisarPedidoSegundaChamada() {		
		System.out.println(this.nome + " est� analisando pedidos de avalia��es de 2a chamada.");
	}
	
	public void analisarPedidoSuficiencia() {		
		System.out.println(this.nome + " est� deferindo pedidos de exames de sufici�ncia.");
	}
	
	public void participarReunioesDirecao() {		
		System.out.println(this.nome + " est� participando das reuni�es da dire��o do campus.");
	}
	
	public void imprimirDadosCoordenador() {
		
		super.imprimirDadosProfessor();
		
		System.out.println("Adicional: R$" + this.adicionalSalario);
		System.out.println("Sal�rio Total: R$" + this.calcularSalario());
	}

	private double calcularSalario() {		
		return this.salario + this.adicionalSalario;
	}
}
