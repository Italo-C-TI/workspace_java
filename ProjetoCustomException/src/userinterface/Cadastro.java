package userinterface;

import java.util.Scanner;

import core.exception.ProdutoException;
import core.model.Produto;

public class Cadastro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto;
		Produto p = new Produto();
		int opcao = 1;

		do {
			try {
				System.out.println("Digite o codigo do produto");
				texto = teclado.nextLine();
				p.setId(Integer.parseInt(texto));

				System.out.println("Digite a descricao do produto");
				texto = teclado.nextLine();
				p.setDescricao(texto);

				System.out.println("Digite o preço do produto");
				texto = teclado.nextLine();
				p.setPreco(Double.parseDouble(texto));

				System.out.println("Produto Cadastrado!");
				System.out.println(p);

				System.out.println("Cadastrar novo produto? 1 - Sim / 0 - Não");
				opcao = Integer.parseInt(teclado.nextLine());
			} catch (ProdutoException e) {
				System.err.println("Erro de Regra de Negócio:" +e.getMessage());			
			}
			catch (NumberFormatException | ArithmeticException e) {
				System.err.println("Erro em dados inválidos: "+e.getMessage());
			}
			catch (Exception e) {
				System.err.println("Erro geral: "+e);
				opcao = 0;
			}			

		} while (opcao != 0);
		
		teclado.close();
	

	}

}
