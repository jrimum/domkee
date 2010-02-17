/*
 * Copyright 2010 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 14/02/2010 - 18:00:18
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
 * Criado em: 14/02/2010 - 18:00:18
 * 
 */

package br.com.nordestefomento.jrimum.domkee.financeiro.banco;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.nordestefomento.jrimum.utilix.ObjectUtil;

/**
 * <p>
 * Mapa de parâmetros com dados bancário para condições específicas de
 * determinados bancos ou implementações. <strong>PARÂMETROS NULOS NÃO SÃO
 * PERMITIDOS.</strong>
 * </p>
 * 
 * <p>
 * Mais dados bancários podem ser necessários a um título para gerar um boleto,
 * por exemplo. Assim, dependendo do banco, talvez seja necessário informar mais
 * dados além de:
 * </p>
 * 
 * <ul>
 * <li>Valor do título;</li>
 * <li>Vencimento;</li>
 * <li>Nosso número;</li>
 * <li>Código do banco;</li>
 * <li>Data de vencimento;</li>
 * <li>Agência/Código do cedente</li>;
 * <li>Código da carteira;</li>
 * <li>Código da moeda;</li>
 * </ul>
 * 
 * <p>
 * Definidos como padrão pela FEBRABAN.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @version 0.2
 * @since 0.2
 */
public final class ParametrosBancariosMap {

	private Map<String, Object> dadosMap;

	/**
	 * <p>
	 * Instancia um mapa sem parâmetros.
	 * </p>
	 * 
	 * @since 0.2
	 */
	public ParametrosBancariosMap() {
		getInstance();
	}

	/**
	 * <p>
	 * Instancia o mapa com um mapeamento já especificado. Nomes e valores nulos
	 * não são permitidos, o nome deve ser único.
	 * </p>
	 * 
	 * @param nome
	 *            do parâmetro a ser associado
	 * @param valor
	 *            do parâmetro a ser associado
	 * 
	 * @throws NullPointerException
	 *             se nome ou valor == NULL
	 * 
	 * @since 0.2
	 */
	public ParametrosBancariosMap(String nome, Object valor) {

		adicione(nome, valor);
	}

	/**
	 * <p>
	 * Indica se o mapa contém um mapeamento para o nome de parâmetros
	 * especificado.
	 * </p>
	 * 
	 * @param nome
	 *            do parâmetro cuja existência no mapa será testada.
	 * 
	 * @return true se o mapa contém um mapeamento para parâmetro
	 * 
	 * @throws NullPointerException
	 *             se nome == NULL
	 * 
	 * @since 0.2
	 */

	public boolean contemComNome(String nome) {

		ObjectUtil.checkNotNull(nome);

		return dadosMap.containsKey(nome);
	}

	/**
	 * <p>
	 * Indica se o mapa contém uma ou mais associações de parâmetros ao valor
	 * especificado
	 * </p>
	 * 
	 * @param valor
	 *            cuja existência no mapa será testada
	 * 
	 * @return true se o mapa contém uma ou mais associações de parâmetros ao
	 *         valor especificado
	 * 
	 * @throws NullPointerException
	 *             se valor == NULL
	 * 
	 * @since 0.2
	 */

	public boolean contemComValor(Object valor) {

		ObjectUtil.checkNotNull(valor);

		return dadosMap.containsValue(valor);
	}

	/**
	 * <p>
	 * Retorna o valor para o qual o parâmetro bancário especificada está
	 * mapeado, ou nulo, se este mapa contém não contém nenhum mapeamento para
	 * tal parâmetro. Nomes nulos não são permitidos.
	 * </p>
	 * 
	 * @param <V>
	 *            Tipo de retorno genérico do valor contido no mapa com nome
	 *            especificado
	 * @param nome
	 *            do parâmetro especificado
	 * @return o valor associado com o parâmetro bancário especificado, ou nulo
	 *         se não houver nenhum mapeamento para o mesmo
	 * 
	 * @throws NullPointerException
	 *             se nome == NULL
	 * 
	 * @since 0.2
	 */

	@SuppressWarnings("unchecked")
	public <V> V getValor(String nome) {

		ObjectUtil.checkNotNull(nome);

		return (V) dadosMap.get(nome);
	}

	/**
	 * <p>
	 * Indica se o mapa não contém associações (parâmetro,valor)
	 * </p>
	 * 
	 * @return true se vazio
	 * 
	 * @since 0.2
	 */

	public boolean isVazio() {

		return dadosMap.isEmpty();
	}

	/**
	 * <p>
	 * Indica se o mapa contém alguma associação (parâmetro,valor)
	 * </p>
	 * 
	 * @return !isVazio()
	 * 
	 * @since 0.2
	 */

	public boolean isNaoVazio() {

		return !isVazio();
	}

	/**
	 * <p>
	 * Retorna um conjuto de nomes de parâmetro do mapa.
	 * </p>
	 * 
	 * @return conjuto de nomes de parâmetro do mapa.
	 * 
	 * @since 0.2
	 */

	public Set<String> nomes() {

		return dadosMap.keySet();
	}

	/**
	 * <p>
	 * Retorna uma coleção com os valores contidos no mapa.
	 * </p>
	 * 
	 * @return coleção de valores do mapa.
	 * 
	 * @since 0.2
	 */

	public Collection<?> valores() {

		return dadosMap.values();
	}

	/**
	 * <p>
	 * Retorna um conjuto de entradas (parâmetro,valor) do mapa. Assim qualquer
	 * modificação nestes valores também reflete no mapa de parâmetros
	 * bancários.
	 * </p>
	 * 
	 * @return conjunto dos mapeamentos contidos.
	 * 
	 * @since 0.2
	 */

	public Set<java.util.Map.Entry<String, Object>> entradas() {

		return dadosMap.entrySet();
	}

	/**
	 * <p>
	 * Associa o valor especificado a um nome de parâmetro também especificado
	 * que deve ser único neste mapa. Nomes e valores nulos não são permitidos.
	 * </p>
	 * 
	 * @param nome
	 *            do parâmetro a ser associado
	 * @param valor
	 *            do parâmetro a ser associado
	 * @return referência a este mapa
	 * 
	 * @throws NullPointerException
	 *             se nome ou valor == NULL
	 * 
	 * @since 0.2
	 */

	public ParametrosBancariosMap adicione(String nome, Object valor) {

		ObjectUtil.checkNotNull(nome);
		ObjectUtil.checkNotNull(valor);

		getInstance();

		dadosMap.put(nome, valor);

		return this;
	}

	/**
	 * <p>
	 * Adiciona todos os bancários de um outro mapeamento neste mapeamento.
	 * Parâmetros nulos não são permitidos.
	 * </p>
	 * 
	 * <p>
	 * O efeito desta chamada é equivalente a de adiciona("parametro", Valor)
	 * neste mapa, só que uma vez para cada mapeamento.
	 * </p>
	 * 
	 * @param dados
	 *            - outros parâmetros bancários a serem mapeados neste mapa.
	 * @return referência a este mapa
	 * 
	 * @throws NullPointerException
	 *             se dados == NULL
	 * 
	 * @since 0.2
	 */

	public ParametrosBancariosMap adicione(ParametrosBancariosMap dados) {

		ObjectUtil.checkNotNull(dados);

		this.dadosMap.putAll(dados.dadosMap);

		return this;
	}

	/**
	 * <p>
	 * Retorna o valor para o qual este mapeamento anteriormente estava
	 * associado ao nome do parâmetro bancário, ou nulo se o mapa não continha
	 * nenhum mapeamento. Nomes nulos não são permitidos.
	 * </p>
	 * 
	 * <p>
	 * Um retorno nulo indica necessariamente que não existia nenhum mapeamento
	 * para o nome do parâmetro bancário.
	 * </p>
	 * 
	 * @param <V>
	 *            Tipo de retorno genérico do valor
	 * @param nome
	 *            do parâmetro bancário que deve ser removido do mapa
	 * @return o valor anterior associado com o parâmetro bancário, ou nulo se
	 *         não houver nenhum mapeamento para o mesmo
	 * 
	 * @throws NullPointerException
	 *             se nome == NULL
	 * 
	 * @since 0.2
	 */

	@SuppressWarnings("unchecked")
	public <V> V remova(String nome) {

		ObjectUtil.checkNotNull(nome);

		return (V) dadosMap.remove(nome);
	}

	/**
	 * <p>
	 * Remove todos os os parâmetros desta instância.
	 * </p>
	 * 
	 * 
	 * @since 0.2
	 */

	public void limpe() {

		dadosMap.clear();
	}

	/**
	 * <p>
	 * Retorna o número de parâmetros contidos na instância.
	 * </p>
	 * 
	 * @return
	 * 
	 * @since 0.2
	 */

	public int quantidade() {

		return dadosMap.size();
	}

	/**
	 * <p>
	 * Instancia um HashMap<String,Object> para uso da deste map bancário.
	 * </p>
	 * 
	 * 
	 * @since 0.2
	 */

	private void getInstance() {

		if (dadosMap == null) {
			dadosMap = new HashMap<String, Object>();
		}
	}

}