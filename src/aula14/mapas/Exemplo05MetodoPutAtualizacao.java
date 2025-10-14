package aula14.mapas;

import java.util.HashMap;
import java.util.Map;

public class Exemplo05MetodoPutAtualizacao {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(111111, "João da Silva", "Tecnologia em Análise e Desenvolvimento de Sistemas");
		Aluno aluno2 = new Aluno(222222, "Maria de Oliveira", "Bacharelado em Ciência da Computação");
		Aluno aluno3 = new Aluno(333333, "Ricardo Carvalho", "Bacharelado em Ciências Biológicas");
		Aluno aluno4 = new Aluno(444444, "Ana Souza", "Tecnologia em Análise e Desenvolvimento de Sistemas");

		Map<Integer, Aluno> alunos = new HashMap<>();

		alunos.put(111111, aluno1);
		alunos.put(222222, aluno2);
		alunos.put(333333, aluno3);
		alunos.put(444444, aluno4);
		
		System.out.println(alunos.get(222222));
		
		Aluno aluno5 = new Aluno(222222, "Luiz Melo", "Engenharia Mecânica");
		alunos.put(222222, aluno5);
		System.out.println("Aluno 222222 atualizado com sucesso.");
		
		System.out.println(alunos.get(222222));
	}
}





