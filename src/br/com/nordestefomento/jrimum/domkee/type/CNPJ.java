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
 * Created at / Criado em : 17/03/2007 - 17:39:22
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

/**
 * 
 * <p>
 * Representa o cadastro nacional de pssoa jurídica (CNPJ), um número identificador de uma pessoa jurídica junto
 * à Receita Federal, necessário para que a pessoa jurídica tenha capacidade de fazer contratos e processar ou ser processada.  
 * </p>
 * <p>
 * O formatador do CNPJ é "##.###.###/####-XX", onde XX é o dígito verificador do número.
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
public class CNPJ extends ACadastroDePessoa {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3217977741182481194L;
	
	public CNPJ(){
		// TODO IMPLEMENTAR
	}
	
	public CNPJ(String strCNPJ){
		// TODO IMPLEMENTAR
	}
	
	public CNPJ(Long numCNPJ){
		// TODO IMPLEMENTAR
	}
	
	/**
	 * @param strCNPJ
	 * @return
	 */
	public static CNPJ getInstance(String strCNPJ) {
		
		StringBuilder codigoFormatado = null;
		Long codigo = 0L;
		
		CNPJ cnpj = new CNPJ();
				
		codigo = Long.parseLong(strCNPJ);
		codigoFormatado = new StringBuilder(strCNPJ);
		
		codigoFormatado.insert(2, '.');
		codigoFormatado.insert(6, '.');
		codigoFormatado.insert(10, '/');
		codigoFormatado.insert(15, '-');
		
		cnpj.setCodigo(codigo);
		cnpj.setCodigoFormatado(codigoFormatado.toString());
		
		return cnpj;
	}
	
	public boolean isMatriz(){
		// TODO IMPLEMENTAR
		return false;
	}
	
	public boolean isFilial(){
		// TODO IMPLEMENTAR
		return false;
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
