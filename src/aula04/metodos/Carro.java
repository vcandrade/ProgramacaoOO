package aula04.metodos;

public class Carro {

	String marca;
	String modelo;
	int ano;
	String placa;
	String cor;
	boolean ligado = false; // true = ligado; false = desligado
	int velocidade = 0;

	public void ligar() {

		ligado = true;
		System.out.println(marca + " " + modelo + " est� ligando.");
	}

	public void desligar() {

		ligado = false;
		System.out.println(marca + " " + modelo + " est� desligando.");
	}

	public void acelerar(int vel) {

		if (ligado) {

			velocidade += vel;
			System.out.println(marca + " " + modelo + " est� acelerando.");

		} else {

			System.out.println("N�o � poss�vel acelerar. " + marca + " " + modelo + " est� desligado.");
		}
	}

	public void frear(int vel) {

		if (ligado) {

			velocidade -= vel;
			System.out.println(marca + " " + modelo + " est� freando.");

		} else {

			System.out.println("N�o � poss�vel acelerar. " + marca + " " + modelo + " est� desligado.");
		}
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}
}
