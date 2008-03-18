package br.com.nordestefomento.jrimum.domkee.ientity;

import java.io.Serializable;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.entity.ContaBancaria;
import br.com.nordestefomento.jrimum.domkee.type.ACadastroDePessoa;
import br.com.nordestefomento.jrimum.domkee.type.Email;
import br.com.nordestefomento.jrimum.domkee.type.Endereco;
import br.com.nordestefomento.jrimum.domkee.type.Telefone;

/**
 * @author   Romulo
 */
public interface IPessoa extends Serializable {

	public String getNome();

	public void setNome(String nome);

	public ACadastroDePessoa getCadastroDePessoa();

	public void setCadastroDePessoa(ACadastroDePessoa cadastroDePessoa);

	public Collection<Telefone> getTelefones();

	public void setTelefones(Collection<Telefone> telefones);

	public void addTelefone(Telefone telefone);

	public Collection<Email> getEmails();

	public void setEmails(Collection<Email> emails);

	public void addEmail(Email email);

	public Collection<Endereco> getEnderecos();

	public void setEnderecos(Collection<Endereco> enderecos);

	public void addEndereco(Endereco endereco);

	public Collection<ContaBancaria> getContasBancarias();

	public void setContasBancarias(Collection<ContaBancaria> contasBancarias);

	public void addContaBancaria(ContaBancaria contaBancaria);

	public boolean isFisica();

	public boolean isJuridica();
	
	public boolean hasContaBancaria();
}
