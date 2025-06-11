package aula17.realizacao.exemplo01;

public class Correios implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 10 + (distancia * 0.30);
	}
}
