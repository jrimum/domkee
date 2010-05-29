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
public abstract class EntidadeDeCobranca implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8794286412913271840L;
	
	
	/**
	 * Utilizado como composição
	 */	
	protected Pessoa pessoa;
	
	
	protected EntidadeDeCobranca() {
		pessoa = new Pessoa();
	}
	
	protected EntidadeDeCobranca(String nome) {
		pessoa = new Pessoa(nome);
	}
	
	protected EntidadeDeCobranca(String nome, AbstractCPRF cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}

	/**
	 * @return
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa#getNome()
	 */
	public String getNome() {
		return pessoa.getNome();
	}

	/**
	 * @param nome
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.Pessoa#setNome(java.lang.String)
	 */
	public void setNome(String nome) {
		pessoa.setNome(nome);
	}

}
