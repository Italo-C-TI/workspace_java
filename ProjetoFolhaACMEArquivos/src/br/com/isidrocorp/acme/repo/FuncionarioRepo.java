package br.com.isidrocorp.acme.repo;

import java.util.ArrayList;

import br.com.isidrocorp.acme.root.Funcionario;

public interface FuncionarioRepo {
		
	public ArrayList<Funcionario> lerTudo();
	public void salvarTudo(ArrayList<Funcionario> lista);

}
