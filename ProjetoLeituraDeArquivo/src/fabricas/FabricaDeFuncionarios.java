package fabricas;
import funcionarios.*;
import exceptions.*;

public class FabricaDeFuncionarios {
	public static Funcionario createFromCSV(String linha) {
		try {
			String[] dados = linha.split(";");
			switch (dados[0].trim()) {
			case "1":
				return new Chefe (	Integer.parseInt(dados[0].trim()),
									Integer.parseInt(dados[1].trim()), 
									dados[2].trim(),
									Float.parseFloat(dados[3].trim()),
									Float.parseFloat(dados[4].trim()),
									Float.parseFloat(dados[5].trim()));
			case "2":
				return new Comissionado(Integer.parseInt(dados[0].trim()),
										Integer.parseInt(dados[1].trim()), 
						                dados[2],
						                Double.parseDouble(dados[3].trim()), 
						                Double.parseDouble(dados[4].trim()));
			case "3":
				return new Horista(	Integer.parseInt(dados[0].trim()),
									Integer.parseInt(dados[1].trim()), 
						           	dados[2], 
						           	Double.parseDouble(dados[4].trim()),
									Integer.parseInt(dados[3].trim()));
			case "4":
				return new Empreiteiro(	Integer.parseInt(dados[0].trim()),
										Integer.parseInt(dados[1].trim()), 
										dados[2],
										Double.parseDouble(dados[3].trim()));
			default:
				throw new TipoFuncionarioInvalidoException("Tipo Invalido");
			}
		} 
		catch(NumberFormatException ex) {
			throw new DadosInvalidosException("Erro ao converter informações do funcionario");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			throw new EstruturaFuncionarioInvalidaException("Dados incompletos para o funcionario");
		}
		catch (Exception ex) {
			throw new RuntimeException("Erro desconhecido");
		}
		
	}
}
