package aula08.associacaoclasse;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa1 = new Pessoa("Jo�o da Silva", "15/08/2000", "Masculino", "joao@email.com", endereco1);
		pessoa1.imprimirDados();
		
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", "10/10/2005", "Feminino", "maria@email.com", "Baldu�no Taques", 2048, "�rfas", "Ponta Grossa", "PR");
		pessoa2.imprimirDados();
	}
}
