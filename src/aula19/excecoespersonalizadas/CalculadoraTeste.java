package aula19.excecoespersonalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calc = new Calculadora();
			calc.calcularRaizQuadrada();

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException ime) {

			System.out.println("Erro na entrada de dados. Informe apenas valores inteiros.");

		} catch (NumeroNaoNaturalException nnne) {

			System.out.println("Erro: " + nnne.getMessage());

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		}
	}
}
