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

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.utilix.Filler;
import br.com.nordestefomento.jrimum.vallia.AValidator4CadastroDePessoa;
import br.com.nordestefomento.jrimum.vallia.AValidator4CadastroDePessoa.EnumCadastroDePessoa;


/**
 * 
 * Representa a família dos cadastros de pessoa.
 * 
 * 
 * @author Gabriel Guimarães
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * 
 * @since JMatryx 1.0
 * 
 * @version 1.0
 */
public abstract class ACadastroDePessoa extends ACurbitaObject{ 

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
	protected AValidator4CadastroDePessoa autenticadorCP;
	
	
	public ACadastroDePessoa(){
		log.warn("Cadastro de Pessoa Não Inicializado Corretamente!");
	}

    public abstract String getRaiz();
	
	public abstract String getSufixo();
	
	public abstract String getDigitoVerificador();

	/**
	 * @param cadastroDePessoa
	 * @param tipoDeCadastro
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static ACadastroDePessoa getInstance(Long cadastroDePessoa,
			EnumCadastroDePessoa tipoDeCadastro) throws IllegalArgumentException {

		return getInstance(String.valueOf(cadastroDePessoa),tipoDeCadastro);
		
	}

	/**
	 * @param cadastroDePessoa
	 * @param tipoDeCadastro
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static ACadastroDePessoa getInstance(String cadastroDePessoa,
			EnumCadastroDePessoa tipoDeCadastro) throws IllegalArgumentException {
		
		String codigo = null;
		
		if (AValidator4CadastroDePessoa.isParametrosValidos(cadastroDePessoa, tipoDeCadastro)) {

			switch_Cadastro: {

				if (tipoDeCadastro == EnumCadastroDePessoa.CPF) {

					codigo = Filler.ZERO_LEFT.fill(cadastroDePessoa, 11);
					break switch_Cadastro;

				}

				if (tipoDeCadastro == EnumCadastroDePessoa.CNPJ) {

					codigo = Filler.ZERO_LEFT.fill(cadastroDePessoa, 14);
					break switch_Cadastro;

				}

			}

		}
		
		return getInstance(codigo);
	}
	
	/**
	 * Recupera uma instância de um cadastro de pessoa.
	 * 
	 * @param cadastroDePessoa -
	 *            identificador do cadastro de pessoa.
	 * @return uma instância de ACadastroDePessoa.
	 * @throws IllegalArgumentException -
	 *             caso o parâmetro não esteja em um formatador válido de cadastro
	 *             de pessoa.
	 */
	public static ACadastroDePessoa getInstance(String cadastroDePessoa)
			throws IllegalArgumentException {

		ACadastroDePessoa cp = null;
		AValidator4CadastroDePessoa autenticadorCP = AValidator4CadastroDePessoa
				.getInstance(cadastroDePessoa);

		if (autenticadorCP.isValido()) {

			if (autenticadorCP.isFisica()) {

				cp = CPF.getInstance(autenticadorCP
						.getCodigoDoCadastro());

			} else if (autenticadorCP.isJuridica()) {

				cp = CNPJ.getInstance(autenticadorCP
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
	 * @return
	 */
	public boolean isFisica(){
		return autenticadorCP.isFisica();
	}
	
	/**
	 * @return
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
