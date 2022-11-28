package aula16.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {
			
			Calculadora calculadora1 = new Calculadora();
			calculadora1.multiplicar();
			calculadora1.dividir();

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException ime) {

			System.out.println("Valor informado é incorreto.");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}
}
