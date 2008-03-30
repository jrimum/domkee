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
 * Created at: 30/03/2008 - 19:08:53
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
 * Criado em: 30/03/2008 - 19:08:53
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
