
public class CartaoCashBack extends CartaoPrePago {
	private int tipo; //bronze/silver/gold

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade,int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if(super.comprar(valor) && tipo>=0 && tipo<=2) {
			if (tipo==0) {
				this.saldo+=valor*0.02;				
			}else if(tipo == 1) {
				this.saldo+=valor*0.05;		
			}else if(tipo == 2) {
				this.saldo+=valor*0.08;	
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " tipo = "+ getTipoTexto();
	}
	
	public String getTipoTexto() {
		return (tipo == 2?"gold":tipo == 1?"silver":tipo ==0?"bronze":"Invalido");
	}

	public int getTipo() {
		return this.tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
