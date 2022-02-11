
public class Refrigerante {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Refrigerante(String nome, double preço, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preço;
		this.quantidade = quantidade;
	}
	
	public void diminuiQuantidade() {
		if(quantidade>0) {
			quantidade-= 1;	
		}		

	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preço) {
		this.preco = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



}
