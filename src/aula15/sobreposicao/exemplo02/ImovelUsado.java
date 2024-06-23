package aula15.sobreposicao.exemplo02;

public class ImovelUsado extends Imovel {

	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {

		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}

	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Valor Desconto: " + this.valorDesconto);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}

	private double calcularValorTotal() {

		return this.valorBase - this.valorDesconto;
	}
}
