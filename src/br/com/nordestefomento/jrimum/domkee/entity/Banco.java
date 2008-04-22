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
 * Created at: 30/03/2008 - 18:57:43
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
 * Criado em: 30/03/2008 - 18:57:43
 * 
 */

package br.com.nordestefomento.jrimum.domkee.entity;

import java.awt.Image;
import java.util.Collection;

import org.apache.commons.lang.StringUtils;

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.domkee.ientity.IBanco;
import br.com.nordestefomento.jrimum.domkee.type.ACpfCnpj;
import br.com.nordestefomento.jrimum.domkee.type.CNPJ;
import br.com.nordestefomento.jrimum.domkee.type.Email;
import br.com.nordestefomento.jrimum.domkee.type.Endereco;
import br.com.nordestefomento.jrimum.domkee.type.Telefone;


/**
 * 
 * <p>
 * DEFINIÇÃO DA CLASSE
 * </p>
 * 
 * <p>
 * OBJETIVO/PROPÓSITO
 * </p>
 * 
 * <p>
 * EXEMPLO: 
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
	
public class Banco extends ACurbitaObject implements IBanco{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6156550582890687779L;

	private String codigoDeCompensacao;

	private String segmento;

	private Image imgLogo;
	
	private PessoaJuridica pessoaJuridica;

	/**
	 * 
	 */
	public Banco() {
		super();
	}
	
	
	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 */
	public Banco(String codigoDeCompensacao, String instituicao) {
		super();
		
		this.codigoDeCompensacao = codigoDeCompensacao;

		pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome(instituicao);
		pessoaJuridica.setNomeFantasia(instituicao);
	}

	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 * @param cnpj
	 */
	public Banco(String codigoDeCompensacao, String instituicao, CNPJ cnpj) {
		super();
		
		this.codigoDeCompensacao = codigoDeCompensacao;
		
		pessoaJuridica = new PessoaJuridica();
		
		pessoaJuridica.setACpfCnpj(cnpj);
		pessoaJuridica.setNome(instituicao);
		pessoaJuridica.setNomeFantasia(instituicao);
	}

	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 * @param cnpj
	 * @param segmento
	 */
	public Banco(String codigoDeCompensacao, String instituicao, CNPJ cnpj,
			String segmento) {
		super();
		
		this.codigoDeCompensacao = codigoDeCompensacao;
		this.segmento = segmento;
		
		pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setACpfCnpj(cnpj);
		pessoaJuridica.setNome(instituicao);
		pessoaJuridica.setNomeFantasia(instituicao);
	}

	/**
	 * @param codigoDeCompensacao
	 * @param instituicao
	 * @param cnpj
	 * @param segmento
	 * @param imgLogo
	 */
	public Banco(String codigoDeCompensacao, String instituicao, CNPJ cnpj,	String segmento, Image imgLogo) {
		super();
		
		this.codigoDeCompensacao = codigoDeCompensacao;
		this.segmento = segmento;
		this.imgLogo = imgLogo;
		
		pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setACpfCnpj(cnpj);
	}

	/**
	 * 	 * <p>
	 * Verifica se o código passdo está ok em relação as regras:
	 * <ol>
	 * <li>Não nulo</li>
	 * <li>Numérico</li>
	 * <li>Com 3 digitos</li>
	 * </ol>
	 * </p>
	 * 
	 * @param codigo
	 * 
	 * @return se ok
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @since 0.2
	 * 
	 */		
	public static boolean isCodigoDeCompensacaoOK(String codigo) throws IllegalArgumentException{
		boolean ok = false;
		if(!isNull(codigo, "codigo")){
			if(StringUtils.isNumeric(codigo))
				if(codigo.length() == 3)
					ok = true;
				else
					throw new IllegalArgumentException("O codigo e de apenas 3 digitos!");
			else
				throw new IllegalArgumentException("O codigo de compensacao deve ser numerico!");
		}
		return ok;
	}

	public String getCodigoDeCompensacao() {
		return codigoDeCompensacao;
	}

	public void setCodigoDeCompensacao(String codigoDeCompensacao) {
		this.codigoDeCompensacao = codigoDeCompensacao;
	}

	public CNPJ getCNPJ() {
		return (CNPJ)pessoaJuridica.getACpfCnpj();
	}

	public void setCNPJ(CNPJ cnpj) {
		pessoaJuridica.setACpfCnpj(cnpj);
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public Image getImgLogo() {
		return imgLogo;
	}

	public void setImgLogo(Image imgLogo) {
		this.imgLogo = imgLogo;
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#addContaBancaria(br.com.nordestefomento.jrimum.domkee.entity.ContaBancaria)
	 */
	@Override
	public void addContaBancaria(ContaBancaria contaBancaria) {
		
		pessoaJuridica.addContaBancaria(contaBancaria);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#addEmail(br.com.nordestefomento.jrimum.domkee.type.Email)
	 */
	@Override
	public void addEmail(Email email) {
		
		pessoaJuridica.addEmail(email);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#addEndereco(br.com.nordestefomento.jrimum.domkee.type.Endereco)
	 */
	@Override
	public void addEndereco(Endereco endereco) {
		
		pessoaJuridica.addEndereco(endereco);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#addTelefone(br.com.nordestefomento.jrimum.domkee.type.Telefone)
	 */
	@Override
	public void addTelefone(Telefone telefone) {
		
		pessoaJuridica.addTelefone(telefone);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#getACpfCnpj()
	 */
	@Override
	public ACpfCnpj getACpfCnpj() {
		
		return pessoaJuridica.getACpfCnpj();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#getContasBancarias()
	 */
	@Override
	public Collection<ContaBancaria> getContasBancarias() {
		
		return pessoaJuridica.getContasBancarias();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#getEmails()
	 */
	@Override
	public Collection<Email> getEmails() {
		
		return getEmails();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#getEnderecos()
	 */
	@Override
	public Collection<Endereco> getEnderecos() {
		
		return pessoaJuridica.getEnderecos();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#getNome()
	 */
	@Override
	public String getNome() {
		
		return pessoaJuridica.getNome();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#getTelefones()
	 */
	@Override
	public Collection<Telefone> getTelefones() {
		
		return pessoaJuridica.getTelefones();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#hasContaBancaria()
	 */
	@Override
	public boolean hasContaBancaria() {
		
		return pessoaJuridica.hasContaBancaria();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#isFisica()
	 */
	@Override
	public boolean isFisica() {
		
		return pessoaJuridica.isFisica();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#isJuridica()
	 */
	@Override
	public boolean isJuridica() {
		
		return pessoaJuridica.isJuridica();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#setACpfCnpj(br.com.nordestefomento.jrimum.domkee.type.ACpfCnpj)
	 */
	@Override
	public void setACpfCnpj(ACpfCnpj aCpfCnpj) {
		
		pessoaJuridica.setACpfCnpj(aCpfCnpj);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#setContasBancarias(java.util.Collection)
	 */
	@Override
	public void setContasBancarias(Collection<ContaBancaria> contasBancarias) {
		
		pessoaJuridica.setContasBancarias(contasBancarias);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#setEmails(java.util.Collection)
	 */
	@Override
	public void setEmails(Collection<Email> emails) {
		
		pessoaJuridica.setEmails(emails);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#setEnderecos(java.util.Collection)
	 */
	@Override
	public void setEnderecos(Collection<Endereco> enderecos) {
		
		pessoaJuridica.setEnderecos(enderecos);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		
		pessoaJuridica.setNome(nome);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa#setTelefones(java.util.Collection)
	 */
	@Override
	public void setTelefones(Collection<Telefone> telefones) {
		
		pessoaJuridica.setTelefones(telefones);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica#getInscricaoEstadual()
	 */
	@Override
	public Long getInscricaoEstadual() {
		
		return pessoaJuridica.getInscricaoEstadual();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica#getInscricaoMunicipal()
	 */
	@Override
	public Long getInscricaoMunicipal() {
		
		return pessoaJuridica.getInscricaoMunicipal();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica#getNomeFantasia()
	 */
	@Override
	public String getNomeFantasia() {
		
		return pessoaJuridica.getNome();
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica#setInscricaoEstadual(java.lang.Long)
	 */
	@Override
	public void setInscricaoEstadual(Long inscricaoEstadual) {
		
		pessoaJuridica.setInscricaoEstadual(inscricaoEstadual);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica#setInscricaoMunicipal(java.lang.Long)
	 */
	@Override
	public void setInscricaoMunicipal(Long inscricaoMunicipal) {
		
		pessoaJuridica.setInscricaoMunicipal(inscricaoMunicipal);
	}


	/**
	 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoaJuridica#setNomeFantasia(java.lang.String)
	 */
	@Override
	public void setNomeFantasia(String nomeFantasia) {
		
		pessoaJuridica.setNomeFantasia(nomeFantasia);
	}
	
}
