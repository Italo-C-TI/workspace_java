package br.com.isidrocorp.maquinaderefri.core;

public class MaquinaDeRefri {
	private double credito;
	private Refrigerante lista[];
	
	public MaquinaDeRefri() {
		this.credito = 0.0;	
	}
	
	public void adicionarCredito(double valor) {
		this.credito += valor;
	}
	
	public double solicitarTroco() {
		double troco = this.credito;
		this.credito = 0.0;
		return troco;
	}
	
	// 0 - deu certo / -1 falta credito / -2 falta estoque
	public int comprar(int num) {
		// tem credito?
		if (this.credito >= this.lista[num].getPreco()) {
			if (this.lista[num].getQtde() > 0 ) {
				this.credito -= this.lista[num].getPreco(); // diminuí meu crédito
				int qtd = this.lista[num].getQtde() - 1;
				this.lista[num].setQtde(qtd);
				return 0; // deu bom - pode degustar seu refri merecido
			}
			else {
				return -2; // faltou estoque
			}
		}
		else {
			return -1; // faltou crédito
		}
	}
	
	public String exibirDisplay() {
		String msg="";
		for (Refrigerante r: lista) {
			msg = msg + r.getNome() + " R$ "+r.getPreco()+"\n";
		}
		return msg;
	}
	
	public double getCredito() {
		return this.credito;
	}

	public Refrigerante[] getLista() {
		return lista;
	}

	public void setLista(Refrigerante[] lista) {
		this.lista = lista;
	}
	
}
