package aula07.metodosconstrutores;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciar objetos
		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("MNO-9876");
		Carro carro3 = new Carro(2015);

		// obter valores dos atributos do objeto
		carro1.imprimirDados();
		carro2.imprimirDados();
		carro3.imprimirDados();
	}
}
