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
import br.com.nordestefomento.jrimum.ICurbitaObject;

/**
 * Enumera as unidades federativas do Brasil.
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
public enum EnumUnidadeFederativa implements ICurbitaObject {

	AM ("Amazonas","AM","Manaus"),
	PA("Pará","PA","Belém"),
	MT("Mato Grosso","MT","Cuiabá"),
	MG("Minas Gerais","MG","Belo Horizonte"),
	BA("Bahia","BA","Salvador"),
	MS("Mato Grosso do Sul","MS","Campo Grande"),
	GO("Goiás","GO","Goiânia"),
	MA("Maranhão","MA","São Luís"),
	RS("Rio Grande do Sul","RS","Porto Alegre"),
	TO("Tocantins","TO","Palmas"),
	PI("Piauí","PI","Teresina"),
	SP("São Paulo","SP","São Paulo"),
	RO("Rondônia","RO","Porto Velho"),
	RR("Roraima","RR","Boa Vista"),
	PR("Paraná","PR","Curitiba"),
	AC("Acre","AC","Rio Branco"),
	CE("Ceará","CE","Fortaleza"),
	AP("Amapá","AP","Macapá"),
	PE("Pernambuco","PE","Recife"),
	SC("Santa Catarina","SC","Florianópolis"),
	PB("Paraíba","PB","João Pessoa"),
	RN("Rio Grande do Norte","RN","Natal"),
	ES("Espírito Santo","ES","Vitória"),
	RJ("Riode Janeiro","RJ","Rio de Janeiro"),
	AL("Alagoas","AL","Maceió"),
	SE("Sergipe","SE","Aracaju"),
	DF("Distrito Federal","DF","Brasília"),
	
	DESCONHECIDO("","","");
	
	private String nome;
	
	private String sigla;
	
	private String capital;
	
	EnumUnidadeFederativa(String nome,String sigla,String capital){
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
	public String getCapital() {
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
