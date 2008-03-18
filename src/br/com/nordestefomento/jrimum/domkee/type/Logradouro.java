package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.domkee.itype.ISingleTagable;
import br.com.nordestefomento.jrimum.domkee.itype.ITipoLogradouro;

public class Logradouro implements ISingleTagable<ITipoLogradouro> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -113374684167319855L;

	private String nome;
	
	private ITipoLogradouro tipoLogradouro;

	/**
	 * 
	 */
	public Logradouro() {}

	/**
	 * @param nome
	 */
	public Logradouro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public ITipoLogradouro getTag() {
		
		return tipoLogradouro;
	}

	@Override
	public void setTag(ITipoLogradouro tag) {
		
		this.tipoLogradouro = tag;
	}
}
