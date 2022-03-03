
public class FabricaDeAlunos {

	public static Aluno criarAlunoFromCSV(String linha) {
		Aluno a=null;
		String[] dados = linha.split(";");
		
		if (dados.length != 3) {
			throw new CSVFormatException("Formato de linha CSV inválido");
		}
		
		try {
			// aqui eu crio de verdade meu aluno
			a = new Aluno(dados[0].trim(),
					      Double.parseDouble(dados[1].trim()), 
					      Double.parseDouble(dados[2].trim()));
			
		} catch (NumberFormatException | NullPointerException ex) {
			throw new DadosAlunoException("Algum dado do aluno veio inválido");
		}
		return a;
	}

}
