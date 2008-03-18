package br.com.nordestefomento.jrimum.domkee.entity;

import java.io.Serializable;

public class Agencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3512980818455792739L;
	
	private Integer codigoDaAgencia = 0;

	private String digitoDaAgencia  = "";
	
	public Agencia() {}
	
	public Agencia(Integer codigoDaAgencia) {
		
		this.codigoDaAgencia = codigoDaAgencia;
	}
	
	public Agencia(Integer codigoDaAgencia, String digitoDaAgencia) {
		
		this.codigoDaAgencia = codigoDaAgencia;
		this.digitoDaAgencia = digitoDaAgencia;
	}

	public Integer getCodigoDaAgencia() {
		return codigoDaAgencia;
	}

	public void setCodigoDaAgencia(Integer codigoDaAgencia) {
		this.codigoDaAgencia = codigoDaAgencia;
	}

	public String getDigitoDaAgencia() {
		return digitoDaAgencia;
	}

	public void setDigitoDaAgencia(String digitoDaAgencia) {
		this.digitoDaAgencia = digitoDaAgencia;
	}

}
