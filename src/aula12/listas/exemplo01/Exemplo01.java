package aula12.listas.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Maria de Oliveira", 20, 50.7);
		Pessoa p2 = new Pessoa("João da Silva", 30, 70.2);
		Pessoa p3 = new Pessoa("Ricardo Carvalho", 35, 65.9);
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		
		for (int i = 0; i < listaPessoas.size(); i++) {
			
			Pessoa pessoa = listaPessoas.get(i);
			
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Peso: " + pessoa.getPeso());
			System.out.println("==========================");
		}		
	}
}
