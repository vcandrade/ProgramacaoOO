package aula12.polimorfismo;

public class PessoaTeste {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.validarDocumento();
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.validarDocumento();
	}
}
