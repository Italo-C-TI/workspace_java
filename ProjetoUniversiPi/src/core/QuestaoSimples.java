package core;

public class QuestaoSimples {
	protected String enunciado;
	protected String gabarito;
	public QuestaoSimples(String enunciado, String gabarito) {
		super();
		this.enunciado = enunciado;
		this.gabarito = gabarito;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getGabarito() {
		return gabarito;
	}
	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}
	public String aplicarQuestao() {
		return enunciado + ": ";
	}
	public boolean corrigr(String resposta) {
		return this.gabarito.equalsIgnoreCase(resposta);
	}
}
