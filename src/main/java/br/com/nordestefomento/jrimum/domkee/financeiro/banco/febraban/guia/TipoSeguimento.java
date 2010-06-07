package br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.guia;

public enum TipoSeguimento {

	PREFEITURA(1, "Prefeituras"),
	
	SANEAMENTO(2, "Saneamento"),
	
	ENERGIA_ELETRICA_E_GAS(3, "Energia Elétrica e Gás"),
	
	TELECOMUNICACOES(4, "Telecomunicações"),
	
	ORGAOS_GOVERNAMENTAIS(5, "Órgãos Governamentais"),
	
	CARNES_E_ASSEMELHADOS_OU_DEMAIS(6, "Carnês e Assemelhados ou demais. " +
			"Empresas / Orgãos serão identificadas através do CNPJ"),
	
	MULTAS_DE_TRANSITO(7, "Multas de trânsito"),
	
	USO_EXCLUSIVO_BANCO(9, "Uso exclusivo do banco");
	
	
	private Integer codigo;
	private String nome;
	
	/**
	 * @param codigo
	 * @param nome
	 */
	private TipoSeguimento(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	
	public static TipoSeguimento findByCodigo(Integer codigo) {
		TipoSeguimento tipoSeguimentoRetorno = null;
		
		TipoSeguimento[] tipoSeguimentoArray = TipoSeguimento.values();
		for (int i = 0; i < tipoSeguimentoArray.length; i++) {
			if (tipoSeguimentoArray[i].codigo.equals(codigo)) {
				tipoSeguimentoRetorno = tipoSeguimentoArray[i];
				break;
			}
				
		}
		
		return tipoSeguimentoRetorno;
	}
}
