package br.com.isidrocorp.acme.ui;

import java.util.ArrayList;

import br.com.isidrocorp.acme.repo.FuncionarioRepo;
import br.com.isidrocorp.acme.repo.RepositorioEmArquivo;
import br.com.isidrocorp.acme.repo.RepositorioEmMemoria;
import br.com.isidrocorp.acme.root.Funcionario;
import br.com.isidrocorp.exceptions.DadosInvalidosException;
import br.com.isidrocorp.exceptions.EstruturaDeFuncionarioInvalida;
import br.com.isidrocorp.exceptions.TipoFuncionarioInvalidoException;

public class FolhaDePagamento {
	public static void main(String[] args) {

		/* rotina para ler arquivos */
		ArrayList<Funcionario> lista;

		try {
			FuncionarioRepo repo = new RepositorioEmArquivo();
			FuncionarioRepo repo2 = new RepositorioEmMemoria();
						
			lista = repo.lerTudo();
			
			repo.salvarTudo(lista);
			repo2.salvarTudo(lista);
			
			
		} catch (DadosInvalidosException ex) {
			System.err.println("Dados do cadastro de funcionario Invalido");
		} catch (TipoFuncionarioInvalidoException ex) {
			System.out.println("Não tem regra para est tipo de funcionario");
		} catch (EstruturaDeFuncionarioInvalida ex) {
			System.err.println("Funcionario com estrutura de informação Inválida");
		} catch (Exception ex) {
			System.err.println("Erro desconhecido");
		}
	}
}
