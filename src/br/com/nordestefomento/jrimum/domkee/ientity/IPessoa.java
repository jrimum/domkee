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
 * Created at: 30/03/2008 - 18:59:24
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
 * Criado em: 30/03/2008 - 18:59:24
 * 
 */


package br.com.nordestefomento.jrimum.domkee.ientity;

import java.io.Serializable;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.entity.ContaBancaria;
import br.com.nordestefomento.jrimum.domkee.type.AbstractCPRF;
import br.com.nordestefomento.jrimum.domkee.type.Email;
import br.com.nordestefomento.jrimum.domkee.type.Endereco;
import br.com.nordestefomento.jrimum.domkee.type.Telefone;

/**
 * 
 * @author <a href="http://gilmatryx.googlepages.com">Gilmar P.S.L.</a>
 * @author Misael
 * @author Romulo
 * 
 * @see br.com.nordestefomento.jrimum.domkee.entity.Pessoa
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public interface IPessoa extends Serializable {

	public String getNome();

	public void setNome(String nome);

	public AbstractCPRF getAbstractCPRF();

	public void setAbstractCPRF(AbstractCPRF abstractCPRF);

	public Collection<Telefone> getTelefones();

	public void setTelefones(Collection<Telefone> telefones);

	public void addTelefone(Telefone telefone);

	public Collection<Email> getEmails();

	public void setEmails(Collection<Email> emails);

	public void addEmail(Email email);

	public Collection<Endereco> getEnderecos();

	public void setEnderecos(Collection<Endereco> enderecos);

	public void addEndereco(Endereco endereco);

	public Collection<ContaBancaria> getContasBancarias();

	public void setContasBancarias(Collection<ContaBancaria> contasBancarias);

	public void addContaBancaria(ContaBancaria contaBancaria);

	public boolean isFisica();

	public boolean isJuridica();
	
	public boolean hasContaBancaria();
}
