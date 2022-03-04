import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipuladorDeLista {
	public static void main(String[] args) {
		
		List<Integer> lista;
		
		
		lista = Arrays.asList(1,6,2,14,20,11,87,9,3,19);
		
//		// forma numero 1 - para percorrer a lista
//		for (int i=0; i<lista.size(); i++) {
//			System.out.print(lista.get(i)+"-");
//		}
//		System.out.println();
//		
//		
//		// forma numero 2 - para percorrer a lista
//		for (Integer ele: lista) {
//			System.out.print(ele+"-");
//		}
//		System.out.println();
		System.out.println("Lista Original...");
		lista.stream().forEach(e -> System.out.print(e+ " "));
		System.out.println();
		
		System.out.println("Lista Ordenada...");
		lista.stream().sorted().forEach(e -> System.out.print(e+ " "));
		System.out.println();
		
		System.out.println("Lista Ordenada pulando os 2 primeiros elementos");
		lista.stream().sorted()
		 		      .skip(2).limit(5).forEach(e ->{
				System.out.print(e+ " ");
		});
		System.out.println();
		
		lista.stream().filter(e -> e%2 == 0)
		              .forEach(e -> System.out.print(e + " "));
		
		
		
		
	}

}
