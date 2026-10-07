package aula11.enumeracoes.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(1, "07/10/2026");
		pedido1.imprimirDadosPedido();

		pedido1.alterarPedido(Status.PROCESSANDO);
		pedido1.imprimirDadosPedido();

		pedido1.alterarPedido(Status.ENVIADO);
		pedido1.imprimirDadosPedido();

		pedido1.alterarPedido(Status.ENTREGUE);
		pedido1.imprimirDadosPedido();
	}
}
