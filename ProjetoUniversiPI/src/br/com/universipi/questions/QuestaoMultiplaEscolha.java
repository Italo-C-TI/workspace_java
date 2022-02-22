package br.com.universipi.questions;

public class QuestaoMultiplaEscolha extends QuestaoSimples{
	private String a1;
	private String a2;
	private String a3;
	private String a4;
	public QuestaoMultiplaEscolha(String enunciado, String gabarito, String a1, String a2, String a3, String a4) {
		super(enunciado, gabarito);
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
	
	@Override
	public String aplicarQuestao() {
		return "Q: "+super.enunciado+"\n"+
	           "   a) "+a1+"\n"+
	           "   b) "+a2+"\n"+
	           "   c) "+a3+"\n"+
	           "   d) "+a4;
	}

}
