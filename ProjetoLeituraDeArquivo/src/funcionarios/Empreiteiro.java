package funcionarios;
public class Empreiteiro extends Funcionario {
	private double valorEmpreita;
	
	
	public Empreiteiro(int tipo, int numeroRegistro, String nome, double valorEmpreita) {
		super(tipo, numeroRegistro, nome);
		this.valorEmpreita = valorEmpreita;
	}
	
	@Override
	public String toString() {
		return tipo+"    ;"+numeroRegistro+"    ;"+nome+"    ;"+valorEmpreita;
	}

	@Override
	public double calculaPagamento() {
		return valorEmpreita;
	
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	
}
