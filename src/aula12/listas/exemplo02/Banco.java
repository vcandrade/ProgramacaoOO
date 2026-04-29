package aula12.listas.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nome;
	private List<ContaBancaria> listasContas;

	public Banco(int cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.listasContas = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		if (this.verificarExistenciaConta(numeroConta)) {

			System.out.println("Conta " + numeroConta + " já existente.");
			return;
		}

		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		this.listasContas.add(contaBancaria);

		System.out.println("Conta " + numeroConta + " criada com sucesso.");
	}

	public boolean verificarExistenciaConta(int numeroConta) {

		for (int i = 0; i < this.listasContas.size(); i++) {

			ContaBancaria cb = this.listasContas.get(i);

			if (cb.getNumero() == numeroConta) {

				return true;

			}
		}
		return false;
	}

	public void excluirConta(int numeroConta) {

		for (int i = 0; i < this.listasContas.size(); i++) {

			ContaBancaria cb = this.listasContas.get(i);

			if (cb.getNumero() == numeroConta) {

				this.listasContas.remove(i);
				System.out.println("Conta " + numeroConta + " removida com sucesso");

				return;
			}
		}
		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void verificarSaldoConta(int numeroConta) {

		System.out.println("==================================");
		System.out.println(this.nome + " - CNPJ: " + this.cnpj);

		for (int i = 0; i < this.listasContas.size(); i++) {

			ContaBancaria cb = this.listasContas.get(i);

			if (cb.getNumero() == numeroConta) {

				cb.imprimirSaldo();
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (int i = 0; i < this.listasContas.size(); i++) {

			ContaBancaria cb = this.listasContas.get(i);

			if (cb.getNumero() == numeroConta) {

				cb.sacar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (int i = 0; i < this.listasContas.size(); i++) {

			ContaBancaria cb = this.listasContas.get(i);

			if (cb.getNumero() == numeroConta) {

				cb.depositar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void listarContas() {

		if (this.listasContas.isEmpty()) {

			System.out.println("Não há contas criadas.");
		}
		
		for (int i = 0; i < this.listasContas.size(); i++) {

			ContaBancaria cb = this.listasContas.get(i);
			cb.imprimirSaldo();
		}
	}
}
