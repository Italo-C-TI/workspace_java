import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int tipo, numFunc;
		double valor1, valor2, valor3;
		int    valor4;
		String linhaDoArquivo;
		int opcao;
		try {
			//File arquivo = new File("/Users/isidro/Desktop/workspace_ifood/ProjetoFolhaACMEArquivos/dados.txt");
			File arquivo = new File("c:\\teste.txt");
			
			FileWriter escritor = new FileWriter(arquivo, true);
			
			do {
				System.out.println("Digite 1 - Chefe / 2 - Comissionado / 3 - Horista / 4 - Empreiteiro");
				tipo = Integer.parseInt(teclado.nextLine());
				System.out.print("Digite a funcional:");
				numFunc = Integer.parseInt(teclado.nextLine());
				System.out.print("Digite o nome     :");
				nome = teclado.nextLine();
				if (tipo == 1) {
					System.out.println("Digite o salário Base :");
					valor1 = Double.parseDouble(teclado.nextLine());
					System.out.println("Digite o adicional Função:");
					valor2 = Double.parseDouble(teclado.nextLine());
					System.out.println("Digite o benefício Terno:");
					valor3 = Double.parseDouble(teclado.nextLine());
					linhaDoArquivo = tipo + ";" + numFunc + ";" + nome + ";" + valor1 + ";" + valor2 + ";" + valor3 + "\n";
					escritor.write(linhaDoArquivo);
				}
				else if (tipo == 2) {
					System.out.println("Digite o salário Base :");
					valor1 = Double.parseDouble(teclado.nextLine());
					System.out.println("Digite comissão:");
					valor2 = Double.parseDouble(teclado.nextLine());
					linhaDoArquivo = tipo + ";" + numFunc + ";" + nome + ";" + valor1 + ";" + valor2 + "\n";
					escritor.write(linhaDoArquivo);
				}
				else if (tipo == 3) {
					System.out.println("Digite o numero de horas:");
					valor4 = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o valor da hora:");
					valor2 = Double.parseDouble(teclado.nextLine());
					linhaDoArquivo = tipo + ";" + numFunc + ";" + nome + ";" + valor4 + ";" + valor2 + "\n";
					escritor.write(linhaDoArquivo);
				}
				else if (tipo == 4) {
					System.out.println("Digite o valor da empreita :");
					valor1 = Double.parseDouble(teclado.nextLine());
					linhaDoArquivo = tipo + ";" + numFunc + ";" + nome + ";" + valor1 + "\n";
					escritor.write(linhaDoArquivo);
				}
				else {
					System.err.println("Tipo desconhecido");
				}
				System.out.println("Deseja Continuar? 1- sim / 0 - não");
				opcao = Integer.parseInt(teclado.nextLine());
			} while (opcao != 0);
			
			
			escritor.close();
			
		}
		catch(Exception ex) {
			System.err.println("Erro ao manipular o arquivo");
			ex.printStackTrace();
		}
	}

}
