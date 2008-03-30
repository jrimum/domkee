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
 * Created at: 30/03/2008 - 19:07:43
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
 * Criado em: 30/03/2008 - 19:07:43
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;

import java.util.ArrayList;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ATagable;
import br.com.nordestefomento.jrimum.domkee.entity.Pessoa;

/**
 * Entidade que encapsula dados do endereço de uma pessoa,  como também facilidades na manipulação dos seus atributos.
 * @author   Gabriel Guimarães
 * @author   <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author   Misael Barreto 
 * @author   Rômulo Augusto
 * @author   <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * @since   JMatryx 1.0
 * @version   1.0
 */
public class Endereco extends ATagable<TryxTag> {

	private static final long serialVersionUID = -2971929602328106185L;
	
	private Long id;
	
	private Logradouro logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private Localidade localidade;
	
	private CEP cep;
	
	private EnumUnidadeFederativa uf;
	
	private Pais pais;
	
	private Collection<Pessoa> pessoas;
	
	private Collection<TryxTag> tagSub;
	
	public Endereco() {}
	
	private void preEventGambi() {
		
		tagSub = super.tag;
	}
	
	@Override
	public void setTags(Collection<TryxTag> tags) {
		
		super.setTags(tags);
	}
	
	@Override
	public Collection<TryxTag> getTags() {

		return super.getTags();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the localidade
	 */
	public Localidade getLocalidade() {
		return localidade;
	}

	/**
	 * @param localidade the localidade to set
	 */
	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public EnumUnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(EnumUnidadeFederativa uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public CEP getCep() {
		return cep;
	}

	public void setCep(CEP cep) {
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Collection<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Collection<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void addPessoa(Pessoa pessoa) {
		
		if(pessoas == null)
			pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa);
	}

	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
