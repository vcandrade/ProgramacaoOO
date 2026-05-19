package aula15.heranca.exemplo02;

public class ProfessorTeste {

	public static void main(String[] args) {

		Professor professor1 = new Professor(111, "João da Silva", "01/02/2010", 5000.00);
		professor1.lancarFrequencia();
		professor1.aplicarAvaliacao();
		professor1.imprimirDadosProfessor();

		System.out.println("====================================================");

		Coordenador coordenador1 = new Coordenador(222, "Maria de Oliveira", "15/01/2015", 5000.00, 2000.00);
		coordenador1.lancarFrequencia();
		coordenador1.aplicarAvaliacao();
		coordenador1.analisarPedidosSegundaChamada();
		coordenador1.analisarPedidoSuficiencia();
		coordenador1.participarReunioesDirecao();
		coordenador1.imprimirDadosCoordenador();
	}
}
