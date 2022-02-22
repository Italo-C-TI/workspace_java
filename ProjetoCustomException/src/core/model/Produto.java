package core.model;

import core.exception.ProdutoException;

public class Produto {
	private int id;
	private String descricao;
	private double preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id <= 0) {
			throw new ProdutoException("ID nao pode ser negativo ou zero!");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao == null || descricao.trim().length() == 0) {
			throw new ProdutoException("Descricao nao pode ficar vazia");
		}
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco < 0 ) {
			throw new ProdutoException("Preço não pode ser negativo!");
		}
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
}
