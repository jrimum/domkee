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
	private TipoSeguimento tipoSeguimento;
	
	/**
	 * 
	 */
	public OrgaoRecebedor() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public OrgaoRecebedor(String nome, CNPJ cnpj, TipoSeguimento tipoSeguimento) {
		super(nome, cnpj);
		setTipoSeguimento(tipoSeguimento);
	}

	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public OrgaoRecebedor(String nome, String cnpj, TipoSeguimento tipoSeguimento) {
		super();
		
		setNome(nome);
		
		CNPJ cNPJ = new CNPJ(cnpj);
		setCNPJ(cNPJ);
		
		setTipoSeguimento(tipoSeguimento);
	}

	/**
	 * @param nome
	 */
	public OrgaoRecebedor(String nome, TipoSeguimento tipoSeguimento) {
		super(nome);
		setTipoSeguimento(tipoSeguimento);
	}
	
	/**
	 * @return the tipoSeguimento
	 */
	public TipoSeguimento getTipoSeguimento() {
		return tipoSeguimento;
	}

	/**
	 * @param tipoSeguimento the tipoSeguimento to set
	 */
	public void setTipoSeguimento(TipoSeguimento tipoSeguimento) {
		this.tipoSeguimento = tipoSeguimento;
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
