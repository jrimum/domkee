/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import java.io.Serializable;
import java.util.Date;

import br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.Agencia;
import br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.Banco;

/**
 * @author i311020
 *
 */
public class Convenio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8371261211322002627L;

	private Banco banco;
	private Agencia agencia;
	private Integer numero;
	private Date dataInicio;
	private Date dataFim;
	
	/**
	 * 
	 */
	public Convenio() {
	
	}

	/**
	 * @param banco
	 * @param numero
	 */
	public Convenio(Banco banco, Integer numero) {
		this.banco = banco;
		this.numero = numero;
	}

	/**
	 * @return the banco
	 */
	public Banco getBanco() {
		return banco;
	}

	/**
	 * @param banco the banco to set
	 */
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	/**
	 * @return the agencia
	 */
	public Agencia getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataInicio
	 */
	public Date getDataInicio() {
		return dataInicio;
	}

	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * @return the dataFim
	 */
	public Date getDataFim() {
		return dataFim;
	}

	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
}
