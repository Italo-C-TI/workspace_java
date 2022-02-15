import java.util.Scanner;

public class VerificadorPalindromo {
	
	public static boolean verificaPalindromo(String palavra) {
		int tam = palavra.length();
		for (int pos=0; pos < palavra.length() / 2 ; pos++) {
			if (palavra.charAt(pos) != palavra.charAt(tam-1-pos)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra = teclado.nextLine();
		int tam;
		boolean ehPalindromo=true;
		
				
		// estrat�gia numero 1 - tratar a palavra como um vetor de char
//		char letras[] = palavra.toCharArray();  // converti para um vetor de caracteres
//		tam = letras.length;
//		for (int pos=0; pos < letras.length / 2; pos++) {
//			if (letras[pos] != letras[tam - 1 - pos]) {
//				ehPalindromo = false;
//				break;
//			}
//		}
		
		
		// estrat�gia 2 - tratar como string mesmo
		tam = palavra.length();
		for (int pos=0; pos < palavra.length() / 2 ; pos++) {
			// o m�todo charAt equivale ao operador []
			if (palavra.charAt(pos) != palavra.charAt(tam - 1 - pos)) {
				ehPalindromo = false;
				break;
			}
		}
		
		if (verificaPalindromo(palavra)) {
			System.out.println("Eh um palindromo");
		}
		else {
			System.out.println("Nao eh palindromo");
		}
		
		
		
//		System.out.println((ehPalindromo?"Palindromo":"N�o � Palindromo"));
		teclado.close();
		
	}

}
