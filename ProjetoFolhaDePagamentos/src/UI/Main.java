package UI;
import core.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Funcionario> lista;
		lista = Arrays.asList(		
				new Empreiteiro("Jose", 171212, 3000),
				new Horista("Joao", 131313, (float)85.92 , 150),
				new Comissionado("Junior", 141414, 1300, 25),
				new Chefe("Jubileu", 151515, 8000 , 22 , 1500));
		

		
		lista.stream().forEach(e -> System.out.print(e+ " \n"));
		System.out.println();
		lista.stream().sorted(Comparator.comparing(e->e.calcularSalario())).forEach(e -> System.out.print("R$ "+e.calcularSalario() +" eh o valor do salario do(a) "+e+"\n"));
		System.out.println();
		lista.stream().sorted(Comparator.comparing(e->e.getNome())).forEach(e -> System.out.print(e+ " \n"));
		System.out.println();
		lista.stream().sorted().forEach(e -> System.out.print(e+ " \n"));
	}
}
