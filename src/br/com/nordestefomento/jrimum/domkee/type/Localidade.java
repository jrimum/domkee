package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.domkee.itype.ISingleTagable;
import br.com.nordestefomento.jrimum.domkee.itype.ITipoLocalidade;

public class Localidade implements ISingleTagable<ITipoLocalidade> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5645560130352430098L;

	private String nome;
	
	private ITipoLocalidade tipoLocalidade;
	
	/**
	 * 
	 */
	public Localidade() {}

	/**
	 * @param nome
	 */
	public Localidade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public ITipoLocalidade getTag() {

		return tipoLocalidade;
	}

	@Override
	public void setTag(ITipoLocalidade tag) {

		this.tipoLocalidade = tag;
	}
}
