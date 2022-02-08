
public class Biblioteca {
	public static void main(String args[]) {
		Livro l1;
		
		l1 = new Livro("Java for Beginners","Professor Isidro","Computação",2021,1,2 );

		l1.emprestar();	
		System.out.println(l1.exibirInfo());
		
	}
}
