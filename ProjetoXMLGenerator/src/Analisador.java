import br.com.xmlgenerator.XMLGenerator;
import br.com.xmlgenerator.objects.Cliente;
import br.com.xmlgenerator.objects.Departamento;
import br.com.xmlgenerator.objects.Localizacao;
import br.com.xmlgenerator.objects.Produto;

public class Analisador {
	public static void main(String[] args) {
		
		Produto p = new Produto(123, "Computador i5 16Gb HD 1Tb", 2500, "computador.jpg", new Departamento(1,"Informatica", new Localizacao("centro", 1,23, 10)));
		Cliente c = new Cliente(10012, "Professor Isidro","isidro@isidro.com", "11-987654321","04/10/1978");
		
		String xmlP = XMLGenerator.generateXML(p, XMLGenerator.COM_CABECALHO);
		String xmlC = XMLGenerator.generateXML(c, XMLGenerator.SEM_CABECALHO);
		
		System.out.println(xmlP);
		System.out.println(xmlC);
		
//		XMLFileGenerator.generateXMLFile(p);
//		XMLFileGenerator.generateXMLFile(c);
			
	
	}

}
