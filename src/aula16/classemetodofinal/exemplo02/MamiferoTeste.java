package aula16.classemetodofinal.exemplo02;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {

		Mamifero mamifero = null;

		Scanner input = new Scanner(System.in);

		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		System.out.print("Op��o: ");

		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			mamifero = new Gato("Garfield", "Amarelo");
			break;

		case 2:
			mamifero = new Cachorro("Tot�", "Caramelo");
			break;

		case 3:
			mamifero = new Cavalo("P� de Lama", "Marchad�o");
		}

		mamifero.emitirSom();
	}
}
