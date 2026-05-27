package aula17.polimorfismo.sobreposicao.exemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImovelTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Imovel imovel = null;

		System.out.println("1 - Imóvel Novo");
		System.out.println("2 - Imóvel Usado");
		System.out.print("Opção: ");
		int opcao = input.nextInt();

		switch (opcao) {

		case 1:

			imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 200000.00);
			break;

		case 2:
			imovel = new ImovelUsado("Balduíno Taques, 2048", 500000.00, 150000.00);
			break;
		}
		imovel.imprimirDados();

		List<Imovel> listaImoveis = new ArrayList<>();

		listaImoveis.add(new ImovelNovo("Monteiro Lobato", 600000.00, 150000.00));
		listaImoveis.add(new ImovelUsado("Av. Brasil", 400000.00, 50000.00));

	}
}
