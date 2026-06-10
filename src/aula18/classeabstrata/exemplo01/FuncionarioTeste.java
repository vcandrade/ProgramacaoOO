package aula18.classeabstrata.exemplo01;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario = null;

		int opcao = 3;

		switch (opcao) {

			case 1:
				funcionario = new Assalariado("João da Silva", "123456", 5000.00, 2000.00);
				break;
	
			case 2:
				funcionario = new Comissionado("Maria de Oliveira", "987654", 5000.00, 50000.00, 10.0);
				break;
	
			case 3:
				funcionario = new Horista("Ricardo Carvalho", "159753", 5000.00, 15.00, 160);
				break;
		}

		funcionario.imprimirDados();
	}
}
