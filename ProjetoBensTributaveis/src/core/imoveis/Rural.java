package core.imoveis;

public class Rural extends Imovel {
	private String tipo;

	public Rural(String endereco, double valorVenal, String tipo) {
		super(endereco, valorVenal);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Rural [tipo=" + tipo + "]\n";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
