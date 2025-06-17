package aula18.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o numerador: ");
			int numerador = input.nextInt();

			System.out.print("Informe o denominador: ");
			int denominador = input.nextInt();

			int resultado = numerador / denominador;
			System.out.println(numerador + " / " + denominador + " = " + resultado);

		} catch (ArithmeticException e) {

			System.out.println("Erro: Impossível dividir por zero.");

		} catch (InputMismatchException e) {

			System.out.println("Erro: O sistema admite apenas valores inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		} finally {

			System.out.println("Executando o bloco finally.");
			input.close();
		}
	}
}
