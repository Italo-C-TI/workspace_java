package br.com.universipi.questions;

public class QuestaoComDica extends QuestaoSimples {
	private String dica;

	public QuestaoComDica(String enunciado, String gabarito, String dica) {
		super(enunciado, gabarito);
		this.dica = dica;
	}
	
	@Override
	public String aplicarQuestao() {
		return "Q: "+super.enunciado+"\n"+
	           "(dica):"+this.dica;
	}

}
