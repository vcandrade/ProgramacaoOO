package aula19.realizacao.exemplo01;

public class Correios implements Frete {

	@Override
	public double calcularFrete(int distancia) {

		return 15.00 + (distancia * 0.35);
	}
}
