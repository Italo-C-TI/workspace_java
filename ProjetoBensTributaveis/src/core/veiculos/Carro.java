package core.veiculos;

import interf.BemTributavel;

public class Carro extends Veiculo implements BemTributavel {
	private int nPortas;
	private int potencia;
	
	public Carro(String marca, String modelo, int ano, double preco, int nPortas, int potencia) {
		super(marca, modelo, ano, preco);
		this.nPortas = nPortas;
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString() +"Carro [nPortas=" + nPortas + ", potencia=" + potencia + "]\n";
	}
	

	
	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public double calcularImposto() {
		if(super.ano < 2000) {
			return 0;
		}
		return super.preco * 0.04;
	}


	


}
