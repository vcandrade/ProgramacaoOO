package aula15.heranca.exemplo01;

public class VeiculoTeste {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 5);
		carro1.calibrarPneus();
		carro1.abastecer();

		Aviao aviao1 = new Aviao("A-380", "AirBus", 1995, 500, "Combustível de Aviação", 45000);
		aviao1.voar();
		aviao1.abastecer();
	}
}
