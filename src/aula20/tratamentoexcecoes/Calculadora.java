package aula20.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o numerador: ");
			double numerador = input.nextDouble();

			System.out.print("Informe o denominador: ");
			double denominador = input.nextDouble();

			double resultado = numerador / denominador;

			System.out.println(numerador + " / " + denominador + " = " + resultado);

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por 0.");

		} catch (InputMismatchException e) {

			System.out.println("Entrada inválida de valores.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		} finally {

			input.close();
			System.out.println("input finalizado.");
		}
	}
}
