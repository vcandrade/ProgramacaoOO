package aula10.associacoesclasses;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa1 = new Pessoa("João da Silva", "01/02/2002", "Masculino", "joao@email.com", "Solteiro", endereco1);
		pessoa1.imprimirDados();
		
		System.out.println("==============================");
		
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", "05/05/2005", "Feminino", "maria@email.com", "Casada", "Balduíno Taques", 2048, "Centro", "Ponta Grossa", "PR");
		pessoa2.imprimirDados();
	}
}
