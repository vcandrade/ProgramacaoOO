package aula19.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {
			
			Calculadora calc = new Calculadora();
			calc.somar();
			calc.dividir();
			
		} catch (ArithmeticException e) {

			System.out.println("Erro: Impossível dividir por zero.");

		} catch (InputMismatchException e) {

			System.out.println("Erro: O sistema admite apenas valores inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());
		}
	}
}
