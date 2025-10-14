package aula14.mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exemplo09Iterator {

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

		Iterator<Map.Entry<Integer, Aluno>> it = alunos.entrySet().iterator();
		
		while (it.hasNext()) {
		   
			Entry<Integer, Aluno> entry = it.next();
			
			int chave = entry.getKey();
			Aluno aluno = entry.getValue();
			
			System.out.println("Chave: " + chave);
			System.out.println("RA: " + aluno.getRa());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Curso: " + aluno.getCurso());
		}
	}
}
