
public class Produto implements Comparable<Produto>{
	private int id;
	private String nome;
	private double preco;

	public Produto(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + String.format("%5d", id) + ", nome=" + String.format("%-10s", nome) + ", preco="
				+ String.format("%7.2f", preco) + "]";
	}

	@Override
	public int compareTo(Produto outro) {
		// TODO Auto-generated method stub
		
		if (this.preco < outro.getPreco()) {
			return -1;
		}
		else if (this.preco > outro.getPreco()) {
			return 1;
		}
		return 0;
	}
}
