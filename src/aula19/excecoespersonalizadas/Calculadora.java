package aula19.excecoespersonalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

import aula19.clausulathrows.NumeroNaoNaturalException;

public class Calculadora {

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor do numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o valor do denominador: ");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;

		System.out.println("Resultado: " + resultado);

		input.close();
	}

	public void calcularRaizQuadrada(int x) throws NumeroNaoNaturalException {

		if (x < 0) {

			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(x);

		System.out.println("Resultado: " + resultado);
	}
}
