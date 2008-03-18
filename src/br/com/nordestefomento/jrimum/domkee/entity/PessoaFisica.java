package br.com.nordestefomento.jrimum.domkee.entity;

import java.util.ArrayList;
import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ientity.IPessoaFisica;
import br.com.nordestefomento.jrimum.domkee.type.EnumSexo;
import br.com.nordestefomento.jrimum.domkee.type.RG;

/**
 * @author   Romulo
 */
public class PessoaFisica extends Pessoa implements IPessoaFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5722593135877031688L;
	
	private PessoaFisica conjuge;
	
	private EnumSexo sexo;
	
	private String estadoCivil;
	
	private Collection<RG> rgs;
	
	public PessoaFisica() {}

	@Override
	public void addRG(RG rg) {
		
		if(rgs == null)
			rgs = new ArrayList<RG>();
		
		rgs.add(rg);
	}
	
	@Override
	public PessoaFisica getConjuge() {
		
		return conjuge;
	}

	@Override
	public String getEstadoCivil() {
		
		return estadoCivil;
	}

	@Override
	public Collection<RG> getRgs() {
		
		return rgs;
	}

	@Override
	public EnumSexo getSexo() {
		
		return sexo;
	}

	@Override
	public void setConjuge(PessoaFisica conjuge) {
		
		this.conjuge = conjuge;
		
		if(conjuge != null && conjuge.getConjuge() == null)
			conjuge.setConjuge(this);
	}

	@Override
	public void setEstadoCivil(String estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}

	@Override
	public void setRgs(Collection<RG> rgs) {
		
		this.rgs = rgs;
	}

	@Override
	public void setSexo(EnumSexo sexo) {
		
		this.sexo = sexo;
	}

}
