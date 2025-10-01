package aula13.metodositeracao;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01ForTradicional {

	public static void main(String[] args) {

		List<Aluno> listaAlunos = new ArrayList<>();

		listaAlunos.add(new Aluno(111111, "João da Silva", "Tecnologia em Análise e Desenvolvimento de Sistemas"));
		listaAlunos.add(new Aluno(222222, "Maria de Oliveira", "Bacharelado em Ciência da Computação"));
		listaAlunos.add(new Aluno(333333, "Ricardo Carvalho", "Bacharelado em Ciências Biológicas"));
		listaAlunos.add(new Aluno(444444, "Ana Souza", "Tecnologia em Análise e Desenvolvimento de Sistemas"));

		for (int i = 0; i < listaAlunos.size(); i++) {

			Aluno aluno = listaAlunos.get(i);

			System.out.println("Nome: " + aluno.getNome());
		}
	}
}
