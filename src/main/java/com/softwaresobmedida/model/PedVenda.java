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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "PEDVENDA")
@SequenceGenerator(name = "INC_PEDVENDA", sequenceName = "GEN_PEDVENDA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pedVenda") 
public class PedVenda implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codPedVenda";

	public PedVenda() {
	}

	@Id
	@Column(name="CODPEDVENDA")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PEDVENDA")
	@XmlElement(name = "codPedVenda")
	private Integer codPedVenda;

	public Integer getCodPedVenda() {
		return codPedVenda;
	}

	public void setCodPedVenda(Integer codPedVenda) {
		this.codPedVenda = codPedVenda;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CODPESSOA")
	@XmlElement(name = "pessoa")
	private Pessoa pessoa;

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	@Column(name="PEDV_STATUS")
	@XmlElement(name = "status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Column(name="PEDV_DATA_ENTRADA")
	@XmlElement(name = "dataEntrada")
	private java.sql.Timestamp dataEntrada;

	public void setDataEntrada(java.sql.Timestamp dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public java.sql.Timestamp getDataEntrada() {
		return dataEntrada;
	}

	@Column(name="PEDV_TIPOPRECO")
	@XmlElement(name = "tipoPreco")
	private String tipoPreco = "01";

	public String getTipoPreco() {
		return tipoPreco;
	}

	public void setTipoPreco(String tipoPreco) {
		this.tipoPreco = tipoPreco;
	}

	@Column(name="PEDV_TOTAL_PRODUTOS")
	@XmlElement(name = "totalProdutos")
	private Float totalProdutos;

	public void setTotalProdutos(Float totalProdutos)
	{
		this.totalProdutos = totalProdutos;
	}

	public Float getTotalProdutos()
	{
		return totalProdutos;
	}

	@Column(name="PEDV_DESC_VLR")
	@XmlElement(name = "descVlr")
	private Float descVlr;

	public void setDescVlr(Float descVlr) {
		this.descVlr = descVlr;
	}

	public Float getDescVlr() {
		return descVlr;
	}

	@Column(name="PEDV_ACRE_VLR")
	@XmlElement(name = "acreVlr")
	private Float acreVlr;

	public void setAcreVlr(Float acreVlr) {
		this.acreVlr = acreVlr;
	}

	public Float getAcreVlr() {
		return acreVlr;
	}

	@Column(name="PEDV_TOTAL_PEDIDO")
	@XmlElement(name = "totalPedido")
	private Float totalPedido;

	public void setTotalPedido(Float totalPedido) {
		this.totalPedido = totalPedido;
	}

	public Float getTotalPedido() {
		return totalPedido;
	}

	@Column(name="PEDV_USUARIO")
	@XmlElement(name = "usuario")
	private String usuario = "SSMMOBILE";
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getUsuario() {
		return usuario;
	}

	@OneToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	@JoinColumn(name="CODPEDVENDA")
	@XmlElement(name = "itens")
	private List<PedVendaItem> itens;
	
	public List<PedVendaItem> getItens() {
		return itens;
	}
	
	public void setItens(List<PedVendaItem> itens) {
		this.itens = itens;
	}
	
	@OneToMany(mappedBy = "pedVenda", 
			targetEntity = PedVendaFechamento.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	@XmlElement(name = "fechamentos")
	private List<PedVendaFechamento> fechamentos;
	
	public void setFechamentos(List<PedVendaFechamento> fechamentos) {
		this.fechamentos = fechamentos;
	}
	
	public List<PedVendaFechamento> getFechamentos() {
		return fechamentos;
	}
}
