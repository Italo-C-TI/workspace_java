
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String s, palavra, palavraInvertida;
		palavra = new String();
		palavraInvertida = new String();
		System.out.println("Digite Uma Palavra");
		s = input.nextLine();
		
		 char[] myChars = s.toCharArray();
		 for(int i = 0;i<myChars.length;i++) {
			 palavra += myChars[i];
		 }
		 for(int x = myChars.length -1;x>=0;x--) {
			 palavraInvertida += myChars[x];
		 }
		 if(palavra.contentEquals(palavraInvertida)) {
			 System.out.println("É palindrimo");
		 }else {
			 System.out.println("Não é palindrimo");
			 
		 }
		 input.close();
	}
}
