package aula07.metodosconstrutores;

public class Carro {

	// atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;

	// m�todos construtores
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.velocidade = 0;
		this.ligado = false;
	}

	public Carro(String placa) {

		this("N�o informado", "N�o informado", 0, placa, "N�o informado");
	}

	public Carro(int ano) {

		this("N�o informado", "N�o informado", ano, "N�o informado", "N�o informado");
	}
	
	public void obterNumeroCaracteres() {
		
		int numeroCaracteres = this.modelo.length();
		System.out.println(numeroCaracteres);
	}

	// m�todos da classe
	public void ligar() {

		System.out.println(marca + " " + modelo + " est� ligando.");
	}

	public void desligar() {

		System.out.println(this.marca + " " + modelo + " est� desligando.");
	}

	public void acelerar() {

		System.out.println(marca + " " + modelo + " est� acelerando.");
	}

	public void frear() {

		System.out.println(marca + " " + modelo + " est� freando.");
	}

	public void imprimirDados() {

		System.out.println("===========================");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Cor: " + this.cor);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Ligado: " + this.ligado);
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
