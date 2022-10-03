package aula09.enumeration.exemplostatuspedido;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(1, "10/10/2010");
		pedido1.imprimirPedido();
		
		System.out.println("----------------------------");
		pedido1.setStatus(Status.PROCESSANDO);
		pedido1.imprimirPedido();
		
		System.out.println("----------------------------");
		pedido1.setStatus(Status.ENVIADO);
		pedido1.imprimirPedido();
		
		System.out.println("----------------------------");
		pedido1.setStatus(Status.ENTREGUE);
		pedido1.imprimirPedido();
	}
}
