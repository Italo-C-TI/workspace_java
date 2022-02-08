
public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	private String categoria;
	private int posiEstante;
	private int posiPrateleira;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, String categoria, int anoDePublicacao, int posiEstante, int posiPrateleira) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.anoDePublicacao = anoDePublicacao;
		this.posiEstante = posiEstante;
		this.posiPrateleira = posiPrateleira;
		disponivel = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int anoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPosiEstante() {
		return posiEstante;
	}

	public void setPosiEstante(int posiEstante) {
		this.posiEstante = posiEstante;
	}

	public int getPosiPrateleira() {
		return posiPrateleira;
	}

	public void setPosiPrateleira(int posiPrateleira) {
		this.posiPrateleira = posiPrateleira;
	}

	public boolean isDispovinel() {
		return disponivel;
	}

	public String exibirInfo() {
		String mensagem;
		mensagem = "Livro: "+ titulo+"("+categoria+") / " + autor+ " (" + anoDePublicacao+ ")\n";
		mensagem = mensagem + ((disponivel) ?"Se encontra na estante "+posiEstante+" na prateleira "+posiPrateleira :"Não está disponivel"); 
		return mensagem;
	}

	public void emprestar() {
		disponivel = false;
	}

	public void devolver() {
		disponivel = true;
	}

}
