package aula15.sobreposicao.exemplo02;

public class ImovelNovo extends Imovel {

	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {

		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Valor Adicional: " + this.valorAdicional);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}

	private double calcularValorTotal() {

		return this.valorBase + this.valorAdicional;
	}
}
