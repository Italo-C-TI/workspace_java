import java.util.Scanner;
public class Loja {
	public static void main(String args[]) {
		CartaoDebito c1;
		int opcao;
		double valor;
		c1 = new CartaoDebito("Italo Costa","2000 0000 5000 0001",2031, 10);
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Bem vindo a Loja!");
			System.out.println("Para Adicionar saldo digite 1");
			System.out.println("Para comprar digite 2");
			System.out.println("Para exibir informações do cartão digite 3");
			System.out.println("Para exibir encerrar o programa digite 0");
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor a adicionar ao saldo");
				valor = input.nextDouble();
				c1.adicionarAoDebito(valor);
				break;
			case 2:	
				System.out.println("Digite o valor da compra");
				valor = input.nextDouble();
				if (c1.comprar(valor)) {
					System.out.println(" --> COMPRA APROVADA!");
				}
				else {
					System.out.println(" --> CREDITO INSUFICIENTE");
				}
				break;		
			case 3:
				System.out.println("Seu Cartão: "+c1.getNumeroCartao() + " Val:"+c1.getMesValidade()+"/"+c1.getAnoValidade());
				System.out.println("Titular: "+c1.getTitular());
				System.out.printf("Saldo R$ %.2f\n",c1.getSaldo());
				break;
			case 0:
				System.out.println("Obrigado pela preferencia!!");
				break;
			default:
				System.out.println(" --> Opção Inválida!");
				
			}
			
		}while(opcao != 0); {
			
		}
		
		
		
		input.close();
	}
}
