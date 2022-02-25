import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<Produto>lista;
		lista = new ArrayList<Produto>();
		double valorMaisAlto, valorMaisBaixo ,valorDoEstoque = 0;
		int posDoMaiorValor= 0, posDoMenorValor = 0;
		
		for(int i = 1 ;i <=10 ;i++) {
			lista.add(new Produto(i,"Produto "+i, (i*11.50)-i, i*10));
		}
		valorMaisAlto = ((Produto) lista.toArray()[0]).getPreco();
		valorMaisBaixo = ((Produto) lista.toArray()[0]).getPreco();
		
		for( int j = 0 ;j <lista.toArray().length ;j++) {
			valorDoEstoque +=  lista.get(j).getPreco() * lista.get(j).getQtdEstoque();
			if(valorMaisAlto < lista.get(j).getPreco()) {
				valorMaisAlto = lista.get(j).getPreco();
				posDoMaiorValor = j;
			}
			if(valorMaisBaixo > lista.get(j).getPreco()) {
				valorMaisBaixo = lista.get(j).getPreco();
				posDoMenorValor = j;
			}

		}
		System.out.println(lista.get(0));
		System.out.println("O produto de maior valor eh "+ lista.get(posDoMaiorValor));
		System.out.println("O produto de menor valor eh "+ lista.get(posDoMenorValor));
		System.out.printf("O valor total do estoque eh R$ %.2f\n",valorDoEstoque);
	}
}
