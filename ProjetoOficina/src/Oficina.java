
public class Oficina {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Oficina(String nome) {
		super();
		this.nome = nome;
	}
	
	public void consertarCarro(Carro c) {
		System.out.println(" ***** "+nome+" ***** ");
		System.out.println("Consertando o carro "+c.getMarca());
		System.out.println("Preço do serviço R$ 1000.00");
		c.setFuncionando(true);
	}

}
