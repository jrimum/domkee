/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import br.com.nordestefomento.jrimum.domkee.comum.pessoa.id.cprf.CPF;

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
	 * @param cpf
	 */
	public Contribuinte(String nome, CPF cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param cpf
	 */	
	public Contribuinte(String nome, String cpf) {
		super();
		
		setNome(nome);
		
		CPF cPF = new CPF(cpf);
		setCPF(cPF);
	}

	/**
	 * @param nome
	 */
	public Contribuinte(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return CPF
	 * @see #getCPF()
	 */
	public CPF getCPF() {
		return (CPF)pessoa.getCPRF();
	}

	/**
	 * @param abstractCPRF
	 * @see # setCPF(CPF cpf)
	 */
	public void setCPF(CPF cpf) {
		pessoa.setCPRF(cpf);
	}
	
}
