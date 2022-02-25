
public class Produto {
	private int    id;
	private String descricao;
	private double preco;
	private int    qtdEstoque;
	
	public Produto(int id, String descricao, double preco, int qtdEstoque) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "id= " + id + ", descricao= " + descricao + ", preco= R$ " + preco + ", qtdEstoque= " + qtdEstoque
				+ "]";
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
}
