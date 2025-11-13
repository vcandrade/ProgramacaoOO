package aula18.classemetodoabstrato.exemplo01;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Assalariado assalariado1 = new Assalariado("João da Silva", "123.456.789-10", 5000.00, 2000.00);
		assalariado1.imprimirDados();
		
		Comissionado comissionado1 = new Comissionado("Maria de Oliveira", "987.654.321-12", 5000.00, 100000.00, 0.05);
		comissionado1.imprimirDados();
		
		Horista horista1 = new Horista("Ricardo Carvalho", "159.753.444-88", 5000.00, 15.00, 160);
		horista1.imprimirDados();
	}
}
