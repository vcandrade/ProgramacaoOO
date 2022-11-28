package aula15.realizacao;

public class Sedex implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 15.00 + (distancia * 0.45);
	}
}
