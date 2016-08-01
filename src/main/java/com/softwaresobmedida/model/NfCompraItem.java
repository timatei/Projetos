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
@Table(name = "NFCOMPRA_ITEM")
@SequenceGenerator(name = "INC_NFCOMPRA_ITEM", sequenceName = "GEN_NFCOMPRA_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "nfcompraItem") 
public class NfCompraItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public NfCompraItem() {	
	}

	@Id
	@Column(name="CODNFCOMPRAITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_NFCOMPRA_ITEM")
	@XmlElement(name = "codnfcompraitem")
	private Integer codnfcompraitem;

	public void setCodnfcompraitem(Integer codnfcompraitem)
	{
		this.codnfcompraitem = codnfcompraitem;
	}

	public Integer getCodnfcompraitem()
	{
		return codnfcompraitem;
	}

	@Column(name="CODNFCOMPRA", nullable =  false , length = 11)
	@XmlElement(name = "codnfcompra")
	private Integer codnfcompra;

	public void setCodnfcompra(Integer codnfcompra)
	{
		this.codnfcompra = codnfcompra;
	}

	public Integer getCodnfcompra()
	{
		return codnfcompra;
	}

	@Column(name="CODPRODUTO", nullable =  true , length = 11)
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

	@Column(name="NFCI_QTDE", nullable =  true , length = 17)
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

	@Column(name="NFCI_VLRUNIT", nullable =  true , length = 17)
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

	@Column(name="NFCI_ALIQ_ICMS", nullable =  true , length = 17)
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

	@Column(name="NFCI_ALIQ_IPI", nullable =  true , length = 17)
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

	@Column(name="NFCI_QTDE_COMPRA", nullable =  true , length = 17)
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

	@Column(name="NFCI_CUSTO_ANTERIOR", nullable =  true , length = 17)
	@XmlElement(name = "custoAnterior")
	private Float custoAnterior= 0f;

	public void setCustoAnterior(Float custoAnterior)
	{
		this.custoAnterior = custoAnterior;
	}

	public Float getCustoAnterior()
	{
		return custoAnterior;
	}

	@Column(name="NFCI_CUSTO_ATUAL", nullable =  true , length = 17)
	@XmlElement(name = "custoAtual")
	private Float custoAtual= 0f;

	public void setCustoAtual(Float custoAtual)
	{
		this.custoAtual = custoAtual;
	}

	public Float getCustoAtual()
	{
		return custoAtual;
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

	@Column(name="NFCI_DESC_PERC", nullable =  true , length = 17)
	@XmlElement(name = "descPerc")
	private Float descPerc= 0f;

	public void setDescPerc(Float descPerc)
	{
		this.descPerc = descPerc;
	}

	public Float getDescPerc()
	{
		return descPerc;
	}

	@Column(name="CODPRODUTOUNIDADE_NFI", nullable =  true , length = 11)
	@XmlElement(name = "nfi")
	private Integer nfi;

	public void setNfi(Integer nfi)
	{
		this.nfi = nfi;
	}

	public Integer getNfi()
	{
		return nfi;
	}

	@Column(name="NFCI_QTDE_UND", nullable =  true , length = 17)
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

	@Column(name="NFCI_VLR_UND", nullable =  true , length = 17)
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

	@Column(name="NFCI_VLR_ICMS", nullable =  true , length = 17)
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

	@Column(name="NFCI_VLR_IPI", nullable =  true , length = 17)
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

	@Column(name="NFCI_ALIQ_DESC_BC_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "aliqDescBcIcms")
	private Float aliqDescBcIcms= 0f;

	public void setAliqDescBcIcms(Float aliqDescBcIcms)
	{
		this.aliqDescBcIcms = aliqDescBcIcms;
	}

	public Float getAliqDescBcIcms()
	{
		return aliqDescBcIcms;
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

	@Column(name="NFCI_ALIQ_ICMS_DENTRO", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcmsDentro")
	private Float aliqIcmsDentro= 0f;

	public void setAliqIcmsDentro(Float aliqIcmsDentro)
	{
		this.aliqIcmsDentro = aliqIcmsDentro;
	}

	public Float getAliqIcmsDentro()
	{
		return aliqIcmsDentro;
	}

	@Column(name="NFCI_ALIQ_ICMS_FORA", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcmsFora")
	private Float aliqIcmsFora= 0f;

	public void setAliqIcmsFora(Float aliqIcmsFora)
	{
		this.aliqIcmsFora = aliqIcmsFora;
	}

	public Float getAliqIcmsFora()
	{
		return aliqIcmsFora;
	}

	@Column(name="NFCI_OBS_PRO", nullable =  true , length = 0)
	@XmlElement(name = "obsPro")
	private Float obsPro= 0f;

	public void setObsPro(Float obsPro)
	{
		this.obsPro = obsPro;
	}

	public Float getObsPro()
	{
		return obsPro;
	}

	@Column(name="NFCI_CONTRIBUINTE", nullable =  true , length = 1)
	@XmlElement(name = "contribuinte")
	private String contribuinte;

	public void setContribuinte(String contribuinte)
	{
		this.contribuinte = contribuinte;
	}

	public String getContribuinte()
	{
		return contribuinte;
	}

	public void setContribuinteBoolean(Boolean value)
	{
		if (value) {
			this.contribuinte = "S";
		}
		else {
			this.contribuinte = "N";
		}
	}
	public Boolean getContribuinteBoolean()
	{
		return ((this.contribuinte != null)&&(this.contribuinte.equalsIgnoreCase("S")));
	}
	@Column(name="NFCI_ALTERAR_BC_ICMS", nullable =  true , length = 1)
	@XmlElement(name = "alterarBcIcms")
	private String alterarBcIcms;

	public void setAlterarBcIcms(String alterarBcIcms)
	{
		this.alterarBcIcms = alterarBcIcms;
	}

	public String getAlterarBcIcms()
	{
		return alterarBcIcms;
	}

	public void setAlterarBcIcmsBoolean(Boolean value)
	{
		if (value) {
			this.alterarBcIcms = "S";
		}
		else {
			this.alterarBcIcms = "N";
		}
	}
	public Boolean getAlterarBcIcmsBoolean()
	{
		return ((this.alterarBcIcms != null)&&(this.alterarBcIcms.equalsIgnoreCase("S")));
	}
	@Column(name="NFCI_VLR_BC_ICMS_ALTERADO", nullable =  true , length = 17)
	@XmlElement(name = "vlrBcIcmsAlterado")
	private Float vlrBcIcmsAlterado= 0f;

	public void setVlrBcIcmsAlterado(Float vlrBcIcmsAlterado)
	{
		this.vlrBcIcmsAlterado = vlrBcIcmsAlterado;
	}

	public Float getVlrBcIcmsAlterado()
	{
		return vlrBcIcmsAlterado;
	}

	@Column(name="NFCI_DESCRICAO", nullable =  true , length = 200)
	@XmlElement(name = "descricao")
	private String descricao;

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return descricao;
	}

	@Column(name="NFCI_UNIDADE", nullable =  true , length = 4)
	@XmlElement(name = "unidade")
	private String unidade;

	public void setUnidade(String unidade)
	{
		this.unidade = unidade;
	}

	public String getUnidade()
	{
		return unidade;
	}

	@Column(name="NFCI_DESC_VLR", nullable =  true , length = 17)
	@XmlElement(name = "descVlr")
	private Float descVlr= 0f;

	public void setDescVlr(Float descVlr)
	{
		this.descVlr = descVlr;
	}

	public Float getDescVlr()
	{
		return descVlr;
	}

}
