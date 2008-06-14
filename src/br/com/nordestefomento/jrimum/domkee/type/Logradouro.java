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
 * Created at: 30/03/2008 - 19:09:47
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
 * Criado em: 30/03/2008 - 19:09:47
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;


/**
 * 
 * <p>
 * Pode representar:
 * <ul>
 * <li>Avenida</li>
 * <li>Rua</li>
 * <li>Alameda</li>
 * <li>Dentro outros, para a listagem completa consulte os Correios</li>
 * </ul>
 * </p>
 * 
 * <p>
 * EXEMPLO:
 * <ul>
 * <li>Avenida Prudente de Morais</li>
 * <li>Rua Apodi</li>
 * </ul>
 * </p> 
 * 
 * @author Romulo
 * @author Gilmar
 * @author Misael
 * @author Samuel
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class Logradouro{

	/**
	 * 
	 */
	private static final long serialVersionUID = -113374684167319855L;

	private String nome;

	/**
	 * 
	 */
	public Logradouro() {}

	/**
	 * @param nome
	 */
	public Logradouro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
