/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 19:11:13
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 19:11:13
 * 
 */

package org.jrimum.domkee.comum.pessoa.id.cprf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jrimum.vallia.AbstractCPRFValidator.TipoDeCPRF;
import org.junit.Before;
import org.junit.Test;

/**
 * Teste da classe CNPJ.
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 2.0
 * 
 * @version 2.0
 */
public class TestCNPJ15 extends TestAbstractCPRF{

	/*
	 * CNPJ: 874.328.742/0005-77 | CNPJ Aleatório 1
	 */
	private final String cnpfEmpresa1FilialStrFmt = "874.328.742/0005-77"; 	
	private final String cnpfEmpresa1StrFmt = "874.328.742/0001-43"; 	
	private final String cnpfEmpresa1Str = "874328742000143"; 	
	private final Long cnpfEmpresa1 = 874328742000143L; 	
	
	@Before
	public void setUp() {
		setTamanhoCPRF(15);
		setRaizCPRF(9);
		setTipo(TipoDeCPRF.CNPJ);
		setCprfLong(cnpfEmpresa1);
		setCprfLongErr(874328742000144L);
		setCprfString(cnpfEmpresa1Str);
		setCprfStringErr("874328742000144");
		setCprfStringFormatada(cnpfEmpresa1StrFmt);
		setCprfStringFormatadaErr("874.328.742/0005-78");
		setCprfRaizLong(874328742L);
		setCprfRaizLongErr(874328743L);
		setCprfRaizFormatada("874.328.742");
		setCprfRaizFormatadaErr("874.328.743");
		setCprfDv(43);
		setCprfDvErr(44);
		setCprf(new CNPJ(cnpfEmpresa1StrFmt));
		 //CNPJ Aleatório 2
		setCprfOutro(new CNPJ("983.987.432/0001-76"));
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#CNPJ(java.lang.Long)}.
	 */
	@Test
	public void testCNPJLong() {
		CNPJ cnpj = new CNPJ(cnpfEmpresa1);
		assertConsistent(cnpj);
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#CNPJ(java.lang.String)}.
	 */
	@Test
	public void testCNPJStringWithZeros() {
		CNPJ cnpj = new CNPJ(cnpfEmpresa1Str);
		assertConsistent(cnpj);
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#CNPJ(java.lang.String)}.
	 */
	@Test
	public void testCNPJStringWithFormat() {
		CNPJ cnpj = new CNPJ(cnpfEmpresa1StrFmt);
		assertConsistent(cnpj);
	}
	
	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#getSufixo()}.
	 */
	@Test
	public void testGetSufixo() {
		assertEquals(Integer.valueOf(1), new CNPJ(cnpfEmpresa1StrFmt).getSufixo());
		
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#getSufixoFormatado()}.
	 */
	@Test
	public void testGetSufixoFormatado() {
		assertEquals("0001", new CNPJ(cnpfEmpresa1StrFmt).getSufixoFormatado());
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#isMatriz()}.
	 */
	@Test
	public void testIsMatriz() {
		assertTrue(new CNPJ(cnpfEmpresa1StrFmt).isMatriz());
		assertTrue(!new CNPJ(cnpfEmpresa1FilialStrFmt).isMatriz());
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#isSufixoEquals(java.lang.String)}.
	 */
	@Test
	public void testIsSufixoEqualsString() {
		
		assertTrue(new CNPJ(cnpfEmpresa1StrFmt).isSufixoEquals("0001"));
		assertTrue(!new CNPJ(cnpfEmpresa1FilialStrFmt).isSufixoEquals("0001"));
	}

	/**
	 * Test method for {@link org.jrimum.domkee.comum.pessoa.id.cprf.CNPJ#isSufixoEquals(java.lang.Integer)}.
	 */
	@Test
	public void testIsSufixoEqualsInteger() {
		assertTrue(new CNPJ(cnpfEmpresa1FilialStrFmt).isSufixoEquals(5));
		assertTrue(!new CNPJ(cnpfEmpresa1StrFmt).isSufixoEquals(5));
	}

	private void assertConsistent(CNPJ cnpj) {
		
		assertNotNull(cnpj);
		assertEquals(cnpfEmpresa1, cnpj.getCodigo());
		assertEquals(cnpfEmpresa1Str, cnpj.getCodigoComZeros());
		assertEquals(cnpfEmpresa1StrFmt, cnpj.getCodigoFormatado());
	}
}
