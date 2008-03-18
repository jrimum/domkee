package br.com.nordestefomento.jrimum.domkee.entity;


import com.lowagie.text.Image;

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
