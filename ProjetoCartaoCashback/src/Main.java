import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		CartaoPrePago c1;
		CartaoPrePago c2;
		
		c1 = new CartaoPrePago("98765430","Italo",2030,8);
		c2 = new CartaoCashBack("000000010","Italo2",2031, 5, 0);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.adicionarCredito(150.50);
		c2.adicionarCredito(150.50);
		c1.comprar(100);
		c2.comprar(100);
		
		System.out.println(c1);
		System.out.println(c2);
		input.close();
	}
}
