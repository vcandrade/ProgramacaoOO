package aula16.polimorfismo.coercao.tiposobjetos;

public class Imovel {

	protected String endereco;
	protected double valorBase;

	public Imovel(String endereco, double valorBase) {

		this.endereco = endereco;
		this.valorBase = valorBase;
	}

	public void imprimirDados() {

		System.out.println("Imprimindo dados da classe pai");
	}

	public double calcularValorImovel() {

		return 0.0;
	}
}
