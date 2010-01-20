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
 * Created at: 30/03/2008 - 19:11:04
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
 * Criado em: 30/03/2008 - 19:11:04
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF;
import br.com.nordestefomento.jrimum.vallia.AbstractCPRFValidator.EnumCPRF;

/**
 * 
 * Teste da classe <code>AbstractCPRF</code>.
 * 
 * 
 * @author Gabriel Guimarães
 * @author Gilmar P.S.L
 * @author Misael Barreto
 * @author Rômulo Augusto
 * 
 * @since JRimum 1.0
 * 
 * @version 1.0
 */
public class TestAbstractCPRF{

	@Test
	public void testGetInstanceLong() {
		
		//cnpj:00.000.208/0001-00 BRB - BANCO DE BRASILIA S.A.
		
		AbstractCPRF abstractCPRF = AbstractCPRF.create(208000100L , EnumCPRF.CNPJ);
		
		assertNotNull(abstractCPRF);
		
		assertFalse(abstractCPRF.isFisica());
		assertTrue(abstractCPRF.isJuridica());
		
		abstractCPRF = AbstractCPRF.create(22233366638L , EnumCPRF.CPF);
		
		assertNotNull(abstractCPRF);
		
		assertFalse(abstractCPRF.isJuridica());
		assertTrue(abstractCPRF.isFisica());
	
		
		try {
			
			Long nulo = null;
			
			AbstractCPRF.create(nulo, null);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			Long nulo = null;
			
			AbstractCPRF.create(nulo, EnumCPRF.CPF);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			AbstractCPRF.create(12L, null);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			AbstractCPRF.create(123L, EnumCPRF.CPF);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
			
		}
		
		try {
			
			AbstractCPRF.create(112223330001L, EnumCPRF.CNPJ);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
	}

	@Test
	public void testGetInstanceString() {
		
		assertNotNull(AbstractCPRF.create("22233366638"));
		assertNotNull(AbstractCPRF.create("222.333.666-38"));
		
		assertNotNull(AbstractCPRF.create("11222333000181"));
		assertNotNull(AbstractCPRF.create("11.222.333/0001-81"));
		
		try {
			
			AbstractCPRF.create("abc123");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
		
		try {
			
			AbstractCPRF.create("222333666");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
		
		try {		
			
			AbstractCPRF.create("112223330001");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
	}

	@Test
	public void testGetCodigoFormatado() {
		
		assertTrue(AbstractCPRF.create("22233366638").getCodigoFormatado().equals("222.333.666-38"));
		assertTrue(AbstractCPRF.create("222.333.666-38").getCodigoFormatado().equals("222.333.666-38"));
		
		assertTrue(AbstractCPRF.create("11222333000181").getCodigoFormatado().equals("11.222.333/0001-81"));
		assertTrue(AbstractCPRF.create("11.222.333/0001-81").getCodigoFormatado().equals("11.222.333/0001-81"));
	}

	@Test
	public void testGetCodigo() {
		
		assertEquals(AbstractCPRF.create("22233366638").getCodigo().longValue(), 22233366638L);
		assertEquals(AbstractCPRF.create("222.333.666-38").getCodigo().longValue(), 22233366638L);
		
		assertEquals(AbstractCPRF.create("11222333000181").getCodigo().longValue(), 11222333000181L);
		assertEquals(AbstractCPRF.create("11.222.333/0001-81").getCodigo().longValue(), 11222333000181L);
	}

}
