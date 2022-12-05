package aula16.excecoespersonalizadas;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calculadora1 = new Calculadora();
			calculadora1.calcularRaizQuadrada();

		} catch (NumeroNaoNaturalException nnne) {

			System.out.println(nnne.getMessage());
		}
	}
}
