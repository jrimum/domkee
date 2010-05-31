/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

/**
 * @author misael
 *
 */
public enum TipoProduto {

	ARRECADACAO(8, "Arredacão");
		
	private Integer codigo;
	private String nome;
	
	/**
	 * @param codigo
	 * @param nome
	 */
	private TipoProduto(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}	
	
}
