package aula03.classeobjeto;

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
		
		// obtenção dos valores dos objetos
		System.out.println("ATRIBUTOS DO CARRO 1");
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor);
		
		System.out.println("\nATRIBUTOS DO CARRO 2");
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("Cor: " + carro2.cor);
	}
}
