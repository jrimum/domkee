/*
 * Copyright 2007, JMatryx Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright 2007, Grupo JMatryx
 * 
 * Licenciado sob a licença da Apache, versão 2.0 (a “licença”); você não pode
 * usar este arquivo exceto na conformidade com a licença. Você pode obter uma
 * cópia da licença em
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * A menos que seja requerido pela aplicação da lei ou esteja de acordo com a
 * escrita, o software distribuído sob esta licença é distribuído “COMO É”
 * BASE,SEM AS GARANTIAS OU às CONDIÇÕES DO TIPO, expresso ou implicado. Veja a
 * licença para as permissões sobre a línguagem específica e limitações quando
 * sob licença.
 * 
 * 
 * Created at / Criado em : 22/03/2007 - 11:20:51
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.domkee.type.ACadastroDePessoa;
import br.com.nordestefomento.jrimum.vallia.AValidator4CadastroDePessoa.EnumCadastroDePessoa;

import junit.framework.TestCase;

/**
 * 
 * Teste da classe <code>ACadastroDePessoa</code>.
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
		
		ACadastroDePessoa cadastroDePessoa = ACadastroDePessoa.getInstance(208000100L , EnumCadastroDePessoa.CNPJ);
		
		assertNotNull(cadastroDePessoa);
		
		assertFalse(cadastroDePessoa.isFisica());
		assertTrue(cadastroDePessoa.isJuridica());
		
		cadastroDePessoa = ACadastroDePessoa.getInstance(22233366638L , EnumCadastroDePessoa.CPF);
		
		assertNotNull(cadastroDePessoa);
		
		assertFalse(cadastroDePessoa.isJuridica());
		assertTrue(cadastroDePessoa.isFisica());
	
		
		try {
			
			Long nulo = null;
			
			ACadastroDePessoa.getInstance(nulo, null);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			Long nulo = null;
			
			ACadastroDePessoa.getInstance(nulo, EnumCadastroDePessoa.CPF);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			ACadastroDePessoa.getInstance(12L, null);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
		try {
			
			ACadastroDePessoa.getInstance(123L, EnumCadastroDePessoa.CPF);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
			
		}
		
		try {
			
			ACadastroDePessoa.getInstance(112223330001L, EnumCadastroDePessoa.CNPJ);
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
			System.out.println(iaex.getMessage());
		}
		
	}

	public void testGetInstanceString() {
		
		assertNotNull(ACadastroDePessoa.getInstance("22233366638"));
		assertNotNull(ACadastroDePessoa.getInstance("222.333.666-38"));
		
		assertNotNull(ACadastroDePessoa.getInstance("11222333000181"));
		assertNotNull(ACadastroDePessoa.getInstance("11.222.333/0001-81"));
		
		try {
			
			ACadastroDePessoa.getInstance("abc123");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
		
		try {
			
			ACadastroDePessoa.getInstance("222333666");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
		
		try {		
			
			ACadastroDePessoa.getInstance("112223330001");
			
			fail("IllegalArgumentException esperado não ocorreu.");
			assertTrue(false);
			
		} catch(IllegalArgumentException iaex) {
		
			assertTrue(true);
		}
	}

	public void testGetCodigoFormatado() {
		
		assertTrue(ACadastroDePessoa.getInstance("22233366638").getCodigoFormatado().equals("222.333.666-38"));
		assertTrue(ACadastroDePessoa.getInstance("222.333.666-38").getCodigoFormatado().equals("222.333.666-38"));
		
		assertTrue(ACadastroDePessoa.getInstance("11222333000181").getCodigoFormatado().equals("11.222.333/0001-81"));
		assertTrue(ACadastroDePessoa.getInstance("11.222.333/0001-81").getCodigoFormatado().equals("11.222.333/0001-81"));
	}

	public void testGetCodigo() {
		
		assertEquals(ACadastroDePessoa.getInstance("22233366638").getCodigo().longValue(), 22233366638L);
		assertEquals(ACadastroDePessoa.getInstance("222.333.666-38").getCodigo().longValue(), 22233366638L);
		
		assertEquals(ACadastroDePessoa.getInstance("11222333000181").getCodigo().longValue(), 11222333000181L);
		assertEquals(ACadastroDePessoa.getInstance("11.222.333/0001-81").getCodigo().longValue(), 11222333000181L);
	}

}
