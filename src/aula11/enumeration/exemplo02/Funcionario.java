package aula11.enumeration.exemplo02;

public class Funcionario {

	private int registro;
	private String nome;
	private String cpf;
	private DiaSemana folga;

	public Funcionario(int registro, String nome, String cpf, DiaSemana folga) {

		this.registro = registro;
		this.nome = nome;
		this.cpf = cpf;
		this.folga = folga;
	}

	public void alterarDiaFolga(DiaSemana diaFolgaAtual) {

		this.folga = diaFolgaAtual;
	}

	public void imprimirRelatorio() {

		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Folga: " + this.folga.getDiaSemanaNumerico() + " - " + this.folga.getDiaSemanaExtenso());
	}
}
