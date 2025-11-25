package aula21.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calc = new Calculadora();
			calc.dividir();

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException e) {

			System.out.println("O programa admite somente valores inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());
		}
	}
}
