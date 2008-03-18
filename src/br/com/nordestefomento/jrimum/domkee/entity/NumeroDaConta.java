package br.com.nordestefomento.jrimum.domkee.entity;

import java.io.Serializable;

public class NumeroDaConta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7807160258460502276L;

	private Integer codigoDaConta  = 0;

	private String digitoDaConta = "";
	
	public NumeroDaConta() {}
	
	public NumeroDaConta(Integer codigoDaConta) {
		
		this.codigoDaConta = codigoDaConta;
	}
	
	public NumeroDaConta(Integer codigoDaConta, String digitoDaConta) {
		
		this.codigoDaConta = codigoDaConta;
		this.digitoDaConta = digitoDaConta;
	}

	public Integer getCodigoDaConta() {
		return codigoDaConta;
	}

	public void setCodigoDaConta(Integer codigoDaConta) {
		this.codigoDaConta = codigoDaConta;
	}

	public String getDigitoDaConta() {
		return digitoDaConta;
	}

	public void setDigitoDaConta(String digitoDaConta) {
		this.digitoDaConta = digitoDaConta;
	}
}
