package aula16.tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	private Scanner input;

	public Calculadora() {

		this.input = new Scanner(System.in);
	}

	public void multiplicar() {

		try {

			System.out.print("Informe o valor de X: ");
			int x = input.nextInt();

			System.out.print("Informe o valor de Y: ");
			int y = input.nextInt();

			int total = x * y;

			System.out.println(x + " * " + y + " = " + total);

		} catch (InputMismatchException ime) {

			System.out.println("Valor informado é incorreto.");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void dividir() {

		try {

			System.out.print("Informe o valor de X: ");
			int x = input.nextInt();

			System.out.print("Informe o valor de Y: ");
			int y = input.nextInt();

			int total = x / y;

			System.out.println(x + " / " + y + " = " + total);

		} catch (ArithmeticException ae) {

			System.out.println("Impossível dividir por zero.");

		} catch (InputMismatchException ime) {

			System.out.println("Valor informado é incorreto.");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
