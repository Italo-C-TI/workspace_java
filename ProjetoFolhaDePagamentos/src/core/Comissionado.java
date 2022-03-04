package core;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;

	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return super.toString() +"Comissionado [salarioBase=" + salarioBase + ", comissao=" + comissao + "]";
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return  salarioBase + (salarioBase * (comissao * 0.01)); 
	}
}
