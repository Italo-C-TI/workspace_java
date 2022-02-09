
public class Biblioteca {
	public static void main(String args[]) {
		Livro l1;
		
		l1 = new Livro("Java for Beginners","Professor Isidro","Computa��o",2021,1,2 );

		l1.emprestar();	
		l1.devolver();
		System.out.println(l1.exibirInfo());
		
	}
}
