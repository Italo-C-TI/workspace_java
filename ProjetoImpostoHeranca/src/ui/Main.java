package ui;
import core.Contribuinte;
import core.Fisico;
import core.Juridico;


public class Main {
	public static void main(String args[]) {
		Contribuinte c1,c2,c3;

		c1 = new Contribuinte(12345, "Jubileu", "Rua da pamonha");
		c2 = new Fisico(54321, "Pé de pano", "Rua do estabulo" , "1111115599" , 50000.541 , 5);
		c3 = new Juridico(98765,"IsidroCorp","Rua da fortuna","1111155599", 1000000);
		
		System.out.println(c1.exibiValorImposto());
		System.out.println(c2.exibiValorImposto());
		System.out.println(c3.exibiValorImposto());

	}
}
