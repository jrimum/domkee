package br.com.nordestefomento.jrimum.domkee.itype;

import java.io.Serializable;

public interface ITag<I, V, D> extends Serializable {

	public I getId();
	
	public void setId(I id);
	
	public V getValue();
	
	public void setValue(V value);
	
	public D getDescription();
	
	public void setDescription(D description);
}
