package br.com.nordestefomento.jrimum.domkee.entity;

import java.util.ArrayList;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ientity.IPessoa;
import br.com.nordestefomento.jrimum.domkee.type.ACadastroDePessoa;
import br.com.nordestefomento.jrimum.domkee.type.Email;
import br.com.nordestefomento.jrimum.domkee.type.Endereco;
import br.com.nordestefomento.jrimum.domkee.type.Telefone;

/**
 * @author   Romulo
 */
public class Pessoa implements IPessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6969495818430633867L;
	
	private Long id;
	
	private String nome;
	
	private ACadastroDePessoa cadastroDePessoa;
	
	private Collection<Telefone> telefones;
	
	private Collection<Email> emails;
	
	private Collection<Endereco> enderecos;
	
	private Collection<ContaBancaria> contasBancarias;
	
	public Pessoa() {}
	
	public Pessoa(String nome) {
		
		this.nome = nome;
	}

	public Pessoa(String nome, String cadastroDePessoa) {
		
		this.nome = nome;
		this.cadastroDePessoa = ACadastroDePessoa.getInstance(cadastroDePessoa);
	}

	@Override
	public void addContaBancaria(ContaBancaria contaBancaria) {
		
		if(contasBancarias == null)
			contasBancarias = new ArrayList<ContaBancaria>();
		
		contasBancarias.add(contaBancaria);
	}
	
	@Override
	public boolean hasContaBancaria(){
		return (getContasBancarias() != null && !getContasBancarias().isEmpty());
	}

	@Override
	public void addEmail(Email email) {
		
		if(emails == null)
			emails = new ArrayList<Email>();
		
		emails.add(email);
	}

	@Override
	public void addEndereco(Endereco endereco) {

		if(enderecos == null)
			enderecos = new ArrayList<Endereco>();
		
		enderecos.add(endereco);
	}

	@Override
	public void addTelefone(Telefone telefone) {
		
		if(telefones == null)
			telefones = new ArrayList<Telefone>();
		
		telefones.add(telefone);
	}

	@Override
	public ACadastroDePessoa getCadastroDePessoa() {
		
		return cadastroDePessoa;
	}

	@Override
	public Collection<ContaBancaria> getContasBancarias() {

		return contasBancarias;
	}

	@Override
	public Collection<Email> getEmails() {

		return emails;
	}

	@Override
	public Collection<Endereco> getEnderecos() {

		return enderecos;
	}

	@Override
	public String getNome() {

		return nome;
	}

	@Override
	public Collection<Telefone> getTelefones() {
		
		return telefones;
	}

	@Override
	public void setCadastroDePessoa(ACadastroDePessoa cadastroDePessoa) {
		
		this.cadastroDePessoa = cadastroDePessoa;
	}

	@Override
	public void setContasBancarias(Collection<ContaBancaria> contasBancarias) {
		
		this.contasBancarias = contasBancarias;
	}

	@Override
	public void setEmails(Collection<Email> emails) {
		
		this.emails = emails;
	}
	
	@Override
	public void setEnderecos(Collection<Endereco> enderecos) {
		
		this.enderecos = enderecos;
	}

	@Override
	public void setNome(String nome) {
	
		this.nome = nome;
	}

	@Override
	public void setTelefones(Collection<Telefone> telefones) {
		
		this.telefones = telefones;
	}

	@Override
	public boolean isFisica() {
		
		return (this instanceof PessoaFisica);
	}

	@Override
	public boolean isJuridica() {
		
		return (this instanceof PessoaJuridica);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
