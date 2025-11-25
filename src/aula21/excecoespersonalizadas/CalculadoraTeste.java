package aula21.excecoespersonalizadas;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calc = new Calculadora();

			calc.calcularRaizQuadrada();
			calc.dividir();

		} catch (InputMismatchException e) {

			System.out.println("Somente são admitidos valores inteiros");

		} catch (ArithmeticException e) {

			System.out.println("Impossível dividir por 0.");

		} catch (NumeroNaoNaturalException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
