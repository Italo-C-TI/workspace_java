package br.com.isidrocorp.imposto.core.veiculos;

public class Carro extends Veiculo {

	private int numeroPortas;
	private int potencia;
	public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, int potencia) {
		super(marca, modelo, ano, preco);
		this.numeroPortas = numeroPortas;
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", numeroPortas="
				+ numeroPortas + ", potencia=" + potencia + "]";
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		if (super.ano < 2000){
			return 0.0;
		}
		return super.preco * 0.04;
	}	

	
}
