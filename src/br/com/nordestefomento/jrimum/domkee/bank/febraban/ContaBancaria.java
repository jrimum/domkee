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
 * Created at: 30/03/2008 - 18:57:59
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
 * Criado em: 30/03/2008 - 18:57:59
 * 
 */

package br.com.nordestefomento.jrimum.domkee.bank.febraban;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.entity.Pessoa;
import br.com.nordestefomento.jrimum.domkee.ientity.IBanco;
import br.com.nordestefomento.jrimum.utilix.ObjectUtil;

// TODO Verificar a necessidade de se criar uma família de classes de
// ContaBancaria, uma para cada banco, e seus respectivos autenticadores.

/**
 * 
 * <p>
 * É um vínculo entre uma Pessoa e um Banco que agrega a agência, o número da conta
 * ou o código do cedente e a carteira.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 * 
 * @see br.com.nordestefomento.jrimum.domkee.ientity.IPessoa
 * @see IBanco
 */
public class ContaBancaria {

	private static final long serialVersionUID = 3409504109013559999L;

	/**
	 * @see IBanco
	 */
	private IBanco banco;

	/**
	 * @see Agencia
	 */
	private Agencia agencia;
	
	/**
	 * @see NumeroDaConta
	 */
	private NumeroDaConta numeroDaConta;
	
	/**
	 * @see Carteira
	 */
	private Carteira carteira;

	/**
	 * @see Pessoa
	 */
	private Collection<Pessoa> titulares;
	
	/**
	 * @see Titulo
	 */
	private Collection<Titulo> titulos;
	
	/**
	 * @see Modalidade
	 */
	private Modalidade modalidade;
	
	
	public ContaBancaria() {}
	
	public ContaBancaria(IBanco banco) {
		
		this.banco = banco;
	}
	
	/**
	 * @see Carteira
	 */
	public Carteira getCarteira() {
		return carteira;
	}

	/**
	 * @see Carteira
	 */
	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}

	/**
	 * @see IBanco
	 */
	public IBanco getBanco() {
		return banco;
	}
	
	/**
	 * @see IBanco
	 */
	public void setBanco(IBanco banco) {
		this.banco = banco;
	}

	/**
	 * @see Pessoa
	 * @see Collection
	 */
	public Collection<Pessoa> getTitulares() {
		return titulares;
	}

	/**
	 * @see Pessoa
	 * @see Collection
	 */
	public void setTitulares(Collection<Pessoa> titulares) {
		this.titulares = titulares;
	}
	
	/**
	 * @see Titulo
	 * @see Collection
	 */
	public Collection<Titulo> getTitulos() {
		return titulos;
	}

	/**
	 * @see Titulo
	 * @see Collection
	 */
	public void setTitulos(Collection<Titulo> titulos) {
		this.titulos = titulos;
	}

	/**
	 * @see Agencia
	 */
	public Agencia getAgencia() {
		return agencia;
	}

	/**
	 * @see Agencia
	 */
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	/**
	 * @see NumeroDaConta
	 */
	public NumeroDaConta getNumeroDaConta() {
		return numeroDaConta;
	}

	/**
	 * @see NumeroDaConta
	 */
	public void setNumeroDaConta(NumeroDaConta numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	@Override
	public String toString() {
		return ObjectUtil.toString(this);
	}
}
