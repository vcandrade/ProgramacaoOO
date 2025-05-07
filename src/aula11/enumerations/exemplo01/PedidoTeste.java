package aula11.enumerations.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(10, "07/05/2025");
		pedido1.imprimirDadosPedido();

		pedido1.alterarStatus(Status.PROCESSANDO);
		pedido1.imprimirDadosPedido();
		
		pedido1.alterarStatus(Status.ENVIADO);
		pedido1.imprimirDadosPedido();
		
		pedido1.alterarStatus(Status.ENTREGUE);
		pedido1.imprimirDadosPedido();
	}
}
