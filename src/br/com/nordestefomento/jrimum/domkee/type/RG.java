package br.com.nordestefomento.jrimum.domkee.type;

import java.io.Serializable;
import java.util.Date;

import br.com.nordestefomento.jrimum.domkee.entity.PessoaFisica;


/**
 * @author  Romulo
 */
public class RG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3472263281659641113L;
	
	private Long id;
	
	private Long numero;
	
	private String orgaoExpedidor;
	
	private String filiacaoPai;
	
	private String filiacaoMae;
	
	private Date dataNascimento;
	
	private PessoaFisica pessoa;

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getFiliacaoPai() {
		return filiacaoPai;
	}

	public void setFiliacaoPai(String filiacaoPai) {
		this.filiacaoPai = filiacaoPai;
	}

	public String getFiliacaoMae() {
		return filiacaoMae;
	}
	
	public void setFiliacaoMae(String filiacaoMae) {
		this.filiacaoMae = filiacaoMae;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}
}
