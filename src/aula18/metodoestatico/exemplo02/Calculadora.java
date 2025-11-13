package aula18.metodoestatico.exemplo02;

public class Calculadora {

	public static void somar(int a, int b) {

		int resultado = a + b;
		System.out.println(a + " + " + b + " = " + resultado);
	}

	public static void subtrair(int a, int b) {

		int resultado = a - b;
		System.out.println(a + " - " + b + " = " + resultado);
	}

	public static void multiplicar(int a, int b) {

		int resultado = a * b;
		System.out.println(a + " * " + b + " = " + resultado);
	}

	public static void dividir(int a, int b) {

		int resultado = a / b;
		System.out.println(a + " / " + b + " = " + resultado);
	}
}
