package aula07.metodoconstrutor;

public class Carro {

	// atributos de instância
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;

	// método(s) construtor(es) da classe Carro
	public Carro(String placa) {

		this("Modelo Indefinido", "Marca Indefinida", 0, placa, "Cor Indefinida");
	}

	public Carro(int ano) {

		this("Modelo Indefinido", "Marca Indefinida", ano, "Placa Indefinida", "Cor Indefinida");
	}

	public Carro(String modelo, String marca) {

		this(modelo, marca, 0, "Placa Indefinida", "Cor Indefinida");
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

		if (!this.ligado) {

			this.ligado = true;
			System.out.println(this.marca + " " + this.modelo + " está ligando.");

		} else {

			System.out.println(this.marca + " " + this.modelo + " já está ligado.");
		}
	}

	public void desligar() {

		if (this.ligado) {

			if (this.velocidade == 0) {

				this.ligado = false;
				System.out.println(this.marca + " " + this.modelo + " está desligando.");

			} else {

				System.out.println(this.marca + " " + this.modelo + " deve estar parado para ser desligado.");
			}

		} else {

			System.out.println(this.marca + " " + this.modelo + " já está desligado.");
		}
	}

	public void acelerar(int valor) {

		if (this.ligado) {

			this.velocidade += valor;

			if (this.velocidade > 200) {

				this.velocidade = 200;
			}

			System.out.println(this.marca + " " + this.modelo + " está acelerando.");

		} else {

			System.out.println(this.marca + " " + this.modelo + " está desligado.");
		}
	}

	public void frear(int valor) {

		if (this.ligado) {

			this.velocidade -= valor;

			if (this.velocidade < 0) {

				this.velocidade = 0;
			}

			System.out.println(this.marca + " " + this.modelo + " está freando.");

		} else {

			System.out.println(this.marca + " " + this.modelo + " está desligado.");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", velocidade=" + velocidade + ", ligado=" + ligado + "]";
	}
}
