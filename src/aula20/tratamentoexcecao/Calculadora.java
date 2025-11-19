package aula20.tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o valor do numerador: ");
			int numerador = input.nextInt();

			System.out.print("Informe o valor do denominador: ");
			int denominador = input.nextInt();

			int resultado = numerador / denominador;
			System.out.println("Resultado: " + resultado);

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException e) {

			System.out.println("O programa admite somente valores inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getLocalizedMessage());

		} finally {

			input.close();
			System.out.println("finalizando o método dividir.");
		}
	}
}
