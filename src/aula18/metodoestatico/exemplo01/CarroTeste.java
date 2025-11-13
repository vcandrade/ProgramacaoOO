package aula18.metodoestatico.exemplo01;

public class CarroTeste {

	public static void main(String[] args) {		
		
		Carro carro1 = new Carro("Gol", "Volkswagen", "ABC-1234");
		Carro carro2 = new Carro("Onix", "Chevrolet", "MNO-9876");
		
		/* 
		 * como os carros precisam armazenar seus estados (modelo, marca, placa e ligado), 
		 * então é necessário instanciá-los para só depois invocar os métodos de cada carro 
		 * 
		 * */
		
		carro1.verificarEstado();
		carro2.verificarEstado();

		carro1.ligar();
		
		carro1.verificarEstado();
		carro2.verificarEstado();
	}
}
