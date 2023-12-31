package aula09.enumeration.exemplodiasemana;

public enum DiaSemana {

	DOMINGO(1, "Domingo"),
	SEGUNDA(2, "Segunda-Feira"),
	TERCA(3, "Ter�a-Feira"),
	QUARTA(4, "Quarta-Feira"),
	QUINTA(5, "Quinta-Feira"),
	SEXTA(6, "Sexta-Feira"),
	SABADO(7, "S�bado");
	
	private int diaSemanaNumerico;
	private String diaSemanaExtenso;
	
	private DiaSemana(int diaSemanaNumerico, String diaSemanaExtenso) {
		
		this.diaSemanaNumerico = diaSemanaNumerico;
		this.diaSemanaExtenso = diaSemanaExtenso;
	}

	public int getDiaSemanaNumerico() {
		return diaSemanaNumerico;
	}

	public String getDiaSemanaExtenso() {
		return diaSemanaExtenso;
	}
}
