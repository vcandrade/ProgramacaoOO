package aula11.enumeration.exemplo02;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(123, "João da Silva", "111.222.333-45", DiaSemana.DOMINGO);
		funcionario1.imprimirRelatorio();
		
		System.out.println("================================");
		
		funcionario1.alterarDiaFolga(DiaSemana.SEXTA);
		funcionario1.imprimirRelatorio();
	}
}
