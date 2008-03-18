package br.com.nordestefomento.jrimum.domkee.type;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ATagable;
import br.com.nordestefomento.jrimum.domkee.entity.Pessoa;
import br.com.nordestefomento.jrimum.utilix.ITextStream;

/**
 * @author Romulo
 */
public class Email extends ATagable<TryxTag> implements ITextStream {

	/**
	 * 
	 */
	private static final long serialVersionUID = 639359687849797249L;
	
	private Long id;

	private String conta;

	private String dominio;
	
	private String email;
	
	private Pessoa pessoa;
	
	private Collection<TryxTag> tagSub;

	public Email() {}

	public Email(String email) {
		
		read(email);
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

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public void read(String str) {
		//Formatter.parse(str);
		
		setEmail(str);
	}

	@Override
	public String write() {
		
		return null;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
