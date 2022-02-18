package ui;
import core.veiculos.*;
import interf.BemTributavel;
import core.imoveis.*;

public class Main {
	public static void main(String args[]) {
		Veiculo listaVeiculos[] = new Veiculo[2];
		Imovel listaImoveis[] = new Imovel[3];
		
		listaVeiculos[0] = new Carro("Camaro", "Amarelo",2017, 100000.50, 2, 200 );
		listaVeiculos[1] = new Moto("Yamaha", "bug",2019, 5250.75, 70, "Normal");
		listaImoveis[0] = new Residencial("Rua carlitos", 200000, (float)50.5 );
		listaImoveis[1] = new Comercial("Rua pablitos", 150000, true);
		listaImoveis[2] = new Rural("Rua doritos", 500000, "Sitio");
		
		String listaTributaveis = "";
		
		for(int i = 0; i < listaVeiculos.length;i++){
			if(listaVeiculos[i] instanceof BemTributavel) {
				listaTributaveis += listaVeiculos[i].toString() +" // \n\n"; 				
			}
		}
		for(int cont = 0;cont < listaImoveis.length;cont++) {
			if(listaImoveis[cont] instanceof BemTributavel) {
				listaTributaveis += listaImoveis[cont].toString() +" // \n\n"; 				
			}
		}
		System.out.println(listaTributaveis);
	}
}
