package br.com.isidrocorp.acme.ui;

import br.com.isidrocorp.acme.core.Chefe;
import br.com.isidrocorp.acme.core.Comissionado;
import br.com.isidrocorp.acme.core.Empreiteiro;
import br.com.isidrocorp.acme.core.Horista;
import br.com.isidrocorp.acme.root.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		Funcionario lista[] = new Funcionario[10];
		
		lista[0] = new Chefe(1221, "Fulano de Tal", 8000, 22, 1500);
		lista[1] = new Horista(1222, "Fulana de Tal", 150, 85.92);
		lista[2] = new Comissionado(1223, "Cicrano de Tal", 1300, 25);
		lista[3] = new Comissionado(1224, "Cicrana de Tal", 1500, 28);
		lista[4] = new Horista(1225, "Beltrano de Tal", 100, 75.42);
		lista[5] = new Horista(1226, "Beltrana de Tal", 150, 99.45);
		lista[6] = new Empreiteiro(1227, "Pedro das Neves", 3500);
		lista[7] = new Empreiteiro(1228, "Josefa Nunes", 4500);
		lista[8] = new Horista(1229,"Ana das Fontes", 85, 112.65);
		lista[9] = new Horista(1230,"Roberto Medeiros", 200, 75.84);
		
		for (Funcionario f: lista) {
			System.out.println("| o |----------------------------------------------------| o |");
			System.out.printf ("|   | Nome: %-30s R$ %10.2f |   |\n", f.getNome(), f.calcularSalario());
		}
	}

}

