package ui;

import java.util.Scanner;

import model.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao, tipo;
		double valor;
		BombaDeCombustivel bombas[] = new BombaDeCombustivel[3];
		bombas[0] = new BombaDeCombustivel("Gasolina", 6.90);
		bombas[1] = new BombaDeCombustivel("Etanol", 4.50 );
		bombas[2] = new BombaDeCombustivel("Diesel", 3.99);
		
		do {
			System.out.println("===================Abasteceaí=================");
			System.out.println("Digite a bomba (0 Gasolina, 1 Etanol, 2 Diesel");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 0:
			case 1:
			case 2:
				System.out.println("Deseja abastecer por 1:litros, 2:valor");
				tipo = teclado.nextInt();
				if (tipo == 1) {
					System.out.println("Por favor digite a quantidade de litros");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].montarRecibo());
				}
				else if (tipo ==2 ) {
					System.out.println("Por favor, digite o total a pagar");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].montarRecibo());	
				}
				else {
					System.out.println("Tipo de abastecimento desconhecido");
				}				
				break;
			case -1:
				System.out.println("Ate logo");
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
			
			
		} while (opcao != -1);
		
		
	}

}
