
public class Teste {
	public static void main(String[] args) {
		Oficina oficina = new Oficina("Oficina do Zé");
		
		Carro c1, c2;
		c1 = new Carro("Vokis", "1978", true);
		c2 = new Carro("Fiote", "1980", false);
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		oficina.consertarCarro(c2);
		
		System.out.println(c2.exibirInfo());
	}

}
