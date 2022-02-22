
public class TesteEnum {
	
	public static void main(String[] args) {		
		Data d = new Data(17, Meses.Fevereiro, 2022);
		System.out.println(d);
		
//		for (int i=0; i<Meses.values().length; i++) {
//			System.out.println("Posicao = "+i+" valor="+Meses.values()[i]);
//		}
//		
//		for (Meses m: Meses.values()) {
//			m.setMesNumerico(m.getMesNumerico()*10);
//			System.out.println(m.getMesNumerico() + " - " + m);
//		}
		
		Meses mes;
		mes = Meses.Janeiro;
		
		
		
		for (Cardapio c: Cardapio.values()){
			System.out.println(c);
		}
	}
}	
