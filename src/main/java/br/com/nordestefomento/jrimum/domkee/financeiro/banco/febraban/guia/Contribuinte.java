/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.AbstractCPRF;

/**
 * @author misael
 *
 */
public class Contribuinte extends EntidadeDeCobranca {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3267851061149256619L;

	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public Contribuinte(String nome, AbstractCPRF cadastroDePessoa) {
		super(nome, cadastroDePessoa);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param cadastroDePessoa
	 */
	public Contribuinte(String nome, String cadastroDePessoa) {
		super(nome, cadastroDePessoa);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 */
	public Contribuinte(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
}
