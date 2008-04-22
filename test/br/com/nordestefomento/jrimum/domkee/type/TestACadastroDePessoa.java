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

import br.com.nordestefomento.jrimum.domkee.type.ACpfCnpj;
import br.com.nordestefomento.jrimum.vallia.AValidator4ACpfCnpj.EnumCadastroDePessoa;

import junit.framework.TestCase;

/**
 * 
 * Teste da classe <code>ACpfCnpj</code>.
 * 
 * 
 * @author Gabriel Guimarães
 * @author Gilmar P.S.L
 * @author Misael Barreto
 * @author Rômulo Augusto
 * 
 * @since JMatryx 1.0
 * 
 * @version 1.0
 */
public class TestACadastroDePessoa extends TestCase {

	public void testGetInstanceLong() {
		
		//cnpj:00.000.208/0001-00 BRB - BANCO DE BRASILIA S.A.
		
		ACpfCnpj aCpfCnpj = ACpfCnpj.getInstance(208000100L , EnumCadastroDePessoa.CNPJ);
		
		assertNotNull(aCpfCnpj);
		
		assertFalse(aCpfCnpj.isFisica());
		assertTrue(aCpfCnpj.isJuridica());
		
		aCpfCnpj = ACpfCnpj.getInstance(22233366638L , EnumCadastroDePessoa.CPF);
		
		assertNotNull(aCpfCnpj);
		
		assertFalse(aCpfCnpj.isJuridica());
		assertTrue(aCpfCnpj.isFisica());
	
		
		try {
			
			Long nulo = null;
			
			ACpfCnpj.getInstance(nulo, null);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			Long nulo = null;
			
			ACpfCnpj.getInstance(nulo, EnumCadastroDePessoa.CPF);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			ACpfCnpj.getInstance(12L, null);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			ACpfCnpj.getInstance(123L, EnumCadastroDePessoa.CPF);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
			
		}
		
		try {
			
			ACpfCnpj.getInstance(112223330001L, EnumCadastroDePessoa.CNPJ);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
	}

	public void testGetInstanceString() {
		
		assertNotNull(ACpfCnpj.getInstance("22233366638"));
		assertNotNull(ACpfCnpj.getInstance("222.333.666-38"));
		
		assertNotNull(ACpfCnpj.getInstance("11222333000181"));
		assertNotNull(ACpfCnpj.getInstance("11.222.333/0001-81"));
		
		try {
			
			ACpfCnpj.getInstance("abc123");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
		
		try {
			
			ACpfCnpj.getInstance("222333666");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
		
		try {		
			
			ACpfCnpj.getInstance("112223330001");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
	}

	public void testGetCodigoFormatado() {
		
		assertTrue(ACpfCnpj.getInstance("22233366638").getCodigoFormatado().equals("222.333.666-38"));
		assertTrue(ACpfCnpj.getInstance("222.333.666-38").getCodigoFormatado().equals("222.333.666-38"));
		
		assertTrue(ACpfCnpj.getInstance("11222333000181").getCodigoFormatado().equals("11.222.333/0001-81"));
		assertTrue(ACpfCnpj.getInstance("11.222.333/0001-81").getCodigoFormatado().equals("11.222.333/0001-81"));
	}

	public void testGetCodigo() {
		
		assertEquals(ACpfCnpj.getInstance("22233366638").getCodigo().longValue(), 22233366638L);
		assertEquals(ACpfCnpj.getInstance("222.333.666-38").getCodigo().longValue(), 22233366638L);
		
		assertEquals(ACpfCnpj.getInstance("11222333000181").getCodigo().longValue(), 11222333000181L);
		assertEquals(ACpfCnpj.getInstance("11.222.333/0001-81").getCodigo().longValue(), 11222333000181L);
	}

}
