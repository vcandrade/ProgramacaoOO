package aula01;

public class SaidaDados {

	public static void main(String [] args) {
		
		String nome = "João da Silva";
		int idade = 25;
		double peso = 78.2;
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.print(nome + " possui " + idade + " anos e " + peso + "kg.\n");
		System.out.printf("%s possui %d anos e %.2f kg.\n", nome, idade, peso);
		
		System.out.println("Universidade Tecnológica Federal do Paraná");
		System.out.println("Programação Orientada a Objetos");
	}
}
