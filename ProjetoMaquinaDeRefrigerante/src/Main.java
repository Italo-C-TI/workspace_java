import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		String nomeCliente;
		double valorInserido,valorAdicional;
		int opcao,numero_refrigerante;
		Refrigerante lista[];
		lista = new Refrigerante[4];
		lista[0] = new Refrigerante("Pepsi", 4.50 , 8);
		lista[1] = new Refrigerante("Coca", 5.50 , 8);
		lista[2] = new Refrigerante("Fanta_Uva", 3.50 , 8);
		lista[3] = new Refrigerante("Tubaina_TutiFruti", 2.50 , 8);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo a maquina de Refrigerantes da IsidroCorp");
		System.out.println("Insira seu nome");
		nomeCliente = input.nextLine();
		System.out.println("Nome inserido com sucesso!");
		System.out.println("Insira o valor que deseja adicionar");
		valorInserido = input.nextDouble();
		Creditos_Cliente cliente = new Creditos_Cliente(nomeCliente, valorInserido);
		System.out.println("Valor inserido com sucesso!");
		
		do {
			System.out.println("Bem vindo a sua conta temporaria!");
			System.out.println("Para Adicionar mais saldo insira o valor 1");
			System.out.println("Para escolher um refrigerante insira o valor 2");
			System.out.println("Para exibir seu saldo insira o valor 3");
			System.out.println("Para solicitar seu saldo insira o valor 4");
			System.out.println("Para exibir encerrar o atendimento insira o valor 0");
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor a adicionar ao saldo");
				valorAdicional = input.nextDouble();
				cliente.AdicionaCredito(valorAdicional);
				System.out.println("R$ "+ valorAdicional +" adicionado ao saldo com sucesso");
				break;
			case 2:	
				for (int i = 0;i < lista.length;i++) {
					System.out.printf("%d - %s - R$ %.2f \n",i,lista[i].nome,lista[i].preco);
				}
				System.out.println("Insira o codigo referente ao refrigerante desejado");
				numero_refrigerante = input.nextInt();	
				if(numero_refrigerante< 0 || numero_refrigerante > lista.length -1) {
					System.out.println("codigo invalido, tente novamente!");
					opcao=2;
				}
				if(cliente.getValorDisponivel() >= lista[numero_refrigerante].preco) {
					if(lista[numero_refrigerante].getQuantidade() > 0) {
						lista[numero_refrigerante].diminuiQuantidade();
						cliente.RealizaCompra(lista[numero_refrigerante].preco);
						System.out.println("Tudo certo , tome seu refrigerante "+lista[numero_refrigerante].nome);
					}else {
						System.out.println("Não foi possivel realizar a compra "+lista[numero_refrigerante].preco+" em falta");
					}
					
				}else {
					System.out.println("Valor em saldo insuficiente, adicione mais saldo!");
				}

				break;		
			case 3:
				System.out.println("Saldo na maquina = R$ "+cliente.getValorDisponivel());
				break;
			case 4:
				System.out.println("Tome seu Troco  de = R$ "+cliente.trocoSolicitado());
			case 0:
				System.out.println("Obrigado pela preferencia "+cliente.getNomeCliente()+"!!");
				break;
			default:
				System.out.println(" --> Opcao Invalida!");
				
			}
			
		}while(opcao != 0); {
			
		}
		
		
		input.close();
	}
}
