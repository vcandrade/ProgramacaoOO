package aula05.metodos;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciar objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		// atribuir valores aos atributos de cada objeto
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Amarelo";

//		carro2.modelo = "Onix";
//		carro2.marca = "Chevrolet";
//		carro2.ano = 2024;
//		carro2.placa = "MNO-9876";
//		carro2.cor = "Preto";
//
//		// obter valores dos atributos do objeto
//		carro1.imprimirDados();
//		carro2.imprimirDados();
//
//		System.out.println("===========================");
//		carro1.ligar();
//		carro1.acelerar();
//
//		carro2.ligar();

		System.out.println("==== M�todo toString() ====");
		System.out.println(carro1);
//		System.out.println(carro2);
	}
}
