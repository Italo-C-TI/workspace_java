import java.util.Scanner;

public class ClasseQueUsaRecurso {
	public static void main(String[] args) {

		int valor;

		try (MeuRecurso recurso = new MeuRecurso(); Scanner teclado = new Scanner(System.in) ) {
			do {
				System.out.println("Digite um valor numérico");
				valor = teclado.nextInt();
				System.out.println("Valor a ser usado no recurso = " + valor);
				recurso.setValor(valor);
			} while (valor != -1);
		} catch (Exception ex) {
			System.out.println("Erro de atribuicao = " + ex.getMessage());			
		}
	}

}
