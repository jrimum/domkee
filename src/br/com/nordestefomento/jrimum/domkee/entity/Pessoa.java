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
 * Created at: 30/03/2008 - 18:58:13
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
 * Criado em: 30/03/2008 - 18:58:13
 * 
 */


package br.com.nordestefomento.jrimum.domkee.entity;

import java.util.ArrayList;
import java.util.Collection;

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.domkee.ientity.IPessoa;
import br.com.nordestefomento.jrimum.domkee.type.AbstractCPRF;
import br.com.nordestefomento.jrimum.domkee.type.Email;
import br.com.nordestefomento.jrimum.domkee.type.Endereco;
import br.com.nordestefomento.jrimum.domkee.type.Telefone;

/**
 * @author   Romulo
 */
public class Pessoa extends ACurbitaObject implements IPessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6969495818430633867L;
	
	private Long id;
	
	private String nome;
	
	private AbstractCPRF abstractCPRF;
	
	private Collection<Telefone> telefones;
	
	private Collection<Email> emails;
	
	private Collection<Endereco> enderecos;
	
	private Collection<ContaBancaria> contasBancarias;
	
	public Pessoa() {}
	
	public Pessoa(String nome) {
		
		this.nome = nome;
	}

	public Pessoa(String nome, String cadastroDePessoa) {
		
		this.nome = nome;
		this.abstractCPRF = AbstractCPRF.getInstance(cadastroDePessoa);
	}

	@Override
	public void addContaBancaria(ContaBancaria contaBancaria) {
		
		if(isNull(contasBancarias))
			contasBancarias = new ArrayList<ContaBancaria>();
		
		contasBancarias.add(contaBancaria);
	}
	
	@Override
	public boolean hasContaBancaria(){
		return (isNotNull(getContasBancarias()) && !getContasBancarias().isEmpty());
	}

	@Override
	public void addEmail(Email email) {
		
		if(isNull(emails))
			emails = new ArrayList<Email>();
		
		emails.add(email);
	}

	@Override
	public void addEndereco(Endereco endereco) {

		if(isNull(enderecos))
			enderecos = new ArrayList<Endereco>();
		
		enderecos.add(endereco);
	}

	@Override
	public void addTelefone(Telefone telefone) {
		
		if(isNull(telefones))
			telefones = new ArrayList<Telefone>();
		
		telefones.add(telefone);
	}

	@Override
	public AbstractCPRF getACpfCnpj() {
		
		return abstractCPRF;
	}

	@Override
	public Collection<ContaBancaria> getContasBancarias() {

		return contasBancarias;
	}

	@Override
	public Collection<Email> getEmails() {

		return emails;
	}

	@Override
	public Collection<Endereco> getEnderecos() {

		return enderecos;
	}

	@Override
	public String getNome() {

		return nome;
	}

	@Override
	public Collection<Telefone> getTelefones() {
		
		return telefones;
	}

	@Override
	public void setACpfCnpj(AbstractCPRF abstractCPRF) {
		
		this.abstractCPRF = abstractCPRF;
	}

	@Override
	public void setContasBancarias(Collection<ContaBancaria> contasBancarias) {
		
		this.contasBancarias = contasBancarias;
	}

	@Override
	public void setEmails(Collection<Email> emails) {
		
		this.emails = emails;
	}
	
	@Override
	public void setEnderecos(Collection<Endereco> enderecos) {
		
		this.enderecos = enderecos;
	}

	@Override
	public void setNome(String nome) {
	
		this.nome = nome;
	}

	@Override
	public void setTelefones(Collection<Telefone> telefones) {
		
		this.telefones = telefones;
	}

	@Override
	public boolean isFisica() {
		
		return (this instanceof PessoaFisica);
	}

	@Override
	public boolean isJuridica() {
		
		return (this instanceof PessoaJuridica);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
