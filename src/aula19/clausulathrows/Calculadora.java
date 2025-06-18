package aula19.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		input = new Scanner(System.in);
	}

	public void somar() throws InputMismatchException, Exception {

		System.out.print("Informe o x: ");
		int x = input.nextInt();

		System.out.print("Informe o y: ");
		int y = input.nextInt();

		int resultado = x + y;

		System.out.println(x + " + " + y + " = " + resultado);
	}

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		System.out.print("Informe o numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o denominador: ");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;

		System.out.println(numerador + " / " + denominador + " = " + resultado);
	}
}
