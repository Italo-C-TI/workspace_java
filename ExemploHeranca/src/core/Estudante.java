package core;

// a definição da classe Estudante AMPLIA A definição da classe Pessoa
// a estrutura ESTUDANTE é uma AMPLIAÇÃO da estrutura PESSOA
// ou seja, só pelo cabeçalho, ESTUDANTE tem tudo o que tem em pessoa, além da sua peculiaridade

public class Estudante extends Pessoa {
	int numeroMatricula;
	
	public Estudante(String nome, String email, String telefone, int numMatricula) {
		super(nome, email, telefone);
		this.numeroMatricula = numMatricula;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Estudante: "+super.nome+"/"+super.email+"/"+super.telefone+"/"+this.numeroMatricula);
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	

}
