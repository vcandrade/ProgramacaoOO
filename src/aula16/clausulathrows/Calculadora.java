package aula16.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void multiplicar() throws InputMismatchException, Exception {

		System.out.print("Informe o valor de X: ");
		int x = input.nextInt();

		System.out.print("Informe o valor de Y: ");
		int y = input.nextInt();

		int total = x * y;

		System.out.println(x + " * " + y + " = " + total);

	}

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		System.out.print("Informe o valor de X: ");
		int x = input.nextInt();

		System.out.print("Informe o valor de Y: ");
		int y = input.nextInt();

		int total = x / y;

		System.out.println(x + " / " + y + " = " + total);
	}
}










