package aula07.metodoconstrutor;

public class Carro {

	// Atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;
	
	// Métodos construtores da classe Carro
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public Carro(String modelo, String marca, int ano) {
		
		this(modelo, marca, ano, null, null);
	}
	
	public Carro(String placa) {
		
		this(null, null, 0, placa, null);
	}

	// Métodos da classe Carro
	public void ligar() {
		
		System.out.println(this.marca + " " + this.modelo + " está ligando.");
	}

	public void desligar() {

		System.out.println(this.marca + " " + this.modelo + " está desligando.");
	}

	public void acelerar() {

		System.out.println(this.marca + " " + this.modelo + " está acelerando.");
	}

	public void frear() {

		System.out.println(this.marca + " " + this.modelo + " está freando.");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}
}
