package br.com.isidrocorp.imposto.main;

import br.com.isidrocorp.imposto.core.imoveis.Comercial;
import br.com.isidrocorp.imposto.core.imoveis.Imovel;
import br.com.isidrocorp.imposto.core.imoveis.Residencial;
import br.com.isidrocorp.imposto.core.imoveis.Rural;
import br.com.isidrocorp.imposto.core.veiculos.Carro;
import br.com.isidrocorp.imposto.core.veiculos.Moto;
import br.com.isidrocorp.imposto.core.veiculos.Veiculo;
import br.com.isidrocorp.imposto.taxes.BemTributavel;

public class Main {
	public static void main(String[] args) {
		
		Veiculo veiculos[];
		veiculos = new Veiculo[3];
		veiculos[0] = new Carro("Hiunday","HB20",2020,30000,4,1000);
		veiculos[1] = new Carro("Chevrolet","Tracker", 2022, 50000, 4, 1600);
		veiculos[2] = new Moto("Dafra", "Citycom", 2018, 10000, 300, "Scooter");
		
		Imovel imoveis[];
		imoveis = new Imovel[3];
		imoveis[0] = new Residencial("Rua I",120000, 110);
		imoveis[1] = new Comercial("Av 123", 400000,"Escritorio");
		imoveis[2] = new Rural("Estrada da Cana S/N", 600000, "Chacara");
		
//		for (Veiculo v: veiculos) {
//			if (v instanceof BemTributavel) {
//				System.out.println("O Veiculo "+v.getMarca()+" é tributável");
//			}
//			else {
//				System.out.println("O Veículo "+v.getMarca()+ " nao é tributavel");
//			}
//		}
//		
//		for (Imovel i: imoveis) {
//			if (i instanceof BemTributavel) {
//				System.out.println("O Imovel localizado em "+i.getEndereco()+" é tributável");
//			}
//			else {
//				System.out.println("O Imovel localizado em "+i.getEndereco()+" não é tributável");
//			}
//		}
		
//		Imovel teste01 = new Residencial("teste da casa", 1000, 100);
//		BemTributavel bem01 = new Residencial("teste da casa", 1000, 100);
//		
//		
//		Residencial teste02 = new Imovel("teste do imovel", 1000);
//		
//		Residencial r = imoveis[0];
//		Comercial c = imoveis[2];
		
		BemTributavel bens[] = new BemTributavel[5];
		bens[0] = veiculos[0];
		bens[1] = veiculos[1];
		bens[2] = veiculos[2];
		bens[3] = (BemTributavel)imoveis[0];
		bens[4] = (BemTributavel)imoveis[1];
		
		for (BemTributavel bem: bens) {
			System.out.println(bem + " R$ "+bem.calcularImposto());
		}
		
		
	}

}
