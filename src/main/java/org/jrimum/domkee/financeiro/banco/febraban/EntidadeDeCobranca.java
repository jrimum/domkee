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
 * Created at: Jan 28, 2010 - 1:29:53 PM
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
 * Criado em: Jan 28, 2010 - 1:29:53 PM
 * 
 */
package org.jrimum.domkee.financeiro.banco.febraban;

import java.util.Collection;

import org.jrimum.domkee.comum.pessoa.contato.NumeroDeTelefone;
import org.jrimum.domkee.comum.pessoa.endereco.Endereco;
import org.jrimum.domkee.comum.pessoa.id.cprf.CPRF;
import org.jrimum.domkee.financeiro.banco.Pessoa;


/**
 * Supertipo para as entidades de cobrança (Sacado, Cedente, SacadorAvalista). Encapsula
 * a composição com o objeto Pessoa deixando apenas as particularidades de cada entidade nos subtipos.
 * 
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 *
 * @since 0.2
 * 
 * @version 0.2
 */
public class EntidadeDeCobranca{

	/**
	 * Utilizado como composição
	 */
	private Pessoa pessoa;
	
	public EntidadeDeCobranca(String nome) {
		pessoa = new Pessoa(nome);
	}
	
	public EntidadeDeCobranca(String nome, String cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}
	
	public EntidadeDeCobranca(String nome, CPRF cadastroDePessoa) {
		pessoa = new Pessoa(nome, cadastroDePessoa);
	}
	
	/**
	 * Nome do sacado
	 * @return
	 */
	public String getNome() {
		return pessoa.getNome();
	}
	
	public void setNome(String nome) {
		pessoa.setNome(nome);
	}
	
	/**
	 * @see CPRF
	 */
	public CPRF getCPRF() {
		return pessoa.getCPRF();
	}
	
	/**
	 * @see CPRF
	 */
	public void setCPRF(CPRF cprf) {
		pessoa.setCPRF(cprf);
	}
	
	/**
	 * @see ContaBancaria
	 */
	public void addContaBancaria(ContaBancaria contaBancaria) {
		pessoa.addContaBancaria(contaBancaria);
	}
	
	/** 
	 * Verifica se esta pessoa tem alguma conta bancária.
	 * 
	 * @see ContaBancaria
	 */
	public boolean hasContaBancaria(){
		return pessoa.hasContaBancaria();
	}
	
	/**
	 * Retorna o resultado de uma chamada a {@code iterator.next()} de
	 * {@linkplain #getContasBancarias()}, caso exista alguma conta, ou null, caso
	 * não exista {@linkplain #contasBancarias}.
	 * 
	 * @return Chamada a {@code iterator.next()}, caso exista algum endereço ou
	 *         null.
	 */
	public ContaBancaria getNextContaBancaria(){
		
		return pessoa.getNextContaBancaria();
	}
	
	/**
	 * @see ContaBancaria
	 * @see Collection
	 */
	public Collection<ContaBancaria> getContasBancarias() {
		return pessoa.getContasBancarias();
	}
	
	/**
	 * @see ContaBancaria
	 * @see Collection
	 */
	public void setContasBancarias(Collection<ContaBancaria> contasBancarias) {
		pessoa.setContasBancarias(contasBancarias);
	}
	
	/**
	 * @see Endereco
	 */
	public void addEndereco(Endereco endereco) {
		pessoa.addEndereco(endereco);
	}
	
	/**
	 * Retorna o resultado de uma chamada a {@code iterator.next()} de
	 * {@linkplain #getEnderecos()}, caso exista algum endereço, ou null, caso
	 * não exista {@linkplain #enderecos}.
	 * 
	 * @return Chamada a {@code iterator.next()}, caso exista algum endereço ou
	 *         null.
	 */
	public Endereco getNextEndereco(){
		
		return pessoa.getNextEndereco(); 
	}
	
	/**
	 * @see Endereco
	 * @see Collection
	 */
	public Collection<Endereco> getEnderecos() {
		return pessoa.getEnderecos();
	}
	
	/**
	 * @see Endereco
	 * @see Collection
	 */
	public void setEnderecos(Collection<Endereco> enderecos) {
		pessoa.setEnderecos(enderecos);
	}

	/**
	 * @see NumeroDeTelefone
	 */
	public void addTelefone(NumeroDeTelefone telefone) {
		pessoa.addTelefone(telefone);
	}

	/**
	 * Retorna o resultado de uma chamada a {@code iterator.next()} de
	 * {@linkplain #getTelefones()}, caso exista algum telefone, ou null, caso
	 * não exista {@linkplain #telefones}.
	 * 
	 * @return Chamada a {@code iterator.next()}, caso exista algum endereço ou
	 *         null.
	 */
	public NumeroDeTelefone getNextTelefone(){
		
		return pessoa.getNextTelefone(); 
	}
	
	/**
	 * @see NumeroDeTelefone
	 * @see Collection
	 */
	public Collection<NumeroDeTelefone> getTelefones() {
		return pessoa.getTelefones();
	}

	/**
	 * @see NumeroDeTelefone
	 * @see Collection
	 */
	public void setTelefones(Collection<NumeroDeTelefone> telefones) {
		pessoa.setTelefones(telefones);
	}

}
