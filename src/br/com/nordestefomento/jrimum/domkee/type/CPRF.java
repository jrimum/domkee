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
 * Created at: 30/03/2008 - 19:03:20
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
 * Criado em: 30/03/2008 - 19:03:20
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.utilix.Filler;
import br.com.nordestefomento.jrimum.vallia.AValidator4CPRF;
import br.com.nordestefomento.jrimum.vallia.AValidator4CPRF.EnumCPRF;


/**
 * 
 * <p>
 * Classe que representa um <a href="http://www.receita.fazenda.gov.br/Principal/Cadastros.htm">Cadastro de Pessoas na Receita Federal</a>, esse
 * cadastro pode ser o de pessoas físicas ou jurídicas.
 * </p>
 * 
 * <p>
 *  O cadastro tem a finalidade de identificadar cada pessoa no país, seja ela de natureza física
 * ou jurídica. O <a href="http://www.receita.fazenda.gov.br/Aplicacoes/ATCTA/CPF/default.htm">Cadastro de Pessoa Física é o CPF</a>, já o de <a href="http://www.receita.fazenda.gov.br/PessoaJuridica/cnpj/ConsulSitCadastralCnpj.htm">Pessoa Jurídica é o CNPJ</a>.
 * </p>
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com">Gilmar P.S.L.</a>
 * @author Misael
 * @author Romulo
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
	
public abstract class CPRF { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 659667618386631640L;

	/**
	 * 
	 */
	private String codigoFormatado;

	/**
	 * 
	 */
	private Long codigo;

	/**
	 * 
	 */
	protected AValidator4CPRF autenticadorCP;

	/**
	 * @param cadastroDePessoa
	 * @param tipoDeCadastro
	 * @return AbstractCPRF (CPF ou CNPJ)
	 * @throws IllegalArgumentException
	 */
	public static CPRF create(Long cadastroDePessoa, EnumCPRF tipoDeCadastro) throws IllegalArgumentException {

		return create(String.valueOf(cadastroDePessoa),tipoDeCadastro);
	}

	/**
	 * @param cadastroDePessoa
	 * @param tipoDeCadastro
	 * @return AbstractCPRF (CPF ou CNPJ)
	 * @throws IllegalArgumentException
	 */
	public static CPRF create(String cadastroDePessoa, EnumCPRF tipoDeCadastro) throws IllegalArgumentException {
		
		String codigo = null;
		
		if (AValidator4CPRF.isParametrosValidos(cadastroDePessoa, tipoDeCadastro)) {

			switch_Cadastro: {

				if (tipoDeCadastro == EnumCPRF.CPF) {

					codigo = Filler.ZERO_LEFT.fill(cadastroDePessoa, 11);
					break switch_Cadastro;

				}

				if (tipoDeCadastro == EnumCPRF.CNPJ) {

					codigo = Filler.ZERO_LEFT.fill(cadastroDePessoa, 14);
					break switch_Cadastro;

				}

			}

		}
		
		return create(codigo);
	}
	
	/**
	 * Recupera uma instância de um cadastro de pessoa.
	 * 
	 * @param cadastroDePessoa -
	 *            identificador do cadastro de pessoa.
	 * @return uma instância de AbstractCPRF.
	 * @throws IllegalArgumentException -
	 *             caso o parâmetro não esteja em um formatador válido de cadastro
	 *             de pessoa.
	 */
	public static CPRF create(String cadastroDePessoa)
			throws IllegalArgumentException {

		CPRF cp = null;
		AValidator4CPRF autenticadorCP = AValidator4CPRF.create(cadastroDePessoa);

		if (autenticadorCP.isValido()) {

			if (autenticadorCP.isFisica()) {

				cp = new CPF(autenticadorCP
						.getCodigoDoCadastro());

			} else if (autenticadorCP.isJuridica()) {

				cp = new CNPJ(autenticadorCP
						.getCodigoDoCadastro());
			}

			cp.autenticadorCP = autenticadorCP;

		} else {

			throw new IllegalArgumentException(
					"O cadastro de pessoa [ "+cadastroDePessoa+" ] não é válido.");
		}

		return cp;
	}
	
	/**
	 * @return boolean
	 */
	public boolean isFisica(){
		return autenticadorCP.isFisica();
	}
	
	/**
	 * @return boolean
	 */
	public boolean isJuridica(){
		return autenticadorCP.isJuridica();
	}
	
	protected void setCodigoFormatado(String codigoFormatado) {

		this.codigoFormatado = codigoFormatado;
	}

	protected void setCodigo(Long codigo) {

		this.codigo = codigo;
	}

	public String getCodigoFormatado() {
		return codigoFormatado;
	}

	public Long getCodigo() {
		return codigo;
	}
	
}
