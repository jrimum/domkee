package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.utilix.ITextStream;

public class CEP implements ITextStream {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3573397075779771290L;
	
	private Integer prefixo;
	
	private Integer sufixo;
	
	private String cep;
	
	public CEP() {}
	
	public CEP(String cep) {
		
		this.cep = cep;
		
		read(cep);
	}

	public Integer getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(Integer prefixo) {
		this.prefixo = prefixo;
	}

	public Integer getSufixo() {
		return sufixo;
	}

	public void setSufixo(Integer sufixo) {
		this.sufixo = sufixo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public void read(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return null;
	}
}
