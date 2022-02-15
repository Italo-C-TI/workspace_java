
public class Carro {
	private String marca;
	private String ano;
	private boolean funcionando;
	
	
	public Carro(String marca, String ano, boolean funcionando) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.funcionando = funcionando;
	}
	
	public String exibirInfo() {
		return marca+" ("+ano+") "+ ((funcionando)?"Funfando Vruuummmm":"Qebrô");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public boolean isFuncionando() {
		return funcionando;
	}
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	
}
