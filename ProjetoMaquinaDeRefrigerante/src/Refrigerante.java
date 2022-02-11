
public class Refrigerante {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Refrigerante(String nome, double pre�o, int quantidade) {
		super();
		this.nome = nome;
		this.preco = pre�o;
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

	public void setPreco(double pre�o) {
		this.preco = pre�o;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



}
