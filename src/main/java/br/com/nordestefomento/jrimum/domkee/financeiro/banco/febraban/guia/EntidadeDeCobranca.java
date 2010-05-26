/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;


import java.io.Serializable;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF;
import br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa;

/**
 * @author misael
 *
 */
public class EntidadeDeCobranca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8794286412913271840L;
	
	
	/**
	 * Utilizado como composição
	 */	
	private Pessoa pessoa;
	
	
	public EntidadeDeCobranca(String nome) {
		pessoa = new Pessoa(nome);
	}
	
	public EntidadeDeCobranca(String nome, String cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}
	
	public EntidadeDeCobranca(String nome, AbstractCPRF cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}

	/**
	 * @return
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa#getCPRF()
	 */
	public AbstractCPRF getCPRF() {
		return pessoa.getCPRF();
	}

	/**
	 * @return
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa#getNome()
	 */
	public String getNome() {
		return pessoa.getNome();
	}

	/**
	 * @param abstractCPRF
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa#setCPRF(br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF)
	 */
	public void setCPRF(AbstractCPRF abstractCPRF) {
		pessoa.setCPRF(abstractCPRF);
	}

	/**
	 * @param nome
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa#setNome(java.lang.String)
	 */
	public void setNome(String nome) {
		pessoa.setNome(nome);
	}

	
}
