package aula15.realizacao;

public class ECommerceTeste {

	public static void main(String[] args) {
		
		CarrinhoCompra carrinhoCompra = new CarrinhoCompra(50.00, 100, new Sedex10());
		carrinhoCompra.realizarCompra();
	}
}
