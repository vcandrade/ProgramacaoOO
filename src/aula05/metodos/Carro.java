package aula05.metodos;

public class Carro {

	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;

	public void ligar() {

		System.out.println(marca + " " + modelo + " está ligando.");
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

	public String toString() {
		return modelo + " " + marca + " " + ano + " " + placa + " " + cor;
	}
}
