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
 * Created at / Criado em : 17/03/2007 - 17:35:22
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import java.io.Serializable;

/**
 * 
 * Representa as moedas existentes que fazem parte do universo de um título, segundo a FEBRABAN.
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
public enum EnumMoeda implements Serializable {

	/**
	 * Padrão FEBRABAN
	 */
	
	DOLAR_AMERICANO_COMERCIAL_VENDA,
	DOLAR_AMERICANO_TURISMO_VENDA,
	ITRD,
	IDTR,
	UFIR_DIARIA,
	UFIR_MENSAL,
	FAJ_TR,
	REAL,
	TR,
	IGPM,
	CDI,
	PERCENTUAL_DO_CDI,
	EURO;

	
	public int getCodigo() {
		
		int codigo = 0;
		
		switch (this) {
		
		case DOLAR_AMERICANO_COMERCIAL_VENDA:
			codigo = 2;
			break;
			
		case DOLAR_AMERICANO_TURISMO_VENDA:
			codigo = 3;
			break;
			
		case ITRD:
			codigo = 4;
			break;
			
		case IDTR:
			codigo = 5;
			break;
			
		case UFIR_DIARIA:
			codigo = 6;
			break;
			
		case UFIR_MENSAL:
			codigo = 7;
			break;
			
		case FAJ_TR:
			codigo = 8;
			break;
			
		case REAL:
			codigo = 9;
			break;
			
		case TR:
			codigo = 10;
			break;
			
		case IGPM:
			codigo = 11;
			break;
			
		case CDI:
			codigo = 12;
			break;
			
		case PERCENTUAL_DO_CDI:
			codigo = 13 ;
			break;
			
		case EURO:
			codigo = 14;
			break;
			
		}
		
		return codigo;
	}
	
	public String toString(){
		
		String s = "";
		
		switch (this) {
			
		case REAL:
			s += "R$";
			break;
		
		default:
			s += this.getCodigo();
			
		}
		
		return s;
	}
	
}
