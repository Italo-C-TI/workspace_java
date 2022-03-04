
public class ClassePrincipal {
	public static void main(String[] args) {

		ClasseQueExecutaAlgo c = new ClasseQueExecutaAlgo(10);

		c.metodoQueExecutaAlgo((valor, valor2) -> {
			System.out.println("Valor = "+valor);
		});

		c.metodoQueExecutaAlgo(new InterfaceServico() {

			@Override
			public void executa(int valor, int valor2) {
				// TODO Auto-generated method stub
				System.out.println("Valor = " + valor);
			}
		});
		
		
		
		ClasseQueExecuta x = new ClasseQueExecuta();
		c.metodoQueExecutaAlgo(x);

	}
}
