package UI;
import core.*;
public class Main {
	public static void main(String args[]) {
		Funcionario lista[] = new Funcionario[4];
		
		lista[0] = new Empreiteiro("Jose", 121212, 3000);
		lista[1] = new Horista("Joao", 131313, (float)85.92 , 150);
		lista[2] = new Comissionado("Junior", 141414, 1300, 25);
		lista[3] = new Chefe("Jubileu", 151515, 8000 , 22 , 1500);
		
		for (Funcionario f: lista) {

			System.out.println(f.getNome()+" - Salario devido R$ "+String.format("%.2f", f.calcularSalario()));
		}
	}
}
