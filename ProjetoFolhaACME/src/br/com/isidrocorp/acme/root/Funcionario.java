package br.com.isidrocorp.acme.root;

/**
 * Classe funcionario que é a raiz de todas as classes. É uma classe abstrata que nos permite
 * criar toda a hireraquia polimorfica de fucionarios
 * 
 * @version 1.0
 * @author isidro
 *
 */
public abstract class Funcionario {
	protected int numeroFuncional;
	protected String nome;
	
	/**
	 * Construtor padrão da classe
	 * @param numeroFuncional - o numero de registro do funcionario
	 * @param nome - seu nome até 100 caracteres
	 */
	public Funcionario(int numeroFuncional, String nome) {
		super();
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
	}

	/**
	 * Classe da regra de negócio que precisa ser implementada nas subclasses
	 * @return o valor do salário a ser calculado
	 */
	public abstract double calcularSalario();
	
	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
