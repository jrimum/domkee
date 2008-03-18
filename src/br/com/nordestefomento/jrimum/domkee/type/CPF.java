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
 * Created at / Criado em : 17/03/2007 - 17:39:09
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

/**
 * <p>
 * Representa o cadastro de pessoa física (CPF), um número identificador de todo contribuinte 
 * (pessoas físicas brasileiras ou estrangeiras com negócios no Brasil).
 * </p>
 * <p>
 * O formatador do CPF é "###.###.###-XX", onde XX é o dígito verificador do número.
 * </p>
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
public class CPF extends ACadastroDePessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5910970842832308496L;
	
	public CPF(){
		// TODO IMPLEMENTAR
	}
	
	public CPF(String strCNPJ){
		// TODO IMPLEMENTAR
	}
	
	public CPF(Long numCNPJ){
		// TODO IMPLEMENTAR
	}
	
	/**
	 * @param cadastroDePessoa
	 * @return
	 */
	public static CPF getInstance(String cadastroDePessoa) {
		
		StringBuilder codigoFormatado = null;
		Long codigo = 0L;
		
		CPF cpf = new CPF();
				
		codigo = Long.parseLong(cadastroDePessoa);
		codigoFormatado = new StringBuilder(cadastroDePessoa);
		
		codigoFormatado.insert(3, '.');
		codigoFormatado.insert(7, '.');
		codigoFormatado.insert(11, '-');
		
		cpf.setCodigo(codigo);
		cpf.setCodigoFormatado(codigoFormatado.toString());
		
		return cpf;
	}

	@Override
	public String getDigitoVerificador() {
		// TODO IMPLEMENTAR
		return null;
	}

	@Override
	public String getRaiz() {
		// TODO IMPLEMENTAR
		return null;
	}

	@Override
	public String getSufixo() {
		// TODO IMPLEMENTAR
		return null;
	}

}
