package funcionarios;
public class Comissionado extends Funcionario {
	private double salarioBase;
	private double comissao;
	
	
	public Comissionado(int tipo, int numeroRegistro, String nome, double salarioBase, double comissao) {
		super(tipo, numeroRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	@Override
	public String toString() {
		return tipo+"    ;"+numeroRegistro+"    ;"+nome+"    ;"+salarioBase+"    ;"+comissao;
	}


	@Override
	public double calculaPagamento() {
		return  salarioBase + (salarioBase * (comissao * 0.01)); 
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
