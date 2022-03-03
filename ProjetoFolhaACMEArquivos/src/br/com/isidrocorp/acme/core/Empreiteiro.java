package br.com.isidrocorp.acme.core;

import br.com.isidrocorp.acme.root.Funcionario;

public class Empreiteiro extends Funcionario {
	private double valorEmpreita;

	public Empreiteiro(int numeroFuncional, String nome, double valorEmpreita) {
		super(numeroFuncional, nome);
		this.valorEmpreita = valorEmpreita;
	}
	
	public double calcularSalario() {
		return this.valorEmpreita;
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public String toString() {
		return "Empreiteiro [numeroFuncional=" + numeroFuncional + ", nome=" + nome + ", valorEmpreita=" + valorEmpreita
				+ "]";
	}
	
	

}
