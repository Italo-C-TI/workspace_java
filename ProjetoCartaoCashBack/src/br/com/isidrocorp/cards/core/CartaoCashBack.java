package br.com.isidrocorp.cards.core;

public class CartaoCashBack extends CartaoPrePago{
	
	private int tipo;

	public CartaoCashBack(String nomeTitular, String numeroCartao, int mesValidade, int anoValidade, double saldo,
			int tipo) {
		super(nomeTitular, numeroCartao, mesValidade, anoValidade, saldo);
		this.tipo = tipo;
	}
	
	@Override 
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			super.saldo += (tipo == 0)? valor * 0.08 : (tipo == 1)? valor * 0.05 : valor * 0.02; 
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "CartaoCashBack [nomeTitular=" + nomeTitular + ", numeroCartao=" + numeroCartao + ", mesValidade="
				+ mesValidade + ", anoValidade=" + anoValidade + ", saldo=" + String.format("%.2f",saldo) + 
				", tipo=" + tipo + getTipoTexto() + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	private String getTipoTexto() {
		return (tipo==0)?" GOLD":(tipo==1)?" SILVER":" BRONZE";
	}

}
