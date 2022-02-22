package br.com.isidrocorp.cards.core;

public class CartaoPrePago {
	protected String nomeTitular;
	protected String numeroCartao;
	protected int    mesValidade;
	protected int    anoValidade;
	protected double saldo;
	
	public CartaoPrePago(String nomeTitular, String numeroCartao, int mesValidade, int anoValidade, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "CartaoPrePago  [nomeTitular=" + nomeTitular + ", numeroCartao=" + numeroCartao + ", mesValidade="
				+ mesValidade + ", anoValidade=" + anoValidade + ", saldo=" + String.format("%.2f", saldo) + "]";
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public double getSaldo() {
		return saldo;
	}
}
