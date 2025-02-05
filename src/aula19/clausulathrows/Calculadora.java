package aula19.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	public void somar() throws InputMismatchException, Exception {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor de x: ");
		int x = input.nextInt();

		System.out.print("Informe o valor de y: ");
		int y = input.nextInt();

		int resultado = x + y;

		System.out.println(x + " + " + y + " = " + resultado);
	}
	
	public void subtrair() throws InputMismatchException, Exception {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor de x: ");
		int x = input.nextInt();

		System.out.print("Informe o valor de y: ");
		int y = input.nextInt();

		int resultado = x - y;

		System.out.println(x + " - " + y + " = " + resultado);
	}

	public void dividir() throws ArithmeticException, InputMismatchException, Exception {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o valor do numerador: ");
		int numerador = input.nextInt();

		System.out.print("Informe o valor do denominador: ");
		int denominador = input.nextInt();

		int resultado = numerador / denominador;

		System.out.println(numerador + " / " + denominador + " = " + resultado);
	}
}
