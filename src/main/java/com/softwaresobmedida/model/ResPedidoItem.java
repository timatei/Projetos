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
@Table(name = "RES_PEDIDO_ITEM")
@SequenceGenerator(name = "INC_RES_PEDIDO_ITEM", sequenceName = "GEN_RES_PEDIDO_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resPedidoItem") 
public class ResPedidoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ResPedidoItem() {	
	}

	@Id
	@Column(name="CODPEDIDOITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_PEDIDO_ITEM")
	@XmlElement(name = "codpedidoitem")
	private Integer codpedidoitem;

	public void setCodpedidoitem(Integer codpedidoitem)
	{
		this.codpedidoitem = codpedidoitem;
	}

	public Integer getCodpedidoitem()
	{
		return codpedidoitem;
	}

	@Column(name="CODPEDIDO", nullable =  false , length = 11)
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
	private String status;

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
	private String lanUsuario;

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

	@Column(name="PEDI_TRAN_USUARIO", nullable =  true , length = 25)
	@XmlElement(name = "tranUsuario")
	private String tranUsuario;

	public void setTranUsuario(String tranUsuario)
	{
		this.tranUsuario = tranUsuario;
	}

	public String getTranUsuario()
	{
		return tranUsuario;
	}

	@Column(name="PEDI_MD5", nullable =  true , length = 32)
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

	@Column(name="PEDI_TRAN_MOTIVO", nullable =  true , length = 100)
	@XmlElement(name = "tranMotivo")
	private String tranMotivo;

	public void setTranMotivo(String tranMotivo)
	{
		this.tranMotivo = tranMotivo;
	}

	public String getTranMotivo()
	{
		return tranMotivo;
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
	@Column(name="CODPEDIDOITEM_PERSON", nullable =  true , length = 11)
	@XmlElement(name = "person")
	private Integer person;

	public void setPerson(Integer person)
	{
		this.person = person;
	}

	public Integer getPerson()
	{
		return person;
	}

}
