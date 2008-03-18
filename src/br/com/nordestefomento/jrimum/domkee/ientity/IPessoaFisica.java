package br.com.nordestefomento.jrimum.domkee.ientity;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.entity.PessoaFisica;
import br.com.nordestefomento.jrimum.domkee.type.EnumSexo;
import br.com.nordestefomento.jrimum.domkee.type.RG;


/**
 * @author   Romulo
 */
public interface IPessoaFisica extends IPessoa {
	
	public PessoaFisica getConjuge();

	public void setConjuge(PessoaFisica conjuge);
	
	public EnumSexo getSexo();

	public void setSexo(EnumSexo sexo);

	public String getEstadoCivil();

	public void setEstadoCivil(String estadoCivil);
	
	public Collection<RG> getRgs();
	
	public void setRgs(Collection<RG> rgs);
	
	public void addRG(RG rg);
}
