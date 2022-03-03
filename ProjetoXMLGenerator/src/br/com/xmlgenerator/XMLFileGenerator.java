package br.com.xmlgenerator;

import java.io.FileWriter;

public class XMLFileGenerator {
	public static void generateXMLFile(Object o) {
		try {
			String filename = o.getClass().getSimpleName()+".xml";
			FileWriter arquivo = new FileWriter(filename);
			
			arquivo.write(XMLGenerator.generateXML(o, XMLGenerator.COM_CABECALHO));
			
			arquivo.close();
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
