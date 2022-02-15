package br.com.isidrocorp.maquinaderefri.userinterface;

import java.util.Scanner;

import br.com.isidrocorp.maquinaderefri.core.MaquinaDeRefri;
import br.com.isidrocorp.maquinaderefri.core.Refrigerante;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MaquinaDeRefri m = new MaquinaDeRefri();
		// agora vou "simular como se eu tivesse recuperando dados de um BD", mas na vdd vou apenas criar meus refris
		Refrigerante listaDeRefri[] = new Refrigerante[7];
		listaDeRefri[0] = new Refrigerante("Coca-Cola", 3.50, 10);
		listaDeRefri[1] = new Refrigerante("Fanta", 1.75, 5);
		listaDeRefri[2] = new Refrigerante("Sprite", 2.00, 5);
		listaDeRefri[3] = new Refrigerante("Fanta Uva", 1.00, 2);
		listaDeRefri[4] = new Refrigerante("Pepsi", 2.75, 8);
		listaDeRefri[5] = new Refrigerante("Soda", 2.00, 5);
		listaDeRefri[6] = new Refrigerante("7-Up", 1.50, 5);
		
		m.setLista(listaDeRefri);
		int opcao; 
		double valor;
		
		do {
			System.out.println("=======================================");
			System.out.println("   M A Q U I N A   D E    R E F R I");
			System.out.println("=======================================");
			System.out.println(" 100 - Inserir Credito");
			System.out.println(" 101 - Solicitar Troco");
			System.out.println("  -1 - Sair");
			System.out.println(" Escolha seu Refri ");
			System.out.println(m.exibirDisplay());
			System.out.println(" CREDITO = R$ "+m.getCredito());
			opcao = teclado.nextInt();
			switch(opcao) {
			case 100:
				System.out.println("Digite o credito a inserir");
				valor = teclado.nextDouble();
				m.adicionarCredito(valor);
				break;
			case 101:
				System.out.println("Seu troco = R$ "+m.solicitarTroco());
				break;
			case -1:
				System.out.println("Ate mais");
				break;
			case 0: case 1: case 2: case 3: case 4:
				int resultado = m.comprar(opcao);
				if (resultado == 0) {
					System.out.println("Aproveite seu Refri!");
				}
				else if (resultado == -1) {
					System.out.println("Credito insuficiente");
				}
				else {
					System.out.println("Desculpe, estoque finalizado");
				}
				break;
			default: 
				System.out.println("Opcao Invalida");
			}
			
		} while (opcao != -1);
	}

}
