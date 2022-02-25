package ui;
import fabricas.FabricaDeFuncionarios;
import funcionarios.Funcionario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import salvarEmArquivo.DadosFuncionario;

public class Main {
	public static void main(String args[]) throws IOException {
		File arquivo;
		FileReader leitor = null;
		BufferedReader br = null;
		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();
		
		try {
			arquivo = new File("./folha.txt");
			leitor = new FileReader(arquivo);
			br = new BufferedReader(leitor);
			String dadosFuncionario = "";
			do {
				dadosFuncionario = br.readLine();
				if (dadosFuncionario != null) {
					try {
						lista.add(FabricaDeFuncionarios.createFromCSV(dadosFuncionario));
					} catch (Exception ex) {
						System.err.println("Algo deu errado");
						ex.printStackTrace();
					}
				}
			} while (dadosFuncionario != null);
			for (Funcionario f: lista) {
				System.out.println(f.toString());
			}
			
		} catch (Exception ex) {
			System.err.println("Algo deu errado");
			ex.printStackTrace();
		}finally{
			leitor.close();
			br.close();
		}
		
		try {
			DadosFuncionario repo = new DadosFuncionario();
			repo.salvarTudo(lista, "backupArquivo");


		} catch (Exception ex) {
			System.err.println("Erro desconhecido");
		}
	}
}
