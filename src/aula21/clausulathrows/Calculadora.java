package aula21.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		System.out.print("Informe o numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o denominador: ");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;

		System.out.println(numerador + " / " + denominador + " = " + resultado);
	}

	public void calcularRaizQuadrada() throws NumeroNaoNaturalException, InputMismatchException, Exception {

		System.out.print("Informe um valor: ");
		double valor = input.nextDouble();

		if (valor < 0) {

			// disparo da exceção NumeroNaoNaturalException
			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(valor);

		System.out.println(resultado);
	}
}
