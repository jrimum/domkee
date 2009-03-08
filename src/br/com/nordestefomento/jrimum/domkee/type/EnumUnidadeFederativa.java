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
 * Created at: 30/03/2008 - 19:09:23
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
 * Criado em: 30/03/2008 - 19:09:23
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.ACurbitaObject;
import br.com.nordestefomento.jrimum.domkee.itype.ImmutableUnidadeFederativa;

/**
 * <p>
 * Enumera as unidades federativas do Brasil.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * @author Samuel
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public enum EnumUnidadeFederativa implements ImmutableUnidadeFederativa {

	AM("Amazonas","AM",new Localidade("Manaus")),
	PA("Pará","PA",new Localidade("Belém")),
	MT("Mato Grosso","MT",new Localidade("Cuiabá")),
	MG("Minas Gerais","MG",new Localidade("Belo Horizonte")),
	BA("Bahia","BA",new Localidade("Salvador")),
	MS("Mato Grosso do Sul","MS",new Localidade("Campo Grande")),
	GO("Goiás","GO",new Localidade("Goiânia")),
	MA("Maranhão","MA",new Localidade("São Luís")),
	RS("Rio Grande do Sul","RS",new Localidade("Porto Alegre")),
	TO("Tocantins","TO",new Localidade("Palmas")),
	PI("Piauí","PI",new Localidade("Teresina")),
	SP("São Paulo","SP",new Localidade("São Paulo")),
	RO("Rondônia","RO",new Localidade("Porto Velho")),
	RR("Roraima","RR",new Localidade("Boa Vista")),
	PR("Paraná","PR",new Localidade("Curitiba")),
	AC("Acre","AC",new Localidade("Rio Branco")),
	CE("Ceará","CE",new Localidade("Fortaleza")),
	AP("Amapá","AP",new Localidade("Macapá")),
	PE("Pernambuco","PE",new Localidade("Recife")),
	SC("Santa Catarina","SC",new Localidade("Florianópolis")),
	PB("Paraíba","PB",new Localidade("João Pessoa")),
	RN("Rio Grande do Norte","RN",new Localidade("Natal")),
	ES("Espírito Santo","ES",new Localidade("Vitória")),
	RJ("Riode Janeiro","RJ",new Localidade("Rio de Janeiro")),
	AL("Alagoas","AL",new Localidade("Maceió")),
	SE("Sergipe","SE",new Localidade("Aracaju")),
	DF("Distrito Federal","DF",new Localidade("Brasília")),
	
	DESCONHECIDO("","",new Localidade(""));
	
	private String nome;
	
	private String sigla;
	
	private Localidade capital;
	
	EnumUnidadeFederativa(String nome,String sigla,Localidade capital){
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @return the capital
	 */
	public Localidade getCapital() {
		return capital;
	}
	
	/**
	 * @see br.com.nordestefomento.jrimum.ACurbitaObject#toString()
	 * @see java.lang.Enum#toString()
	 */
	public String toString(){
		return ACurbitaObject.toString(this);
	}
}
