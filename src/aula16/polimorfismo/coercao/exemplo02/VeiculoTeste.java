package aula16.polimorfismo.coercao.exemplo02;

import java.util.Scanner;

public class VeiculoTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Veiculo veiculo = null;
		
		System.out.println("1 - Carro");
		System.out.println("2 - Avião");
		System.out.print("Opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			
			case 1:
				// coerção implícita
				veiculo = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 5);
				break;
			
			case 2:
				// coerção implícita
				veiculo = new Aviao("A-380", "AirBus", 1995, 500, "Combustível de Aviação", 45000);
				break;
		}

		veiculo.abastecer();
		
		if (veiculo instanceof Aviao) {
			
			// coerção explícita
			Aviao aviao = (Aviao) veiculo;
			aviao.voar();
		}
	}
}
