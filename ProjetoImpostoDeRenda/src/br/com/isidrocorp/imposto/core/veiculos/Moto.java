package br.com.isidrocorp.imposto.core.veiculos;

public class Moto extends Veiculo {
	private int    cilindradas;
	private String tipo;
	
	public Moto(String marca, String modelo, int ano, double preco, int cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", cilindradas="
				+ cilindradas + ", tipo=" + tipo + "]";
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		if (this.cilindradas <= 500) {
			return super.preco * 0.025;
		}
		return super.preco * 0.05;
	}	
}
