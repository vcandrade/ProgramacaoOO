package aula18.metodoestatico.exemplo01;

public class Carro {

	private String modelo;
	private String marca;
	private String placa;
	private boolean ligado;
	
	public Carro(String modelo, String marca, String placa) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.ligado = false;
	}
	
	public void ligar() {
		
		this.ligado = true;
		System.out.println(this.marca + " " + this.modelo + " está ligando.");
		System.out.println("============================");
	}
	
	public void desligar() {
		
		this.ligado = false;
		System.out.println(this.marca + " " + this.modelo + " está desligando.");
		System.out.println("============================");
	}
	
	public void verificarEstado() {
		
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Placa: " + this.placa);
		System.out.println("Ligado: " + this.ligado);
		System.out.println("============================");
	}
}
