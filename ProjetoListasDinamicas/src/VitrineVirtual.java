import java.util.ArrayList;

public class VitrineVirtual {
	public static void main(String[] args) {

		
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();

		// como eu faço para adicionar novos produtos?
		
		lista.add(new Produto(1, "Produto 01", 100, 1));
		lista.add(new Produto(2, "Produto 02", 200, 2));
		lista.add(new Produto(3, "Produto 03", 300, 3));
		lista.add(new Produto(4, "Produto 04", 400, 4));
		lista.add(new Produto(5, "Produto 05", 500, 5));
		lista.add(new Produto(6, "Produto 06", 600, 6));
		lista.add(new Produto(7, "Produto 07", 700, 7));
		lista.add(new Produto(8, "Produto 08", 800, 8));
		lista.add(new Produto(9, "Produto 09", 900, 9));
		 
		// preciso do seguinte:
		Produto maisCaro, maisBarato;
		double totalEstoque = 0;
		double qtdItens=0;
		// apenas para ter um elemento de referência
		maisCaro = maisBarato = lista.get(0);
		
		for (Produto p: lista) {
			if (p.getPreco() > maisCaro.getPreco()) {
				maisCaro = p;
			}
			
			if (p.getPreco() < maisBarato.getPreco()) {
				maisBarato = p;
			}
			
			totalEstoque += p.getPreco() * p.getEstoque();
			qtdItens += p.getEstoque();			
		}
		
		System.out.println("Produto Mais caro   = "+maisCaro);
		System.out.println("Produto mais barato = "+maisBarato);
		System.out.printf ("Estoque avaliado em R$ %.2f\n", totalEstoque);
		System.out.println("Total de Itens em estoque = "+qtdItens);
		
		
	}

}
