// na interface eu tenho apenas os cabecalhos

public interface InterfaceBD {
		
	public void conectar();
	public void desconectar();
	public void executarComando(String comando);

}
