package aula01.primeiroprograma;

public class ExemploSaidaDados {

	public static void main(String [] args) {
		
		String disciplina = "POO";
		String professor = "Vinícius";
		
		System.out.println("==== PRINTLN ====");
		System.out.println("Universidade Tecnológica Federal do Paraná");
		System.out.println(disciplina + " ministrada pelo Prof. " + professor);
		
		System.out.println("\n==== PRINT ====");
		System.out.print("Universidade Tecnológica Federal do Paraná");
		System.out.print(disciplina + " ministrada pelo Prof. " + professor);
		
		System.out.println("\n\n==== PRINTF ====");
		System.out.printf("Universidade Tecnológica Federal do Paraná");
		System.out.printf("%s ministrada pelo Prof. %s", disciplina, professor);
	}
}






