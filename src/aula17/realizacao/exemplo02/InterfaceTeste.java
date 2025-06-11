package aula17.realizacao.exemplo02;

public class InterfaceTeste {

	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica("João da Silva", "Masculino", "123.456.789-10");
		pf.caminhar();
		pf.nadar();

		Passaro passaro = new Passaro();
		passaro.voar();

		Peixe peixe = new Peixe();
		peixe.nadar();

		Pato pato = new Pato();
		pato.nadar();
		pato.caminhar();
		pato.voar();
	}
}
