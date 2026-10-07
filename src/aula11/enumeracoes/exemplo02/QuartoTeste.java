package aula11.enumeracoes.exemplo02;

public class QuartoTeste {

	public static void main(String[] args) {

		Quarto quarto1 = new Quarto(101, TipoQuarto.SOLTEIRO);
		Quarto quarto2 = new Quarto(102, TipoQuarto.CASAL);
		Quarto quarto3 = new Quarto(103, TipoQuarto.SUITE);
		Quarto quarto4 = new Quarto(104, TipoQuarto.LUXO);

		quarto1.imprimirDadosQuarto();
		quarto2.imprimirDadosQuarto();
		quarto3.imprimirDadosQuarto();
		quarto4.imprimirDadosQuarto();
	}
}
