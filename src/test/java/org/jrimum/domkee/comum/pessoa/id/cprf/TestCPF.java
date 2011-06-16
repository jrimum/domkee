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
 * Created at: 30/03/2008 - 19:11:24
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
 * Criado em: 30/03/2008 - 19:11:24
 * 
 */

package org.jrimum.domkee.comum.pessoa.id.cprf;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Teste da classe CPF.
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 2.0
 * 
 * @version 2.0
 */
public class TestCPF {

	private static final Long NUM_CPF_TESTE = 22222222222L;
	private static final String STR_NOT_FORMATTED_CPF_TESTE = "22222222222";
	private static final String STR_FORMATTED_CPF_TESTE = "222.222.222-22";

	private CPF cpf;

	@Before
	public void setUp() {
		cpf = null;
	}

	@Test
	public void testNewInstanceWithLong() {

		cpf = new CPF(NUM_CPF_TESTE);

		assertEquals(STR_FORMATTED_CPF_TESTE, cpf.getCodigoFormatado());
		assertEquals(NUM_CPF_TESTE, cpf.getCodigo());
	}

	@Test
	public void testNewInstanceWithNotFormattedString() {

		cpf = new CPF(STR_NOT_FORMATTED_CPF_TESTE);

		assertEquals(STR_FORMATTED_CPF_TESTE, cpf.getCodigoFormatado());
		assertEquals(NUM_CPF_TESTE, cpf.getCodigo());
	}

	@Test
	public void testNewInstanceWithFormattedString() {

		cpf = new CPF(STR_FORMATTED_CPF_TESTE);

		assertEquals(STR_FORMATTED_CPF_TESTE, cpf.getCodigoFormatado());
		assertEquals(NUM_CPF_TESTE, cpf.getCodigo());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowExceptionForWrongFormat(){
		
		new CPF("222.222.222/22");
	}

	@Test(expected=CPFException.class)
	public void testThrowExceptionForWrongInputString(){
		
		new CPF("222.222.222-21");
	}

	@Test(expected=CPFException.class)
	public void testThrowExceptionForWrongInputLong(){
		
		new CPF(22222222221L);
	}

}
