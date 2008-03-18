/*
 * Copyright 2007, JMatryx Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright 2007, Grupo JMatryx
 * 
 * Licenciado sob a licença da Apache, versão 2.0 (a “licença”); você não pode
 * usar este arquivo exceto na conformidade com a licença. Você pode obter uma
 * cópia da licença em
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * A menos que seja requerido pela aplicação da lei ou esteja de acordo com a
 * escrita, o software distribuído sob esta licença é distribuído “COMO É”
 * BASE,SEM AS GARANTIAS OU às CONDIÇÕES DO TIPO, expresso ou implicado. Veja a
 * licença para as permissões sobre a línguagem específica e limitações quando
 * sob licença.
 * 
 * 
 * Created at / Criado em : 17/03/2007 - 17:39:32
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.ICurbitaObject;

/**
 * 
 * @author Gabriel Guimarães
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * 
 * @since JMatryx 1.0
 * 
 * @version 1.0
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
	
}
