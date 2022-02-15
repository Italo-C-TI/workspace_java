package br.com.isidrocorp.projetotime.core;

public class LocalTime {
	private int hora;
	private int minu;
	private int segu;
	
	public LocalTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	
	public LocalTime(int hora, int minu) {
		this(hora, minu, 0);
	}
	
	public LocalTime(int hora) {
		this(hora, 0, 0);
	}
	
	public LocalTime() {
		this(0,0,0);
	}

	public void setTime(int hora, int minu, int segu) {
		this.hora = hora;
		this.minu = minu;
		this.segu = segu;
	}
	
	public void setTime(int hora, int minu) {
		this.hora = hora;   // pode ser substituido por setTime(hora,minu, 0);
		this.minu = minu;
		this.segu = 0;
	}
	
	public void setTime(int hora) {
		this.setTime(hora, 0, 0);
	}
	
	public String exibirHoraUniversal() {
		return formataNumero(this.hora) + ":" + formataNumero(this.minu) + ":" + formataNumero(this.segu);
	}

	public String exibirHoraPadrao() {
		String horaPadrao;
		String sufixo;
		if (hora == 0) {
			horaPadrao = "12:";
			sufixo = "AM";
		}
		else if (hora == 12) {
			horaPadrao = "12:";
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaPadrao = formataNumero(hora) + ":";
			sufixo = "AM";
		}
		else {
			horaPadrao = formataNumero(hora - 12) + ":";
			sufixo = "PM";
		}
		horaPadrao = horaPadrao + formataNumero(this.minu)+":"+formataNumero(this.segu) + sufixo;
		return horaPadrao;
	}
	
	// aqui o método é declarado como PRIVATE pois não faz sentido outras classes o utilizarem
	// ele só serve para formatar o numero da hora/min/segu colocando o 0 na frente
	private String formataNumero(int numero) {
		return (numero < 10)? "0"+numero : String.valueOf(numero);
	}
}
