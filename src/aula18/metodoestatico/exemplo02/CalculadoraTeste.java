package aula18.metodoestatico.exemplo02;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		/* 
		 * Neste caso, a calculadora apenas faz os cálculos e apresenta em tela, não é
		 * necessário armazenar esses valores ou o estado da calculadora (marca, resultado 
		 * do cálculo, entre outros. Por isso, pode-se definir os métodos como estáticos
		 * e, consequentemente, podem ser invocados a partir da classe Calculadora, não
		 * sendo necessário instanciar a calculadora para utilizar os métodos dela. 
		 * 
		 * */
		
		Calculadora.somar(10, 5);
		Calculadora.subtrair(20, 15);
		Calculadora.multiplicar(5, 5);
		Calculadora.dividir(100, 2);
	}
}
