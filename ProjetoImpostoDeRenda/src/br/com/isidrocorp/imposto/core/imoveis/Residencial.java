package br.com.isidrocorp.imposto.core.imoveis;

import br.com.isidrocorp.imposto.taxes.BemTributavel;

public class Residencial extends Imovel implements BemTributavel {
	private int metragem;

	public Residencial(String endereco, double valorVenal, int metragem) {
		super(endereco, valorVenal);
		this.metragem = metragem;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		if (this.metragem <= 100) {
			return super.valorVenal * 0.015;
		}
		return super.valorVenal * 0.03;
	}

	@Override
	public String toString() {
		return "Residencial [endereco=" + endereco + ", valorVenal=" + valorVenal + ", metragem=" + metragem + "]";
	}

	public int getMetragem() {
		return metragem;
	}

	public void setMetragem(int metragem) {
		this.metragem = metragem;
	}
	
	
	
	

}
