package br.com.nordestefomento.jrimum.domkee.financeiro.banco.hsbc;



public enum TipoIdentificadorCNR{

	COM_VENCIMENTO{
		@Override
		public int getConstante() {
			return 4;
		}
	},
	
	SEM_VENCIMENTO{
		@Override
		public int getConstante() {
			return  5;
		}
	};
	
	public abstract int getConstante();	
}