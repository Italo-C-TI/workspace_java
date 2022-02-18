package core;

public class QuestaoComDica extends QuestaoSimples {
	private String dica;

	public QuestaoComDica(String enunciado, String reposta, String dica) {
		super(enunciado, reposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	@Override
	public String aplicarQuestao() {
		return enunciado + ": \n Dica : "+this.dica;
	}
	
}
