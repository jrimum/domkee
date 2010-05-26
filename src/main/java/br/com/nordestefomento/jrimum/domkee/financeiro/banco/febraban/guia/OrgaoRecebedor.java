/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF;

/**
 * @author misael
 *
 */
public class OrgaoRecebedor extends EntidadeDeCobranca {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8761667660640466620L;
	private IdentificacaoSeguimento tipoSeguimento;
	
	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public OrgaoRecebedor(String nome, AbstractCPRF cadastroDePessoa, IdentificacaoSeguimento tipoSeguimento) {
		super(nome, cadastroDePessoa);
		setTipoSeguimento(tipoSeguimento);
	}

	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public OrgaoRecebedor(String nome, String cadastroDePessoa, IdentificacaoSeguimento tipoSeguimento) {
		super(nome, cadastroDePessoa);
		setTipoSeguimento(tipoSeguimento);
	}

	/**
	 * @param nome
	 */
	public OrgaoRecebedor(String nome, IdentificacaoSeguimento tipoSeguimento) {
		super(nome);
		setTipoSeguimento(tipoSeguimento);
	}
	
	/**
	 * @return the tipoSeguimento
	 */
	public IdentificacaoSeguimento getTipoSeguimento() {
		return tipoSeguimento;
	}

	/**
	 * @param tipoSeguimento the tipoSeguimento to set
	 */
	public void setTipoSeguimento(IdentificacaoSeguimento tipoSeguimento) {
		this.tipoSeguimento = tipoSeguimento;
	}
	
}
