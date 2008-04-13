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
 * Created at: 30/03/2008 - 18:57:43
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
 * Criado em: 30/03/2008 - 18:57:43
 * 
 */

package br.com.nordestefomento.jrimum.domkee.entity;

import java.awt.Image;

import org.apache.commons.lang.StringUtils;

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.domkee.ientity.IBanco;
import br.com.nordestefomento.jrimum.domkee.type.CNPJ;


/**
 * 
 * <p>
 * DEFINIÇÃO DA CLASSE
 * </p>
 * 
 * <p>
 * OBJETIVO/PROPÓSITO
 * </p>
 * 
 * <p>
 * EXEMPLO: 
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 
 * 
 * @version 
 */
	
public class Banco extends ACurbitaObject implements IBanco{

	//TODO garantir consitencia do codigo de compensação.
	//TODO criar classe para codigo de compensação.
	
	private String codigoDeCompensacao;

	private String instituicao;

	private CNPJ cNPJ;

	private String segmento;

	private Image imgLogo;

	/**
	 * 
	 */
	public Banco() {
		super();
	}
	
	
	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 */
	public Banco(String codigoDeCompensacao, String instituicao) {
		super();
		this.codigoDeCompensacao = codigoDeCompensacao;
		this.instituicao = instituicao;
	}

	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 * @param cnpj
	 */
	public Banco(String codigoDeCompensacao, String instituicao, CNPJ cnpj) {
		super();
		this.codigoDeCompensacao = codigoDeCompensacao;
		this.instituicao = instituicao;
		cNPJ = cnpj;
	}

	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 * @param cnpj
	 * @param segmento
	 */
	public Banco(String codigoDeCompensacao, String instituicao, CNPJ cnpj,
			String segmento) {
		super();
		this.codigoDeCompensacao = codigoDeCompensacao;
		this.instituicao = instituicao;
		cNPJ = cnpj;
		this.segmento = segmento;
	}

	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 * @param cnpj
	 * @param segmento
	 * @param imgLogo
	 */
	public Banco(String codigoDeCompensacao, String instituicao, CNPJ cnpj,	String segmento, Image imgLogo) {
		super();
		this.codigoDeCompensacao = codigoDeCompensacao;
		this.instituicao = instituicao;
		cNPJ = cnpj;
		this.segmento = segmento;
		this.imgLogo = imgLogo;
	}

	/**
	 * 	 * <p>
	 * Verifica se o código passdo está ok em relação as regras:
	 * <ol>
	 * <li>Não nulo</li>
	 * <li>Numérico</li>
	 * <li>Com 3 digitos</li>
	 * </ol>
	 * </p>
	 * 
	 * @param codigo
	 * 
	 * @return se ok
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @since 0.2
	 * 
	 */		
	public static boolean isCodigoDeCompensacaoOK(String codigo) throws IllegalArgumentException{
		boolean ok = false;
		if(!isNull(codigo, "codigo")){
			if(StringUtils.isNumeric(codigo))
				if(codigo.length() == 3)
					ok = true;
				else
					throw new IllegalArgumentException("O codigo e de apenas 3 digitos!");
			else
				throw new IllegalArgumentException("O codigo de compensacao deve ser numerico!");
		}
		return ok;
	}

	public String getCodigoDeCompensacao() {
		return codigoDeCompensacao;
	}

	public void setCodigoDeCompensacao(String codigoDeCompensacao) {
		this.codigoDeCompensacao = codigoDeCompensacao;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public CNPJ getCNPJ() {
		return cNPJ;
	}

	public void setCNPJ(CNPJ cnpj) {
		cNPJ = cnpj;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public Image getImgLogo() {
		return imgLogo;
	}

	public void setImgLogo(Image imgLogo) {
		this.imgLogo = imgLogo;
	}
	
}
