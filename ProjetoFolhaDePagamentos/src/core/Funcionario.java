package core;

public abstract class Funcionario implements Comparable<Funcionario>{
	protected String nome;
	protected int numeroRegistro;
	
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Funcionario(a) " + nome + " de numeroRegistro= " + numeroRegistro + " é ";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public abstract double calcularSalario();

	@Override
	public int compareTo(Funcionario outro) {
		// TODO Auto-generated method stub
			
		if (this.numeroRegistro < outro.getNumeroRegistro()) {
			return -1;
		}
		else if (this.numeroRegistro > outro.getNumeroRegistro()) {
			return 1;
		}
		return 0;		
		}
}

