package aula01.primeiroprograma;

public class SaidaDados {

	public static void main(String [] args) {
		
		String nome = "João";
		int idade = 25;
		double peso = 78.2;
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.print(nome + " possui " + idade + " anos e " + peso + "kg.\n");
		System.out.printf("%s possui %d anos e %f kg.", nome, idade, peso);
	}
}
