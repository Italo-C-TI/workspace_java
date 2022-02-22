
public class BDOracle implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Connecting on ORADB Service");		
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnecting ORADB Service");
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("oracle> "+comando);
		
	}
	

}
