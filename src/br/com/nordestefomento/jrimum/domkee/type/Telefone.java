package br.com.nordestefomento.jrimum.domkee.type;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ATagable;
import br.com.nordestefomento.jrimum.domkee.entity.Pessoa;
import br.com.nordestefomento.jrimum.utilix.ITextStream;

/**
 * @author Romulo
 */
public class Telefone extends ATagable<TryxTag> implements ITextStream {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8948441953189653213L;

	private Long id;

	private Integer ddi;

	private Integer ddd;

	private Integer prefixo;

	private Integer sufixo;
	
	private String telefone;
	
	private Pessoa pessoa;
	
	private Collection<TryxTag> tagSub;

	public Telefone() {}
	
	public Telefone(String telefone) {
		
		read(telefone);
	}
	
	private void preEventGambi() {
		
		tagSub = super.tag;
	}
	
	@Override
	public void setTags(Collection<TryxTag> tags) {
		
		super.setTags(tags);
	}
	
	@Override
	public Collection<TryxTag> getTags() {

		return super.getTags();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public void read(String str) {
		// TODO Auto-generated method stub
		setTelefone(str);
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
