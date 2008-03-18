package br.com.nordestefomento.jrimum.domkee.itype;

import java.io.Serializable;

public interface ISingleTagable <T extends ITag<?, ?, ?>> extends Serializable {

	public T getTag();
	
	public void setTag(T tag);
}
