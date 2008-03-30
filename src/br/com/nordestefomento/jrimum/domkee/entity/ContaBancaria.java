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


package br.com.nordestefomento.jrimum.domkee.entity;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ientity.IBanco;


// TODO Verificar a necessidade de se criar uma família de classes de
// ContaBancaria, uma para cada banco, e seus respectivos autenticadores.

/**
 * Entidade responsável pelo armazenamento de informações relacionadas à uma conta bancária. Esta classe fornece serviços para obtenção de dados de uma conta de forma diferenciada.
 * @author   Gabriel Guimarães
 * @author   <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author   Misael Barreto 
 * @author   Rômulo Augusto
 * @author   <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * @since   JMatryx 1.0
 * @version   1.0
 */
public class ContaBancaria {

	private static final long serialVersionUID = 3409504109013559999L;

	private IBanco banco;

	private Agencia agencia;
	
	private NumeroDaConta numeroDaConta;
	
	private Integer codigoDaCarteira  = 0;

	private Collection<Pessoa> titulares;
	
	public ContaBancaria() {}
	
	public ContaBancaria(IBanco banco) {
		
		this.banco = banco;
	}

	public Integer getCodigoDaCarteira() {
		return codigoDaCarteira;
	}

	public void setCodigoDaCarteira(Integer codigoDaCarteira) {
		this.codigoDaCarteira = codigoDaCarteira;
	}

	public IBanco getBanco() {
		return banco;
	}

	public void setBanco(IBanco banco) {
		this.banco = banco;
	}

	public Collection<Pessoa> getTitulares() {
		return titulares;
	}

	public void setTitulares(Collection<Pessoa> titulares) {
		this.titulares = titulares;
	}
	
	public void addTitular(Pessoa titular) {

	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public NumeroDaConta getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(NumeroDaConta numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
}
