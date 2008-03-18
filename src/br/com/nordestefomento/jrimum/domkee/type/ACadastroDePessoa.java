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
 * Created at / Criado em : 17/03/2007 - 17:38:51
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.utilix.Filler;
import br.com.nordestefomento.jrimum.utilix.Operator4String;
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

					codigo = Operator4String.complete_x(cadastroDePessoa, Filler.STR_ZERO_LEFT, 11);
					break switch_Cadastro;

				}

				if (tipoDeCadastro == EnumCadastroDePessoa.CNPJ) {

					codigo = Operator4String.complete_x(cadastroDePessoa, Filler.STR_ZERO_LEFT, 14);
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
