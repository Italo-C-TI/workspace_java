package core.imoveis;
import interf.BemTributavel;

public class Residencial extends Imovel implements BemTributavel {
	private float metragem;

	public Residencial(String endereco, double valorVenal, float metragem) {
		super(endereco, valorVenal);
		this.metragem = metragem;
	}

	@Override
	public String toString() {
		return super.toString() + "Residencial [metragem=" + metragem + "]\n";
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	
	@Override
	public double calcularImposto() {
		if(metragem < 101) {
			return super.valorVenal* 0.03;
		}
		return super.valorVenal * 0.015;
	}
	
	
}
