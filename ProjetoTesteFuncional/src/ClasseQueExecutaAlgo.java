
public class ClasseQueExecutaAlgo {
	private int valor;
	
	
	
	public ClasseQueExecutaAlgo(int valor) {
		super();
		this.valor = valor;
	}

	public void metodoQueExecutaAlgo(InterfaceServico i) {
		System.out.println("Antes da chamada....");
		i.executa(this.valor, this.valor);
		System.out.println("------------------");
	}

}
