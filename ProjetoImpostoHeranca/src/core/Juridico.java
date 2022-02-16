package core;

public class Juridico extends Contribuinte {
	private String cnpj;
	private double faturamento;
	
	public Juridico(int numeroCadastral, String nome, String endereco, String cnpj, double faturamento) {
		super(numeroCadastral,nome, endereco);
		this.cnpj = cnpj;
		this.faturamento = faturamento;
		
	}
	
	@Override
	public double calcularImposto() {
		return faturamento < 100000? 0.0 : faturamento<250000? faturamento*0.06: faturamento<450000? faturamento*0.15: faturamento*0.25; 
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	
}
