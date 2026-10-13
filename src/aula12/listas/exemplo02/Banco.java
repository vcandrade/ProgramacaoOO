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
		
		if (this.verificarExistenciaConta(numero)) {
			
			System.out.println("Conta de Número " + numero + " já existente.");
			return;
		}
		
		ContaBancaria contaBancaria = new ContaBancaria(numero, titular);
		this.listaContas.add(contaBancaria);
		
		System.out.println("Conta " + numero + " criada com sucesso.");
	}
	
	private boolean verificarExistenciaConta(int numero) {
		
		for (int i = 0; i < this.listaContas.size(); i++) {
			
			ContaBancaria contaBancaria = this.listaContas.get(i);
			
			if (contaBancaria.getNumero() == numero) {
				
				return true;
			}
		}
		return false;
	}
	
	public void excluirConta(int numero) {
		
		for (int i = 0; i < this.listaContas.size(); i++) {
			
			ContaBancaria contaBancaria = this.listaContas.get(i);
			
			if (contaBancaria.getNumero() == numero) {
				
				this.listaContas.remove(contaBancaria);
				
				System.out.println("Conta " + numero + " removida com sucesso.");
				return;
			}
		}
		
		System.out.println("Conta " + numero + " não encontrada.");
	}
	
	public void verificarSaldoConta(int numero) {
		
		for (int i = 0; i < this.listaContas.size(); i++) {
			
			ContaBancaria contaBancaria = this.listaContas.get(i);
			
			if (contaBancaria.getNumero() == numero) {
				
				contaBancaria.imprimirSaldo();
				return;
			}
		}
		
		System.out.println("Conta " + numero + " não encontrada.");
	}
}








