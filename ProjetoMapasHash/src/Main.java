import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

		/*
		 * Idéia do benchmark
		 * 
		 * realizar várias buscas em uma lista que eu vou incrementando o tamanho (pra
		 * ver se é mesmo proporcional)
		 */

		/*
		 * ArrayList<Produto> lista = new ArrayList<Produto>(); int chaveDeBusca = -1;
		 * for (int i = 1; i <= 1000000; i++) { lista.add(new Produto(i, "Produto" + i,
		 * i)); }
		 * 
		 * // agora vou fazer um monte de buscas long ini, fim; ini =
		 * System.currentTimeMillis();
		 * 
		 * for (int cont = 1; cont <= 1000; cont++) { // como é o algoritmo de 1 busca
		 * for (Produto p : lista) { if (p.getId() == chaveDeBusca) {
		 * System.out.println(p); break; } } }
		 * 
		 * fim = System.currentTimeMillis();
		 * 
		 * System.out.println("Tempo de busca = "+(fim-ini)+ "ms");
		 */

		// ------------------ agora vamos testar tudo com HASH
		HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

		for (int i = 1; i < 1000000; i++) {
			mapa.put(i, new Produto(i, "Produto" + i, i));
		}
		long ini, fim;
		int chaveDeBusca = 1000;
		// as mesmas 1000 buscas em cima do conjunto
		ini = System.currentTimeMillis();
		for (int cont = 1; cont < 10000; cont++) {
			Produto p = mapa.get(chaveDeBusca);
			if (p != null) {
				//System.out.println(p);
			}
		}
		fim = System.currentTimeMillis();

		System.out.println("Tempo de Busca = " + (fim - ini) + "ms");

	}
}
