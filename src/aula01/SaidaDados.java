package aula01;

public class SaidaDados {

	public static void main(String [] args) {
		
		String nome = "João da Silva";
		int idade = 30;
		double peso = 78.9;
		
		System.out.print(nome + " possui " + idade + " anos e " + String.format("%.2f", peso) + "kg.");
		
		System.out.println(nome + " possui " + idade + " anos e " + String.format("%.2f", peso) + "kg.");
		
		System.out.printf("%s possui %d anos e %.2f kg.\n", nome, idade, peso);
	}
}
