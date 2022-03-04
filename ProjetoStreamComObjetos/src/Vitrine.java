import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vitrine {
	public static void main(String[] args) {
		List<Produto> lista;
	
		lista = Arrays.asList(new Produto(1,"Computador", 1500),
							  new Produto(2,"Teclado", 100),
							  new Produto(3,"Mouse", 50),
							  new Produto(4,"Monitor", 600),
							  new Produto(10,"Otocomputer",1500),
							  new Produto(5,"Tablet",800),
							  new Produto(9,"Mesa", 800),
							  new Produto(6,"Celular", 1200),
							  new Produto(7,"Headphone", 70));
		
		lista.stream()
		     .sorted(Comparator.comparing(Produto::getId)) // se eu não passo o critério, ele usa o método compareTo
		     .forEach(p -> System.out.println(p));
		
		Produto produtoMaisCaro;
		produtoMaisCaro = lista.stream()
				               .max(Comparator.comparing(p->p.getPreco()))
				               .orElse(new Produto(0,"",0));
		
		System.out.println("Produto mais caro = "+produtoMaisCaro);
		
		lista.stream().filter(p -> p.getPreco() == produtoMaisCaro.getPreco());
		
		Collections.sort(lista);
		// aqui sim ela altera
		
		System.out.println(lista);
		
		
 	}

}
