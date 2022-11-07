package aula11.heranca;

public class Carro extends Veiculo {

	private int numeroPortas;
	
	public Carro(String modelo, 
			String fabricante, 
			int ano, 
			int numeroPassageiros, 
			String combustivel,
			int numeroPortas) {
		
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.numeroPortas = numeroPortas;
	}
	
	public void calibrarPneus() {
	
		System.out.println(fabricante + " " + modelo + " está calibrando os pneus.");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", fabricante=" + fabricante + ", ano=" + ano + ", numeroPassageiros="
				+ numeroPassageiros + ", combustivel=" + combustivel + ", numeroPortas=" + numeroPortas + "]";
	}
}
