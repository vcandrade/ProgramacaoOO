package aula17.realizacao.exemplo02;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome) {
	
		super(nome);
	}
	
	public void contratarFuncionario() {
		
		System.out.println(this.nome + " está contratando.");
	}
}
