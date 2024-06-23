package aula16.classemetodofinal.exemplo01;

public class FuncionarioTeste {

	public static void main(String[] args) {

		double salarioFinal = 0.0;

		Comissionado comissionado = new Comissionado("João", 123, 5000.00, 50000.00, 0.10);
		salarioFinal = comissionado.calcularSalario();
		System.out.println("Salário Final Comissionado: R$" + salarioFinal);

		Horista horista = new Horista("Maria", 987, 5000.00, 160, 15.00);
		salarioFinal = horista.calcularSalario();
		System.out.println("Salário Final Horista: R$" + salarioFinal);

		Assalariado assalariado = new Assalariado("Ricardo", 456, 5000.00, 1500.00);
		salarioFinal = assalariado.calcularSalario();
		System.out.println("Salário Final Assalariado: R$" + salarioFinal);
	}
}
