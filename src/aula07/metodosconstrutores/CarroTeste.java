package aula07.metodosconstrutores;

public class CarroTeste {

	public static void main(String[] args) {

		// criar instâncias da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("Civic", "MNO-9876");
		Carro carro3 = new Carro("911 Carrera", 2022);

		// obtenção dos valores dos atributos dos carros por meio do método toString()
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
