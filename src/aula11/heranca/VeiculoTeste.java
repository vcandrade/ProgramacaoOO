package aula11.heranca;

public class VeiculoTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 5);
		System.out.println(carro1);
		carro1.abastecer();
		carro1.calibrarPneus();
		
		Aviao aviao1 = new Aviao("A-380", "AirBus", 2004, 853, "Combustível de Aviação", 43100);
		System.out.println(aviao1);
		aviao1.abastecer();
		aviao1.voar();
	}
}
