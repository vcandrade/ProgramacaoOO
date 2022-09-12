package aula04.metodos;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciação de objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		// atribuição de valores aos atributos
		carro1.marca = "Ferrari";
		carro1.modelo = "458 Italia";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";

		carro2.marca = "Honda";
		carro2.modelo = "Civic";
		carro2.ano = 2021;
		carro2.placa = "MNO-9876";
		carro2.cor = "Azul";

		System.out.println(carro1);
		System.out.println(carro2);
		
		carro2.ligar();
		
		carro2.acelerar(15);
		carro2.acelerar(20);
		carro2.acelerar(10);
		carro2.acelerar(5);
		carro2.acelerar(30);
		
		carro1.acelerar(25);

		System.out.println(carro1);
		System.out.println(carro2);
	}
}
