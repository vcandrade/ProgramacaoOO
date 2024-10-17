package aula01.primeiroprograma;

public class SaidaDados {

	public static void main(String[] args) {
		
		String nome = "João da Silva";
		int idade = 30;
		double peso = 75.9;
		
		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.printf("%s possui %d anos e %f kg.\n", nome, idade, peso);
		System.out.println("Disciplina: Programação Orientada a Objetos");
	}
}
