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


package br.com.nordestefomento.jrimum.domkee.bank.febraban;

import static br.com.nordestefomento.jrimum.utilix.ObjectUtil.isNotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import br.com.nordestefomento.jrimum.JRimumException;
import br.com.nordestefomento.jrimum.domkee.entity.Pessoa;
import br.com.nordestefomento.jrimum.domkee.type.IDadoBancario;
import br.com.nordestefomento.jrimum.utilix.DateUtil;
import br.com.nordestefomento.jrimum.utilix.ObjectUtil;


/**
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
 * Para visualizar o conceito de negócio consulte o 
 * <a href="http://jrimum.nordestefomento.com.br/wprojeto/wiki/Glossario">glossário</a>.
 * 
 * @see EnumTitulo
 * 
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public final class Titulo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7417116706701988529L;

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
	 * @see br.com.nordestefomento.jrimum.domkee.bank.febraban.EnumMoeda
	 */
	private EnumMoeda enumMoeda = EnumMoeda.REAL;

	/**
	 * @see #setValor(BigDecimal)
	 */
	private BigDecimal valor;
	
	/**
	 * @see #setDesconto(BigDecimal)
	 */
	private BigDecimal desconto;

	/**
	 * @see br.com.nordestefomento.jrimum.domkee.bank.febraban.EnumTitulo
	 */
	private EnumTitulo tipoDeDocumento;

	/**
	 * @see #setNossoNumero(String)
	 */
	private String nossoNumero;

	/**
	 * @see #setDigitoDoNossoNumero(String)
	 */
	private String digitoDoNossoNumero;
	
	/**
	 * @see #setContaBancaria(ContaBancaria)
	 */
	private ContaBancaria contaBancaria;

	/**
	 * @see #setCedente(Pessoa)
	 */
	private Pessoa cedente;
	
	/**
	 * @see #setSacado(Pessoa)
	 */
	private Pessoa sacado;

	/**
	 * @see #setSacadorAvalista(Pessoa)
	 */
	private Pessoa sacadorAvalista;
	
	private IDadoBancario dadosBancarios;
	

	/**
	 * <p>
	 * Identificação de Título Aceito / Não Aceito Código adotado pela FEBRABAN
	 * para identificar se o título de cobrança foi aceito (reconhecimento da
	 * dívida pelo Sacado). Domínio:
	 * </p>
	 * <ul>
	 * <li>'A' = Aceite</li>
	 * <li>'N' = Não Aceite</li>
	 * </ul>
	 * 
	 * @since 0.2
	 * 
	 * @version 0.2
	 */
	public enum EnumAceite {

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
	 * @see #setAceite(br.com.nordestefomento.jrimum.domkee.bank.febraban.Titulo.EnumAceite)
	 * 
	 * @see EnumAceite
	 */
	private EnumAceite aceite;

	/**
	 * <p>
	 * Cria um título sem sacador avalista.
	 * </p>
	 */
	public Titulo(ContaBancaria contaBancaria, Pessoa sacado, Pessoa cedente) throws JRimumException {
		this.setContaBancaria(contaBancaria);
		this.setSacado(sacado);
		this.setCedente(cedente);
	}
	
	public Titulo(ContaBancaria contaBancaria, Pessoa sacado, Pessoa cedente, Pessoa sacadorAvalista) throws JRimumException {
		this(contaBancaria, sacado, cedente);
		this.setSacadorAvalista(sacadorAvalista);
	}
	
	/**
	 * 
	 * @return has
	 */
	public boolean hasSacadorAvalista(){
		
		boolean has = false;

		if(isNotNull(this.sacadorAvalista)){
			has = true;
		}
		
		return has;
	}

	/**
	 * @see #setAceite(br.com.nordestefomento.jrimum.domkee.bank.febraban.Titulo.EnumAceite)
	 * 
	 * @return the aceite
	 */
	public EnumAceite getAceite() {
		return aceite;
	}

	/**
	 * <p>
	 * Indicação de aceite.
	 * </p>
	 * 
	 * @param aceite
	 *            the aceite to set
	 */
	public void setAceite(EnumAceite aceite) {
		this.aceite = aceite;
	}

	/**
	 * @see #setCedente(Pessoa)
	 * 
	 * @return the cedente
	 */
	public Pessoa getCedente() {
		return cedente;
	}

	/**
	 * <p>
	 * Cliente que entrega os títulos ao Banco para serem cobrados.
	 * </p>
	 * 
	 * @param cedente
	 *            the cedente to set
	 */
	public void setCedente(Pessoa cedente) {
		if (isNotNull(cedente)) {
			this.cedente = cedente;
		} else {
			throw new JRimumException(new IllegalArgumentException(
					"Cedente não pode ser nulo!"));
		}
	}

	/**
	 * @see #setDataDoDocumento(Date)
	 * 
	 * @return the dataDoDocumento
	 */
	public Date getDataDoDocumento() {
		return dataDoDocumento;
	}

	/**
	 * <p>
	 * Data de emissão do documento.
	 * </p>
	 * 
	 * @param dataDoDocumento
	 *            the dataDoDocumento to set
	 */
	public void setDataDoDocumento(Date dataDoDocumento) {
		this.dataDoDocumento = dataDoDocumento;
	}
	
	public void setDataDoDocumento(String dataDoDocumento) {
		  setDataDoDocumento(DateUtil.parse(dataDoDocumento));
	}

	/**
	 * @see #setDataDoVencimento(Date)
	 * 
	 * @return the dataDoVencimento
	 */
	public Date getDataDoVencimento() {
		return dataDoVencimento;
	}

	/**
	 *  <p>
	 * Data de vencimento nominal do título de cobrança, ou melhor, data limite
	 * para pagamento do título.
	 * </p>
	 * 
	 * @param dataDoVencimento
	 *            the dataDoVencimento to set
	 */
	public void setDataDoVencimento(Date dataDoVencimento) {
		this.dataDoVencimento = dataDoVencimento;
	}
	
	public void setDataDoVencimento(String dataDoVencimento) {
		setDataDoVencimento(DateUtil.parse(dataDoVencimento));
	}

	/**
	 * @see #setDigitoDoNossoNumero(String)
	 * 
	 * @return the dígitoDoNossoNúmero
	 */
	public String getDigitoDoNossoNumero() {
		return digitoDoNossoNumero;
	}

	/**
	 * <p>
	 * Dígito verificador do nosso número, caso exista.
	 * </p>
	 * 
	 * @param digitoDoNossoNumero
	 *            the dígitoDoNossoNúmero to set
	 */
	public void setDigitoDoNossoNumero(String digitoDoNossoNumero) {
		this.digitoDoNossoNumero = digitoDoNossoNumero;
	}

	/**
	 * @see br.com.nordestefomento.jrimum.domkee.bank.febraban.EnumMoeda
	 * 
	 * @return the enumMoeda
	 */
	public EnumMoeda getEnumMoeda() {
		return enumMoeda;
	}

	/**
	 * @see br.com.nordestefomento.jrimum.domkee.bank.febraban.EnumMoeda
	 * 
	 * @param moeda
	 *            the enumMoeda to set
	 */
	public void setEnumMoeda(EnumMoeda moeda) {
		enumMoeda = moeda;
	}

	/**
	 * @see #setNossoNumero(String)
	 * 
	 * @return the nossoNúmero
	 */
	public String getNossoNumero() {
		return nossoNumero;
	}

	/**
	 * <p>
	 * Código fornecido pelo Banco correspondente para identificação do título
	 *  ou identificação do título atribuído pelo esmissor do título de cobrança.
	 * </p>
	 * 
	 * @param nossoNumero
	 *            the nossoNúmero to set
	 */
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	/**
	 * @see #setNumeroDoDocumento(String)
	 * 
	 * @return the númeroDoDocumento
	 */
	public String getNumeroDoDocumento() {
		return numeroDoDocumento;
	}

	/**
	 * <p>
	 * Número de controle do cedente para o referido título. Não confundir com o nosso número.
	 * </p>
	 * 
	 * @param numeroDoDocumento
	 *            the númeroDoDocumento to set
	 */
	public void setNumeroDoDocumento(String numeroDoDocumento) {
		this.numeroDoDocumento = numeroDoDocumento;
	}
	
	/**
	 * @see #setContaBancaria(ContaBancaria)
	 * 
	 * @return the contaBancaria
	 */
	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	/**
	 * <p>
	 * Conta na qual o título se encontra, conta do favorecido (Cedente).
	 * </p>
	 * 
	 * @param contaBancaria the contaBancaria to set
	 */
	public void setContaBancaria(ContaBancaria contaBancaria)
			throws JRimumException {
		
		if (isNotNull(contaBancaria)) {
			this.contaBancaria = contaBancaria;
		} else {
			throw new JRimumException(new IllegalArgumentException(
					"ContaBancaria não pode ser nula!"));
		}
	}

	/**
	 * @see #setSacado(Pessoa)
	 * 
	 * @return the sacado
	 */
	public Pessoa getSacado() {
		return sacado;
	}

	/**
	 * <p>
	 * Pessoa física ou jurídica a que se destina a cobrança do compromisso, é o cliente do Cedente.
	 * </p>
	 * 
	 * @param sacado
	 *            the sacado to set
	 */
	public void setSacado(Pessoa sacado) {
		if (isNotNull(sacado)) {
			this.sacado = sacado;
		} else {
			throw new JRimumException(new IllegalArgumentException(
					"Sacado não pode ser nulo!"));
		}
	}

	/**
	 * @see #setSacadorAvalista(Pessoa)
	 * 
	 * @return the sacadorAvalista
	 */
	public Pessoa getSacadorAvalista() {
		return sacadorAvalista;
	}

	/**
	 * <p>
	 * Cedente original do Título.
	 * </p>
	 * 
	 * @param sacadorAvalista
	 *            the sacadorAvalista to set
	 */
	public void setSacadorAvalista(Pessoa sacadorAvalista) {
		if (isNotNull(sacadorAvalista)) {
			this.sacadorAvalista = sacadorAvalista;
		} else {
			throw new JRimumException(new IllegalArgumentException(
					"SacadorAvalista não pode ser nulo!"));
		}
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
	 * @see #setValor(BigDecimal)
	 * 
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * <p>
	 * Atribui um valor (original do Título) expresso em moeda corrente e arredondanda em duas casas decimais para baixo.
	 * </p>
	 * <p>
	 * Exemplo: Para o valor 12,349 ele definirá o valor para 12,34.
	 * </p>
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(BigDecimal valor) {
		valor = valor.setScale(2, RoundingMode.DOWN);
		this.valor = valor;
	}
	
	/**
	 * @see #setDesconto(BigDecimal)
	 * 
	 * @return the desconto
	 */
	public BigDecimal getDesconto() {
		return desconto;
	}

	/**
	 * <p>
	 * Atribui um valor de desconto ao valor original do título expresso em moeda 
	 * corrente e arredondanda em duas casas decimais para baixo.
	 * </p>
	 * <p>
	 * Exemplo: Para o valor 12,349 ele definirá o valor para 12,34.
	 * </p>
	 * @param desconto
	 *            the desconto to set
	 */
	public void setDesconto(BigDecimal desconto) {
		
		if(desconto != null) {
			desconto = desconto.setScale(2, RoundingMode.DOWN);
		}
		this.desconto = desconto;
	}

	public IDadoBancario getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(IDadoBancario dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	@Override
	public String toString() {
		return ObjectUtil.toString(this);
	}
}
