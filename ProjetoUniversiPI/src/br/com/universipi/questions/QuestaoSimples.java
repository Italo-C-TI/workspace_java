package br.com.universipi.questions;

public class QuestaoSimples {
	protected String enunciado;
	protected String gabarito;
	public QuestaoSimples(String enunciado, String gabarito) {
		super();
		this.enunciado = enunciado;
		this.gabarito = gabarito;
	}
	
	public String aplicarQuestao() {
		return "Q: "+enunciado;
	}
	
	public boolean corrigir(String resposta) {
		return this.gabarito.equalsIgnoreCase(resposta);
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
	
}
