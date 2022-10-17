package aula10.collections.contabancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contas;

	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<ContaBancaria>();
	}

	public void criarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);
		this.contas.add(conta);
	}

	public void solicitarSaque(int numeroConta, double valor) {

		boolean verificacao = false;

		for (ContaBancaria contaBancaria : this.contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.realizarSaque(valor);
				verificacao = true;
				break;
			}
		}
		if (verificacao == false) {

			System.out.println("Conta não encontrada.");
		}
	}

	public void solicitarDeposito(int numeroConta, double valor) {

		boolean verificacao = false;

		for (ContaBancaria contaBancaria : this.contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.realizarDeposito(valor);
				verificacao = true;
				break;
			}
		}
		if (verificacao == false) {

			System.out.println("Conta não encontrada.");
		}
	}

	public void solicitarSaldo(int numeroConta) {

		boolean verificacao = false;

		for (ContaBancaria contaBancaria : this.contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.verificarSaldo();
				verificacao = true;
				break;
			}
		}
		if (verificacao == false) {

			System.out.println("Conta não encontrada.");
		}
	}
}
