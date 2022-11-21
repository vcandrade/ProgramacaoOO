package aula12.polimorfismo.sobrecarga;

public class Conversor {

	public int converter(double valor) {
		
		return (int) valor;
	}
	
	public int converter(char valor) {
		
		return valor;
	}
	
	public int converter(String valor) {
		
		return Integer.parseInt(valor);
	}
}
