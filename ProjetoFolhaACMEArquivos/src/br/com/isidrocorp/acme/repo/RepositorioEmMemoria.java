package br.com.isidrocorp.acme.repo;

import java.util.ArrayList;

import br.com.isidrocorp.acme.core.Chefe;
import br.com.isidrocorp.acme.core.Comissionado;
import br.com.isidrocorp.acme.core.Empreiteiro;
import br.com.isidrocorp.acme.core.Horista;
import br.com.isidrocorp.acme.root.Funcionario;

public class RepositorioEmMemoria implements FuncionarioRepo {

	@Override
	public ArrayList<Funcionario> lerTudo() {
		// TODO Auto-generated method stub
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(new Chefe(1221, "Fulano de Tal", 8000, 22, 1500));
		lista.add(new Horista(1222, "Fulana de Tal", 150, 85.92));
		lista.add(new Comissionado(1223, "Cicrano de Tal", 1300, 25));
		lista.add(new Comissionado(1224, "Cicrana de Tal", 1500, 28));
		lista.add(new Horista(1225, "Beltrano de Tal", 100, 75.42));
		lista.add(new Horista(1226, "Beltrana de Tal", 150, 99.45));
		lista.add(new Empreiteiro(1227, "Pedro das Neves", 3500));
		lista.add(new Empreiteiro(1228, "Josefa Nunes", 4500));
		lista.add(new Horista(1229,"Ana das Fontes", 85, 112.65));
		lista.add(new Horista(1230,"Roberto Medeiros", 200, 75.84));
		return lista;
	}

	@Override
	public void salvarTudo(ArrayList<Funcionario> lista) {
		for (Funcionario f: lista) {
			System.out.println("|   |----------------------------------------------------|   |");
			System.out.printf("| o | Nome: %-30s R$ %10.2f | o |\n", f.getNome(), f.calcularSalario());
		}
		
	}
	
}
