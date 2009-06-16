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
 * Created at: 30/03/2008 - 19:06:56
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
 * Criado em: 30/03/2008 - 19:06:56
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.utilix.Filler;
import br.com.nordestefomento.jrimum.vallia.AValidator4CPRF;
import br.com.nordestefomento.jrimum.vallia.AValidator4CPRF.EnumCPRF;

/**
 * 
 * <p>
 * Representa o cadastro nacional de pssoa jurídica (CNPJ), um número
 * identificador de uma pessoa jurídica junto à Receita Federal, necessário para
 * que a pessoa jurídica tenha capacidade de fazer contratos e processar ou ser
 * processada.
 * </p>
 * 
 * <p>
 * O formatador do CNPJ é "##.###.###/####-XX", onde XX é o dígito verificador
 * do número.
 * </p>
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento
 *         Mercantil</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class CNPJ extends CPRF {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3217977741182481194L;

	public CNPJ(String strCNPJ) {

		this.autenticadorCP = AValidator4CPRF.create(strCNPJ);

		if (autenticadorCP.isValido()) {
			init(strCNPJ);
		} else {
			throw new CNPJException(new IllegalArgumentException(
					"O cadastro de pessoa [ " + strCNPJ + " ] não é válido."));
		}
	}

	public CNPJ(Long numCNPJ) {

		try {

			if (AValidator4CPRF.isParametrosValidos(
					String.valueOf(numCNPJ), EnumCPRF.CNPJ)) {

				String strCNPJ = Filler.ZERO_LEFT.fill(numCNPJ, 14);

				this.autenticadorCP = AValidator4CPRF.create(strCNPJ);

				if (autenticadorCP.isValido())
					init(strCNPJ);
				else
					throw new IllegalArgumentException(
							"O cadastro de pessoa [ " + strCNPJ
									+ " ] não é válido.");

			}

		} catch (Exception e) {
			if (!(e instanceof CNPJException))
				throw new CNPJException(e);
		}

	}

	private void init(String strCNPJ) {

		try {

			StringBuilder codigoFormatado = null;

			codigoFormatado = new StringBuilder(strCNPJ);

			codigoFormatado.insert(2, '.');
			codigoFormatado.insert(6, '.');
			codigoFormatado.insert(10, '/');
			codigoFormatado.insert(15, '-');

			this.setCodigoFormatado(codigoFormatado.toString());
			this.setCodigo(Long.parseLong(strCNPJ));

		} catch (Exception e) {
			throw new CNPJException(e);
		}
	}

}
