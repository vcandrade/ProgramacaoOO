package aula15.sobreposicao.exemplo02;

public class ImovelTeste {

	public static void main(String[] args) {

		String opcao = "Imovel Usado";

		Imovel imovel = null;

		switch (opcao) {
			case "Imovel Novo":
				imovel = new ImovelNovo("Baldu�no Taques", 500000.00, 100000.00);
				break;
	
			case "Imovel Usado":
				imovel = new ImovelUsado("Vicente Machado", 500000.00, 200000.00);
				break;
		}
		
		imovel.imprimirDados();
	}
}
