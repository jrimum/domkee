package br.com.nordestefomento.jrimum.domkee.ientity;

/**
 * @author   Romulo
 */
public interface IPessoaJuridica extends IPessoa {

	public String getNomeFantasia();

	public void setNomeFantasia(String nomeFantasia);

	public Long getInscricaoEstadual();

	public void setInscricaoEstadual(Long inscricaoEstadual);

	public Long getInscricaoMunicipal();

	public void setInscricaoMunicipal(Long inscricaoMunicipal);
}
