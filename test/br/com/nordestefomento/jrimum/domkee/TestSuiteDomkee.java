package br.com.nordestefomento.jrimum.domkee;

import junit.framework.Test;
import junit.framework.TestSuite;
import br.com.nordestefomento.jrimum.domkee.type.TestACadastroDePessoa;
import br.com.nordestefomento.jrimum.domkee.type.TestCNPJ;
import br.com.nordestefomento.jrimum.domkee.type.TestCPF;
import br.com.nordestefomento.jrimum.domkee.type.TestEnumBanco;
import br.com.nordestefomento.jrimum.domkee.type.TestEnumMoeda;
import br.com.nordestefomento.jrimum.domkee.type.TestEnumTitulo;

public class TestSuiteDomkee {

	public static Test suite() {
	    
		TestSuite suite= new TestSuite();
		
		suite.addTestSuite(TestEnumBanco.class);
		suite.addTestSuite(TestEnumMoeda.class);
		suite.addTestSuite(TestEnumTitulo.class);
		suite.addTestSuite(TestACadastroDePessoa.class);
		suite.addTestSuite(TestCPF.class);
		suite.addTestSuite(TestCNPJ.class);
		
	    return suite;
	}
}
