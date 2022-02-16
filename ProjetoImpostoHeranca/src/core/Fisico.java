package core;

public class Fisico extends Contribuinte {
	private String cpf;
	private double rendimentoAnual;
	private int dependentes;
	
	public Fisico(int numeroCadastral, String nome, String endereco, String cpf, double rendimentoAnual, int dependentes) {
		super(numeroCadastral, nome, endereco);
		this.cpf = cpf;
		this.rendimentoAnual = rendimentoAnual;
		this.dependentes = dependentes;
		
	}
	@Override
	public double calcularImposto() {
		double base = rendimentoAnual - (1770 * dependentes);
		return base < 25000? 0.0 : base<50000? rendimentoAnual*0.15: base<100000? rendimentoAnual*0.20: rendimentoAnual*0.275; 
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

}
