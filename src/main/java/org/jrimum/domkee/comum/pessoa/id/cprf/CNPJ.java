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

package org.jrimum.domkee.comum.pessoa.id.cprf;

import static org.jrimum.utilix.text.Strings.fillWithZeroLeft;

import org.apache.commons.lang.StringUtils;
import org.jrimum.utilix.Exceptions;
import org.jrimum.utilix.Objects;
import org.jrimum.utilix.text.Strings;
import org.jrimum.vallia.AbstractCPRFValidator;
import org.jrimum.vallia.AbstractCPRFValidator.TipoDeCPRF;

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
 * O formato do CNPJ é "##.###.###/####-XX", onde XX é o dígito verificador do
 * número.
 * </p>
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author <a href="mailto:misaelbarreto@gmail.com">Misael Barreto</a>
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 * @author <a href="http://www.nordestefomento.com.br">Nordeste Fomento
 *         Mercantil</a>
 * 		
 * @since 0.2
 * 		
 * @version 0.2
 */
public class CNPJ extends AbstractCPRF {
	
	private static final String PATTERN_CNPJ_15 = "###.###.###/####-##";
	
	private static final String PATTERN_CNPJ_14 = "##.###.###/####-##";
	
	public CNPJ(String strCNPJ) {
		process(strCNPJ);
	}
	
	public CNPJ(Long numCNPJ) {
		process(String.valueOf(numCNPJ));
	}
	
	private void process(String strCNPJ) {
		String cnpj = removeFormat(strCNPJ);
		
		if (StringUtils.isBlank(strCNPJ)) {
			Exceptions.throwIllegalArgumentException(
					"O cadastro de pessoa [ \"" + strCNPJ + "\" ] não pode ser nulo ou em branco.");
		}
		
		if (strCNPJ.length() < 14) {
			cnpj = fillWithZeroLeft(strCNPJ, 14);
		}
		
		if (AbstractCPRFValidator.isParametrosValidos(cnpj, TipoDeCPRF.CNPJ)) {
			this.autenticadorCP = AbstractCPRFValidator.create(cnpj);
			if (autenticadorCP.isValido()) {
				if (cnpj.length() == 14) {
					this.setCodigoFormatado(format(PATTERN_CNPJ_14, cnpj));
				} else if (cnpj.length() == 15){
					this.setCodigoFormatado(format(PATTERN_CNPJ_15, cnpj));
				}else {
					this.setCodigoFormatado(cnpj);
				}
				this.setCodigo(Long.parseLong(cnpj));
				
			} else {
				throw new CNPJException(
						new IllegalArgumentException("O cadastro de pessoa [ \"" + strCNPJ + "\" ] não é válido."));
			}
		}
	}
	
	public boolean isMatriz() {
		
		return getSufixoFormatado().equals("0001");
	}
	
	public boolean isSufixoEquals(String sufixoFormatado) {
		
		Strings.checkNotNumeric(sufixoFormatado,
				String.format("O sufixo [%s] deve ser um número natural diferente de zero!", sufixoFormatado));
				
		return isSufixoEquals(Integer.valueOf(sufixoFormatado));
	}
	
	public boolean isSufixoEquals(Integer sufixo) {
		
		Objects.checkNotNull(sufixo, "Sufixo nulo!");
		Objects.checkArgument(sufixo > 0,
				String.format("O sufixo [%s] deve ser um número natural diferente de zero!", sufixo));
				
		return getSufixo().equals(sufixo);
	}
	
	public Integer getSufixo() {
		
		return Integer.valueOf(getSufixoFormatado());
	}
	
	public String getSufixoFormatado() {
		
		return getCodigoFormatado().split("-")[0].split("/")[1];
	}
	
	public final static String removeFormat(final String valor) {
		if (valor == null) {
			return null;
		}
		return valor.replaceAll("[^0-9]", "").trim();
	}
	
	private String format(String pattern, final Object valor) {
		final char[] val = valor.toString().toCharArray();
		for (final char var : val) {
			if (pattern.contains("#")) {
				pattern = pattern.replaceFirst("#", String.valueOf(var));
			} else {
				pattern += var;
			}
		}
		return pattern;
	}
	
}
