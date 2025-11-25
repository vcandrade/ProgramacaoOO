package aula21.excecoespersonalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor do numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o valor do denominador: ");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;
		System.out.println("Resultado: " + resultado);
	}

	public void calcularRaizQuadrada() throws NumeroNaoNaturalException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor de x: ");
		int x = input.nextInt();

		if (x < 0) {

			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(x);

		System.out.println("Resultado: " + resultado);
	}
}
