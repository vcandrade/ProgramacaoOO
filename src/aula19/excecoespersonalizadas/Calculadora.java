package aula19.excecoespersonalizadas;

public class Calculadora {

	public void dividir(int numerador, int denominador) throws ArithmeticException, Exception {

		int resultado = numerador / denominador;

		System.out.println(numerador + " / " + denominador + " = " + resultado);
	}

	public void calcularRaizQuadrada(int x) throws NumeroNaoNaturalException {

		if (x < 0) {

			throw new NumeroNaoNaturalException();
		}

		double resultado = Math.sqrt(x);

		System.out.println("Raiz de " + x + " = " + resultado);
	}
}
