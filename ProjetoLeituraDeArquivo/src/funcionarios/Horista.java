package funcionarios;
public class Horista extends Funcionario {
	private double valorHora;
	private int nHoras;
	
	public Horista(int tipo, int numeroRegistro, String nome, double valorHora, int nHoras) {
		super(tipo, numeroRegistro, nome);
		this.valorHora = valorHora;
		this.nHoras = nHoras;
	}
	@Override
	public String toString() {
		return tipo+"    ;"+numeroRegistro+"    ;"+nome+"    ;"+nHoras+"    ;"+valorHora;
	}
	@Override
	public double calculaPagamento() {
		return valorHora * nHoras;
	}

	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	public int getnHoras() {
		return nHoras;
	}



	public void setnHoras(int nHoras) {
		this.nHoras = nHoras;
	}




}
