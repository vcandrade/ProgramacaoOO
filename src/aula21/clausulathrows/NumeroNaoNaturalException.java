package aula21.clausulathrows;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
		
		super("Número não natural informado.");
	}
}
