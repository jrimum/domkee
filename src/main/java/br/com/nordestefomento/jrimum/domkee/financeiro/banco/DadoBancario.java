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
 * Created at: 30/03/2008 - 18:59:18
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
 * Criado em: 30/03/2008 - 18:59:18
 * 
 */

package br.com.nordestefomento.jrimum.domkee.financeiro.banco;


/**
 * 
 * <p>
 * DEFINIÇÃO DA CLASSE
 * </p>
 * 
 * <p>
 * OBJETIVO/PROPÓSITO
 * </p>
 * 
 * <p>
 * EXEMPLO: 
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @version 0.2
 */
public interface DadoBancario {
	/*
	 * INFORMANDO MAIS DADOS BANCÁRIOS A UM TÍTULO, QUANDO NECESSÁRIO.
	 * Dependendo do banco, talvez seja necessário informar mais dados além de: 
	 * 
	 * > Valor do título; 
	 * > Vencimento; 
	 * > Nosso número; 
	 * > Código do banco 
	 * > Data de vencimento; 
	 * > Agência/Código do cedente; 
	 * > Código da carteira; 
	 * > Código da moeda;
	 * 
	 * Definidos como padrão pela FEBRABAN.
	 * Verifique na documentação.
	 * 
	 * Um exemplo é o do banco Santander, este banco utiliza um campo de IOF no campo livre da seguinte maneira:
	 * 
	 * Posição 21, tamanho 1: 
	 * IOF – Seguradoras (Se 7% informar 7.  Limitado a 9%) 
	 * Demais clientes usar 0 (zero)
	 */
}