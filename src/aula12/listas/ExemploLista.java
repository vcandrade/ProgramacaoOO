package aula12.listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Ricardo", 25, 70.7);
		Pessoa pessoa2 = new Pessoa("João", 27, 65.9);
		Pessoa pessoa3 = new Pessoa("Ana", 22, 50.1);
		
		List<Pessoa> listaGenerica = new ArrayList<>();
		
		listaGenerica.add(pessoa1); // 0
		listaGenerica.add(pessoa2); // 1
		listaGenerica.add(pessoa3); // 3
		
		for (int i = 0; i < listaGenerica.size(); i++) {
			
			Pessoa pessoa = listaGenerica.get(i);
			
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Peso: " + pessoa.getPeso());
			System.out.println("==========================");
		}
	}
}












