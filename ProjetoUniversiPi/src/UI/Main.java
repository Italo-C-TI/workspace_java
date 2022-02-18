package UI;
import core.*;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		QuestaoSimples questoes[] = new QuestaoSimples[5];
		questoes[0] = new QuestaoSimples("Quanto vale 1 + 1?","2");
		questoes[1] = new QuestaoComDica("Qual a linguagem do curso?","JAVA","Come�a com JA e termina com VA");
		questoes[2] = new QuestaoMutiplaEscolha("Qual a formula da �gua?","H2O","NaCl","H2SO4", "H2O", "H2OH");
		questoes[3] = new QuestaoSimples("Quem descobriu o Brasa?","PA Cabral");
		questoes[4] = new QuestaoComDica("Qual a cor do cavalo Branco de Napole�o","Marrom","N�o confunda a cor com o nome");
		int pontos = 0;
		String respAluno;
		
		for(QuestaoSimples q: questoes) {
			System.out.println(q.aplicarQuestao());
			System.out.print("R:");
			respAluno = input.nextLine();
			if (q.corrigr(respAluno)) {
				System.out.println("Resposta Correta!");
				pontos++;
			}
			else {
				System.out.println("Resposta Incorreta");
				System.out.println("A resposta correta � "+q.getGabarito());
			}
		}
		
		System.out.println("Voce acertou um total de "+pontos+"/"+questoes.length);
		input.close();
	}
}
