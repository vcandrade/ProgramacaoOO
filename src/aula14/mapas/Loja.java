package aula14.mapas;

import java.util.HashMap;
import java.util.Map;

public class Loja {

	private String nome;
	private Map<Integer, Produto> listaProdutos;
	
	public Loja(String nome) {
		
		this.nome = nome;
		this.listaProdutos = new HashMap<>();
	}
	
	public void adicionarNovoProduto(Integer codigo, String nome, double preco) {
		
	}
	
	public void exibirTodosProdutos() {
		
	}
	
	public void buscarProdutoPorCodigo(Integer codigo) {
		
	}
	
	public void atualizarPrecoProduto(Integer codigo, double preco) {
		
	}
	
	public void removerProduto(Integer codigo) {
		
	}
	
	public void calcularPrecoMedio() {
		
	}
}





