package aula07.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {

		// criação de instâncias (objetos) da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("Civic", "Honda", 2018);
		Carro carro3 = new Carro("XYZ-5555");

		// representação textual dos objetos por meio do método toString()
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
