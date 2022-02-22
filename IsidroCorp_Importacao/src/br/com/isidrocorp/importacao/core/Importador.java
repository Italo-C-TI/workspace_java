package br.com.isidrocorp.importacao.core;

import com.oracle.enterprise.middleware.IService;
import com.sap.erp.integration.InterfaceSAP;

public class Importador implements InterfaceSAP, IService {
	
	public void realizarImportacao(String conteudo) {
		/* logica mirabolante */
		System.out.println("--> ISIDROCORP: Importação Realizada com Sucesso");
	}

	@Override
	public void proceedInvoice(String content) {
		// codigo especifico para poder extrair corretamente as infos que a SAP precisa
		realizarImportacao(content);		
	}

	@Override
	public void importInvoice(String invoice) {
		// outro código para extrair as infos relevantes ao sistema da Oracle
		realizarImportacao(invoice);
	}

}
