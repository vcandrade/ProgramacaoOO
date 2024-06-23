package aula10.associacoesclasses;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa1 = new Pessoa("João da Silva", "10/05/2000", "Masculino", "joao@gmail.com", end);
		
		pessoa1.imprimirDados();
		
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", "20/08/1995", "Feminino", "maria@gmail.com", "Monteiro Lobato", 2048, "Centro", "Ponta Grossa", "PR");
		pessoa2.imprimirDados();
	}
}
