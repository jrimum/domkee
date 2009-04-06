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
 * Created at: 30/03/2008 - 18:58:20
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
 * Criado em: 30/03/2008 - 18:58:20
 * 
 */


package br.com.nordestefomento.jrimum.domkee.entity;

import java.util.ArrayList;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ientity.IPessoaFisica;
import br.com.nordestefomento.jrimum.domkee.type.Genero;
import br.com.nordestefomento.jrimum.domkee.type.RG;

/**
 * <p>
 *  Representação básica de uma Pessoa Física.
 * </p>
 * 
 * @see Pessoa
 * @see br.com.nordestefomento.jrimum.domkee.type.CPRF
 * @see br.com.nordestefomento.jrimum.domkee.type.CPF
 * 
 * @author <a href="http://gilmatryx.googlepages.com">Gilmar P.S.L.</a>
 * @author Misael
 * @author Romulo
 * 
 * @since 0.2
 * 
 * @version 0.2
 */

public class PessoaFisica extends Pessoa implements IPessoaFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5722593135877031688L;
	
	private PessoaFisica conjuge;
	
	private Genero genero;
	
	private String estadoCivil;
	
	private Collection<RG> rgs;
	
	public PessoaFisica() {}

	
	public void addRG(RG rg) {
		
		if(isNull(rgs))
			rgs = new ArrayList<RG>();
		
		rgs.add(rg);
	}
	
	
	public PessoaFisica getConjuge() {
		
		return conjuge;
	}

	
	public String getEstadoCivil() {
		
		return estadoCivil;
	}

	
	public Collection<RG> getRgs() {
		
		return rgs;
	}

	
	public Genero getGenero() {
		
		return genero;
	}

	
	public void setConjuge(PessoaFisica conjuge) {
		
		this.conjuge = conjuge;
		
		if(isNotNull(conjuge) && isNull(conjuge.getConjuge()))
			conjuge.setConjuge(this);
	}

	
	public void setEstadoCivil(String estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}

	
	public void setRgs(Collection<RG> rgs) {
		
		this.rgs = rgs;
	}

	
	public void setGenero(Genero sexo) {
		
		this.genero = sexo;
	}

}
