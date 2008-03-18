package br.com.nordestefomento.jrimum.domkee.type;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

/**
 * @author   Romulo
 */
public enum EnumSexo implements Serializable {

	F,
	M;
	
	public String getNome() {
		
		String nome = StringUtils.EMPTY;
		
		switch (this) {
			
			case F:
				nome = "Feminino";
				break;

			case M:
				nome = "Masculino";
				break;
		}
		
		return nome;
	}
}
