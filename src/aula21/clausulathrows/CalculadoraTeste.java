package aula21.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calc = new Calculadora();
			calc.calcularRaizQuadrada();
			calc.dividir();

		} catch (ArithmeticException e) {

			System.out.println("Impossível Dividir por 0.");

		} catch (InputMismatchException e) {

			System.out.println("Entrada de valor incorreto.");

		} catch (NumeroNaoNaturalException e) {

			System.out.println("Erro: " + e.getMessage());

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());
		}
	}
}
