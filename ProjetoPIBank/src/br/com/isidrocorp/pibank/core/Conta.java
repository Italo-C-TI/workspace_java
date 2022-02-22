package br.com.isidrocorp.pibank.core;

import br.com.isidrocorp.pibank.core.exceptions.ContaException;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int    numerConta;
	protected double saldo;
	
	public Conta(String nomeTitular, String cpf, int numerConta, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numerConta = numerConta;
		this.saldo = saldo;
	}
	
	public void creditar(double valor) throws ContaException{
		if (valor <= 0) {
			throw new ContaException("Valor Invalido para crédito: ", valor);
		}
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) throws ContaException{
		if (valor <= 0) {
			throw new ContaException("Valor invalido para débito", valor);
		}
		if (this.saldo >= valor) {
			this.saldo -= valor;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumerConta() {
		return numerConta;
	}

	public void setNumerConta(int numerConta) {
		this.numerConta = numerConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Conta:"+numerConta+" ("+nomeTitular+"|"+cpf+") R$ "+String.format("%.2f", saldo);
	}
	
}
