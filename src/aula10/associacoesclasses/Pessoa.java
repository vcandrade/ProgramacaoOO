package aula10.associacoesclasses;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco end;

	public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil, Endereco end) {

		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.end = end;
	}

	public void imprimirDados() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Estado Civil: " + this.estadoCivil);
		System.out.println("Logradouro: " + this.end.getLogradouro());
		System.out.println("Número: " + this.end.getNumero());
		System.out.println("Bairro: " + this.end.getBairro());
		System.out.println("Cidade: " + this.end.getCidade());
		System.out.println("UF: " + this.end.getUnidadeFederativa());
	}
}
