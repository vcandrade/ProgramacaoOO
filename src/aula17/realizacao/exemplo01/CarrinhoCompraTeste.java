package aula17.realizacao.exemplo01;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {

		CarrinhoCompra carrinhoCompra1 = new CarrinhoCompra(500.00, 100, new Correios());
		carrinhoCompra1.realizarCompra();

		CarrinhoCompra carrinhoCompra2 = new CarrinhoCompra(500.00, 100, new Sedex());
		carrinhoCompra2.realizarCompra();
	}
}
