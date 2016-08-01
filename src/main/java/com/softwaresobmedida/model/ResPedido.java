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
@Table(name = "RES_PEDIDO")
@SequenceGenerator(name = "INC_RES_PEDIDO", sequenceName = "GEN_RES_PEDIDO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resPedido") 
public class ResPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ResPedido() {	
	}

	@Id
	@Column(name="CODPEDIDO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_PEDIDO")
	@XmlElement(name = "codpedido")
	private Integer codpedido;

	public void setCodpedido(Integer codpedido)
	{
		this.codpedido = codpedido;
	}

	public Integer getCodpedido()
	{
		return codpedido;
	}

	@Column(name="CODCONTROLE", nullable =  false , length = 11)
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

	@Column(name="PED_STATUS", nullable =  false , length = 10)
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

	@Column(name="PED_DATA", nullable =  false , length = 19)
	@XmlElement(name = "data")
	private java.sql.Timestamp data;

	public void setData(java.sql.Timestamp data)
	{
		this.data = data;
	}

	public java.sql.Timestamp getData()
	{
		return data;
	}

	@Column(name="PED_TOTAL", nullable =  true , length = 17)
	@XmlElement(name = "total")
	private Float total= 0f;

	public void setTotal(Float total)
	{
		this.total = total;
	}

	public Float getTotal()
	{
		return total;
	}

	@Column(name="CODGARCON", nullable =  true , length = 11)
	@XmlElement(name = "codgarcon")
	private Integer codgarcon;

	public void setCodgarcon(Integer codgarcon)
	{
		this.codgarcon = codgarcon;
	}

	public Integer getCodgarcon()
	{
		return codgarcon;
	}

	@Column(name="PED_QTDE_COVERT", nullable =  true , length = 11)
	@XmlElement(name = "qtdeCovert")
	private Integer qtdeCovert;

	public void setQtdeCovert(Integer qtdeCovert)
	{
		this.qtdeCovert = qtdeCovert;
	}

	public Integer getQtdeCovert()
	{
		return qtdeCovert;
	}

	@Column(name="PED_IMPRESSO", nullable =  true , length = 1)
	@XmlElement(name = "impresso")
	private String impresso;

	public void setImpresso(String impresso)
	{
		this.impresso = impresso;
	}

	public String getImpresso()
	{
		return impresso;
	}

	public void setImpressoBoolean(Boolean value)
	{
		if (value) {
			this.impresso = "S";
		}
		else {
			this.impresso = "N";
		}
	}
	public Boolean getImpressoBoolean()
	{
		return ((this.impresso != null)&&(this.impresso.equalsIgnoreCase("S")));
	}
	@Column(name="PED_DESC_VLR", nullable =  true , length = 17)
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

	@Column(name="PED_ACRESCIMO", nullable =  true , length = 17)
	@XmlElement(name = "acrescimo")
	private Float acrescimo= 0f;

	public void setAcrescimo(Float acrescimo)
	{
		this.acrescimo = acrescimo;
	}

	public Float getAcrescimo()
	{
		return acrescimo;
	}

	@Column(name="PED_DATA_FINAL", nullable =  true , length = 19)
	@XmlElement(name = "dataFinal")
	private java.sql.Timestamp dataFinal;

	public void setDataFinal(java.sql.Timestamp dataFinal)
	{
		this.dataFinal = dataFinal;
	}

	public java.sql.Timestamp getDataFinal()
	{
		return dataFinal;
	}

	@Column(name="PED_QTDE_PESSOA", nullable =  true , length = 11)
	@XmlElement(name = "qtdePessoa")
	private Integer qtdePessoa;

	public void setQtdePessoa(Integer qtdePessoa)
	{
		this.qtdePessoa = qtdePessoa;
	}

	public Integer getQtdePessoa()
	{
		return qtdePessoa;
	}

	@Column(name="PED_DT_ULT_MOV", nullable =  true , length = 19)
	@XmlElement(name = "dtUltMov")
	private java.sql.Timestamp dtUltMov;

	public void setDtUltMov(java.sql.Timestamp dtUltMov)
	{
		this.dtUltMov = dtUltMov;
	}

	public java.sql.Timestamp getDtUltMov()
	{
		return dtUltMov;
	}

	@Column(name="PED_MD5", nullable =  true , length = 32)
	@XmlElement(name = "md5")
	private String md5;

	public void setMd5(String md5)
	{
		this.md5 = md5;
	}

	public String getMd5()
	{
		return md5;
	}

	@Column(name="PED_TOTPROD", nullable =  true , length = 17)
	@XmlElement(name = "totprod")
	private Float totprod= 0f;

	public void setTotprod(Float totprod)
	{
		this.totprod = totprod;
	}

	public Float getTotprod()
	{
		return totprod;
	}

	@Column(name="PED_COO", nullable =  true , length = 11)
	@XmlElement(name = "coo")
	private Integer coo;

	public void setCoo(Integer coo)
	{
		this.coo = coo;
	}

	public Integer getCoo()
	{
		return coo;
	}

	@Column(name="PED_NUMECF", nullable =  true , length = 11)
	@XmlElement(name = "numecf")
	private Integer numecf;

	public void setNumecf(Integer numecf)
	{
		this.numecf = numecf;
	}

	public Integer getNumecf()
	{
		return numecf;
	}

	@Column(name="PED_CER", nullable =  true , length = 11)
	@XmlElement(name = "cer")
	private Integer cer;

	public void setCer(Integer cer)
	{
		this.cer = cer;
	}

	public Integer getCer()
	{
		return cer;
	}

}
