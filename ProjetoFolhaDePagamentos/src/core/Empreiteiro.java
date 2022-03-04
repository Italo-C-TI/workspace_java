package core;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	

	@Override
	public String toString() {
		return super.toString() +"Empreiteiro [valorEmpreita=" + valorEmpreita + "]";
	}


	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	@Override
	public double calcularSalario() {
		return valorEmpreita;
	}
}
