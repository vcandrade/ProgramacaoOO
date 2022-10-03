package aula09.enumeration.exemplodiasemana;

public class Funcionario {

	private int registro;
	private String nome;
	private int cpf;
	private DiaSemana folga;
	
	public Funcionario(int registro, String nome, int cpf, DiaSemana folga) {
		
		this.registro = registro;
		this.nome = nome;
		this.cpf = cpf;
		this.folga = folga;
	}
	
	public void alterarDiaFolga(DiaSemana folga) {
		
		this.folga = folga;
	}
	
	public void imprimirDadosFuncionario() {
		
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Dia da Semana da folga: " + this.folga.getDiaSemanaExtenso());
	}
}











