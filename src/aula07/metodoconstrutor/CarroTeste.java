package aula07.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciação de objetos da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("MNO-9876");
		Carro carro3 = new Carro(2018);
		Carro carro4 = new Carro("Gol", "Volks", 2022);

		// invocação dos métodos dos objetos
		carro1.ligar();
		carro3.acelerar();
		carro3.desligar();
		
		System.out.println("================================================================================");

		// impressão dos dados de cada objeto por meio do método toString()
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		System.out.println(carro4);
	}
}
