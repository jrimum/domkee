/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import java.awt.Image;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.CNPJ;

/**
 * @author misael
 *
 */
public class OrgaoRecebedor extends EntidadeDeCobranca {

	private Image imgLogo;	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8761667660640466620L;
	private IdentificacaoSeguimento identificacaoSeguimento;
	
	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public OrgaoRecebedor(String nome, CNPJ cnpj, IdentificacaoSeguimento tipoSeguimento) {
		super(nome, cnpj);
		setIdentificacaoSeguimento(tipoSeguimento);
	}

	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public OrgaoRecebedor(String nome, String cnpj, IdentificacaoSeguimento tipoSeguimento) {
		super();
		
		setNome(nome);
		
		CNPJ cNPJ = new CNPJ(cnpj);
		setCNPJ(cNPJ);
		
		setIdentificacaoSeguimento(tipoSeguimento);
	}

	/**
	 * @param nome
	 */
	public OrgaoRecebedor(String nome, IdentificacaoSeguimento tipoSeguimento) {
		super(nome);
		setIdentificacaoSeguimento(tipoSeguimento);
	}
	
	/**
	 * @return the tipoSeguimento
	 */
	public IdentificacaoSeguimento getIdentificacaoSeguimento() {
		return identificacaoSeguimento;
	}

	/**
	 * @param tipoSeguimento the tipoSeguimento to set
	 */
	public void setIdentificacaoSeguimento(IdentificacaoSeguimento tipoSeguimento) {
		this.identificacaoSeguimento = tipoSeguimento;
	}	
	
	/**
	 * @return CNPJ
	 * @see #getCNPJ()
	 */
	public CNPJ getCNPJ() {
		return (CNPJ) pessoa.getCPRF();
	}

	/**
	 * @param abstractCNPJ
	 * @see # setCNPJ(CNPJ cnpj)
	 */
	public void setCNPJ(CNPJ cnpj) {
		pessoa.setCPRF(cnpj);
	}
	
	/**
	 * @return the imgLogo
	 */
	public Image getImgLogo() {
		return imgLogo;
	}

	/**
	 * @param imgLogo the imgLogo to set
	 */
	public void setImgLogo(Image imgLogo) {
		this.imgLogo = imgLogo;
	}	
}
