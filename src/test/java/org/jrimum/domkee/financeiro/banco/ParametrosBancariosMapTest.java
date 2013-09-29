/*
 * Copyright 2013 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 26/09/2013 - 19:06:06
 * 
 * ================================================================================
 * 
 * Direitos autorais 2013 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 26/09/2013 - 19:06:06
 * 
 */


package org.jrimum.domkee.financeiro.banco;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class ParametrosBancariosMapTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private int V1 = 1;
	private Integer V2 = 1;
	private Double V3 = 3d;
	private BigDecimal V4 = BigDecimal.ONE;

	@Test
	public void deve_estar_vazio_na_instanciacao_sem_parametros(){
		ParametrosBancariosMap parametrosBancariosMap = new ParametrosBancariosMap();
		
		assertTrue(parametrosBancariosMap.isVazio());
		assertFalse(parametrosBancariosMap.isNaoVazio());
	}

	@Test
	public void deve_conter_um_parametro_na_instanciacao_com_parametros(){
		ParametrosBancariosMap parametrosBancariosMap = new ParametrosBancariosMap(ParamBancTest.P1,V1);
	
		Set<ParametroBancario<?>> nomes = parametrosBancariosMap.nomes();
		
		assertEquals(ParamBancTest.P1, nomes.iterator().next());
		assertEquals(V1, parametrosBancariosMap.getValor(ParamBancTest.P1));
		assertFalse(parametrosBancariosMap.isVazio());
		assertTrue(parametrosBancariosMap.isNaoVazio());
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excessao_caso_o_nome_do_parametro_seja_nulo(){
		new ParametrosBancariosMap(null,V1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excessao_caso_o_valor_do_parametro_seja_nulo(){
		new ParametrosBancariosMap(ParamBancTest.P1,null);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excessao_caso_os_parametros_sejam_nulos(){
		new ParametrosBancariosMap(null,null);
	}

	@Test
	public void deve_indicar_que_nao_tem_elementos_quando_o_map_passado_eh_nulo(){
		ParametrosBancariosMap map = null;
		
		assertFalse(ParametrosBancariosMap.hasElement(map));
	}

	@Test
	public void deve_indicar_que_nao_tem_elementos_quando_o_map_passado_eh_vazio(){
		ParametrosBancariosMap map = new ParametrosBancariosMap();
		
		assertFalse(ParametrosBancariosMap.hasElement(map));
	}

	@Test
	public void deve_indicar_que_tem_elementos_quando_o_map_passado_tem__apenas_um_elemento(){
		ParametrosBancariosMap map = new ParametrosBancariosMap(ParamBancTest.P1,V1);
		
		assertTrue(ParametrosBancariosMap.hasElement(map));
	}

	@Test
	public void deve_indicar_que_tem_elementos_quando_o_map_passado_tem_mais_de_um_elementos(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		
		assertTrue(ParametrosBancariosMap.hasElement(map));
	}
	
	@Test
	public void deve_indicar_que_contem_um_parametro_que_estah_no_mapa(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
	
		assertTrue(map.contemComNome(ParamBancTest.P1));
	}

	@Test
	public void deve_indicar_que__nao_contem_um_parametro_que_nao_estah_no_mapa(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		
		assertFalse(map.contemComNome(ParamBancTest.P3));
	}

	@Test
	public void deve_indicar_que_contem_um_valor_que_estah_no_mapa(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		
		assertTrue(map.contemComValor(V1));
	}
	
	@Test
	public void deve_indicar_que__nao_contem_um_valor_que_nao_estah_no_mapa(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		
		assertFalse(map.contemComValor(V3));
	}

	@Test
	public void deve_retornar_um_valor_que_esteja_no_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2)
		.adicione(ParamBancTest.P3,V3);
		
		assertEquals(V2, map.getValor(ParamBancTest.P2));
	}

	@Test
	public void deve_retornar_null_quando_o_valor_nao_existe_no_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P3,V3);

		assertNull(map.getValor(ParamBancTest.P2));
	}

	public void deve_lancar_excecao_quando_o_nome_passado_eh_nulo(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P3,V3);
		
		thrown.expect(IllegalArgumentException.class);
		map.getValor(null);
	}
	
	@Test
	public void deve_indicar_que_eh_vazio_quando_nao_existem_parametros_no_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap();
		
		assertTrue(map.isVazio());
	}

	@Test
	public void deve_indicar_que_nao_eh_vazio_quando_existem_parametros_no_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap(ParamBancTest.P1,V1);
		
		assertFalse(map.isVazio());
	}

	@Test
	public void deve_indicar_o_oposto_que_eh_vazio_quando_nao_existem_parametros_no_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap();
		
		assertFalse(map.isNaoVazio());
	}
	
	@Test
	public void deve_indicar_o_oposto_que_nao_eh_vazio_quando_existem_parametros_no_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap(ParamBancTest.P1,V1);
		
		assertTrue(map.isNaoVazio());
	}
	
	@Test
	public void deve_retornar_os_nomes_contidos_no_map(){
		Set<ParamBancTest> nomesEsperados = Sets.newHashSet(ParamBancTest.P1,ParamBancTest.P2,ParamBancTest.P3);
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V1)
		.adicione(ParamBancTest.P3,V3);
		
		Set<ParametroBancario<?>> nomes = map.nomes();
		
		assertThat(nomes.size(), is(equalTo(nomesEsperados.size())));
		assertEquals(nomesEsperados, nomes);
	}
 
	@Test
	public void deve_retornar_os_valores_contidos_no_map(){
		@SuppressWarnings("unchecked")
		Collection<?> valoresEsperados = Lists.newArrayList(V3,V1,V4,V2);
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2)
		.adicione(ParamBancTest.P3,V3)
		.adicione(ParamBancTest.P4,V4);
		
		Collection<?> valores = map.valores();
		
		assertThat(valores.size(), is(equalTo(valoresEsperados.size())));
		assertThat(valores.toArray(), arrayContainingInAnyOrder(valoresEsperados.toArray()));
	}

	@Test
	public void deve_retornar_o_conjunto_de_entradas_do_map(){
		ParametrosBancariosMap map = new ParametrosBancariosMap(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		Map<ParametroBancario<?>,Number> mapEsperado = Maps.newHashMap();
		mapEsperado.put(ParamBancTest.P1,V1);
		mapEsperado.put(ParamBancTest.P2,V2);
		Set<Entry<ParametroBancario<?>,Number>> entradasEsperadas = mapEsperado.entrySet();
		
		Set<Entry<ParametroBancario<?>,Number>> entradas = map.entradas();
		
		assertThat(entradas, is(equalTo(entradasEsperadas)));
	}

	@Test
	public void deve_adicionar_um_parametro_e_um_valor_corretamente(){
		ParametrosBancariosMap map = new ParametrosBancariosMap();
		
		map = map.adicione(ParamBancTest.P1,V1);
		
		assertThat(map.getValor(ParamBancTest.P1), is(equalTo((Number)V1)));
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excessao_ao_adicionar_nome_nulo(){
		new ParametrosBancariosMap().adicione(null,V1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excessao_ao_adicionar_valor_nulo(){
		new ParametrosBancariosMap().adicione(ParamBancTest.P1,null);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excessao_ao_adicionar_nome_e_valor_nulos(){
		new ParametrosBancariosMap().adicione(null,null);
	}
	
	@Test
	public void deve_adicionar_todos_os_parametros_de_um_outro_objeto_parametro_bancario_map_corretamente(){
		ParametrosBancariosMap mapA = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		ParametrosBancariosMap mapB = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P3,V3)
		.adicione(ParamBancTest.P4,V4);
		final Integer totalEsperadoA = 4;
		final Integer totalEsperadoB = 2;
		
		mapA = mapA.adicione(mapB);
		
		assertThat(mapA.quantidade(), is(equalTo(totalEsperadoA)));
		assertThat(mapB.quantidade(), is(equalTo(totalEsperadoB)));
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excecao_ao_tentar_adicionar_um_outro_objeto_parametro_bancario_map_null(){
		new ParametrosBancariosMap().adicione(null);
	}

	@Test
	public void deve_remover_o_parametro_do_map_corretamente(){
		ParametrosBancariosMap map = new ParametrosBancariosMap(ParamBancTest.P1,V1);
		
		Integer valor = map.remova(ParamBancTest.P1);
		
		assertTrue(map.isVazio());
		assertThat(valor, is(equalTo(V1)));
	}

	@Test(expected=IllegalArgumentException.class)
	public void deve_lancar_excecao_ao_tentar_remover_parametro_null(){
		new ParametrosBancariosMap().remova(null);
	}
	
	@Test
	public void deve_remover_todos_os_parametros_do_map_corretamente(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		
		map.limpe();
		
		assertTrue(map.isVazio());
	}

	@Test
	public void deve_retornar_o_numero_de_parametros_correto(){
		ParametrosBancariosMap map = new ParametrosBancariosMap()
		.adicione(ParamBancTest.P1,V1)
		.adicione(ParamBancTest.P2,V2);
		final int quantidadeEsperada = 2;
		
		assertThat(map.quantidade(), is(equalTo(quantidadeEsperada)));
	}
	
	/**
	 * Enum utilizado para uso apenas nesta classe de teste. 
	 * 
	 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
	 * 
	 * @since 0.2
	 * 
	 * @version 0.2
	 */
	private enum ParamBancTest implements ParametroBancario<ParamBancTest>{
		P1,P2,P3,P4;
	}
}
