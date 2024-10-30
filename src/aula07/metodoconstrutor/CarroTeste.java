package aula07.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciação de objetos da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari");
		Carro carro2 = new Carro("MNO-9876");
		Carro carro3 = new Carro("911 Carrera", "Porsche", 2022, "XYZ-1597", "Branca");
		Carro carro4 = new Carro(2010);

		// obtenção dos valores dos atributos de cada objeto
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		System.out.println(carro4);
	}
}
