package com.softwaresobmedida.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "PEDVENDA_ITEM")
@SequenceGenerator(name = "INC_PEDVENDA_ITEM", sequenceName = "GEN_PEDVENDA_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pedvendaItem") 
public class PedVendaItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public PedVendaItem() {	
	}

	@Id
	@Column(name="CODPEDVENDAITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PEDVENDA_ITEM")
	@XmlElement(name = "codpedvendaitem")
	private Integer codpedvendaitem;

	public void setCodpedvendaitem(Integer codpedvendaitem)
	{
		this.codpedvendaitem = codpedvendaitem;
	}

	public Integer getCodpedvendaitem()
	{
		return codpedvendaitem;
	}

	@Column(name="CODPEDVENDA", nullable =  false , length = 11)
	@XmlElement(name = "codpedvenda")
	private Integer codpedvenda;

	public void setCodpedvenda(Integer codpedvenda)
	{
		this.codpedvenda = codpedvenda;
	}

	public Integer getCodpedvenda()
	{
		return codpedvenda;
	}

	@Column(name="CODPRODUTO", nullable =  false , length = 11)
	@XmlElement(name = "codproduto")
	private Integer codproduto;

	public void setCodproduto(Integer codproduto)
	{
		this.codproduto = codproduto;
	}

	public Integer getCodproduto()
	{
		return codproduto;
	}

	@Column(name="PEDI_TIPOPRECO", nullable =  false , length = 2)
	@XmlElement(name = "tipopreco")
	private String tipopreco;

	public void setTipopreco(String tipopreco)
	{
		this.tipopreco = tipopreco;
	}

	public String getTipopreco()
	{
		return tipopreco;
	}

	@Column(name="PEDI_QTDE", nullable =  true , length = 17)
	@XmlElement(name = "qtde")
	private Float qtde= 0f;

	public void setQtde(Float qtde)
	{
		this.qtde = qtde;
	}

	public Float getQtde()
	{
		return qtde;
	}

	@Column(name="PEDI_DESCVLR", nullable =  true , length = 17)
	@XmlElement(name = "descvlr")
	private Float descvlr= 0f;

	public void setDescvlr(Float descvlr)
	{
		this.descvlr = descvlr;
	}

	public Float getDescvlr()
	{
		return descvlr;
	}

	@Column(name="PEDI_VLRUNIT", nullable =  true , length = 17)
	@XmlElement(name = "vlrunit")
	private Float vlrunit= 0f;

	public void setVlrunit(Float vlrunit)
	{
		this.vlrunit = vlrunit;
	}

	public Float getVlrunit()
	{
		return vlrunit;
	}

	@Column(name="CODPESQUISA", nullable =  true , length = 20)
	@XmlElement(name = "codpesquisa")
	private String codpesquisa;

	public void setCodpesquisa(String codpesquisa)
	{
		this.codpesquisa = codpesquisa;
	}

	public String getCodpesquisa()
	{
		return codpesquisa;
	}

	@Column(name="CODRESPEDIDO_ITEM", nullable =  true , length = 11)
	@XmlElement(name = "item")
	private Integer item;

	public void setItem(Integer item)
	{
		this.item = item;
	}

	public Integer getItem()
	{
		return item;
	}

	@Column(name="PEDI_QTDE_FAT", nullable =  true , length = 17)
	@XmlElement(name = "qtdeFat")
	private Float qtdeFat= 0f;

	public void setQtdeFat(Float qtdeFat)
	{
		this.qtdeFat = qtdeFat;
	}

	public Float getQtdeFat()
	{
		return qtdeFat;
	}

	@Column(name="CODPEDVENDA_ORIGEM", nullable =  true , length = 11)
	@XmlElement(name = "origem")
	private Integer origem;

	public void setOrigem(Integer origem)
	{
		this.origem = origem;
	}

	public Integer getOrigem()
	{
		return origem;
	}

	@Column(name="PEDI_QTDE_ENTR", nullable =  true , length = 17)
	@XmlElement(name = "qtdeEntr")
	private Float qtdeEntr= 0f;

	public void setQtdeEntr(Float qtdeEntr)
	{
		this.qtdeEntr = qtdeEntr;
	}

	public Float getQtdeEntr()
	{
		return qtdeEntr;
	}

	@Column(name="PEDI_PACIENTE", nullable =  true , length = 40)
	@XmlElement(name = "paciente")
	private String paciente;

	public void setPaciente(String paciente)
	{
		this.paciente = paciente;
	}

	public String getPaciente()
	{
		return paciente;
	}

	@Column(name="CODPRODUTOUNIDADE_PEDI", nullable =  true , length = 11)
	@XmlElement(name = "pedi")
	private Integer pedi;

	public void setPedi(Integer pedi)
	{
		this.pedi = pedi;
	}

	public Integer getPedi()
	{
		return pedi;
	}

	@Column(name="PEDI_QTDE_UND", nullable =  true , length = 17)
	@XmlElement(name = "qtdeUnd")
	private Float qtdeUnd= 0f;

	public void setQtdeUnd(Float qtdeUnd)
	{
		this.qtdeUnd = qtdeUnd;
	}

	public Float getQtdeUnd()
	{
		return qtdeUnd;
	}

	@Column(name="PEDI_VLR_UND", nullable =  true , length = 17)
	@XmlElement(name = "vlrUnd")
	private Float vlrUnd= 0f;

	public void setVlrUnd(Float vlrUnd)
	{
		this.vlrUnd = vlrUnd;
	}

	public Float getVlrUnd()
	{
		return vlrUnd;
	}

	@Column(name="PEDI_CUSTO_PRODUTO", nullable =  true , length = 17)
	@XmlElement(name = "custoProduto")
	private Float custoProduto= 0f;

	public void setCustoProduto(Float custoProduto)
	{
		this.custoProduto = custoProduto;
	}

	public Float getCustoProduto()
	{
		return custoProduto;
	}

	@Column(name="PEDI_PERDESC", nullable =  true , length = 17)
	@XmlElement(name = "perdesc")
	private Float perdesc= 0f;

	public void setPerdesc(Float perdesc)
	{
		this.perdesc = perdesc;
	}

	public Float getPerdesc()
	{
		return perdesc;
	}

	@Column(name="PEDI_TOTAL_DESCONTO", nullable =  true , length = 17)
	@XmlElement(name = "totalDesconto")
	private Float totalDesconto= 0f;

	public void setTotalDesconto(Float totalDesconto)
	{
		this.totalDesconto = totalDesconto;
	}

	public Float getTotalDesconto()
	{
		return totalDesconto;
	}

	@Column(name="CODCONTROLE", nullable =  true , length = 11)
	@XmlElement(name = "codcontrole")
	private Integer codcontrole;

	public void setCodcontrole(Integer codcontrole)
	{
		this.codcontrole = codcontrole;
	}

	public Integer getCodcontrole()
	{
		return codcontrole;
	}

	@Column(name="CODPEDVENDATIPOLENTE_TMP", nullable =  true , length = 11)
	@XmlElement(name = "tmp")
	private Integer tmp;

	public void setTmp(Integer tmp)
	{
		this.tmp = tmp;
	}

	public Integer getTmp()
	{
		return tmp;
	}

	@Column(name="PEDI_STATUS", nullable =  true , length = 15)
	@XmlElement(name = "status")
	private String status;

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}

	@Column(name="PEDI_DESC_PROP_PED", nullable =  true , length = 17)
	@XmlElement(name = "descPropPed")
	private Float descPropPed= 0f;

	public void setDescPropPed(Float descPropPed)
	{
		this.descPropPed = descPropPed;
	}

	public Float getDescPropPed()
	{
		return descPropPed;
	}

	@Column(name="PEDI_VLR_COMISSAO_1", nullable =  true , length = 17)
	@XmlElement(name = "vlrComissao1")
	private Float vlrComissao1= 0f;

	public void setVlrComissao1(Float vlrComissao1)
	{
		this.vlrComissao1 = vlrComissao1;
	}

	public Float getVlrComissao1()
	{
		return vlrComissao1;
	}

	@Column(name="PEDI_VLR_COMISSAO_2", nullable =  true , length = 17)
	@XmlElement(name = "vlrComissao2")
	private Float vlrComissao2= 0f;

	public void setVlrComissao2(Float vlrComissao2)
	{
		this.vlrComissao2 = vlrComissao2;
	}

	public Float getVlrComissao2()
	{
		return vlrComissao2;
	}

	@Column(name="PEDI_TROCA_PROP_PED", nullable =  true , length = 17)
	@XmlElement(name = "trocaPropPed")
	private Float trocaPropPed= 0f;

	public void setTrocaPropPed(Float trocaPropPed)
	{
		this.trocaPropPed = trocaPropPed;
	}

	public Float getTrocaPropPed()
	{
		return trocaPropPed;
	}

	@Column(name="PEDI_ANT_VLR_COMIS_1", nullable =  true , length = 17)
	@XmlElement(name = "antVlrComis1")
	private Float antVlrComis1= 0f;

	public void setAntVlrComis1(Float antVlrComis1)
	{
		this.antVlrComis1 = antVlrComis1;
	}

	public Float getAntVlrComis1()
	{
		return antVlrComis1;
	}

	@Column(name="PEDI_ANT_VLR_COMIS_2", nullable =  true , length = 17)
	@XmlElement(name = "antVlrComis2")
	private Float antVlrComis2= 0f;

	public void setAntVlrComis2(Float antVlrComis2)
	{
		this.antVlrComis2 = antVlrComis2;
	}

	public Float getAntVlrComis2()
	{
		return antVlrComis2;
	}

	@Column(name="PEDI_VLRDIF", nullable =  true , length = 17)
	@XmlElement(name = "vlrdif")
	private Float vlrdif= 0f;

	public void setVlrdif(Float vlrdif)
	{
		this.vlrdif = vlrdif;
	}

	public Float getVlrdif()
	{
		return vlrdif;
	}

	@Column(name="PEDI_ACRESC_PROP_PED", nullable =  true , length = 17)
	@XmlElement(name = "acrescPropPed")
	private Float acrescPropPed= 0f;

	public void setAcrescPropPed(Float acrescPropPed)
	{
		this.acrescPropPed = acrescPropPed;
	}

	public Float getAcrescPropPed()
	{
		return acrescPropPed;
	}

	@Column(name="PEDI_VLR2", nullable =  true , length = 17)
	@XmlElement(name = "vlr2")
	private Float vlr2= 0f;

	public void setVlr2(Float vlr2)
	{
		this.vlr2 = vlr2;
	}

	public Float getVlr2()
	{
		return vlr2;
	}

	@Column(name="PEDI_NUMLOTE", nullable =  true , length = 20)
	@XmlElement(name = "numlote")
	private String numlote;

	public void setNumlote(String numlote)
	{
		this.numlote = numlote;
	}

	public String getNumlote()
	{
		return numlote;
	}

	@Column(name="PEDI_MEDICO", nullable =  true , length = 40)
	@XmlElement(name = "medico")
	private String medico;

	public void setMedico(String medico)
	{
		this.medico = medico;
	}

	public String getMedico()
	{
		return medico;
	}

	@Column(name="PEDI_MEDICO_RP", nullable =  true , length = 11)
	@XmlElement(name = "medicoRp")
	private Integer medicoRp;

	public void setMedicoRp(Integer medicoRp)
	{
		this.medicoRp = medicoRp;
	}

	public Integer getMedicoRp()
	{
		return medicoRp;
	}

	@Column(name="PEDI_MEDICO_RP_TIPO", nullable =  true , length = 4)
	@XmlElement(name = "medicoRpTipo")
	private String medicoRpTipo;

	public void setMedicoRpTipo(String medicoRpTipo)
	{
		this.medicoRpTipo = medicoRpTipo;
	}

	public String getMedicoRpTipo()
	{
		return medicoRpTipo;
	}

	@Column(name="PEDI_MEDICO_RP_UF", nullable =  true , length = 2)
	@XmlElement(name = "medicoRpUf")
	private String medicoRpUf;

	public void setMedicoRpUf(String medicoRpUf)
	{
		this.medicoRpUf = medicoRpUf;
	}

	public String getMedicoRpUf()
	{
		return medicoRpUf;
	}

	@Column(name="PEDI_RECEITA_DT", nullable =  true , length = 10)
	@XmlElement(name = "receitaDt")
	private java.sql.Timestamp receitaDt;

	public void setReceitaDt(java.sql.Timestamp receitaDt)
	{
		this.receitaDt = receitaDt;
	}

	public java.sql.Timestamp getReceitaDt()
	{
		return receitaDt;
	}

	@Column(name="PEDI_RECEITA_TP", nullable =  true , length = 1)
	@XmlElement(name = "receitaTp")
	private String receitaTp;

	public void setReceitaTp(String receitaTp)
	{
		this.receitaTp = receitaTp;
	}

	public String getReceitaTp()
	{
		return receitaTp;
	}

	public void setReceitaTpBoolean(Boolean value)
	{
		if (value) {
			this.receitaTp = "S";
		}
		else {
			this.receitaTp = "N";
		}
	}
	public Boolean getReceitaTpBoolean()
	{
		return ((this.receitaTp != null)&&(this.receitaTp.equalsIgnoreCase("S")));
	}
	@Column(name="PEDI_RECEITA_NR", nullable =  true , length = 11)
	@XmlElement(name = "receitaNr")
	private Integer receitaNr;

	public void setReceitaNr(Integer receitaNr)
	{
		this.receitaNr = receitaNr;
	}

	public Integer getReceitaNr()
	{
		return receitaNr;
	}

	@Column(name="PEDI_REC_NOME", nullable =  true , length = 40)
	@XmlElement(name = "recNome")
	private String recNome;

	public void setRecNome(String recNome)
	{
		this.recNome = recNome;
	}

	public String getRecNome()
	{
		return recNome;
	}

	@Column(name="PEDI_REC_ID", nullable =  true , length = 15)
	@XmlElement(name = "recId")
	private String recId;

	public void setRecId(String recId)
	{
		this.recId = recId;
	}

	public String getRecId()
	{
		return recId;
	}

	@Column(name="PEDI_REC_ORG", nullable =  true , length = 5)
	@XmlElement(name = "recOrg")
	private String recOrg;

	public void setRecOrg(String recOrg)
	{
		this.recOrg = recOrg;
	}

	public String getRecOrg()
	{
		return recOrg;
	}

	@Column(name="PEDI_REC_UF", nullable =  true , length = 2)
	@XmlElement(name = "recUf")
	private String recUf;

	public void setRecUf(String recUf)
	{
		this.recUf = recUf;
	}

	public String getRecUf()
	{
		return recUf;
	}

	@Column(name="PEDI_OBS", nullable =  true , length = 200)
	@XmlElement(name = "obs")
	private String obs;

	public void setObs(String obs)
	{
		this.obs = obs;
	}

	public String getObs()
	{
		return obs;
	}

	@Column(name="PEDI_STATUS_ENTREGA", nullable =  true , length = 15)
	@XmlElement(name = "statusEntrega")
	private String statusEntrega;

	public void setStatusEntrega(String statusEntrega)
	{
		this.statusEntrega = statusEntrega;
	}

	public String getStatusEntrega()
	{
		return statusEntrega;
	}

	@Column(name="CODPESSOA", nullable =  true , length = 11)
	@XmlElement(name = "codpessoa")
	private Integer codpessoa;

	public void setCodpessoa(Integer codpessoa)
	{
		this.codpessoa = codpessoa;
	}

	public Integer getCodpessoa()
	{
		return codpessoa;
	}

	@Column(name="PEDI_ACRESCVLR", nullable =  true , length = 17)
	@XmlElement(name = "acrescvlr")
	private Float acrescvlr= 0f;

	public void setAcrescvlr(Float acrescvlr)
	{
		this.acrescvlr = acrescvlr;
	}

	public Float getAcrescvlr()
	{
		return acrescvlr;
	}

	@Column(name="PEDI_PERACRESC", nullable =  true , length = 9)
	@XmlElement(name = "peracresc")
	private Float peracresc= 0f;

	public void setPeracresc(Float peracresc)
	{
		this.peracresc = peracresc;
	}

	public Float getPeracresc()
	{
		return peracresc;
	}

	@Column(name="PEDI_TOTAL_ACRESCIMO", nullable =  true , length = 17)
	@XmlElement(name = "totalAcrescimo")
	private Float totalAcrescimo= 0f;

	public void setTotalAcrescimo(Float totalAcrescimo)
	{
		this.totalAcrescimo = totalAcrescimo;
	}

	public Float getTotalAcrescimo()
	{
		return totalAcrescimo;
	}

	@Column(name="SSM_MODIFICACAO", nullable =  true , length = 19)
	@XmlElement(name = "modificacao")
	private java.sql.Timestamp modificacao;

	public void setModificacao(java.sql.Timestamp modificacao)
	{
		this.modificacao = modificacao;
	}

	public java.sql.Timestamp getModificacao()
	{
		return modificacao;
	}

	@Column(name="SSM_REVISAO", nullable =  true , length = 11)
	@XmlElement(name = "revisao")
	private Integer revisao;

	public void setRevisao(Integer revisao)
	{
		this.revisao = revisao;
	}

	public Integer getRevisao()
	{
		return revisao;
	}

	@Column(name="CODEMPRESA", nullable =  true , length = 11)
	@XmlElement(name = "codempresa")
	private Integer codempresa;

	public void setCodempresa(Integer codempresa)
	{
		this.codempresa = codempresa;
	}

	public Integer getCodempresa()
	{
		return codempresa;
	}

	@Column(name="AUX", nullable =  true , length = 1)
	@XmlElement(name = "aux")
	private String aux;

	public void setAux(String aux)
	{
		this.aux = aux;
	}

	public String getAux()
	{
		return aux;
	}

	public void setAuxBoolean(Boolean value)
	{
		if (value) {
			this.aux = "S";
		}
		else {
			this.aux = "N";
		}
	}
	public Boolean getAuxBoolean()
	{
		return ((this.aux != null)&&(this.aux.equalsIgnoreCase("S")));
	}
	@Column(name="PEDI_PEND_COMPRA_GERADA", nullable =  true , length = 1)
	@XmlElement(name = "pendCompraGerada")
	private String pendCompraGerada;

	public void setPendCompraGerada(String pendCompraGerada)
	{
		this.pendCompraGerada = pendCompraGerada;
	}

	public String getPendCompraGerada()
	{
		return pendCompraGerada;
	}

	public void setPendCompraGeradaBoolean(Boolean value)
	{
		if (value) {
			this.pendCompraGerada = "S";
		}
		else {
			this.pendCompraGerada = "N";
		}
	}
	public Boolean getPendCompraGeradaBoolean()
	{
		return ((this.pendCompraGerada != null)&&(this.pendCompraGerada.equalsIgnoreCase("S")));
	}
	@Column(name="PEDI_PREPARACAO", nullable =  true , length = 15)
	@XmlElement(name = "preparacao")
	private String preparacao;

	public void setPreparacao(String preparacao)
	{
		this.preparacao = preparacao;
	}

	public String getPreparacao()
	{
		return preparacao;
	}

	@Column(name="PEDI_PRECO_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "precoCompra")
	private Float precoCompra= 0f;

	public void setPrecoCompra(Float precoCompra)
	{
		this.precoCompra = precoCompra;
	}

	public Float getPrecoCompra()
	{
		return precoCompra;
	}

	@Column(name="PEDI_ULT_PRECO_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "ultPrecoCompra")
	private Float ultPrecoCompra= 0f;

	public void setUltPrecoCompra(Float ultPrecoCompra)
	{
		this.ultPrecoCompra = ultPrecoCompra;
	}

	public Float getUltPrecoCompra()
	{
		return ultPrecoCompra;
	}

	@Column(name="PEDI_ULT_CUSTO", nullable =  true , length = 17)
	@XmlElement(name = "ultCusto")
	private Float ultCusto= 0f;

	public void setUltCusto(Float ultCusto)
	{
		this.ultCusto = ultCusto;
	}

	public Float getUltCusto()
	{
		return ultCusto;
	}

	@Column(name="PEDI_ANT_CALC_PRECO_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "antCalcPrecoCompra")
	private Float antCalcPrecoCompra= 0f;

	public void setAntCalcPrecoCompra(Float antCalcPrecoCompra)
	{
		this.antCalcPrecoCompra = antCalcPrecoCompra;
	}

	public Float getAntCalcPrecoCompra()
	{
		return antCalcPrecoCompra;
	}

	@Column(name="PEDI_ANT_CALC_CUSTO_PRODUTO", nullable =  true , length = 17)
	@XmlElement(name = "antCalcCustoProduto")
	private Float antCalcCustoProduto= 0f;

	public void setAntCalcCustoProduto(Float antCalcCustoProduto)
	{
		this.antCalcCustoProduto = antCalcCustoProduto;
	}

	public Float getAntCalcCustoProduto()
	{
		return antCalcCustoProduto;
	}

	@Column(name="PEDI_ALIQ_IPI", nullable =  true , length = 17)
	@XmlElement(name = "aliqIpi")
	private Float aliqIpi= 0f;

	public void setAliqIpi(Float aliqIpi)
	{
		this.aliqIpi = aliqIpi;
	}

	public Float getAliqIpi()
	{
		return aliqIpi;
	}

	@Column(name="PEDI_VLR_IPI", nullable =  true , length = 17)
	@XmlElement(name = "vlrIpi")
	private Float vlrIpi= 0f;

	public void setVlrIpi(Float vlrIpi)
	{
		this.vlrIpi = vlrIpi;
	}

	public Float getVlrIpi()
	{
		return vlrIpi;
	}

	@Column(name="PEDI_ALIQ_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcms")
	private Float aliqIcms= 0f;

	public void setAliqIcms(Float aliqIcms)
	{
		this.aliqIcms = aliqIcms;
	}

	public Float getAliqIcms()
	{
		return aliqIcms;
	}

	@Column(name="PEDI_VLR_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "vlrIcms")
	private Float vlrIcms= 0f;

	public void setVlrIcms(Float vlrIcms)
	{
		this.vlrIcms = vlrIcms;
	}

	public Float getVlrIcms()
	{
		return vlrIcms;
	}

	@Column(name="PEDI_BC_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "bcIcms")
	private Float bcIcms= 0f;

	public void setBcIcms(Float bcIcms)
	{
		this.bcIcms = bcIcms;
	}

	public Float getBcIcms()
	{
		return bcIcms;
	}

	@Column(name="PEDI_BC_IPI", nullable =  true , length = 17)
	@XmlElement(name = "bcIpi")
	private Float bcIpi= 0f;

	public void setBcIpi(Float bcIpi)
	{
		this.bcIpi = bcIpi;
	}

	public Float getBcIpi()
	{
		return bcIpi;
	}

	@Column(name="PEDI_ENTREGA", nullable =  true , length = 15)
	@XmlElement(name = "entrega")
	private String entrega;

	public void setEntrega(String entrega)
	{
		this.entrega = entrega;
	}

	public String getEntrega()
	{
		return entrega;
	}

	@Column(name="CODVENDEDOR", nullable =  true , length = 11)
	@XmlElement(name = "codvendedor")
	private Integer codvendedor;

	public void setCodvendedor(Integer codvendedor)
	{
		this.codvendedor = codvendedor;
	}

	public Integer getCodvendedor()
	{
		return codvendedor;
	}

	@Column(name="CODCFOP", nullable =  true , length = 4)
	@XmlElement(name = "codcfop")
	private String codcfop;

	public void setCodcfop(String codcfop)
	{
		this.codcfop = codcfop;
	}

	public String getCodcfop()
	{
		return codcfop;
	}

	@Column(name="PEDI_ESTOQUE_BAIXADO", nullable =  false , length = 1)
	@XmlElement(name = "estoqueBaixado")
	private String estoqueBaixado;

	public void setEstoqueBaixado(String estoqueBaixado)
	{
		this.estoqueBaixado = estoqueBaixado;
	}

	public String getEstoqueBaixado()
	{
		return estoqueBaixado;
	}

	public void setEstoqueBaixadoBoolean(Boolean value)
	{
		if (value) {
			this.estoqueBaixado = "S";
		}
		else {
			this.estoqueBaixado = "N";
		}
	}
	public Boolean getEstoqueBaixadoBoolean()
	{
		return ((this.estoqueBaixado != null)&&(this.estoqueBaixado.equalsIgnoreCase("S")));
	}
	@Column(name="PEDI_RECEITA_PAC_NOME", nullable =  true , length = 40)
	@XmlElement(name = "receitaPacNome")
	private String receitaPacNome;

	public void setReceitaPacNome(String receitaPacNome)
	{
		this.receitaPacNome = receitaPacNome;
	}

	public String getReceitaPacNome()
	{
		return receitaPacNome;
	}

	@Column(name="PEDI_RECEITA_PAC_IDADE", nullable =  true , length = 11)
	@XmlElement(name = "receitaPacIdade")
	private Integer receitaPacIdade;

	public void setReceitaPacIdade(Integer receitaPacIdade)
	{
		this.receitaPacIdade = receitaPacIdade;
	}

	public Integer getReceitaPacIdade()
	{
		return receitaPacIdade;
	}

	@Column(name="PEDI_RECEITA_PAC_SEXO", nullable =  true , length = 1)
	@XmlElement(name = "receitaPacSexo")
	private String receitaPacSexo;

	public void setReceitaPacSexo(String receitaPacSexo)
	{
		this.receitaPacSexo = receitaPacSexo;
	}

	public String getReceitaPacSexo()
	{
		return receitaPacSexo;
	}

	public void setReceitaPacSexoBoolean(Boolean value)
	{
		if (value) {
			this.receitaPacSexo = "S";
		}
		else {
			this.receitaPacSexo = "N";
		}
	}
	public Boolean getReceitaPacSexoBoolean()
	{
		return ((this.receitaPacSexo != null)&&(this.receitaPacSexo.equalsIgnoreCase("S")));
	}
	@Column(name="PEDI_QTDE_RESERVA", nullable =  true , length = 17)
	@XmlElement(name = "qtdeReserva")
	private Float qtdeReserva= 0f;

	public void setQtdeReserva(Float qtdeReserva)
	{
		this.qtdeReserva = qtdeReserva;
	}

	public Float getQtdeReserva()
	{
		return qtdeReserva;
	}

	@Column(name="PEDI_QTDE_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "qtdeCompra")
	private Float qtdeCompra= 0f;

	public void setQtdeCompra(Float qtdeCompra)
	{
		this.qtdeCompra = qtdeCompra;
	}

	public Float getQtdeCompra()
	{
		return qtdeCompra;
	}

	@Column(name="PEDI_PER_REDUC", nullable =  true , length = 17)
	@XmlElement(name = "perReduc")
	private Float perReduc= 0f;

	public void setPerReduc(Float perReduc)
	{
		this.perReduc = perReduc;
	}

	public Float getPerReduc()
	{
		return perReduc;
	}

	@Column(name="PEDI_DATA_ENTREGA", nullable =  true , length = 10)
	@XmlElement(name = "dataEntrega")
	private java.sql.Timestamp dataEntrega;

	public void setDataEntrega(java.sql.Timestamp dataEntrega)
	{
		this.dataEntrega = dataEntrega;
	}

	public java.sql.Timestamp getDataEntrega()
	{
		return dataEntrega;
	}

	@Column(name="PEDI_RESERVA_OK", nullable =  true , length = 1)
	@XmlElement(name = "reservaOk")
	private String reservaOk;

	public void setReservaOk(String reservaOk)
	{
		this.reservaOk = reservaOk;
	}

	public String getReservaOk()
	{
		return reservaOk;
	}

	public void setReservaOkBoolean(Boolean value)
	{
		if (value) {
			this.reservaOk = "S";
		}
		else {
			this.reservaOk = "N";
		}
	}
	public Boolean getReservaOkBoolean()
	{
		return ((this.reservaOk != null)&&(this.reservaOk.equalsIgnoreCase("S")));
	}
	@Column(name="CODPESSOA_FORNECEDOR", nullable =  true , length = 11)
	@XmlElement(name = "fornecedor")
	private Integer fornecedor;

	public void setFornecedor(Integer fornecedor)
	{
		this.fornecedor = fornecedor;
	}

	public Integer getFornecedor()
	{
		return fornecedor;
	}

	@Column(name="CODNFVENDAITEM", nullable =  true , length = 11)
	@XmlElement(name = "codnfvendaitem")
	private Integer codnfvendaitem;

	public void setCodnfvendaitem(Integer codnfvendaitem)
	{
		this.codnfvendaitem = codnfvendaitem;
	}

	public Integer getCodnfvendaitem()
	{
		return codnfvendaitem;
	}

	@Column(name="CODPEDCOMPRAITEM", nullable =  true , length = 11)
	@XmlElement(name = "codpedcompraitem")
	private Integer codpedcompraitem;

	public void setCodpedcompraitem(Integer codpedcompraitem)
	{
		this.codpedcompraitem = codpedcompraitem;
	}

	public Integer getCodpedcompraitem()
	{
		return codpedcompraitem;
	}

}
