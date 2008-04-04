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

import br.com.nordestefomento.jrimum.domkee.ientity.IBanco;
import br.com.nordestefomento.jrimum.domkee.type.CNPJ;

public class Banco implements IBanco{

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
