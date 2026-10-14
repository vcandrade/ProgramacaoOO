package aula13.metodositeracao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo11StreamCollect {

	public static void main(String[] args) {

		List<Aluno> listaAlunos = new ArrayList<>();

		listaAlunos.add(new Aluno(111111, "João da Silva", "Tecnologia em Análise e Desenvolvimento de Sistemas"));
		listaAlunos.add(new Aluno(222222, "Maria de Oliveira", "Bacharelado em Ciência da Computação"));
		listaAlunos.add(new Aluno(333333, "Ricardo Carvalho", "Bacharelado em Ciências Biológicas"));
		listaAlunos.add(new Aluno(444444, "Ana Souza", "Tecnologia em Análise e Desenvolvimento de Sistemas"));

		List<Aluno> listaFilter = listaAlunos.stream()
				.filter(aluno -> aluno.getCurso().equals("Tecnologia em Análise e Desenvolvimento de Sistemas"))
				.collect(Collectors.toList());

		listaFilter.forEach(aluno -> System.out.println(aluno.getNome()));
	}
}
