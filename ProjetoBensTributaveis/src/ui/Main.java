package ui;
import core.veiculos.Veiculo;
import core.veiculos.Carro;
import core.veiculos.Moto;
import interf.BemTributavel;
import core.imoveis.*;

public class Main {
	public static void main(String args[]) {
		Veiculo listaVeiculos[] = new Veiculo[2];
		Imovel listaImoveis[] = new Imovel[3];
		
		listaVeiculos[0] = new Carro("Camaro", "Amarelo",2017, 100000.50, 2, 200 );
		listaVeiculos[1] = new Moto("Yamaha", "bug",2019, 5250.75, 70, "Normal");
		listaImoveis [0] = new Residencial("Rua carlitos", 200000, (float)50.5 );
		listaImoveis [1] = new Comercial("Rua pablitos", 150000, true);
		listaImoveis [2] = new Rural("Rua doritos", 500000, "Sitio");
		int nTributaveis = 0; 
		
		//String listaTributaveis = "";
		
		for(int j = 0 ; j< listaVeiculos.length;j++) {
			if(listaVeiculos[j] instanceof BemTributavel) {
				nTributaveis++;		
			}
		}
		
		for(int k = 0; k < listaImoveis.length;k++){
			if(listaImoveis[k] instanceof BemTributavel) {
				nTributaveis++;					
			}
		}
		
		BemTributavel listaBensTributaveis[] = new BemTributavel[nTributaveis];  
		int contTributavel = 0;
		
		for(int i = 0; i < listaVeiculos.length;i++){
			if(listaVeiculos[i] instanceof BemTributavel) {			
				//listaTributaveis += listaVeiculos[i].toString() +" // \n\n"; 	
				listaBensTributaveis[contTributavel] = (listaVeiculos[i] instanceof Carro?( (Carro) listaVeiculos[i]):(Moto) listaVeiculos[i]);
				contTributavel++;
			}
		}
		for(int cont = 0;cont < listaImoveis.length;cont++) {
			if(listaImoveis[cont] instanceof BemTributavel) {
				//listaTributaveis += listaImoveis[cont].toString() +" // \n\n"; 	
				listaBensTributaveis[contTributavel] = (listaImoveis[cont] instanceof Residencial?( (Residencial) listaImoveis[cont]):(Comercial) listaImoveis[cont]);
				contTributavel++;
			}
		}
		for(int q = 0;q<listaBensTributaveis.length;q++) {
			System.out.println(listaBensTributaveis[q]);
		}
		
	}
}
