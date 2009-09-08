package br.com.nordestefomento.jrimum.domkee.bank;


/**
 * 
 * <p>
 * DEFINIÇÃO DA CLASSE
 * </p>
 * 
 * <p>
 * OBJETIVO/PROPÓSITO
 * </p>
 * 
 * <p>
 * EXEMPLO: 
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L.</a>
 * 
 * @since 
 * 
 * @version 
 */
public interface IDadoBancario {
	/*
	 * INFORMANDO MAIS DADOS BANCÁRIOS A UM TÍTULO, QUANDO NECESSÁRIO.
	 * Dependendo do banco, talvez seja necessário informar mais dados além de: 
	 * 
	 * > Valor do título; 
	 * > Vencimento; 
	 * > Nosso número; 
	 * > Código do banco 
	 * > Data de vencimento; 
	 * > Agência/Código do cedente; 
	 * > Código da carteira; 
	 * > Código da moeda;
	 * 
	 * Definidos como padrão pela FEBRABAN.
	 * Verifique na documentação.
	 * 
	 * Um exemplo é o do banco Santander, este banco utiliza um campo de IOF no campo livre da seguinte maneira:
	 * 
	 * Posição 21, tamanho 1: 
	 * IOF – Seguradoras (Se 7% informar 7.  Limitado a 9%) 
	 * Demais clientes usar 0 (zero)
	 */
}