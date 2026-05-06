package aula14.mapas.exemplosuso;

public class DisciplinaTeste {

	public static void main(String[] args) {
		
		Disciplina disciplina = new Disciplina(123456, "Orientação a Objetos", 3);
		
		disciplina.exibirListaAlunosMatriculados();
		
		disciplina.matricularAluno(111111, "João da Silva", 0.75);
		disciplina.matricularAluno(222222, "Maria de Oliveira", 0.64);
		disciplina.matricularAluno(111111, "João da Silva", 0.75);
		disciplina.matricularAluno(333333, "Ricardo Carvalho", 0.81);
		disciplina.matricularAluno(444444, "Ana Souza", 0.71);
		
		disciplina.exibirListaAlunosMatriculados();
		
		disciplina.cancelarMatriculaAluno(222222);
		disciplina.exibirListaAlunosMatriculados();
	}
}
