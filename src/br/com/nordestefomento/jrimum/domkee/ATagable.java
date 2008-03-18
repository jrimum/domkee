package br.com.nordestefomento.jrimum.domkee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import br.com.nordestefomento.jrimum.domkee.itype.ITag;
import br.com.nordestefomento.jrimum.domkee.itype.ITagable;

/**
 * <p>
 * Classe que fornece uma implementação padrão para classes que implementam a interface
 * <code>I_Tagable</code>.<br/>
 * Toda classe que pode ser marcável com várias <code>Tag</code>s deve herdar esta classe.
 * </p>
 * 
 * <h3>A_Tagable e JPA</h3>
 * 
 * <p>
 * A classe <code>A_Tagable</code> deveria estar mapeada como <i>MappedSuperclass</i>, mas não foi 
 * possível, pelo menos nesta versão do JPA (1.0).<br/>
 * O mapeamento da coleção de Tags deveria estar nesta classe, mas o JPA 1.0 não dá suporte à 
 * sobrescrita da <i>JoinTable</i> da associação nas classes filhas.
 * <br/>
 * Por isso, toda cada classe que herdar de <code>A_Tagable</code> deve sobrescerver os métodos
 * <code>getTags</code> e <code>setTags</code>, definir uma <code>Collection</code> de tags
 * propriedade privada e definir um método para os eventos <i>PrePersist</i>, <i>PreRemove</i> e 
 * <i>PreUpdate</i> do JPA.
 * </p>
 * <p>
 * Exemplo:<br/>
 * <code>
 * public class MinhaClasse extends A_Tagable<TryxTag> {<br/>
 * <br/>
 * 		private Collection<TryxTag> tagsSub;<br/>
 * <br/>
 * 		private void preEventJPA() {<br/>
 * <br/>
 * 			tagsSub = super.tags;<br/>
 * 		}<br/>
 * <br/>
 * 		@Override<br/>
 *		public void setTags(Collection<TryxTag> tags) {<br/>
 * <br/>
 *			super.setTags(tags);<br/>
 *		}<br/>
 * <br/>
 *		@Override<br/>
 *		public Collection<TryxTag> getTags() {<br/>
 * <br/>
 *			return super.getTags();<br/>
 *		}<br/>
 * }
 * </code>
 * </p>
 * 
 * @author Romulo
 *
 * @param <G>
 */
public abstract class ATagable <G extends ITag<?, ?, ?>> implements ITagable<G> {

	protected Collection<G> tag = new ArrayList<G>();
	
	@Override
	public Collection<G> getTags() {
		
		return tag;
	}
	
	@Override
	public void setTags(Collection<G> tags) {
		
		this.tag = tags;
	}
	
	@Override
	public boolean add(G e) {
		
		return tag.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends G> c) {
		
		return tag.addAll(c);
	}

	@Override
	public void clear() {
		
		tag.clear();
	}

	@Override
	public boolean contains(Object o) {
		
		return tag.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return tag.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		
		return tag.isEmpty();
	}

	@Override
	public Iterator<G> iterator() {
		
		return tag.iterator();
	}

	@Override
	public boolean remove(Object o) {
		
		return tag.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return tag.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return tag.retainAll(c);
	}

	@Override
	public int size() {
		
		return tag.size();
	}

	@Override
	public Object[] toArray() {
		
		return tag.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return tag.toArray(a);
	}
}
