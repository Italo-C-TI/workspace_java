package br.com.isidrocorp.acme.core;

import br.com.isidrocorp.acme.root.Funcionario;

public class Horista extends Funcionario {
	private int numeroHoras;
	private double valorHoras;
	
	public Horista(int numeroFuncional, String nome, int numeroHoras, double valorHoras) {
		super(numeroFuncional, nome);
		this.numeroHoras = numeroHoras;
		this.valorHoras = valorHoras;
	}

	@Override
	public double calcularSalario() {
		return this.numeroHoras * this.valorHoras;
	}
	
	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}

	@Override
	public String toString() {
		return "Horista [numeroFuncional=" + numeroFuncional + ", nome=" + nome + ", numeroHoras=" + numeroHoras
				+ ", valorHoras=" + valorHoras + "]";
	}
	
}
