
public class Biblioteca {
	public static void main(String[] args) {
		
		Livro l1, l2, l3, l4;
		
		l1 = new Livro("Java for Beginners", "Professor Isidro", "Terror", 2021, 1, 2);
		l2 = new Livro("Java Web", "Professor Isidro", "Suspense", 2021,1,3);
		l3 = new Livro("Desenvolvimento de Software","Professor Isidro", "Auto Ajuda", 2021, 2, 1);
		l4 = new Livro("Sistemas Operacionais", "Professor Isidro", "Ficção", 2021, 2, 2);		
		
//		l1.setTitulo("Java for Beginners");
//		l1.setAutor("Professor Isidro");
//		l1.setAnoPubli(2021);
//		l1.setCategoria("Terror");
//		l1.setPosEstante(1);
//		l1.setPosPrateleira(2);
//		l1.emprestar();
		//---------------------
//		l2.setTitulo("Java Web");
//		l2.setAutor("Professor Isidro");
//		l2.setAnoPubli(2021);
//		l2.setCategoria("Suspense");
//		l2.setPosEstante(1);
//		l2.setPosPrateleira(3);
//		l2.emprestar();
		//-------------------------
//		l3.setTitulo("Desenvolvimento de Software");
//		l3.setAutor("Professor Isidro");
//		l3.setAnoPubli(2021);
//		l3.setCategoria("Auto Ajuda");
//		l3.setPosEstante(2);
//		l3.setPosPrateleira(1);
//		l3.emprestar();
//		//---------------------
//		l4.setTitulo("Sistemas Operacionais");
//		l4.setAutor("Professor Isidro");
//		l4.setAnoPubli(2021);
//		l4.setCategoria("Ficção");
//		l4.setPosEstante(2);
//		l4.setPosPrateleira(2);
//		l4.emprestar();
		
		
		//-- quero exibir as informações de todos os livros
		System.out.println(l1.exibirInfo());
		System.out.println(l2.exibirInfo());
		System.out.println(l3.exibirInfo());
		System.out.println(l4.exibirInfo());
		
		l1.emprestar();
		l3.emprestar();
		
		System.out.println(l1.exibirInfo());
		System.out.println(l2.exibirInfo());
		System.out.println(l3.exibirInfo());
		System.out.println(l4.exibirInfo());
		
		
	}
}
