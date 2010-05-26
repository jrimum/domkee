/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

/**
 * @author misael
 *
 */
public enum IdentificacaoValorEfetivo {

	
	VALOR_COBRANDO_EM_REAL_COM_DV_MODULO_10(6),
	
	QUANTIDADE_DE_MOEDA_COM_DV_MODULO_10(7),
	
	VALOR_COBRANDO_EM_REAL_COM_DV_MODULO_11(8),
	
	QUANTIDADE_DE_MOEDA_COM_DV_MODULO_11(9);
	
	
	private Integer codigo;
	
	/**
	 * @param codigo
	 * @param nome
	 */
	private IdentificacaoValorEfetivo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}	
}
