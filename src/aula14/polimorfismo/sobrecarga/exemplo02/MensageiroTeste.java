package aula14.polimorfismo.sobrecarga.exemplo02;

public class MensageiroTeste {

	public static void main(String[] args) {
        
		Mensageiro mensageiro = new Mensageiro();

        mensageiro.imprimirMensagem("Ol�, Tudo bem?");
        
        mensageiro.imprimirMensagem(99887766);
        
        mensageiro.imprimirMensagem("Orienta��o a Objetos", 11223344);
    }
}
