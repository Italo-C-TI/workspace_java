package br.com.isidrocorp.pibank.core;

public class ContaEspecial extends Conta {
	protected double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numerConta, double saldo, double limite) {
		super(nomeTitular, cpf, numerConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " Lim: R$ "+String.format("%.2f", this.limite);
	}
	
}
