package aula11.heranca;

public class Aviao extends Veiculo {

	private int altitudeMaxima;
	
	public Aviao(String modelo, 
			String fabricante, 
			int ano, 
			int numeroPassageiros, 
			String combustivel,
			int altitudeMaxima) {
		
		super(modelo,fabricante, ano, numeroPassageiros, combustivel);
		this.altitudeMaxima = altitudeMaxima;
	}
	
	public void voar() {
		
		System.out.println(fabricante + " " + modelo + " está voando.");
	}

	@Override
	public String toString() {
		return "Aviao [modelo=" + modelo + ", fabricante=" + fabricante + ", ano=" + ano + ", numeroPassageiros="
				+ numeroPassageiros + ", combustivel=" + combustivel + ", altitudeMaxima=" + altitudeMaxima + "]";
	}
}
