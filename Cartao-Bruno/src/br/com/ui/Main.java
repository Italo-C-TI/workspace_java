//import javax.swing.JOptionPane;
package br.com.ui;

import javax.swing.JOptionPane;

import br.com.core.Cartao;
import br.com.core.CartaoCashBack;
import br.com.core.CartaoPrePago;

public class Main {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bem-vindo a criacao do seu cartao!");
		// int opcaoCartao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para
		// Cartão Pré Pago. Digite 2 para Cartão com CashBack"));
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		Cartao cartao = null;
		
		if (Integer.parseInt(JOptionPane.showInputDialog("digite 1 para pre pago e 2 para CB")) == 1) {
			cartao = new CartaoPrePago("4314", nome, 2025, 12, 1000);
		}
		else {
			cartao = new CartaoCashBack("4314", nome, 2025, 12, 1000, 2);
		}
				
//				new CartaoPrePago("4314", nome, 2025, 12, 1000);
		// cartao = new CartaoCashBack("4314", nome, 2025, 12, 1000);

		int oQueFazer;
		do {
			oQueFazer = Integer.parseInt(JOptionPane.showInputDialog("Voce possui R$" + cartao.getSaldo()
					+ " de credito\nDigite 1 para adicionar credito\nDigite 2 para fazer uma compra\nDigite 0 para encerrar!"));

			if (oQueFazer == 1) {
				double valor = Double
						.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja adicionar de credito: "));
				cartao.adicionarCredito(valor);
				JOptionPane.showMessageDialog(null, "Credito adicionado com sucesso!");
			}

			if (oQueFazer == 2) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
				if (cartao.comprar(valor)) {
					JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null, "Voce nao possui saldo!!");

				}
			}

		} while (oQueFazer != 0);

	}
}
