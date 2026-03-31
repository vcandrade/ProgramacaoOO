package aula07.metodoconstrutor;

public class Carro {

	// atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;
	
	// método construtor
	public Carro(String placa) {
		
		this("", "", 0, placa, "");
	}
	
	public Carro(int ano) {
		
		this("", "", ano, "", "");
	}
	
	public Carro(String modelo, String marca, int ano) {
		
		this(modelo, marca, ano, "", "");
	}
	
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.velocidade = 0;
		this.ligado = false;
	}

	// métodos da classe Carro
	public void ligar() {

		System.out.println(this.marca + " " + this.modelo + " ligou.");
	}

	public void desligar() {

		System.out.println(this.marca + " " + this.modelo + " desligou.");
	}

	public void acelerar() {

		System.out.println(this.marca + " " + this.modelo + " acelerou.");
	}

	public void frear() {

		System.out.println(this.marca + " " + this.modelo + " freou.");
		
		if (this.velocidade == 0) {
			
			this.desligar();
		}
	}

	// implementar o método toString()
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", velocidade=" + velocidade + ", ligado=" + ligado + "]";
	}	
}
