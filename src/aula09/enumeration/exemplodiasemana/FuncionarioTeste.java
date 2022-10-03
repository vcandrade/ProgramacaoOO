package aula09.enumeration.exemplodiasemana;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(111, "João da Silva", 123456, DiaSemana.TERCA);
		funcionario1.imprimirDadosFuncionario();
		
		funcionario1.alterarDiaFolga(DiaSemana.SABADO);
		funcionario1.imprimirDadosFuncionario();
	}
}
