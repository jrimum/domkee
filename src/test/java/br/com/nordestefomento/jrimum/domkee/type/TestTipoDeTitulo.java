/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 19:11:46
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 19:11:46
 * 
 */


package br.com.nordestefomento.jrimum.domkee.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.nordestefomento.jrimum.domkee.financeiro.banco.febraban.TipoDeTitulo;

public class TestTipoDeTitulo{

	TipoDeTitulo CH = TipoDeTitulo.CH_CHEQUE;

	TipoDeTitulo DM = TipoDeTitulo.DM_DUPLICATA_MERCANTIL;

	TipoDeTitulo DMI = TipoDeTitulo.DMI_DUPLICATA_MERCANTIL_PARA_INDICACAO;

	TipoDeTitulo DS = TipoDeTitulo.DS_DUPLICATA_DE_SERVICO;

	TipoDeTitulo DSI = TipoDeTitulo.DSI_DUPLICATA_DE_SERVICO_PARA_INDICACAO;

	TipoDeTitulo DR = TipoDeTitulo.DR_DUPLICATA_RURAL;

	TipoDeTitulo LC = TipoDeTitulo.LC_LETRA_DE_CAMBIO;

	TipoDeTitulo NCC = TipoDeTitulo.NCC_NOTA_DE_CREDITO_COMERCIAL;

	TipoDeTitulo NCE = TipoDeTitulo.NCE_NOTA_DE_CREDITO_A_EXPORTACAO;

	TipoDeTitulo NCI = TipoDeTitulo.NCI_NOTA_DE_CREDITO_INDUSTRIAL;

	TipoDeTitulo NCR = TipoDeTitulo.NCR_NOTA_DE_CREDITO_RURAL;

	TipoDeTitulo NP = TipoDeTitulo.NP_NOTA_PROMISSORIA;

	TipoDeTitulo NPR = TipoDeTitulo.NPR_NOTA_PROMISSORIA_RURAL;

	TipoDeTitulo TM = TipoDeTitulo.TM_TRIPLICATA_MERCANTIL;

	TipoDeTitulo TS = TipoDeTitulo.TS_TRIPLICATA_DE_SERVICO;

	TipoDeTitulo NS = TipoDeTitulo.NS_NOTA_DE_SEGURO;

	TipoDeTitulo RC = TipoDeTitulo.RC_RECIBO;

	TipoDeTitulo FAT = TipoDeTitulo.FAT_FATURA;

	TipoDeTitulo ND = TipoDeTitulo.ND_NOTA_DE_DEBITO;

	TipoDeTitulo AP = TipoDeTitulo.AP_APOLICE_DE_SEGURO;

	TipoDeTitulo ME = TipoDeTitulo.ME_MENSALIDADE_ESCOLAR;

	TipoDeTitulo PC = TipoDeTitulo.PC_PARCELA_DE_CONSORCIO;

	TipoDeTitulo NF = TipoDeTitulo.NF_NOTA_FISCAL;

	TipoDeTitulo DD = TipoDeTitulo.DD_DOCUMENTO_DE_DIVIDA;

	TipoDeTitulo cedulaDeProdutoRural = TipoDeTitulo.CEDULA_DE_PRODUTO_RURAL;

	TipoDeTitulo warrant = TipoDeTitulo.WARRANT;

	TipoDeTitulo dividaAtivaDeEstado = TipoDeTitulo.DIVIDA_ATIVA_DE_ESTADO;

	TipoDeTitulo dividaAtivaDeMunicipio = TipoDeTitulo.DIVIDA_ATIVA_DE_MUNICIPIO;

	TipoDeTitulo dividaAtivaDaUniao = TipoDeTitulo.DIVIDA_ATIVA_DA_UNIAO;

	TipoDeTitulo cotaCondominial = TipoDeTitulo.COTA_CONDOMINIAL;

	TipoDeTitulo outros = TipoDeTitulo.OUTROS;

	@Test
	public void setUp() throws Exception {

		CH = TipoDeTitulo.CH_CHEQUE;
		DM = TipoDeTitulo.DM_DUPLICATA_MERCANTIL;
		DMI = TipoDeTitulo.DMI_DUPLICATA_MERCANTIL_PARA_INDICACAO;
		DS = TipoDeTitulo.DS_DUPLICATA_DE_SERVICO;
		DSI = TipoDeTitulo.DSI_DUPLICATA_DE_SERVICO_PARA_INDICACAO;
		DR = TipoDeTitulo.DR_DUPLICATA_RURAL;
		LC = TipoDeTitulo.LC_LETRA_DE_CAMBIO;
		NCC = TipoDeTitulo.NCC_NOTA_DE_CREDITO_COMERCIAL;
		NCE = TipoDeTitulo.NCE_NOTA_DE_CREDITO_A_EXPORTACAO;
		NCI = TipoDeTitulo.NCI_NOTA_DE_CREDITO_INDUSTRIAL;
		NCR = TipoDeTitulo.NCR_NOTA_DE_CREDITO_RURAL;
		NP = TipoDeTitulo.NP_NOTA_PROMISSORIA;
		NPR = TipoDeTitulo.NPR_NOTA_PROMISSORIA_RURAL;
		TM = TipoDeTitulo.TM_TRIPLICATA_MERCANTIL;
		TS = TipoDeTitulo.TS_TRIPLICATA_DE_SERVICO;
		NS = TipoDeTitulo.NS_NOTA_DE_SEGURO;
		RC = TipoDeTitulo.RC_RECIBO;
		FAT = TipoDeTitulo.FAT_FATURA;
		ND = TipoDeTitulo.ND_NOTA_DE_DEBITO;
		AP = TipoDeTitulo.AP_APOLICE_DE_SEGURO;
		ME = TipoDeTitulo.ME_MENSALIDADE_ESCOLAR;
		PC = TipoDeTitulo.PC_PARCELA_DE_CONSORCIO;
		NF = TipoDeTitulo.NF_NOTA_FISCAL;
		DD = TipoDeTitulo.DD_DOCUMENTO_DE_DIVIDA;
		cedulaDeProdutoRural = TipoDeTitulo.CEDULA_DE_PRODUTO_RURAL;
		warrant = TipoDeTitulo.WARRANT;
		dividaAtivaDeEstado = TipoDeTitulo.DIVIDA_ATIVA_DE_ESTADO;
		dividaAtivaDeMunicipio = TipoDeTitulo.DIVIDA_ATIVA_DE_MUNICIPIO;
		dividaAtivaDaUniao = TipoDeTitulo.DIVIDA_ATIVA_DA_UNIAO;
		cotaCondominial = TipoDeTitulo.COTA_CONDOMINIAL;
		outros = TipoDeTitulo.OUTROS;

	}

	@Test
	public void testGetSigla() {

		assertEquals("CH", CH.getSigla());
		assertEquals("DM", DM.getSigla());
		assertEquals("DMI", DMI.getSigla());
		assertEquals("DS", DS.getSigla());
		assertEquals("DSI", DSI.getSigla());
		assertEquals("DR", DR.getSigla());
		assertEquals("LC", LC.getSigla());
		assertEquals("NCC", NCC.getSigla());
		assertEquals("NCE", NCE.getSigla());
		assertEquals("NCI", NCI.getSigla());
		assertEquals("NCR", NCR.getSigla());
		assertEquals("NP", NP.getSigla());
		assertEquals("NPR", NPR.getSigla());
		assertEquals("TM", TM.getSigla());
		assertEquals("TS", TS.getSigla());
		assertEquals("NS", NS.getSigla());
		assertEquals("RC", RC.getSigla());
		assertEquals("FAT", FAT.getSigla());
		assertEquals("ND", ND.getSigla());
		assertEquals("AP", AP.getSigla());
		assertEquals("ME", ME.getSigla());
		assertEquals("PC", PC.getSigla());
		assertEquals("NF", NF.getSigla());
		assertEquals("DD", DD.getSigla());
		assertEquals("Cédula de Produto Rural", cedulaDeProdutoRural.getSigla());
		assertEquals("Warrant", warrant.getSigla());
		assertEquals("Dívida Ativa de Estado", dividaAtivaDeEstado.getSigla());
		assertEquals("Dívida Ativa de Município", dividaAtivaDeMunicipio
				.getSigla());
		assertEquals("Dívida Ativa da União", dividaAtivaDaUniao.getSigla());
		assertEquals("Cota Condominial", cotaCondominial.getSigla());
		assertEquals("Outros", outros.getSigla());

	}

	@Test
	public void testGetCodigo() {

		assertTrue(CH.getCodigo() == 1);
		assertTrue(DM.getCodigo() == 2);
		assertTrue(DMI.getCodigo() == 3);
		assertTrue(DS.getCodigo() == 4);
		assertTrue(DSI.getCodigo() == 5);
		assertTrue(DR.getCodigo() == 6);
		assertTrue(LC.getCodigo() == 7);
		assertTrue(NCC.getCodigo() == 8);
		assertTrue(NCE.getCodigo() == 9);
		assertTrue(NCI.getCodigo() == 10);
		assertTrue(NCR.getCodigo() == 11);
		assertTrue(NP.getCodigo() == 12);
		assertTrue(NPR.getCodigo() == 13);
		assertTrue(TM.getCodigo() == 14);
		assertTrue(TS.getCodigo() == 15);
		assertTrue(NS.getCodigo() == 16);
		assertTrue(RC.getCodigo() == 17);
		assertTrue(FAT.getCodigo() == 18);
		assertTrue(ND.getCodigo() == 19);
		assertTrue(AP.getCodigo() == 20);
		assertTrue(ME.getCodigo() == 21);
		assertTrue(PC.getCodigo() == 22);
		assertTrue(NF.getCodigo() == 23);
		assertTrue(DD.getCodigo() == 24);
		assertTrue(cedulaDeProdutoRural.getCodigo() == 25);
		assertTrue(warrant.getCodigo() == 26);
		assertTrue(dividaAtivaDeEstado.getCodigo() == 27);
		assertTrue(dividaAtivaDeMunicipio.getCodigo() == 28);
		assertTrue(dividaAtivaDaUniao.getCodigo() == 29);
		assertTrue(cotaCondominial.getCodigo() == 30);
		assertTrue(outros.getCodigo() == 99);

	}

}
