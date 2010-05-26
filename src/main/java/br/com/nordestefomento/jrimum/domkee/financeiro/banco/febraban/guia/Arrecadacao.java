/**
 * 
 */
package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;
import br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.TipoDeMoeda;

/**
 * @author misael
 *
 */
public class Arrecadacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -466289033349771721L;

	
	/**
	 * @see #setNumeroDoDocumento(String)
	 */
	private String numeroDoDocumento;

	/**
	 * @see #setDataDoDocumento(Date)
	 */
	private Date dataDoDocumento;

	/**
	 * @see #setDataDoVencimento(Date)
	 */
	private Date dataDoVencimento;

	/**
	 * @see br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.TipoDeMoeda
	 */
	private TipoDeMoeda tipoDeMoeda = TipoDeMoeda.REAL;

	/**
	 * @see #setValor(BigDecimal)
	 */
	private BigDecimal valor;

	/**
	 * @see #setDesconto(BigDecimal)
	 */
	private BigDecimal desconto;

	/**
	 * @see #setNossoNumero(String)
	 */
	private String nossoNumero;


	/**
	 * @see #setContaBancaria(ContaBancaria)
	 */
	private Convenio convenio;

	/**
	 * @see #setOrgaoRecebedor(OrgaoRecebedor)
	 */
	private OrgaoRecebedor orgaoRecebedor;

	/**
	 * @see #setContribuinte(Contribuinte)
	 */
	private Contribuinte contribuinte;

	/**
	 * @param orgaoRecebedor
	 * @param contribuinte
	 */
	public Arrecadacao(OrgaoRecebedor orgaoRecebedor, Contribuinte contribuinte) {
		this.orgaoRecebedor = orgaoRecebedor;
		this.contribuinte = contribuinte;
	}

	/**
	 * @param convenio
	 * @param orgaoRecebedor
	 * @param contribuinte
	 */
	public Arrecadacao(Convenio convenio, OrgaoRecebedor orgaoRecebedor,
			Contribuinte contribuinte) {
		this.convenio = convenio;
		this.orgaoRecebedor = orgaoRecebedor;
		this.contribuinte = contribuinte;
	}

	/**
	 * @return the numeroDoDocumento
	 */
	public String getNumeroDoDocumento() {
		return numeroDoDocumento;
	}

	/**
	 * @param numeroDoDocumento the numeroDoDocumento to set
	 */
	public void setNumeroDoDocumento(String numeroDoDocumento) {
		this.numeroDoDocumento = numeroDoDocumento;
	}

	/**
	 * @return the dataDoDocumento
	 */
	public Date getDataDoDocumento() {
		return dataDoDocumento;
	}

	/**
	 * @param dataDoDocumento the dataDoDocumento to set
	 */
	public void setDataDoDocumento(Date dataDoDocumento) {
		this.dataDoDocumento = dataDoDocumento;
	}

	/**
	 * @return the dataDoVencimento
	 */
	public Date getDataDoVencimento() {
		return dataDoVencimento;
	}

	/**
	 * @param dataDoVencimento the dataDoVencimento to set
	 */
	public void setDataDoVencimento(Date dataDoVencimento) {
		this.dataDoVencimento = dataDoVencimento;
	}

	/**
	 * @return the tipoDeMoeda
	 */
	public TipoDeMoeda getTipoDeMoeda() {
		return tipoDeMoeda;
	}

	/**
	 * @param tipoDeMoeda the tipoDeMoeda to set
	 */
	public void setTipoDeMoeda(TipoDeMoeda tipoDeMoeda) {
		this.tipoDeMoeda = tipoDeMoeda;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * @return the desconto
	 */
	public BigDecimal getDesconto() {
		return desconto;
	}

	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	/**
	 * @return the nossoNumero
	 */
	public String getNossoNumero() {
		return nossoNumero;
	}

	/**
	 * @param nossoNumero the nossoNumero to set
	 */
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	/**
	 * @return the convenio
	 */
	public Convenio getConvenio() {
		return convenio;
	}

	/**
	 * @param convenio the convenio to set
	 */
	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	/**
	 * @return the orgaoRecebedor
	 */
	public OrgaoRecebedor getOrgaoRecebedor() {
		return orgaoRecebedor;
	}

	/**
	 * @param orgaoRecebedor the orgaoRecebedor to set
	 */
	public void setOrgaoRecebedor(OrgaoRecebedor orgaoRecebedor) {
		this.orgaoRecebedor = orgaoRecebedor;
	}

	/**
	 * @return the contribuinte
	 */
	public Contribuinte getContribuinte() {
		return contribuinte;
	}

	/**
	 * @param contribuinte the contribuinte to set
	 */
	public void setContribuinte(Contribuinte contribuinte) {
		this.contribuinte = contribuinte;
	}
	
}
