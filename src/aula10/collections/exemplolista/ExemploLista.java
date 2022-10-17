package aula10.collections.exemplolista;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Maria de Oliveira", 30, 50.5);
		Pessoa pessoa2 = new Pessoa("João da Silva", 35, 78.9);
		Pessoa pessoa3 = new Pessoa("Ricardo Carvalho", 27, 65.9);

		List<Pessoa> listaGenerica = new ArrayList<Pessoa>();

		listaGenerica.add(pessoa1);
		listaGenerica.add(pessoa2);
		listaGenerica.add(pessoa3);

		for (Pessoa pessoa : listaGenerica) {
			int anoNascimento = 2022 - pessoa.getIdade();
			System.out.println("Nascida em: " + anoNascimento);
		}
	}
}
