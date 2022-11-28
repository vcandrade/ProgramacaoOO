package aula15.realizacao;

public class Sedex10 implements Frete {

	public double calcularFrete(int distancia) {
		
		return 16.00 + (distancia * 0.48);
	}
}
