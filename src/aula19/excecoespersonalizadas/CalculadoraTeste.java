package aula19.excecoespersonalizadas;

public class CalculadoraTeste {

	public static void main(String[] args) {

		try {
			
			Calculadora calc = new Calculadora();
			calc.dividir(10, 2);
			calc.calcularRaizQuadrada(9);
		
		} catch (NumeroNaoNaturalException e) {
			
			System.out.println(e.getMessage());
		
		} catch (ArithmeticException e) {
			
			System.out.println("Impossível dividir por zero.");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
