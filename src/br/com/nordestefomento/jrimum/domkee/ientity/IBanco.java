package br.com.nordestefomento.jrimum.domkee.ientity;

import br.com.nordestefomento.jrimum.domkee.type.CNPJ;

import com.lowagie.text.Image;

public interface IBanco {

	public abstract String getCodigoDeCompensacao();
	public abstract String getInstituicao();
	public abstract CNPJ getCNPJ();
	public abstract String getSegmento();
	public abstract Image getImgLogo();
	public abstract void setCodigoDeCompensacao(String codigoDeCompensacao);
	public abstract void setInstituicao(String instituicao);
	public abstract void setCNPJ(CNPJ cnpj);
	public abstract void setSegmento(String segmento);
	public abstract void setImgLogo(Image imgLogo);
	
}
