package aula11.enumeration.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(111, "24/09/2025");
		pedido1.imprimirPedido();

		System.out.println("========================");

		pedido1.atualizarStatus(Status.PROCESSANDO);
		pedido1.imprimirPedido();

		System.out.println("========================");

		pedido1.atualizarStatus(Status.ENVIADO);
		pedido1.imprimirPedido();

		System.out.println("========================");

		pedido1.atualizarStatus(Status.ENTREGUE);
		pedido1.imprimirPedido();
	}
}
