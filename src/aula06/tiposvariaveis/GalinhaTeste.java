package aula06.tiposvariaveis;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha galinha1 = new Galinha("Giselda");
		Galinha galinha2 = new Galinha("Matilde");
		Galinha galinha3 = new Galinha("Clotilde");
		
		galinha1.botar();
		galinha1.botar();
		galinha1.botar();
		
		galinha2.botar();
		
		galinha3.botar();
		galinha3.botar();
		
		System.out.println(galinha1.nome + " botou " + galinha1.quantidadeOvos + " ovo(s).");
		System.out.println(galinha2.nome + " botou " + galinha2.quantidadeOvos + " ovo(s).");
		System.out.println(galinha3.nome + " botou " + galinha3.quantidadeOvos + " ovo(s).");
		
		System.out.println("Quantidade Total: " + Galinha.quantidadeOvosGranja);	
	}
}
