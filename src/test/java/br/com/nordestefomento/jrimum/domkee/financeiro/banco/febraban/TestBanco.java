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
 * Created at: 22/02/2010 - 13:52:30
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
 * Criado em: 22/02/2010 - 13:52:30
 * 
 */

package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Classe de teste para a classe Banco.
 *  
 * @author Rômulo Augusto
 * 
 * @version 0.2
 * 
 * @since 0.2
 */
public class TestBanco {

	@Test
	public void testIsCodigoDeCompensacaoOKNaoNulo() {
		
		Assert.assertTrue(Banco.isCodigoDeCompensacaoOK("001"));
		
		Assert.assertFalse(Banco.isCodigoDeCompensacaoOK(null));
		Assert.assertFalse(Banco.isCodigoDeCompensacaoOK("ABC"));
		Assert.assertFalse(Banco.isCodigoDeCompensacaoOK("0011"));
	}
}
