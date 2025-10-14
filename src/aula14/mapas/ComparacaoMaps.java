package aula14.mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComparacaoMaps {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(111111, "João da Silva", "Tecnologia em Análise e Desenvolvimento de Sistemas");
		Aluno aluno2 = new Aluno(222222, "Maria de Oliveira", "Bacharelado em Ciência da Computação");
		Aluno aluno3 = new Aluno(333333, "Ricardo Carvalho", "Bacharelado em Ciências Biológicas");
		Aluno aluno4 = new Aluno(444444, "Ana Souza", "Tecnologia em Análise e Desenvolvimento de Sistemas");

		Map<Integer, Aluno> alunosHashMap = new HashMap<>();
		alunosHashMap.put(333333, aluno3);
		alunosHashMap.put(111111, aluno1);
		alunosHashMap.put(444444, aluno4);
		alunosHashMap.put(222222, aluno2);
		
		Map<Integer, Aluno> alunosLinkedHashMap = new LinkedHashMap<>();
		alunosLinkedHashMap.put(333333, aluno3);
		alunosLinkedHashMap.put(111111, aluno1);
		alunosLinkedHashMap.put(444444, aluno4);
		alunosLinkedHashMap.put(222222, aluno2);
		
		Map<Integer, Aluno> alunosTreeMap = new TreeMap<>();
		alunosTreeMap.put(333333, aluno3);
		alunosTreeMap.put(111111, aluno1);
		alunosTreeMap.put(444444, aluno4);
		alunosTreeMap.put(222222, aluno2);

		System.out.println("Hash Map:");
		alunosHashMap.forEach((chave, aluno) -> System.out.println(aluno));
		
		System.out.println("Linked Hash Map:");
		alunosLinkedHashMap.forEach((chave, aluno) -> System.out.println(aluno));
		
		System.out.println("Tree Map:");
		alunosTreeMap.forEach((chave, aluno) -> System.out.println(aluno));
	}
}
