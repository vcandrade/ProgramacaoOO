package aula05;

public class Carro {

	String marca;
	String modelo;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;
	
	public Carro() {
		
		this("", "", 0, "", "");
	}
	
	public Carro(String marca, String modelo, int ano) {
		
		this(marca, modelo, ano, "", "");
	}

	public Carro(String marca, String modelo, int ano, String placa, String cor) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
		this.velocidade = 0;
	}
	public void ligar() {

		ligado = true;
		System.out.println(marca + " " + modelo + " está ligando.");
	}

	public void desligar() {

		ligado = false;
		System.out.println(marca + " " + modelo + " está desligando.");
	}

	public void acelerar(int vel) {

		if (ligado) {

			velocidade += vel;
			System.out.println(marca + " " + modelo + " está acelerando.");

		} else {

			System.out.println("Não é possível acelerar. " + marca + " " + modelo + " está desligado.");
		}
	}

	public void frear(int vel) {

		if (ligado) {

			velocidade -= vel;
			System.out.println(marca + " " + modelo + " está freando.");

		} else {

			System.out.println("Não é possível acelerar. " + marca + " " + modelo + " está desligado.");
		}
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}
}
