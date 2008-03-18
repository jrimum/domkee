/*
 * Copyright 2007, JMatryx Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright 2007, Grupo JMatryx
 * 
 * Licenciado sob a licença da Apache, versão 2.0 (a “licença”); você não pode
 * usar este arquivo exceto na conformidade com a licença. Você pode obter uma
 * cópia da licença em
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * A menos que seja requerido pela aplicação da lei ou esteja de acordo com a
 * escrita, o software distribuído sob esta licença é distribuído “COMO É”
 * BASE,SEM AS GARANTIAS OU às CONDIÇÕES DO TIPO, expresso ou implicado. Veja a
 * licença para as permissões sobre a línguagem específica e limitações quando
 * sob licença.
 * 
 * 
 * Created at / Criado em : 17/03/2007 - 17:35:31
 * 
 */

package br.com.nordestefomento.jrimum.domkee.type;

import java.io.Serializable;

/**
 * 
 * Enumeração de códigos adotados pela FEBRABAN para identificar o tipo de título de cobrança.
	Domínio:
 * 
 * <br />
 * 
 * <ul>
 * <li> '01'  =  CH Cheque</li>
 * <li> '02'  =  DM Duplicata Mercantil</li>
 * <li> '03'  =  DMI Duplicata Mercantil p/ Indicação</li>
 * <li> '04'  =  DS Duplicata de Serviço</li>
 * <li>	'05'  =  DSI Duplicata de Serviço p/ Indicação</li>
 * <li>	'06'  =  DR Duplicata Rural</li>
 * <li>	'07'  =  LC Letra de Câmbio</li>
 * <li>	'08'  =  NCC Nota de Crédito Comercial</li>
 * <li>	'09'  =  NCE Nota de Crédito a Exportação</li>
 * <li>	'10'  =  NCI Nota de Crédito Industrial</li>
 * <li>	'11'  =  NCR Nota de Crédito Rural</li>
 * <li>	'12'  =  NP Nota Promissória</li>
 * <li>	'13'  =  NPR Nota Promissória Rural</li>
 * <li>	'14'  =  TM Triplicata Mercantil</li>
 * <li>	'15'  =  TS Triplicata de Serviço</li>
 * <li>	'16'  =  NS Nota de Seguro</li>
 * <li> '17'  =  RC Recibo</li>
 * <li>	'18'  =  FAT Fatura</li>
 * <li>	'19'  =  ND Nota de Débito</li>
 * <li>	'20'  =  AP Apólice de Seguro</li>
 * <li>	'21'  =  ME Mensalidade Escolar</li>
 * <li>	'22'  =  PC Parcela de Consórcio</li>
 * <li>	'23'  =  NF Nota Fiscal</li>
 * <li>	'24'  =  DD Documento de Dívida</li>
 * <li>	‘25’ = Cédula de Produto Rural</li>
 * <li>	‘26’ = Warrant</li>
 * <li>	‘27’ = Dívida Ativa de Estado</li>
 * <li> ‘28’ = Dívida Ativa de Município</li>
 * <li>	‘29’ = Dívida Ativa da União</li>
 * <li>	‘30’ = Cota Condominial</li>
 * <li> '99'  =  Outros</li>
 * </ul>
 * 
 * 
 * @author Gabriel Guimarães
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author Misael Barreto 
 * @author Rômulo Augusto
 * @author <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * 
 * @since JMatryx 1.0
 * 
 * @version 1.0
 */
public enum EnumTitulo implements Serializable {

	
	CH_CHEQUE,
	DM_DUPLICATA_MERCANTIL,
	DMI_DUPLICATA_MERCANTIL_PARA_INDICACAO,
	DS_DUPLICATA_DE_SERVICO,
	DSI_DUPLICATA_DE_SERVICO_PARA_INDICACAO,
	DR_DUPLICATA_RURAL,
	LC_LETRA_DE_CAMBIO,
	NCC_NOTA_DE_CREDITO_COMERCIAL,
	NCE_NOTA_DE_CREDITO_A_EXPORTACAO,
	NCI_NOTA_DE_CREDITO_INDUSTRIAL,
	NCR_NOTA_DE_CREDITO_RURAL,
	NP_NOTA_PROMISSORIA,
	NPR_NOTA_PROMISSORIA_RURAL,
	TM_TRIPLICATA_MERCANTIL,
	TS_TRIPLICATA_DE_SERVICO,
	NS_NOTA_DE_SEGURO,
	RC_RECIBO,
	FAT_FATURA,
	ND_NOTA_DE_DEBITO,
	AP_APOLICE_DE_SEGURO,
	ME_MENSALIDADE_ESCOLAR,
	PC_PARCELA_DE_CONSORCIO,
	NF_NOTA_FISCAL,
	DD_DOCUMENTO_DE_DIVIDA,
	CEDULA_DE_PRODUTO_RURAL,
	WARRANT,
	DIVIDA_ATIVA_DE_ESTADO,
	DIVIDA_ATIVA_DE_MUNICIPIO,
	DIVIDA_ATIVA_DA_UNIAO,
	COTA_CONDOMINIAL, 
	OUTROS;
	
	/**
	 * Código adotado pela FEBRABAN para identificar o tipo de título de cobrança.
	 */
	private int codigo;
	
	/**
	 * Sigla ou nome compelto de um tipo de título de cobrança.
	 */
	private String sigla;
	
	/**
	 * Seleciona a Espécie de título de cobrança e seta sua respectiva sigla,
	 * caso haja e seu código padronizado e obrigatório.
	 *
	 */
    private void selectAndSet(){
    	
    	switch(this) {
		
		case CH_CHEQUE:
			codigo = 1;
			sigla = "CH";
			break;
		case DM_DUPLICATA_MERCANTIL:
			codigo = 2;
			sigla = "DM";
			break;
		case DMI_DUPLICATA_MERCANTIL_PARA_INDICACAO:
			codigo = 3;
			sigla = "DMI";
			break;
		case DS_DUPLICATA_DE_SERVICO:
			codigo = 4;
			sigla = "DS";
			break;
		case DSI_DUPLICATA_DE_SERVICO_PARA_INDICACAO:
			codigo = 5;
			sigla = "DSI";
			break;
		case DR_DUPLICATA_RURAL:
			codigo = 6;
			sigla = "DR";
			break;
		case LC_LETRA_DE_CAMBIO:
			codigo = 7;
			sigla = "LC";
			break;
		case NCC_NOTA_DE_CREDITO_COMERCIAL:
			codigo = 8;
			sigla = "NCC";
			break;
		case NCE_NOTA_DE_CREDITO_A_EXPORTACAO:
			codigo = 9;
			sigla = "NCE";
			break;
		case NCI_NOTA_DE_CREDITO_INDUSTRIAL:
			codigo = 10;
			sigla = "NCI";
			break;
		case NCR_NOTA_DE_CREDITO_RURAL:
			codigo = 11;
			sigla = "NCR";
			break;
		case NP_NOTA_PROMISSORIA:
			codigo = 12;
			sigla = "NP";
			break;
		case NPR_NOTA_PROMISSORIA_RURAL:
			codigo = 13;
			sigla = "NPR";
			break;
		case TM_TRIPLICATA_MERCANTIL:
			codigo = 14;
			sigla = "TM";
			break;
		case TS_TRIPLICATA_DE_SERVICO:
			codigo = 15;
			sigla = "TS";
			break;
		case NS_NOTA_DE_SEGURO:
			codigo = 16;
			sigla = "NS";
			break;
		case RC_RECIBO:
			codigo = 17;
			sigla = "RC";
			break;
		case FAT_FATURA:
			codigo = 18;
			sigla = "FAT";
			break;
		case ND_NOTA_DE_DEBITO:
			codigo = 19;
			sigla = "ND";
			break;
		case AP_APOLICE_DE_SEGURO:
			codigo = 20;
			sigla = "AP";
			break;
		case ME_MENSALIDADE_ESCOLAR:
			codigo = 21;
			sigla = "ME";
			break;
		case PC_PARCELA_DE_CONSORCIO:
			codigo = 22;
			sigla = "PC";
			break;
		case NF_NOTA_FISCAL:
			codigo = 23;
			sigla = "NF";
			break;
		case DD_DOCUMENTO_DE_DIVIDA:
			codigo = 24;
			sigla = "DD";
			break;
		case CEDULA_DE_PRODUTO_RURAL:
			codigo = 25;
			sigla = "Cédula de Produto Rural";
			break;
		case WARRANT :
			codigo = 26;
			sigla = "Warrant";
			break;
		case DIVIDA_ATIVA_DE_ESTADO:
			codigo = 27;
			sigla = "Dívida Ativa de Estado";
			break;
		case DIVIDA_ATIVA_DE_MUNICIPIO:
			codigo = 28;
			sigla = "Dívida Ativa de Município";
			break;
		case DIVIDA_ATIVA_DA_UNIAO:
			codigo = 29;
			sigla = "Dívida Ativa da União";
			break;
		case COTA_CONDOMINIAL:
			codigo = 30;
			sigla = "Cota Condominial";
			break;
		case OUTROS:
			codigo = 99;
			sigla = "Outros";
			break;
    	}
		
	}

    /**
     * Apesar do nome, este método pode retornar não uma sigla, e sim, um nome compelto
     * de uma espécie de título de cobrança. Isto se justifica pelo fato de que não há
     * uma sigla determinada pela FEBRABAN para alguns casos.
     * 
     * @return sigla ou descrição completa.
     */
	public String getSigla() {

		selectAndSet();
		
		return sigla;

	}
	
	/**
	 * Código adotado pela FEBRABAN para identificar o tipo de título de cobrança.
	 * 
	 * @return código FEBRABAN
	 */
	public int getCodigo(){
	
		selectAndSet();
		
		return codigo;
	}

}
