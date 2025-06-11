package aula17.realizacao.exemplo02;

public class PessoaFisica extends Pessoa implements Nado, Caminho {

	private String cpf;
	private String sexo;
	
	public PessoaFisica(String nome, String cpf, String sexo) {
		
		super(nome);
		this.cpf = cpf;
		this.sexo = sexo;
	}

	@Override
	public void caminhar() {

		System.out.println(this.nome + " está caminhando.");
	}

	@Override
	public void nadar() {

		System.out.println(this.nome + " está nadando.");
	}
}
