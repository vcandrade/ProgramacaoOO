package aula15.heranca.exemplo01;

public class VeiculoTeste {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Gol", "Volks", 2015, 5, "Flex", 5);
		carro1.calibrarPneus();
		carro1.abastecer();

		Aviao aviao1 = new Aviao("A-380", "AirBus", 1980, 800, "Combustível de Avição", 45000);
		aviao1.voar();
		aviao1.abastecer();
	}
}
