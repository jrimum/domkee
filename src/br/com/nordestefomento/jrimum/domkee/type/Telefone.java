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
 * Created at: 30/03/2008 - 19:10:26
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
 * Criado em: 30/03/2008 - 19:10:26
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ATagable;
import br.com.nordestefomento.jrimum.domkee.entity.Pessoa;
import br.com.nordestefomento.jrimum.utilix.ITextStream;

/**
 * @author Romulo
 */
public class Telefone extends ATagable<TryxTag> implements ITextStream {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8948441953189653213L;

	private Long id;

	private Integer ddi;

	private Integer ddd;

	private Integer prefixo;

	private Integer sufixo;
	
	private String telefone;
	
	private Pessoa pessoa;
	
	private Collection<TryxTag> tagSub;

	public Telefone() {}
	
	public Telefone(String telefone) {
		
		read(telefone);
	}
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDdi() {
		return ddi;
	}

	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(Integer prefixo) {
		this.prefixo = prefixo;
	}

	public Integer getSufixo() {
		return sufixo;
	}

	public void setSufixo(Integer sufixo) {
		this.sufixo = sufixo;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public void read(String str) {
		// TODO Auto-generated method stub
		setTelefone(str);
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
