package br.com.isidrocorp.projetotime.userinterface;

import br.com.isidrocorp.projetotime.core.*;
import java.time.*;

import static java.lang.System.out;

public class TimeTeste {
	public static void main(String[] args) {
		
		br.com.isidrocorp.projetotime.core.LocalTime t = new br.com.isidrocorp.projetotime.core.LocalTime();
		java.time.LocalTime outroT = java.time.LocalTime.now();
		
		t.setTime(5,5,8);
		
		out.println(t.exibirHoraUniversal());
		out.println(t.exibirHoraPadrao());
		
		t.setTime(12,15);
		out.println(t.exibirHoraUniversal());
		out.println(t.exibirHoraPadrao());
		
	}

}
