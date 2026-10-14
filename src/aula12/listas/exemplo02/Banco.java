package aula12.listas.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String cnpj;
	private String nome;
	private List<ContaBancaria> listaContas;

	public Banco(String cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;

		this.listaContas = new ArrayList<>();
	}

	public void adicionarNovaConta(int numero, String titular) {

		if (numero <= 0) {

			System.out.println("Número da conta inválido.");
			return;
		}

		if (this.verificarExistenciaConta(numero) != null) {

			System.out.println("Conta de Número " + numero + " já existente.");
			return;
		}

		ContaBancaria contaBancaria = new ContaBancaria(numero, titular);
		this.listaContas.add(contaBancaria);

		System.out.println("Conta " + numero + " criada com sucesso.");
	}

	private ContaBancaria verificarExistenciaConta(int numero) {

//		>>>>>>>>>>>>>>>>>>  for each  <<<<<<<<<<<<<<<<<<

		for (ContaBancaria cb : this.listaContas) {

			if (cb.getNumero() == numero) {

				return cb;
			}
		}
		
		return null;

//		>>>>>>>>>>>>>>>  for tradicional  <<<<<<<<<<<<<<<
//		
//		for (int i = 0; i < this.listaContas.size(); i++) {
//
//			ContaBancaria cb = this.listaContas.get(i);
//
//			if (cb.getNumero() == numero) {
//
//				return cb;
//			}
//		}
//		return null;
	}

	public void excluirConta(int numero) {

		ContaBancaria contaBancaria = this.verificarExistenciaConta(numero);

		if (contaBancaria == null) {

			System.out.println("Conta " + numero + " não encontrada.");
			return;
		}

		this.listaContas.remove(contaBancaria);
		System.out.println("Conta " + numero + " removida com sucesso.");
	}

	public void verificarSaldoConta(int numero) {

		ContaBancaria contaBancaria = this.verificarExistenciaConta(numero);

		if (contaBancaria == null) {

			System.out.println("Conta " + numero + " não encontrada.");
		}

		contaBancaria.imprimirSaldo();
	}

	public void realizarDepositoConta(int numero, double valor) {

		ContaBancaria contaBancaria = this.verificarExistenciaConta(numero);

		if (contaBancaria == null) {

			System.out.println("Conta " + numero + " não encontrada.");
			return;
		}

		contaBancaria.depositar(valor);
	}

	public void realizarSaqueConta(int numero, double valor) {

		ContaBancaria contaBancaria = this.verificarExistenciaConta(numero);

		if (contaBancaria == null) {

			System.out.println("Conta " + numero + " não encontrada.");
			return;
		}

		contaBancaria.sacar(valor);
	}
}
