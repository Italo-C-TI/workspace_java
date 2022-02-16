import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	    int d;
		Scanner input = new Scanner(System.in);
		d = input.nextInt();
		if(d<=800){
		    System.out.println(1);
		}else if(d >800 && d<=1400){
		    System.out.println(2);
		}else if(d >1400 && d<=2000){
		    System.out.println(3);
		}
		input.close();
	}
}