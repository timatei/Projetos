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
@Table(name = "NFCOMPRA")
@SequenceGenerator(name = "INC_NFCOMPRA", sequenceName = "GEN_NFCOMPRA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "nfcompra") 
public class NfCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public NfCompra() {	
	}

	@Id
	@Column(name="CODNFCOMPRA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_NFCOMPRA")
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

	@Column(name="CODPESSOA", nullable =  false , length = 11)
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

	@Column(name="CODCFOP", nullable =  false , length = 4)
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

	@Column(name="CODTRANSPORTADORA", nullable =  true , length = 11)
	@XmlElement(name = "codtransportadora")
	private Integer codtransportadora;

	public void setCodtransportadora(Integer codtransportadora)
	{
		this.codtransportadora = codtransportadora;
	}

	public Integer getCodtransportadora()
	{
		return codtransportadora;
	}

	@Column(name="CODFORMAPAGAMENTO", nullable =  false , length = 11)
	@XmlElement(name = "codformapagamento")
	private Integer codformapagamento;

	public void setCodformapagamento(Integer codformapagamento)
	{
		this.codformapagamento = codformapagamento;
	}

	public Integer getCodformapagamento()
	{
		return codformapagamento;
	}

	@Column(name="NFC_STATUS", nullable =  false , length = 15)
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

	@Column(name="NFC_NRNOTA", nullable =  false , length = 11)
	@XmlElement(name = "nrnota")
	private Integer nrnota;

	public void setNrnota(Integer nrnota)
	{
		this.nrnota = nrnota;
	}

	public Integer getNrnota()
	{
		return nrnota;
	}

	@Column(name="NFC_SERIE", nullable =  true , length = 4)
	@XmlElement(name = "serie")
	private String serie;

	public void setSerie(String serie)
	{
		this.serie = serie;
	}

	public String getSerie()
	{
		return serie;
	}

	@Column(name="NFC_DATA_EMI", nullable =  false , length = 10)
	@XmlElement(name = "dataEmi")
	private java.sql.Timestamp dataEmi;

	public void setDataEmi(java.sql.Timestamp dataEmi)
	{
		this.dataEmi = dataEmi;
	}

	public java.sql.Timestamp getDataEmi()
	{
		return dataEmi;
	}

	@Column(name="NFC_DATA_ENTR", nullable =  true , length = 10)
	@XmlElement(name = "dataEntr")
	private java.sql.Timestamp dataEntr;

	public void setDataEntr(java.sql.Timestamp dataEntr)
	{
		this.dataEntr = dataEntr;
	}

	public java.sql.Timestamp getDataEntr()
	{
		return dataEntr;
	}

	@Column(name="NFC_ICMS_BASE", nullable =  true , length = 17)
	@XmlElement(name = "icmsBase")
	private Float icmsBase= 0f;

	public void setIcmsBase(Float icmsBase)
	{
		this.icmsBase = icmsBase;
	}

	public Float getIcmsBase()
	{
		return icmsBase;
	}

	@Column(name="NFC_ICMS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "icmsVlr")
	private Float icmsVlr= 0f;

	public void setIcmsVlr(Float icmsVlr)
	{
		this.icmsVlr = icmsVlr;
	}

	public Float getIcmsVlr()
	{
		return icmsVlr;
	}

	@Column(name="NFC_ICMS_SUB_BASE", nullable =  true , length = 17)
	@XmlElement(name = "icmsSubBase")
	private Float icmsSubBase= 0f;

	public void setIcmsSubBase(Float icmsSubBase)
	{
		this.icmsSubBase = icmsSubBase;
	}

	public Float getIcmsSubBase()
	{
		return icmsSubBase;
	}

	@Column(name="NFC_ICMS_SUB_VLR", nullable =  true , length = 17)
	@XmlElement(name = "icmsSubVlr")
	private Float icmsSubVlr= 0f;

	public void setIcmsSubVlr(Float icmsSubVlr)
	{
		this.icmsSubVlr = icmsSubVlr;
	}

	public Float getIcmsSubVlr()
	{
		return icmsSubVlr;
	}

	@Column(name="NFC_PRODUTOS_TOTAL", nullable =  true , length = 17)
	@XmlElement(name = "produtosTotal")
	private Float produtosTotal= 0f;

	public void setProdutosTotal(Float produtosTotal)
	{
		this.produtosTotal = produtosTotal;
	}

	public Float getProdutosTotal()
	{
		return produtosTotal;
	}

	@Column(name="NFC_FRETE_VLR", nullable =  true , length = 17)
	@XmlElement(name = "freteVlr")
	private Float freteVlr= 0f;

	public void setFreteVlr(Float freteVlr)
	{
		this.freteVlr = freteVlr;
	}

	public Float getFreteVlr()
	{
		return freteVlr;
	}

	@Column(name="NFC_SEGURO_VLR", nullable =  true , length = 17)
	@XmlElement(name = "seguroVlr")
	private Float seguroVlr= 0f;

	public void setSeguroVlr(Float seguroVlr)
	{
		this.seguroVlr = seguroVlr;
	}

	public Float getSeguroVlr()
	{
		return seguroVlr;
	}

	@Column(name="NFC_OUTRAS_DESPESAS", nullable =  true , length = 17)
	@XmlElement(name = "outrasDespesas")
	private Float outrasDespesas= 0f;

	public void setOutrasDespesas(Float outrasDespesas)
	{
		this.outrasDespesas = outrasDespesas;
	}

	public Float getOutrasDespesas()
	{
		return outrasDespesas;
	}

	@Column(name="NFC_IPI_BASE", nullable =  true , length = 17)
	@XmlElement(name = "ipiBase")
	private Float ipiBase= 0f;

	public void setIpiBase(Float ipiBase)
	{
		this.ipiBase = ipiBase;
	}

	public Float getIpiBase()
	{
		return ipiBase;
	}

	@Column(name="NFC_IPI_VLR", nullable =  true , length = 17)
	@XmlElement(name = "ipiVlr")
	private Float ipiVlr= 0f;

	public void setIpiVlr(Float ipiVlr)
	{
		this.ipiVlr = ipiVlr;
	}

	public Float getIpiVlr()
	{
		return ipiVlr;
	}

	@Column(name="NFC_SERVICOS_TOTAL", nullable =  true , length = 17)
	@XmlElement(name = "servicosTotal")
	private Float servicosTotal= 0f;

	public void setServicosTotal(Float servicosTotal)
	{
		this.servicosTotal = servicosTotal;
	}

	public Float getServicosTotal()
	{
		return servicosTotal;
	}

	@Column(name="NFC_IR_VLR", nullable =  true , length = 17)
	@XmlElement(name = "irVlr")
	private Float irVlr= 0f;

	public void setIrVlr(Float irVlr)
	{
		this.irVlr = irVlr;
	}

	public Float getIrVlr()
	{
		return irVlr;
	}

	@Column(name="NFC_ALTERAR_ICMS", nullable =  false , length = 1)
	@XmlElement(name = "alterarIcms")
	private String alterarIcms;

	public void setAlterarIcms(String alterarIcms)
	{
		this.alterarIcms = alterarIcms;
	}

	public String getAlterarIcms()
	{
		return alterarIcms;
	}

	public void setAlterarIcmsBoolean(Boolean value)
	{
		if (value) {
			this.alterarIcms = "S";
		}
		else {
			this.alterarIcms = "N";
		}
	}
	public Boolean getAlterarIcmsBoolean()
	{
		return ((this.alterarIcms != null)&&(this.alterarIcms.equalsIgnoreCase("S")));
	}
	@Column(name="NFC_TOTAL_NOTA", nullable =  true , length = 17)
	@XmlElement(name = "totalNota")
	private Float totalNota= 0f;

	public void setTotalNota(Float totalNota)
	{
		this.totalNota = totalNota;
	}

	public Float getTotalNota()
	{
		return totalNota;
	}

	@Column(name="NFC_ISS_PERCENTUAL", nullable =  true , length = 17)
	@XmlElement(name = "issPercentual")
	private Float issPercentual= 0f;

	public void setIssPercentual(Float issPercentual)
	{
		this.issPercentual = issPercentual;
	}

	public Float getIssPercentual()
	{
		return issPercentual;
	}

	@Column(name="NFC_OBS", nullable =  true , length = 300)
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

	@Column(name="NFC_FINANCEIRO", nullable =  false , length = 1)
	@XmlElement(name = "financeiro")
	private String financeiro;

	public void setFinanceiro(String financeiro)
	{
		this.financeiro = financeiro;
	}

	public String getFinanceiro()
	{
		return financeiro;
	}

	public void setFinanceiroBoolean(Boolean value)
	{
		if (value) {
			this.financeiro = "S";
		}
		else {
			this.financeiro = "N";
		}
	}
	public Boolean getFinanceiroBoolean()
	{
		return ((this.financeiro != null)&&(this.financeiro.equalsIgnoreCase("S")));
	}
	@Column(name="NFC_ESTOQUE", nullable =  false , length = 1)
	@XmlElement(name = "estoque")
	private String estoque;

	public void setEstoque(String estoque)
	{
		this.estoque = estoque;
	}

	public String getEstoque()
	{
		return estoque;
	}

	public void setEstoqueBoolean(Boolean value)
	{
		if (value) {
			this.estoque = "S";
		}
		else {
			this.estoque = "N";
		}
	}
	public Boolean getEstoqueBoolean()
	{
		return ((this.estoque != null)&&(this.estoque.equalsIgnoreCase("S")));
	}
	@Column(name="NFC_ATUALIZOU_CUSTO", nullable =  true , length = 1)
	@XmlElement(name = "atualizouCusto")
	private String atualizouCusto;

	public void setAtualizouCusto(String atualizouCusto)
	{
		this.atualizouCusto = atualizouCusto;
	}

	public String getAtualizouCusto()
	{
		return atualizouCusto;
	}

	public void setAtualizouCustoBoolean(Boolean value)
	{
		if (value) {
			this.atualizouCusto = "S";
		}
		else {
			this.atualizouCusto = "N";
		}
	}
	public Boolean getAtualizouCustoBoolean()
	{
		return ((this.atualizouCusto != null)&&(this.atualizouCusto.equalsIgnoreCase("S")));
	}
	@Column(name="NFC_VLR_ICMS_DIF", nullable =  true , length = 17)
	@XmlElement(name = "vlrIcmsDif")
	private Float vlrIcmsDif= 0f;

	public void setVlrIcmsDif(Float vlrIcmsDif)
	{
		this.vlrIcmsDif = vlrIcmsDif;
	}

	public Float getVlrIcmsDif()
	{
		return vlrIcmsDif;
	}

	@Column(name="NFC_DT_FATURAMENTO", nullable =  true , length = 19)
	@XmlElement(name = "dtFaturamento")
	private java.sql.Timestamp dtFaturamento;

	public void setDtFaturamento(java.sql.Timestamp dtFaturamento)
	{
		this.dtFaturamento = dtFaturamento;
	}

	public java.sql.Timestamp getDtFaturamento()
	{
		return dtFaturamento;
	}

	@Column(name="NFC_VLR_DESCONTO", nullable =  true , length = 17)
	@XmlElement(name = "vlrDesconto")
	private Float vlrDesconto= 0f;

	public void setVlrDesconto(Float vlrDesconto)
	{
		this.vlrDesconto = vlrDesconto;
	}

	public Float getVlrDesconto()
	{
		return vlrDesconto;
	}

	@Column(name="CODPEDCOMPRA", nullable =  true , length = 11)
	@XmlElement(name = "codpedcompra")
	private Integer codpedcompra;

	public void setCodpedcompra(Integer codpedcompra)
	{
		this.codpedcompra = codpedcompra;
	}

	public Integer getCodpedcompra()
	{
		return codpedcompra;
	}

	@Column(name="NFC_TIPO_FRETE", nullable =  true , length = 3)
	@XmlElement(name = "tipoFrete")
	private String tipoFrete;

	public void setTipoFrete(String tipoFrete)
	{
		this.tipoFrete = tipoFrete;
	}

	public String getTipoFrete()
	{
		return tipoFrete;
	}

	@Column(name="NFC_IMP_FRONT", nullable =  true , length = 17)
	@XmlElement(name = "impFront")
	private Float impFront= 0f;

	public void setImpFront(Float impFront)
	{
		this.impFront = impFront;
	}

	public Float getImpFront()
	{
		return impFront;
	}

	@Column(name="CODCENTCUSTO", nullable =  true , length = 11)
	@XmlElement(name = "codcentcusto")
	private Integer codcentcusto;

	public void setCodcentcusto(Integer codcentcusto)
	{
		this.codcentcusto = codcentcusto;
	}

	public Integer getCodcentcusto()
	{
		return codcentcusto;
	}

	@Column(name="CODNFVENDA", nullable =  true , length = 11)
	@XmlElement(name = "codnfvenda")
	private Integer codnfvenda;

	public void setCodnfvenda(Integer codnfvenda)
	{
		this.codnfvenda = codnfvenda;
	}

	public Integer getCodnfvenda()
	{
		return codnfvenda;
	}

	@Column(name="CODSERIE", nullable =  true , length = 3)
	@XmlElement(name = "codserie")
	private String codserie;

	public void setCodserie(String codserie)
	{
		this.codserie = codserie;
	}

	public String getCodserie()
	{
		return codserie;
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

	@Column(name="NFC_NRCONHECIMENTO", nullable =  true , length = 10)
	@XmlElement(name = "nrconhecimento")
	private String nrconhecimento;

	public void setNrconhecimento(String nrconhecimento)
	{
		this.nrconhecimento = nrconhecimento;
	}

	public String getNrconhecimento()
	{
		return nrconhecimento;
	}

}
