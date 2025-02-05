package aula19.clausulathrows;

import java.util.InputMismatchException;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		try {

			Calculadora calc = new Calculadora();
			calc.dividir();
		
		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por 0.");

		} catch (InputMismatchException ime) {

			System.out.println("Informe apenas valores inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		}
	}
}
