import com.sap.erp.integration.InterfaceSAP;

import br.com.isidrocorp.importacao.core.Importador;

public class SAPMain {
	public static void main(String[] args) {
		InterfaceSAP isap;
		
		isap = new Importador();
		System.out.println("SISTEMA da SAP");
		isap.proceedInvoice("<xml> invoice </xml>");
		
	}
}
