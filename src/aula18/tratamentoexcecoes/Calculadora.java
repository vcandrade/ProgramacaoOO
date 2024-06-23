package aula18.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public void dividir() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o valor do numerador: ");
			int numerador = input.nextInt();

			System.out.print("Inmforme o valor do denominador: ");
			int denominador = input.nextInt();

			int resultado = numerador / denominador;

			System.out.println("Resultado da Divisão: " + resultado);

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException ime) {

			System.out.println("Erro na entrada de dados. Informe apenas valores inteiros.");

		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());

		} finally {

			System.out.println("finally sendo executado.");
			input.close();
		}
	}
}
