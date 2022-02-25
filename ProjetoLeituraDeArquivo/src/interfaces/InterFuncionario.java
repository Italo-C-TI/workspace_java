package interfaces;
import java.util.ArrayList;
import funcionarios.Funcionario;

public interface InterFuncionario {
	public void salvarTudo(ArrayList<Funcionario> lista);

	void salvarTudo(ArrayList<Funcionario> lista, String nomeArquivo);
}
