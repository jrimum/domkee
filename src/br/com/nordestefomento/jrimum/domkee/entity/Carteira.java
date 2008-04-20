package br.com.nordestefomento.jrimum.domkee.entity;

/**
 * 
 * <p>
 *  Representação pela <a href="http://www.febraban.org.br">FEBRABAN</a>, para identificar a característica dos títulos dentro das modalidades de cobrança existentes no banco.
 * </p>
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */

public class Carteira {

	/**
	 * Nome da modalidade de cobrança (ou serviços) atribuído a carteira.
	 */
	private String nome;

	/**
	 * Código adotado pela <a href="http://www.febraban.org.br">FEBRABAN</a>, para identificar a característica dos
	 * títulos dentro das modalidades de cobrança existentes no banco.
	 * 
	 */
	private Integer codigo;

	/**
	 *Tipo determinado de cobrança, com registro ou sem registro.
	 *
	 * @see EnumCobranca
	 */
	private EnumCobranca cobranca;

	/**
	 * 
	 */
	public Carteira() {
		super();
	}	

	/**
	 * @param codigo
	 */
	public Carteira(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	/**
	 * @param codigo
	 * @param cobranca
	 */
	public Carteira(Integer codigo, EnumCobranca cobranca) {
		super();
		this.codigo = codigo;
		this.cobranca = cobranca;
	}

	/**
	 * @param nome
	 * @param codigo
	 * @param cobranca
	 */
	public Carteira(String nome, Integer codigo, EnumCobranca cobranca) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.cobranca = cobranca;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the cobranca
	 */
	public EnumCobranca getCobranca() {
		return cobranca;
	}

	/**
	 * @param cobranca the cobranca to set
	 */
	public void setCobranca(EnumCobranca cobranca) {
		this.cobranca = cobranca;
	}
	
}
