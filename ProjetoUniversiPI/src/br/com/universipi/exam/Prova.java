package br.com.universipi.exam;

import java.util.Scanner;

import br.com.universipi.questions.QuestaoComDica;
import br.com.universipi.questions.QuestaoMultiplaEscolha;
import br.com.universipi.questions.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples questoes[] = new QuestaoSimples[5];
		questoes[0] = new QuestaoSimples("Quanto vale 1 + 1?","2");
		questoes[1] = new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA");
		questoes[2] = new QuestaoMultiplaEscolha("Qual a formula da água?","H2O","NaCl","H2SO4", "H2O", "H2OH");
		questoes[3] = new QuestaoSimples("Quem descobriu o Brasa?","PA Cabral");
		questoes[4] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão","Marrom","Não confunda a cor com o nome");
		int pontos = 0;
		String respAluno;
		
		for(QuestaoSimples q: questoes) {
			System.out.println(q.aplicarQuestao());
			System.out.print("R:");
			respAluno = teclado.nextLine();
			if (q.corrigir(respAluno)) {
				System.out.println("Boa!!!!");
				pontos++;
			}
			else {
				System.out.println("Errrroooooooooooouuuuu (imagine Silva, F. dizendo)");
				System.out.println("A resposta correta é "+q.getGabarito());
			}
		}
		
		System.out.println("Voce acertou um total de "+pontos+"/"+questoes.length);
		
		
		teclado.close();
	}

}

