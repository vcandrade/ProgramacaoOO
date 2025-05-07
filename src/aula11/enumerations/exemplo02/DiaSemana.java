package aula11.enumerations.exemplo02;

public enum DiaSemana {

	DOMINGO(1, "Domingo"), 
	SEGUNDA(2, "Segunda-feira"), 
	TERCA(3, "Terça-feira"), 
	QUARTA(4, "Quarta-feira"),
	QUINTA(5, "Quinta-feira"), 
	SEXTA(6, "Sexta-feira"), 
	SABADO(7, "Sábado");

	private int diaSemana;
	private String diaExtenso;

	private DiaSemana(int diaSemana, String diaExtenso) {

		this.diaSemana = diaSemana;
		this.diaExtenso = diaExtenso;
	}

	public int getDiaSemana() {
		return diaSemana;
	}

	public String getDiaExtenso() {
		return diaExtenso;
	}
}
