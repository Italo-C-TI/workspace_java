package core;

public class Contribuinte {
	protected int numeroCadastral;
	protected String nome;
	protected String endereco;
	
	public double calcularImposto() {
		return 0.0;
	}
	public String exibiValorImposto() {
		return nome+" deve pagar: R$ "+ this.calcularImposto()+" DeImposto";
	}
	
	public int getNumeroCadastral() {
		return numeroCadastral;
	}

	public void setNumeroCadastral(int numeroCadastral) {
		this.numeroCadastral = numeroCadastral;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Contribuinte(int numeroCadastral, String nome, String endereco) {
		super();
		this.numeroCadastral = numeroCadastral;
		this.nome = nome;
		this.endereco = endereco;
	}
}
