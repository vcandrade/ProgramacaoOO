package aula14.mapas.exemplosuso;

import java.util.LinkedHashMap;
import java.util.Map;

public class Disciplina {

	private int codigo;
	private String nome;
	private int limiteVagas;
	
	private Map<Integer, Aluno> alunosMatriculados;

	public Disciplina(int codigo, String nome, int limiteVagas) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.limiteVagas = limiteVagas;
		
		this.alunosMatriculados = new LinkedHashMap<>();
	}
	
	public void matricularAluno(int registroAcademico, String nome, double coeficiente) {
		
		if (this.alunosMatriculados.size() == this.limiteVagas) {
			
			System.out.println("ERRO: Limite de vagas atingido.");
			return;
		}
		
		Aluno aluno = new Aluno(registroAcademico, nome, coeficiente);
		
		if (this.verificarMatriculaAluno(registroAcademico)) {
			
			System.out.println("ERRO: Aluno " + aluno.getNome() + "(RA " + aluno.getRegistroAcademico() +") já encontram-se matriculado na disciplina (" + this.codigo + ") " + this.nome);
			return;
		}
		
		this.alunosMatriculados.put(aluno.getRegistroAcademico(), aluno);
		System.out.println("Aluno " + aluno.getNome() + "(RA " + aluno.getRegistroAcademico() +") matriculado com sucesso na disciplina (" + this.codigo + ") " + this.nome);
	}
	
	private boolean verificarMatriculaAluno(int registroAcademico) {
		
		return this.alunosMatriculados.containsKey(registroAcademico);
	}
	
	public void exibirListaAlunosMatriculados() {
		
		if (this.alunosMatriculados.isEmpty()) {
			
			System.out.println("Não há alunos matriculados na disciplina " + this.codigo + " - " + this.nome);
			return;
		}
		
		System.out.println("========================================================================");
		System.out.println("Relação de Alunos Matriculados na Disciplina " + this.codigo + " " + this.nome);
		System.out.println();
		
		this.alunosMatriculados.forEach((registroAcademico, aluno) -> {
			
			System.out.println("Registro Acadêmico: " + registroAcademico + " "
					         + "Nome: " + aluno.getNome() + " "
					         + "Coeficiente: " + aluno.getCoeficiente());
		});
		
		System.out.println("========================================================================");
	}
	
	public void cancelarMatriculaAluno(int registroAcademico) {
		
		if (this.alunosMatriculados.remove(registroAcademico) != null) {
			
			System.out.println("Matricula cancelada com sucesso.");
		
		} else {
			
			System.out.println("ERRO: Matrícula não encontrada.");
		}
	}
}
