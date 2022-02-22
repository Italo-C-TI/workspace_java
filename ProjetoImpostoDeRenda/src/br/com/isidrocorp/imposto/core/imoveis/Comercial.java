package br.com.isidrocorp.imposto.core.imoveis;

import br.com.isidrocorp.imposto.taxes.BemTributavel;

public class Comercial extends Imovel implements BemTributavel {
	private String uso;

	public Comercial(String endereco, double valorVenal, String uso) {
		super(endereco, valorVenal);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return super.valorVenal * 0.04;
	}

	@Override
	public String toString() {
		return "Comercial [endereco=" + endereco + ", valorVenal=" + valorVenal + ", uso=" + uso + "]";
	}	

}
