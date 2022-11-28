package aula15.realizacao;

public class Correios implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 13.00 + (distancia * 0.35);
	}
}
