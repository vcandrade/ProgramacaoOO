package aula15.heranca.exemplo01;

public class Aviao extends Veiculo {

	private int altitudeMaxima;

	public Aviao(String modelo, 
			     String fabricante, 
			     int anoFabricacao, 
			     int numeroPassageiros, 
			     String combustivel, 
			     int altitudeMaxima) {

		super(modelo, fabricante, anoFabricacao, numeroPassageiros, combustivel);
		this.altitudeMaxima = altitudeMaxima;
	}

	public void voar() {

		System.out.println(this.fabricante + " " + this.modelo + " está voando.");
	}
}
