package funcionarios;

public abstract class Funcionario {
	protected int tipo;
	protected int numeroRegistro;
	protected String nome;
	
	
	public Funcionario(int tipo, int numeroRegistro, String nome) {
		super();
		this.tipo = tipo;
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
	}
	
	public abstract double calculaPagamento();
	
	public String getNome() {
		return nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNum(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
