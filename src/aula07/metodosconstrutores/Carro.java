package aula07.metodosconstrutores;

public class Carro {

	// Atributos da classe Carro

	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;

	// =======================================================================
	// Métodos Construtores

	public Carro(String modelo, String marca, int ano, String placa, String cor) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
		this.velocidade = 0;
	}

	public Carro(String modelo, String placa) {

		this(modelo, "Default", 0, placa, "Default");
	}

	public Carro(int ano, String placa) {

		this("Default", "Default", ano, placa, "Default");
	}

	public Carro(String modelo, int ano) {

		this(modelo, "Default", ano, "Default", "Default");
	}

	// =======================================================================
	// Métodos da Classe Carro

	public void ligar() {

		System.out.println(this.marca + " " + this.modelo + " está ligando.");
	}

	public void desligar() {

		System.out.println(marca + " " + modelo + " está desligando.");
	}

	public void acelerar() {

		System.out.println(marca + " " + modelo + " está acelerando.");
	}

	public void frear() {

		System.out.println(marca + " " + modelo + " está freando.");
	}

	// =======================================================================
	// Método toString()

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
