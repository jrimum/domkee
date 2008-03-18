package br.com.nordestefomento.jrimum.domkee.entity;

import br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica;

/**
 * @author  Romulo
 */
public class PessoaJuridica extends Pessoa implements IPessoaJuridica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2028330457824238140L;
	
	private Long inscricaoEstadual;
	
	private Long inscricaoMunicipal;
	
	private String nomeFantasia;

	@Override
	public Long getInscricaoEstadual() {

		return inscricaoEstadual;
	}

	@Override
	public Long getInscricaoMunicipal() {

		return inscricaoMunicipal;
	}

	@Override
	public String getNomeFantasia() {

		return nomeFantasia;
	}

	@Override
	public void setInscricaoEstadual(Long inscricaoEstadual) {

		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public void setInscricaoMunicipal(Long inscricaoMunicipal) {

		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	@Override
	public void setNomeFantasia(String nomeFantasia) {

		this.nomeFantasia = nomeFantasia;
	}

}
