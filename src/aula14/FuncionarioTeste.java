package aula14;

import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Funcionario funcionario = null;

		System.out.println("1 - Assalariado");
		System.out.println("2 - Comissionado");
		System.out.println("3 - Horista");
		System.out.print("Opção: ");
		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			funcionario = new Assalariado("João da Silva", 1234, 5000.00, 2000.00);
			break;
		case 2:
			funcionario = new Comissionado("Maria de Oliveira", 9876, 5000.00, 50000.00, 0.10);
			break;
		case 3:
			funcionario = new Horista("José Carvalho", 1598, 5000.00, 20.00, 160);
			break;
		}

		funcionario.calcularSalario();
	}
}
