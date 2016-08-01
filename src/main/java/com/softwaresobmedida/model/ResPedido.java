package com.softwaresobmedida.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "RES_PEDIDO")
@SequenceGenerator(name = "INC_RES_PEDIDO", sequenceName = "GEN_RES_PEDIDO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resPedido") 
public class ResPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codPedido";

	public ResPedido() {	
	}

	@Id
	@Column(name="CODPEDIDO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_PEDIDO")
	@XmlElement(name = "codPedido")
	private Integer codPedido;
	
	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}
	
	public Integer getCodPedido() {
		return codPedido;
	}

	@Column(name="CODCONTROLE", nullable =  false , length = 11)
	@XmlElement(name = "codControle")
	private Integer codControle;
	
	public void setCodControle(Integer codControle) {
		this.codControle = codControle;
	}
	
	public Integer getCodControle() {
		return codControle;
	}

	@Column(name="PED_STATUS", nullable =  false , length = 10)
	@XmlElement(name = "status")
	private String status = "ABERTO";

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Column(name="PED_DATA", nullable =  false , length = 19)
	@XmlElement(name = "data")
	private java.sql.Timestamp data;

	public void setData(java.sql.Timestamp data) {
		this.data = data;
	}

	public java.sql.Timestamp getData() {
		return data;
	}

	@Column(name="CODGARCON", nullable =  false , length = 11)
	@XmlElement(name = "codGarcon")
	private Integer codGarcon = 0;
	
	public void setCodGarcon(Integer codGarcon) {
		this.codGarcon = codGarcon;
	}
	
	public Integer getCodGarcon() {
		return codGarcon;
	}

	@Column(name="PED_TOTPROD", nullable =  true , length = 17)
	@XmlElement(name = "totProd")
	private Float totProd= 0f;
	
	public void setTotProd(Float totProd) {
		this.totProd = totProd;
	}
	
	public Float getTotProd() {
		return totProd;
	}
	
	@Column(name="PED_DESC_VLR", nullable =  true , length = 17)
	@XmlElement(name = "descVlr")
	private Float descVlr= 0f;

	public void setDescVlr(Float descVlr) {
		this.descVlr = descVlr;
	}

	public Float getDescVlr() {
		return descVlr;
	}

	@Column(name="PED_ACRESCIMO", nullable =  true , length = 17)
	@XmlElement(name = "acrescimo")
	private Float acrescimo= 0f;

	public void setAcrescimo(Float acrescimo) {
		this.acrescimo = acrescimo;
	}

	public Float getAcrescimo() {
		return acrescimo;
	}

	@Column(name="PED_TOTAL", nullable =  true , length = 17)
	@XmlElement(name = "total")
	private Float total= 0f;

	public void setTotal(Float total) {
		this.total = total;
	}

	public Float getTotal() {
		return total;
	}

	@Column(name="PED_QTDE_COVERT", nullable =  true , length = 11)
	@XmlElement(name = "qtdeCovert")
	private Integer qtdeCovert = 0;

	public void setQtdeCovert(Integer qtdeCovert) {
		this.qtdeCovert = qtdeCovert;
	}

	public Integer getQtdeCovert() {
		return qtdeCovert;
	}

	@Column(name="PED_QTDE_PESSOA", nullable =  true , length = 11)
	@XmlElement(name = "qtdePessoa")
	private Integer qtdePessoa = 1;

	public void setQtdePessoa(Integer qtdePessoa)
	{
		this.qtdePessoa = qtdePessoa;
	}

	public Integer getQtdePessoa()
	{
		return qtdePessoa;
	}

	@Column(name="PED_IMPRESSO", nullable =  true , length = 1)
	@XmlElement(name = "impresso")
	private String impresso = "N";

	public void setImpresso(String impresso) {
		this.impresso = impresso;
	}

	public String getImpresso() {
		return impresso;
	}
	
	@Column(name="PED_DT_ULT_MOV", nullable =  true , length = 19)
	@XmlElement(name = "dtUltMov")
	private java.sql.Timestamp dtUltMov;

	public void setDtUltMov(java.sql.Timestamp dtUltMov) {
		this.dtUltMov = dtUltMov;
	}

	public java.sql.Timestamp getDtUltMov() {
		return dtUltMov;
	}
	
	@Column(name="PED_DATA_FINAL", nullable =  true , length = 19)
	@XmlElement(name = "dataFinal")
	private java.sql.Timestamp dataFinal;

	public void setDataFinal(java.sql.Timestamp dataFinal) {
		this.dataFinal = dataFinal;
	}

	public java.sql.Timestamp getDataFinal() {
		return dataFinal;
	}
	
	@OneToMany(mappedBy = "resPedido", 
			targetEntity = ResPedidoItem.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	//@OneToMany(fetch = FetchType.LAZY, mappedBy="resPedido", cascade=CascadeType.ALL)
	@XmlElement(name = "itens")
	private List<ResPedidoItem> itens;
	
	public void setItens(List<ResPedidoItem> itens) {
		this.itens = itens;
	}
	
	public List<ResPedidoItem> getItens() {
		return itens;
	}
	
	// METODO IMPORTANTE PARA COMPARAR OBJETOS
	@Override  
	public boolean equals(Object obj){  
		if (this == obj)  
			return true;  
		if (obj == null)  
			return false;  
		if (!(obj instanceof ResPedido)) //<<<<-------- MUDAR A CLASSE AQUI  
			return false;  
		ResPedido other = (ResPedido) obj;   //<<<<-------- MUDAR A CLASSE AQUI
		if (codPedido == null){   //<<<<-------- MUDAR A CAMPO AQUI
			if (other.codPedido != null)     //<<<<-------- MUDAR A CAMPO AQUI
				return false;  
		} else if (!codPedido.equals(other.codPedido))   //<<<<-------- MUDAR A CAMPO AQUI
			return false;  
		return true;  
	}
	
	public int hashCode() {
		return toString().hashCode();
	}		
}
