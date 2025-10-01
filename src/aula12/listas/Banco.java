package aula12.listas;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contas;

	public Banco(String cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		if (this.verificarContaExistente(numeroConta) == null) {

			ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
			contas.add(contaBancaria);
			System.out.println("Conta " + numeroConta + " criada com sucesso.");

		} else {

			System.out.println("O número da conta já existe.");
		}
	}

	private ContaBancaria verificarContaExistente(int numeroConta) {

		for (ContaBancaria contaBancaria : this.contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				return contaBancaria;
			}
		}

		return null;
	}

	public void excluirConta(int numeroConta) {

		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);

		if (contaBancaria != null) {

			this.contas.remove(contaBancaria);
			System.out.println("Conta " + numeroConta + " excluída com sucesso.");

		} else {

			System.out.println("Conta Inexistente");
		}
	}

	public void verificarSaldoConta(int numeroConta) {

		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);

		if (contaBancaria != null) {

			System.out.println("====================================");
			System.out.println("Banco: " + this.nomeBanco);
			System.out.println("CNPJ: " + this.cnpj);
			
			contaBancaria.imprimirSaldo();

		} else {

			System.out.println("Conta Inexistente");
		}
	}

	public void efetuarSaqueConta(int numeroConta, double valor) {

		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);

		if (contaBancaria != null) {

			contaBancaria.sacar(valor);

		} else {

			System.out.println("Conta Inexistente");
		}
	}

	public void efetuarDepositoConta(int numeroConta, double valor) {

		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);

		if (contaBancaria != null) {

			contaBancaria.depositar(valor);

		} else {

			System.out.println("Conta Inexistente");
		}
	}
}
