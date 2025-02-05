package aula19.clausulathrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	public void somar() {
		
	}
	
	public void subtrair() {
		
	}

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
}
