package aula13.metodositeracao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exemplo04ListIterator {

	public static void main(String[] args) {

		List<Aluno> listaAlunos = new ArrayList<>();

		listaAlunos.add(new Aluno(111111, "João da Silva", "Tecnologia em Análise e Desenvolvimento de Sistemas"));
		listaAlunos.add(new Aluno(222222, "Maria de Oliveira", "Bacharelado em Ciência da Computação"));
		listaAlunos.add(new Aluno(333333, "Ricardo Carvalho", "Bacharelado em Ciências Biológicas"));
		listaAlunos.add(new Aluno(444444, "Ana Souza", "Tecnologia em Análise e Desenvolvimento de Sistemas"));

		ListIterator<Aluno> iterator = listaAlunos.listIterator();

		System.out.println("Percorrendo a lista a partir do início:");

		while (iterator.hasNext()) {

			int indice = iterator.nextIndex();
			Aluno aluno = iterator.next();

			System.out.println(indice + ": " + aluno.getNome());
		}

		System.out.println("Percorrendo a lista a partir do fim:");

		while (iterator.hasPrevious()) {

			int indice = iterator.previousIndex();
			Aluno aluno = iterator.previous();

			System.out.println(indice + ": " + aluno.getNome());
		}
	}
}
