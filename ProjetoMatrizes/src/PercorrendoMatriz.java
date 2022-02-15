
public class PercorrendoMatriz {
	public static void main(String[] args) {
		int matriz[][];
		
		matriz = new int[3][5];
		
		// uma matriz de 3 linhas por 5 colunas, as linhas vão de 0 a 2 e as colunas de 0 a 4
		
		matriz[0][0] = 123;
		matriz[0][1] = 456;
		matriz[0][2] = 789;
		matriz[0][3] = 987;
		matriz[0][4] = 654;
		
		matriz[1][0] = 741;
		matriz[1][1] = 147;
		matriz[1][2] = 852;
		matriz[1][3] = 258;
		matriz[1][4] = 963;
		
		matriz[2][0] = 369;
		matriz[2][1] = 159;
		matriz[2][2] = 951;
		matriz[2][3] = 753;
		matriz[2][4] = 357;
		System.out.println("-------------------------------");
		for(int l = 0; l < 3; l++) {
			System.out.print("|");
			for (int c = 0; c < 5; c++) {
				System.out.printf("%5d|", matriz[l][c]);
			}
			System.out.println("\n-------------------------------");
		}
		
	}
}
