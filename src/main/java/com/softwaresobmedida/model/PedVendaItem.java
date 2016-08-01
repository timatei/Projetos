package com.softwaresobmedida.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "PEDVENDA_ITEM")
@SequenceGenerator(name = "INC_PEDVENDA_ITEM", sequenceName = "GEN_PEDVENDA_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pedVenda") 
public class PedVendaItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codPedVendaItem";

	public PedVendaItem() {
	}

	@Id
	@Column(name="CODPEDVENDAITEM")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PEDVENDA_ITEM")
	@XmlElement(name = "codPedVendaItem")
	private Integer codPedVendaItem;
	
	public void setCodPedVendaItem(Integer codPedVendaItem) {
		this.codPedVendaItem = codPedVendaItem;
	}
	
	public Integer getCodPedVendaItem() {
		return codPedVendaItem;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)  
	@JoinColumn(name="CODPEDVENDA", insertable=false, updatable=false, nullable=false)
	private PedVenda pedVenda;
	public void setPedVenda(PedVenda pedVenda)
	{
		this.pedVenda = pedVenda;
	}
	public PedVenda getPedVenda()
	{
		return pedVenda;
	}

	@Column(name="PEDI_TIPOPRECO")
	@XmlElement(name = "tipoPreco")
	private String tipoPreco = "01";
	
	public void setTipoPreco(String tipoPreco) {
		this.tipoPreco = tipoPreco;
	}
	
	public String getTipoPreco() {
		return tipoPreco;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CODPRODUTO", insertable=false, updatable=false, nullable=false)
	@XmlElement(name = "produto")
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Column(name="PEDI_QTDE")
	@XmlElement(name = "qtde")
	private Float qtde;
	
	public void setQtde(Float qtde) {
		this.qtde = qtde;
	}
	
	public Float getQtde() {
		return qtde;
	}

	@Column(name="PEDI_VLRUNIT")
	@XmlElement(name = "vlrUnit")
	private Float vlrUnit;
	
	public void setVlrUnit(Float vlrUnit) {
		this.vlrUnit = vlrUnit;
	}
	
	public Float getVlrUnit() {
		return vlrUnit;
	}
	
	@Column(name="PEDI_DESCVLR")
	@XmlElement(name = "descvlr")
	private Long descvlr;
	
	public void setDescvlr(Long descvlr) {
		this.descvlr = descvlr;
	}
	
	public Long getDescvlr() {
		return descvlr;
	}
}
