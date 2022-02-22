package br.com.isidrocorp.acme.core;

import br.com.isidrocorp.acme.root.Funcionario;

public class Comissionado extends Funcionario {
	private double salarioBase;
	private double comissao;
	
	public Comissionado(int numeroFuncional, String nome, double salarioBase, double comissao) {
		super(numeroFuncional, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return this.salarioBase + (this.salarioBase * this.comissao / 100);
	}
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Comissionado [numeroFuncional=" + numeroFuncional + ", nome=" + nome + ", salarioBase=" + salarioBase
				+ ", comissao=" + comissao + "]";
	}
	
	
	

}
