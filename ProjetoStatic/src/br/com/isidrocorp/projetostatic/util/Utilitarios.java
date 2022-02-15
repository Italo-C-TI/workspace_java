package br.com.isidrocorp.projetostatic.util;
/* esta classe vai ter funções para fazer continhas */
public class Utilitarios {
	
	public static final double PI = 3.14;
	
	public static String soma(double a , double b) {
		return formatador(a + b);
	}
	
	public static String subt(double a, double b) {
		return formatador(a - b);
	}
	
	public static String pot(double b, int e) {
		double pote = 1;
		for (int cont=0; cont < e; cont++) {
			pote = pote * b;
		}
		return Utilitarios.formatador(pote);
	}
	
	private static String formatador(double valor) {
		return String.format("%.3f", valor);
	}
	
	
}
