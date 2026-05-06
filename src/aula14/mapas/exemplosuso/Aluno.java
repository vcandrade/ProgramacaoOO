package aula14.mapas.exemplosuso;

	public class Aluno {
	
		private int registroAcademico;
		private String nome;
		private double coeficiente;
		
		public Aluno(int registroAcademico, String nome, double coeficiente) {
		
			this.registroAcademico = registroAcademico;
			this.nome = nome;
			this.coeficiente = coeficiente;
		}
	
		public int getRegistroAcademico() {
			return registroAcademico;
		}
	
		public String getNome() {
			return nome;
		}
	
		public double getCoeficiente() {
			return coeficiente;
		}
	}
