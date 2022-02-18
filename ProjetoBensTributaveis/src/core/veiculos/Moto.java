package core.veiculos;
import interf.BemTributavel;
public class Moto extends Veiculo implements BemTributavel {
	private int cilindradas;
	private String tipo;
	
	public Moto(String marca, String modelo, int ano, double preco, int cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [cilindradas=" + cilindradas + ", tipo=" + tipo + "]";
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
		if(cilindradas < 501) {
			return super.preco * 0.025;
		}
		return super.preco * 0.05;
	}

	
}
