package salvarEmArquivo;
import interfaces.InterFuncionario;
import java.io.FileWriter;
import java.io.IOException;
import funcionarios.Funcionario;
import java.util.ArrayList;
import java.io.File;



public class DadosFuncionario implements InterFuncionario {
	@Override
	public void salvarTudo(ArrayList<Funcionario> lista, String nomeArquivo) {
		try {
			File arquivo = new File("./"+nomeArquivo+".txt");
			FileWriter escritor = new FileWriter(arquivo);
			
			for (Funcionario f: lista) {
				escritor.write(String.format(f.toString()));
				escritor.write("\n");
			}			
			escritor.close();
		}
		catch (IOException ex) {
			System.err.println("Erro ao gravar Funcionarios em arquivo");
			ex.printStackTrace();
		}
		
	}

	@Override
	public void salvarTudo(ArrayList<Funcionario> lista) {
		
		
	}
}
