package br.com.nordestefomento.jrimum.domkee.base;

public class CodigoIdentificador<T> implements Comparable<T>{

	T codigo;
	
	//TODO se codigos iguais lance excecao
	
	
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodigoIdentificador other = (CodigoIdentificador) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
