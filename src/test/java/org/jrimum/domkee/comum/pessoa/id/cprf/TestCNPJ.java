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
public class TestCNPJ {

	private static final Long NUM_CNPJ_TESTE = 11222333000181L;
	private static final String STR_NOT_FORMATTED_CNPJ_TESTE = "11222333000181";
	private static final String STR_FORMATTED_CNPJ_TESTE = "11.222.333/0001-81";

	private CNPJ cnpj;

	@Before
	public void setUp() {
		cnpj = null;
	}

	@Test
	public void testNewInstanceWithLong() {

		cnpj = new CNPJ(NUM_CNPJ_TESTE);

		assertEquals(STR_FORMATTED_CNPJ_TESTE, cnpj.getCodigoFormatado());
		assertEquals(NUM_CNPJ_TESTE, cnpj.getCodigo());
	}

	@Test
	public void testNewInstanceWithNotFormattedString() {

		cnpj = new CNPJ(STR_NOT_FORMATTED_CNPJ_TESTE);

		assertEquals(STR_FORMATTED_CNPJ_TESTE, cnpj.getCodigoFormatado());
		assertEquals(NUM_CNPJ_TESTE, cnpj.getCodigo());
	}

	@Test
	public void testNewInstanceWithFormattedString() {

		cnpj = new CNPJ(STR_FORMATTED_CNPJ_TESTE);

		assertEquals(STR_FORMATTED_CNPJ_TESTE, cnpj.getCodigoFormatado());
		assertEquals(NUM_CNPJ_TESTE, cnpj.getCodigo());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowExceptionForWrongFormat(){
		
		new CNPJ("11.222.333-0001-81");
	}

	@Test(expected=CNPJException.class)
	public void testThrowExceptionForWrongInputString(){
		
		new CNPJ("11.222.333/0001-82");
	}

	@Test(expected=CNPJException.class)
	public void testThrowExceptionForWrongInputLong(){
		
		new CNPJ(11222333000182L);
	}
}
