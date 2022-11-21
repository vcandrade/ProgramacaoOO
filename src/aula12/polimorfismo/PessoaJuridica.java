package aula12.polimorfismo;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	
	public void validarDocumento() {

		System.out.println("Validando CNPJ.");
	}
}
