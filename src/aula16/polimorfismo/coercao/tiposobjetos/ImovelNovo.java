package aula16.polimorfismo.coercao.tiposobjetos;

public class ImovelNovo extends Imovel {

	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {

		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public void imprimirDados() {

		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base: R$" + this.valorBase);
		System.out.println("Valor Adicional: R$" + this.valorAdicional);
		System.out.println("Valor Total: R$" + this.calcularValorImovel());
	}

	public double calcularValorImovel() {

		return this.valorBase + this.valorAdicional;
	}
}
