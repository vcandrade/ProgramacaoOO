package aula05.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {
		
		// instanciação de objetos
		Carro carro1 = new Carro("Ferrari", "458 Italia", 2020, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("Volkswagen", "Gol", 2015);
		Carro carro3 = new Carro();

		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
