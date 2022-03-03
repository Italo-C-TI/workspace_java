package br.com.xmlgenerator;

import java.lang.reflect.Field;

public class XMLGenerator {
	public static final int COM_CABECALHO=1;
	public static final int SEM_CABECALHO=0;
	
	public static String generateXML(Object obj, int modo) {

		StringBuilder str = new StringBuilder();
		if (modo == COM_CABECALHO) {
			str.append("<xml>");
		}

		try {
			// vamos tratar apenas com a visão dos atributos
			for (Field f : obj.getClass().getDeclaredFields()) {
				if (   f.getType().getName().equals("int") 
					|| f.getType().getName().equals("float")  
					|| f.getType().getName().equals("double") 
					|| f.getType().getName().equals("java.lang.String")) {
					
					f.setAccessible(true);
					str.append("<" + f.getName() + "> " + f.get(obj) + "</" + f.getName() + ">");
					f.setAccessible(false);
				}
				else {
					f.setAccessible(true);
					str.append("<"+f.getName()+">" +
					           generateXML(f.get(obj), SEM_CABECALHO) + 
					           "</"+f.getName()+">");
					f.setAccessible(false);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (modo == COM_CABECALHO) {
			str.append("</xml>");
		}
		return str.toString();

	}
}
