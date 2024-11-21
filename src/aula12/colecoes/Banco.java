package aula12.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nome;
	private List<ContaBancaria> contasBancarias;

	public Banco(int cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.contasBancarias = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular);
		this.contasBancarias.add(cb);
		System.out.println("Conta criada com sucesso.");
	}

	public void removerConta(int numeroConta) {

		for (ContaBancaria contaBancaria : this.contasBancarias) {

			if (contaBancaria.getNumero() == numeroConta) {

				this.contasBancarias.remove(contaBancaria);
				System.out.println("Conta " + numeroConta + " removida com sucesso.");
				return;

			}
		}
		System.out.println("Conta não encontrada.");
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contasBancarias) {

			if (contaBancaria.getNumero() == numeroConta) {

				contaBancaria.sacar(valor);
				return;
			}
		}
		System.out.println("Conta não encontrada.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contasBancarias) {

			if (contaBancaria.getNumero() == numeroConta) {

				contaBancaria.depositar(valor);
				return;
			}
		}
		System.out.println("Conta não encontrada.");
	}

	public void imprimirSaldoConta(int numeroConta) {

		
		for (ContaBancaria contaBancaria : contasBancarias) {

			if (contaBancaria.getNumero() == numeroConta) {

				System.out.println("=========================");
				System.out.println("CPNJ: " + this.cnpj);
				System.out.println("Banco: " + this.nome);

				contaBancaria.imprimirSaldo();
				return;
			}
		}
		System.out.println("Conta não encontrada.");
	}

	public void listarContas() {

		for (int i = 0; i < this.contasBancarias.size(); i++) {

			ContaBancaria contaBancaria = this.contasBancarias.get(i);
			contaBancaria.imprimirSaldo();
		}
	}
}
