/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 18:58:42
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 18:58:42
 * 
 */


package br.com.nordestefomento.jrimum.domkee.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.domkee.type.EnumMoeda;
import br.com.nordestefomento.jrimum.domkee.type.EnumTitulo;


/**
 * 
 * Representa um título em cobrança, tais como:
 * 
 * <br />
 * 
 * <ul>
 * <li>Cheque</li>
 * <li>Duplicata Mercantil </li>
 * <li>Duplicata de Serviço</li>
 * <li>Duplicata Rural</li>
 * <li>Letra de Câmbio</li>
 * <li>Nota de Crédito Comercial</li>
 * <li>Nota de Crédito Industrial</li>
 * <li>Nota de Crédito Rural</li>
 * <li>E outras espécies pagáveis através da rede bancária.</li>
 * 
 * @see br.com.nordestefomento.jrimum.boleto.EnumTitulo
 * 
 * @author Gabriel Guimarães
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * 
 * @since JMatryx 1.0
 * 
 * @version 1.0
 */
public final class Titulo extends ACurbitaObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7417116706701988529L;

	/**
	 * Identificação do Título atribuído pelo esmissor do título, não confundir
	 * com o nosso número.
	 */
	private String numeroDoDocumento;

	/**
	 * Data de emissão do documento.
	 */
	private Date dataDoDocumento;

	/**
	 * Data de vencimento nominal do título de cobrança, ou melhor, data limite
	 * para pagamento do título.
	 */
	private Date dataDoVencimento;

	/**
	 * @see br.com.nordestefomento.jrimum.boleto.EnumMoeda
	 */
	private EnumMoeda enumMoeda = EnumMoeda.REAL;

	/**
	 * Valor original do Título expresso em moeda corrente, utilizar 2 decimais.
	 */
	private BigDecimal valor;

	/**
	 * @see br.com.nordestefomento.jrimum.boleto.EnumTitulo
	 */
	private EnumTitulo tipoDeDocumento;

	/**
	 * Código fornecido pelo Banco Correspondente para identificação do Título
	 * de Cobrança.
	 */
	private String nossoNumero;

	/**
	 * Dígito verificador do nosso número, caso exista.
	 */
	private String digitoDoNossoNumero;

	/**
	 * @see br.com.nordestefomento.jrimum.type.entity.Cedente
	 */
	private Pessoa cedente;

	/**
	 * @see br.com.nordestefomento.jrimum.type.entity.Sacado
	 */
	private Pessoa sacado;

	/**
	 * @see br.com.nordestefomento.jrimum.type.entity.SacadorAvalista
	 */
	private Pessoa sacadorAvalista;

	/**
	 * Identificação de Título Aceito / Não Aceito Código adotado pela FEBRABAN
	 * para identificar se o título de cobrança foi aceito (reconhecimento da
	 * dívida pelo Sacado). Domínio:
	 * 
	 * <ul>
	 * <li>'A' = Aceite</li>
	 * <li>'N' = Não Aceite</li>
	 * </ul>
	 */
	public enum E_Aceite {

		A, N;

		boolean isAceite() {

			boolean isAceite = true;

			switch (this) {

			case N:
				isAceite = false;
				break;
			}

			return isAceite;
		}
	}

	/**
	 * Indicação de aceite.
	 * 
	 * @see br.com.nordestefomento.jrimum.type.entity.Titulo.E_Aceite
	 */
	private E_Aceite aceite;

	private Titulo() {
		super();
	}
	
	public static Titulo getInstance(Pessoa sacado, Pessoa cedente, Pessoa sacadorAvalista)throws IllegalArgumentException{
		
		Titulo titulo = null;
		
		if(sacadorAvalista != null){
			
			titulo = getInstance(sacado, cedente);
			titulo.setSacadorAvalista(sacadorAvalista);
		}else
			throw new IllegalArgumentException("Sacador Avalista NULL!");
		
		return titulo;
	}

	public static Titulo getInstance(Pessoa sacado, Pessoa cedente)throws IllegalArgumentException{
		
		Titulo titulo = null;
		
		if(sacado != null && cedente != null){
			
			titulo = new Titulo();
			
			titulo.setSacado(sacado);
			titulo.setCedente(cedente);
		}else
			throw new IllegalArgumentException("Sacado ou Cedente NULL!");
		
		return titulo;
	}

	/**
	 * 
	 * @return has
	 */
	public boolean hasSacadorAvalista(){
		
		boolean has = false;
		
		if(this.sacadorAvalista != null){
			has = true;
		}
		
		return has;
	}

	/**
	 * @return the aceite
	 */
	public E_Aceite getAceite() {
		return aceite;
	}

	/**
	 * @param aceite
	 *            the aceite to set
	 */
	public void setAceite(E_Aceite aceite) {
		this.aceite = aceite;
	}

	/**
	 * @return the cedente
	 */
	public Pessoa getCedente() {
		return cedente;
	}

	/**
	 * @param cedente
	 *            the cedente to set
	 */
	public void setCedente(Pessoa cedente) {
		this.cedente = cedente;
	}

	/**
	 * @return the dataDoDocumento
	 */
	public Date getDataDoDocumento() {
		return dataDoDocumento;
	}

	/**
	 * @param dataDoDocumento
	 *            the dataDoDocumento to set
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
	 * @param dataDoVencimento
	 *            the dataDoVencimento to set
	 */
	public void setDataDoVencimento(Date dataDoVencimento) {
		this.dataDoVencimento = dataDoVencimento;
	}

	/**
	 * @return the dígitoDoNossoNúmero
	 */
	public String getDigitoDoNossoNumero() {
		return digitoDoNossoNumero;
	}

	/**
	 * @param digitoDoNossoNumero
	 *            the dígitoDoNossoNúmero to set
	 */
	public void setDigitoDoNossoNumero(String digitoDoNossoNumero) {
		this.digitoDoNossoNumero = digitoDoNossoNumero;
	}

	/**
	 * @return the enumMoeda
	 */
	public EnumMoeda getE_Moeda() {
		return enumMoeda;
	}

	/**
	 * @param moeda
	 *            the enumMoeda to set
	 */
	public void setE_Moeda(EnumMoeda moeda) {
		enumMoeda = moeda;
	}

	/**
	 * @return the nossoNúmero
	 */
	public String getNossoNumero() {
		return nossoNumero;
	}

	/**
	 * @param nossoNumero
	 *            the nossoNúmero to set
	 */
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	/**
	 * @return the númeroDoDocumento
	 */
	public String getNumeroDoDocumento() {
		return numeroDoDocumento;
	}

	/**
	 * @param numeroDoDocumento
	 *            the númeroDoDocumento to set
	 */
	public void setNumeroDoDocumento(String numeroDoDocumento) {
		this.numeroDoDocumento = numeroDoDocumento;
	}

	/**
	 * @return the sacado
	 */
	public Pessoa getSacado() {
		return sacado;
	}

	/**
	 * @param sacado
	 *            the sacado to set
	 */
	public void setSacado(Pessoa sacado) {
		this.sacado = sacado;
	}

	/**
	 * @return the sacadorAvalista
	 */
	public Pessoa getSacadorAvalista() {
		return sacadorAvalista;
	}

	/**
	 * @param sacadorAvalista
	 *            the sacadorAvalista to set
	 */
	public void setSacadorAvalista(Pessoa sacadorAvalista) {
		this.sacadorAvalista = sacadorAvalista;
	}

	/**
	 * @return the tipoDeDocumento
	 */
	public EnumTitulo getTipoDeDocumento() {
		return tipoDeDocumento;
	}

	/**
	 * @param tipoDeDocumento
	 *            the tipoDeDocumento to set
	 */
	public void setTipoDeDocumento(EnumTitulo tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(BigDecimal valor) {
		valor = valor.setScale(2, RoundingMode.DOWN);
		this.valor = valor;
	}

}
