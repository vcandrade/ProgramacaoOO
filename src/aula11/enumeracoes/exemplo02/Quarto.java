package aula11.enumeracoes.exemplo02;

public class Quarto {

	private int numero;
	private TipoQuarto tipoQuarto;

	public Quarto(int numero, TipoQuarto tipoQuarto) {

		this.numero = numero;
		this.tipoQuarto = tipoQuarto;
	}

	public void imprimirDadosQuarto() {

		System.out.println("Número do Quarto: " + this.numero);
		System.out.println("Tipo do Quarto: " + this.tipoQuarto);

		System.out.println("Capacidade do Quarto: " + this.tipoQuarto.getCapacidade());
		System.out.println("Valor a Diária: R$" + this.tipoQuarto.getValorDiaria());
		System.out.println("Área do Quarto: " + this.tipoQuarto.getArea());
		System.out.println("Descrição do Quarto: " + this.tipoQuarto.getDescricao());
		
		System.out.println("======================================================");
	}
}
