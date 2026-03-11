package aula02.entradadados;

public class OperadorTernario {

	public static void main(String[] args) {	
		
		int idade = 15;
		
		String resultado = (idade >= 16) ? "voto permitido" : "voto negado";
		
		System.out.println(resultado);
		
//		if (idade >= 16) {
//			
//			System.out.println("voto permitido");
//		
//		} else {
//			
//			System.out.println("voto negado");
//		}
	}
}
