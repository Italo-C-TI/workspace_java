
public class CartaoDebito {
	private String titular;
	private String numeroCartao;
	private int anoValidade;
	private int mesValidade;
	private double saldo;
	
	public CartaoDebito(String titular, String numeroCartao, int anoValidade, int mesValidade) {
		super();
		this.titular = titular;
		this.numeroCartao = numeroCartao;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
	}
	
	public boolean adicionarAoDebito(double valor) {
		saldo+=valor;
		return true;
	}
	public boolean comprar(double valor) {
		if (saldo >= valor) {
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	}
