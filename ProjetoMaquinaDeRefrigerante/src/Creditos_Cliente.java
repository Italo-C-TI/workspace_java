
public class Creditos_Cliente {
	private String nomeCliente;
	private double valorDisponivel;
	
	public Creditos_Cliente(String nomeCliente, double valorDisponivel) {
		super();
		this.nomeCliente = nomeCliente;
		this.valorDisponivel = valorDisponivel;
	}

	public void AdicionaCredito(double valor) {
		valorDisponivel += valor;
	}
	
	public double getValorDisponivel() {
		return valorDisponivel;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public double trocoSolicitado() {
		double troco = valorDisponivel;
		valorDisponivel = 0.0;
		return troco;
	}
	public void RealizaCompra(double valor ) {
		valorDisponivel -= valor;
	}
	
}
