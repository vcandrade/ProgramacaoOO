package aula12.polimorfismo.sobrecarga;

public class ConversorTeste {

	public static void main(String[] args) {
		
		Conversor conversor = new Conversor();
		
		int x = conversor.converter(15.75);
		System.out.println("Inteiro x: " + x);

		int y = conversor.converter('y');
		System.out.println("Inteiro y: " + y);
		
		int z = conversor.converter("5");
		System.out.println("Inteiro z: " + z);
	}
}
