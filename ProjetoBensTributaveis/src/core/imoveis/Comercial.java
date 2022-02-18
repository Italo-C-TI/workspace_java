package core.imoveis;
import interf.BemTributavel;

public class Comercial extends Imovel implements BemTributavel {
	private boolean uso;
	
	public Comercial(String endereco, double valorVenal, boolean uso) {
		super(endereco, valorVenal);
		this.uso = uso;
	}

	@Override
	public String toString() {
		return super.toString() + "Comercial [uso=" + uso + "]";
	}

	public boolean isUso() {
		return uso;
	}

	public void setUso(boolean uso) {
		this.uso = uso;
	}

	@Override
	public double calcularImposto() {
		return super.valorVenal * 0.04;
	}
	

	
}
