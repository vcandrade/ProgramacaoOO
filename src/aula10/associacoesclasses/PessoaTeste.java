package aula10.associacoesclasses;

public class PessoaTeste {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa1 = new Pessoa("João da Silva", "01/01/2000", "Masculino", "joao@email.com", endereco1);

		pessoa1.imprimirDados();

		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", "02/02/2002", "Feminino", "maria@email.com", "Monteiro Lobato", 2048, "Jd. Carvalho", "Ponta Grossa", "PR");
		pessoa2.imprimirDados();
	}
}
