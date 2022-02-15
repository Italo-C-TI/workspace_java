package br.com.isidrocorp.pibank.core;

public class ContaPremium extends ContaEspecial {
	protected double milhas;

	public ContaPremium(String nomeTitular, String cpf, int numerConta, double saldo, double limite, double milhas) {
		super(nomeTitular, cpf, numerConta, saldo, limite);
		this.milhas = milhas;
	}

	@Override
	public boolean debitar(double valor) {
		// versão curtinha
		if (super.debitar(valor)) {            // posso trocar por if (super.saldo + super.limite >= valor) {
			this.milhas += valor / 100;        //                       super.saldo -= valor;
			return true;                       //                       this.milhas += valor / 100; 
		}									   //                       return true;
		return false;                          //                      ...
	}
	public double getMilhas() {
		return milhas;
	}

	public void setMilhas(double milhas) {
		this.milhas = milhas;
	}
	
    @Override 
    public String toString() {
    	return super.toString() + " Milhas: "+String.format("%.3f", this.milhas);
    }
	

}
