package br.com.isidrocorp.acme.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.com.isidrocorp.acme.factory.FabricaDeFuncionario;
import br.com.isidrocorp.acme.root.Funcionario;

public class RepositorioEmArquivo implements FuncionarioRepo {

	@Override
	public ArrayList<Funcionario> lerTudo() {
		try {
			ArrayList<Funcionario> lista;
			lista = new ArrayList<Funcionario>();
			FileReader arquivo = new FileReader(new File("./dados.txt"));
			String linha = "";
			BufferedReader br = new BufferedReader(arquivo);
			
			do {
				linha = br.readLine();
				if (linha != null) {
					//System.out.println(linha);
					// uma vez lida a linha, adiciono na lista o objeto a partir do arquivo CSV
					lista.add(FabricaDeFuncionario.createFromCSV(linha));
				}
			} while (linha != null);
			return lista;
		}
		
		catch(IOException ex) {
			System.err.println("Erro a ler arquivo");
			ex.printStackTrace();
			return null;
		}
		catch(RuntimeException ex) {
			throw ex;
		}
	}

	@Override
	public void salvarTudo(ArrayList<Funcionario> lista) {
		try {
			File arquivo = new File("./recibos.txt");
			FileWriter escritor = new FileWriter(arquivo);
			
			for (Funcionario f: lista) {
				escritor.write("|   |----------------------------------------------------|   |\n");
				escritor.write(String.format("| o | Nome: %-30s R$ %10.2f | o |\n", f.getNome(), f.calcularSalario()));
			}			
			escritor.close();
		}
		catch (IOException ex) {
			System.err.println("Erro ao gravar recibos");
			ex.printStackTrace();
		}
		
	}

}
