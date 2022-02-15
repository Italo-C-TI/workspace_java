package br.com.isidrocorp.lojavirtual.userinterface;

import br.com.isidrocorp.lojavirtual.core.Cliente;
import br.com.isidrocorp.lojavirtual.core.Pedido;
import br.com.isidrocorp.lojavirtual.core.Produto;

public class Loja {
	public static void main(String[] args) {
		
		
		Produto lista[];  // aqui eu só tenho a declaração
		
		lista = new Produto[6];  // só tenho as referências (as variáveis do tipo produto)
		
		// preciso instanciar individualmente cada objeto
		lista[0] = new Produto(1, "Computador", 1000.0);
		lista[1] = new Produto(2, "Mouse", 50.0);
		lista[2] = new Produto(3, "Teclado", 100.0);
		lista[3] = new Produto(4, "Gabinete", 300.0);
		lista[4] = new Produto(5, "Estabilizador", 150.0);
		lista[5] = new Produto(6, "Cadeira Gamer", 900.0);
		
		Cliente clientes[] = new Cliente[5];
		clientes[0] = new Cliente(123, "Isidro", "isidro@isidro.com");
		clientes[1] = new Cliente(234, "Delazir", "dela@dela.com");
		clientes[2] = new Cliente(345, "Liderce", "nega@nega.com");
		clientes[3] = new Cliente(456, "Ivaneria", "neria@neria.com");
		clientes[4] = new Cliente(789, "Lindolfo", "dorfo@dorfo.com");
		
		Pedido p1 = new Pedido();
		p1.setData("11/02/2022");
		p1.setCliente(clientes[0]);
		p1.setProduto(lista[0]);
		System.out.println(p1.exibir());
	}

}
