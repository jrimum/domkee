package br.com.nordestefomento.jrimum.domkee.itype;

import java.io.Serializable;
import java.util.Collection;

public interface ITagable <T extends ITag<?, ?, ?>> extends Collection<T>, Serializable {

	public Collection<T> getTags();
	
	public void setTags(Collection<T> tags);
}
