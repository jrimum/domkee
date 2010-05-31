/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import br.com.nordestefomento.jrimum.vallia.digitoverificador.Modulo;
import br.com.nordestefomento.jrimum.vallia.digitoverificador.TipoDeModulo;

/**
 * @author misael
 *
 */
public enum TipoValorReferencia {

	
	VALOR_COBRADO_EM_REAL_COM_DV_MODULO_10(6, new Modulo(TipoDeModulo.MODULO10)),
	
	QUANTIDADE_DE_MOEDA_COM_DV_MODULO_10(7, new Modulo(TipoDeModulo.MODULO10)),
	
	VALOR_COBRADO_EM_REAL_COM_DV_MODULO_11(8, new Modulo(TipoDeModulo.MODULO11)),
	
	QUANTIDADE_DE_MOEDA_COM_DV_MODULO_11(9, new Modulo(TipoDeModulo.MODULO11));
	
	
	private Integer codigo;

	private Modulo modulo;
	
	/**
	 * @param codigo
	 * @param nome
	 */
	private TipoValorReferencia(Integer codigo, Modulo modulo) {
		this.codigo = codigo;
		this.modulo = modulo;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @return the modulo
	 */
	public Modulo getModulo() {
		return modulo;
	}	

}
