import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	    int l;
	    String a="";
		Scanner input = new Scanner(System.in);
		l = input.nextInt();
        for(int i = 0;i < l;i++){
            a+= "a";
        }
        System.out.println("Feliz nat"+a+"l!");
		input.close();
	}
}