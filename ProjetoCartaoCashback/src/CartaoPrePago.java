
public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeTitular;
	protected int    anoValidade;
	protected int    mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0;
	}
	
	@Override
	public String toString() {
		return "nomeTitular:"+nomeTitular+" ("+numeroCartao+") R$ "+String.format("%.2f", saldo);
	}
	
	public void adicionarCredito(double valor){
		this.saldo +=valor;
	}
	public boolean comprar(double valor) {
		if(valor<=saldo) {
			saldo -=valor;
			return true;
		}
		return false;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
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

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public double getSaldo() {
		return saldo;
	}

	
}
