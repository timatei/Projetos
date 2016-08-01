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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "RES_PEDIDO_ITEM")
@SequenceGenerator(name = "INC_RES_PEDIDO_ITEM", sequenceName = "GEN_RES_PEDIDO_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resPedidoItem") 
public class ResPedidoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codPedidoItem";

	public ResPedidoItem() {	
	}

	@Id
	@Column(name="CODPEDIDOITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_PEDIDO_ITEM")
	@XmlElement(name = "codPedidoItem")
	private Integer codPedidoItem;
	
	public void setCodPedidoItem(Integer codPedidoItem) {
		this.codPedidoItem = codPedidoItem;
	}
	
	public Integer getCodPedidoItem() {
		return codPedidoItem;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="CODPEDIDO", nullable = false)
	@ManyToOne(fetch=FetchType.EAGER)  
	@JoinColumn(name="CODPEDIDO")
	private ResPedido resPedido;
	
	public void setResPedido(ResPedido resPedido) {
		this.resPedido = resPedido;
	}
	
	public ResPedido getResPedido() {
		return resPedido;
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
	
	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="CODPRODUTO")
	@XmlElement(name = "produto")
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Column(name="CODPESQUISA", nullable = true, length = 20)
	@XmlElement(name = "codPesquisa")
	private String codPesquisa;
	
	public String getCodPesquisa() {
		return codPesquisa;
	}
	
	public void setCodPesquisa(String codPesquisa) {
		this.codPesquisa = codPesquisa;
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

	@Column(name="PEDI_VLRUNIT", nullable =  true , length = 17)
	@XmlElement(name = "vlrUnit")
	private Float vlrUnit= 0f;
	
	public void setVlrUnit(Float vlrUnit) {
		this.vlrUnit = vlrUnit;
	}
	
	public Float getVlrUnit() {
		return vlrUnit;
	}

	@Column(name="PEDI_TOTAL", nullable =  true , length = 17)
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

	@Column(name="PEDI_STATUS", nullable =  false , length = 10)
	@XmlElement(name = "status")
	private String status = "NORMAL";

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}

	@Column(name="PEDI_LAN_USUARIO", nullable =  true , length = 30)
	@XmlElement(name = "lanUsuario")
	private String lanUsuario = "SSMWEB";

	public void setLanUsuario(String lanUsuario)
	{
		this.lanUsuario = lanUsuario;
	}

	public String getLanUsuario()
	{
		return lanUsuario;
	}

	@Column(name="PEDI_LAN_DATA", nullable =  true , length = 19)
	@XmlElement(name = "lanData")
	private java.sql.Timestamp lanData;

	public void setLanData(java.sql.Timestamp lanData)
	{
		this.lanData = lanData;
	}

	public java.sql.Timestamp getLanData()
	{
		return lanData;
	}

	@Column(name="PEDI_CAN_USUARIO", nullable =  true , length = 30)
	@XmlElement(name = "canUsuario")
	private String canUsuario;

	public void setCanUsuario(String canUsuario)
	{
		this.canUsuario = canUsuario;
	}

	public String getCanUsuario()
	{
		return canUsuario;
	}

	@Column(name="PEDI_CAN_MOTIVO", nullable =  true , length = 100)
	@XmlElement(name = "canMotivo")
	private String canMotivo;

	public void setCanMotivo(String canMotivo)
	{
		this.canMotivo = canMotivo;
	}

	public String getCanMotivo()
	{
		return canMotivo;
	}

	@Column(name="PEDI_CAN_DATA", nullable =  true , length = 19)
	@XmlElement(name = "canData")
	private java.sql.Timestamp canData;

	public void setCanData(java.sql.Timestamp canData)
	{
		this.canData = canData;
	}

	public java.sql.Timestamp getCanData()
	{
		return canData;
	}

	@Column(name="PEDI_OBS", nullable =  true , length = 100)
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

	@Column(name="CODPEDIDOITEM_PERSON")
	@XmlElement(name = "codPedidoItemPerson")
	private Integer codPedidoItemPerson;

	public void setCodPedidoItemPerson(Integer codPedidoItemPerson)
	{
		this.codPedidoItemPerson = codPedidoItemPerson;
	}

	public Integer getCodPedidoItemPerson()
	{
		return codPedidoItemPerson;
	}
	
	
	
	
	
	// METODO IMPORTANTE PARA COMPARAR OBJETOS
	@Override  
	public boolean equals(Object obj){  
		if (this == obj)  
			return true;  
		if (obj == null)  
			return false;  
		if (!(obj instanceof ResPedidoItem)) //<<<<-------- MUDAR A CLASSE AQUI  
			return false;  
		ResPedidoItem other = (ResPedidoItem) obj;   //<<<<-------- MUDAR A CLASSE AQUI
		if (codPedidoItem == null){   //<<<<-------- MUDAR A CAMPO AQUI
			if (other.codPedidoItem != null)     //<<<<-------- MUDAR A CAMPO AQUI
				return false;  
		} else if (!codPedidoItem.equals(other.codPedidoItem))   //<<<<-------- MUDAR A CAMPO AQUI
			return false;  
		return true;  
	}

	
	public int hashCode() {
		return toString().hashCode();
	}
		
	@OneToMany(mappedBy = "resPedidoItem", 
			targetEntity = ResPedidoItemPerso.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	@XmlElement(name = "personalizacoes")
	private List<ResPedidoItemPerso> personalizacoes;
	public void setPersonalizacoes(List<ResPedidoItemPerso> personalizacoes) {
		this.personalizacoes = personalizacoes;
	}
	public List<ResPedidoItemPerso> getPersonalizacoes() {
		return personalizacoes;
	}	
}
