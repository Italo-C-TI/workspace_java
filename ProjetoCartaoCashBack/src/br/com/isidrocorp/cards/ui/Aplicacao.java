package br.com.isidrocorp.cards.ui;

import br.com.isidrocorp.cards.core.CartaoCashBack;
import br.com.isidrocorp.cards.core.CartaoPrePago;

public class Aplicacao {
	public static void main(String[] args) {
		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[4];
		
		cartoes[0] = new CartaoPrePago ("Cliente PP01", "111 222 333 444", 10, 2028, 1000);
		cartoes[1] = new CartaoCashBack("Cliente CB02", "222 333 444 555", 10, 2028, 1000, 0);
		cartoes[2] = new CartaoCashBack("Cliente CB03", "333 444 555 666", 10, 2028, 1000, 1);
		cartoes[3] = new CartaoCashBack("Cliente CB04", "444 555 666 777", 10, 2028, 1000, 2);
		
		for (CartaoPrePago cartao : cartoes) {
			System.out.println(cartao);
			cartao.comprar(100);
		}
		
		System.out.println("\n---> Compra de R$ 100,00 em cada cartao\n");
		
		for (CartaoPrePago cartao: cartoes) {
			System.out.println(cartao);			
		}
	}
}
