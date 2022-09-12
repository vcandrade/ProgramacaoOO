package aula02.entradadados;

public class EstraturuaCondicional {

	public static void main(String[] args) {
		
		double notaFinal = 10.0;
		
		if(notaFinal >= 6.0) {
			
			System.out.println("APROVADO");
		
		} else {
			
			if(notaFinal >= 4.0) {
				
				System.out.println("RECUPERAÇÂO");
			
			} else {
				
				System.out.println("REPROVADO");
			}
		}
	}
}
