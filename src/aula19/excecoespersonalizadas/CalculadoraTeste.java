package aula19.excecoespersonalizadas;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {

			Calculadora calc = new Calculadora();
			calc.calcularRaizQuadrada(-81);

		} catch (NumeroNaoNaturalException e) {

			System.out.println(e.getMessage());
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
