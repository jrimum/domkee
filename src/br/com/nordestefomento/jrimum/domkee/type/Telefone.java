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
 * Created at: 30/03/2008 - 19:10:26
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
 * Criado em: 30/03/2008 - 19:10:26
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;

import br.com.nordestefomento.jrimum.utilix.ITextStream;

/**
 * 
 * <p>
 * Representação particio
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com">Gilmar P.S.L.</a>
 * @author Misael
 * @author Romulo
 * @author Samuel
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class Telefone implements ITextStream {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8948441953189653213L;

	private Integer ddi;

	private Integer ddd;

	private Integer prefixo;

	private Integer sufixo;
	
	private String telefone;

	public Telefone() {}
	
	public Telefone(String telefone) {
		
		read(telefone);
	}

	public Integer getDdi() {
		return ddi;
	}

	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(Integer prefixo) {
		this.prefixo = prefixo;
	}

	public Integer getSufixo() {
		return sufixo;
	}

	public void setSufixo(Integer sufixo) {
		this.sufixo = sufixo;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * <p>Lê a string exatamente como é passada, ainda não implementado.</p>
	 * @see br.com.nordestefomento.jrimum.utilix.IReadWriteStream#read(java.lang.Object)
	 */
	
	public void read(String str) {
		//TODO AVALIAR
		setTelefone(str);
	}

	/** 
	 * <p>
	 * Retorna null, ainda não implementado.
	 * </p>
	 * @see br.com.nordestefomento.jrimum.utilix.IReadWriteStream#write()
	 */
	
	public String write() {
		//TODO AVALIAR
		return null;
	}
	
}
