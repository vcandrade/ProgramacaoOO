package aula21.excecoespersonalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void dividir() {

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
		}
	}

	public void calcularRaizQuadrada() {

		try {

			System.out.print("Informe um valor: ");
			double valor = input.nextDouble();

			if (valor < 0) {

				// disparo da exceção NumeroNaoNaturalException
				throw new NumeroNaoNaturalException();
			}

			double resultado = Math.sqrt(valor);

			System.out.println(resultado);

		} catch (NumeroNaoNaturalException e) {

			System.out.println("Erro: " + e.getMessage());

		} catch (InputMismatchException e) {

			System.out.println("Valor informado incorretamente.");
		}
	}
}
