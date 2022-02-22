import java.util.Scanner;

public class AplicacoBD {
	public static void main(String[] args) {
		InterfaceBD ibd = null;
		Scanner teclado = new Scanner(System.in);
		String database;
		System.out.print("Digite Mysql | Oracle | Postgres :");
		database = teclado.nextLine();
		/*
		 * switch (database) { case "Mysql": ibd = new BDMysql(); break; case "Oracle":
		 * ibd = new BDOracle(); break; case "Postgres": ibd = new BDPostgres(); break;
		 * default:
		 * 
		 * }
		 */

		try {
			String nomeDaClasse = "BD"+database;
			ibd = (InterfaceBD)Class.forName(nomeDaClasse).getDeclaredConstructor().newInstance(null);
		} catch (Exception ex) {
			System.err.println("Erro ao criar classe");
			ex.printStackTrace();
		}
		ibd.conectar();
		ibd.executarComando("Select * from tb_produto");
		ibd.desconectar();

		teclado.close();
	}

}
