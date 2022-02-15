package model;

public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double valorTotal;
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	public void abastecerPorLitros(double qtde) {
		this.qtdeLitros = qtde;
		this.valorTotal =  this.qtdeLitros * this.precoLitro;		
	}
	public void abastecerPorValor(double total) {
		this.valorTotal = total;
		this.qtdeLitros = this.valorTotal / this.precoLitro;
	}
	
	public String montarRecibo() {
		String recibo = "=============================================\n"+
				        " P O S T O      D E    C O M B U S T I V E L \n"+
				        "=============================================\n"+
				        " Combustivel : "+nome+"\n"+
				        " Preço Litro R$ "+String.format("%.3f\n", precoLitro)+
				        " Abastecidos    "+String.format("%.3f litros\n", qtdeLitros)+
				        " Valor Total R$ "+String.format("%.2f\n", valorTotal)+
				        "=============================================";
		return recibo;
	}
	
	
}
