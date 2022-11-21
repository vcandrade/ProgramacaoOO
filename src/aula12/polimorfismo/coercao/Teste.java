package aula12.polimorfismo.coercao;

public class Teste {

	public static void main(String[] args) {
		
		float w = (float) 12.34;
		int x = (int) 56.78;
		
		double y = 10;
		int z = 'z';
		
		System.out.println("float: " + w);
		System.out.println("int: " + x);
		System.out.println("double: " + y);
		System.out.println("int: " + z);
	}
}
