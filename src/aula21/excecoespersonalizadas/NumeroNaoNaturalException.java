package aula21.excecoespersonalizadas;

public class NumeroNaoNaturalException extends Exception {

	public NumeroNaoNaturalException() {
	
		super("Não são admitidos números não naturais.");
	}
}
