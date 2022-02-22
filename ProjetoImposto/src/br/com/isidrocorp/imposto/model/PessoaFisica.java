package br.com.isidrocorp.imposto.model;

public class PessoaFisica extends Contribuinte {
	private String cpf;
	private double rendimentoAnual;
	private int    numeroDep;
	public PessoaFisica(int numeroCadastral, String nome, String endereco, String cpf, double rendimentoAnual,
			int numeroDep) {
		super(numeroCadastral, nome, endereco);
		this.cpf = cpf;
		this.rendimentoAnual = rendimentoAnual;
		this.numeroDep = numeroDep;
	}
	
	@Override
	public double calcularImposto() {
		double imposto;
		double baseCalculo = this.rendimentoAnual - this.numeroDep * 1770;
		if (baseCalculo < 25000) {
			imposto = 0.0;
		}
		else if (baseCalculo < 50000) {
			imposto = baseCalculo * 0.15;
		}
		else if (baseCalculo < 100000) {
			imposto = baseCalculo * 0.20;
		}
		else {
			imposto = baseCalculo * 0.275;
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [numeroCadastral=" + numeroCadastral + ", nome=" + nome + ", endereco=" + endereco
				+ ", cpf=" + cpf + ", rendimentoAnual=" + rendimentoAnual + ", numeroDep=" + numeroDep + "]";
	}


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getRendimentoAnual() {
		return rendimentoAnual;
	}
	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	public int getNumeroDep() {
		return numeroDep;
	}
	public void setNumeroDep(int numeroDep) {
		this.numeroDep = numeroDep;
	}
	
	
	

}
