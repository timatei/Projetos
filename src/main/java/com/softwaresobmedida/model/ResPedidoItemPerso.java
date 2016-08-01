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
@Table(name = "RES_PEDIDO_ITEM_PERSO")
@SequenceGenerator(name = "INC_RES_PEDIDO_ITEM_PERSO", sequenceName = "GEN_RES_PEDIDO_ITEM_PERSO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resPedidoItemPerso") 
public class ResPedidoItemPerso implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ResPedidoItemPerso() {	
	}

	@Id
	@Column(name="CODRESPEDIDOITEMPERSO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_PEDIDO_ITEM_PERSO")
	@XmlElement(name = "codrespedidoitemperso")
	private Integer codrespedidoitemperso;

	public void setCodrespedidoitemperso(Integer codrespedidoitemperso)
	{
		this.codrespedidoitemperso = codrespedidoitemperso;
	}

	public Integer getCodrespedidoitemperso()
	{
		return codrespedidoitemperso;
	}

	@Column(name="CODPEDIDOITEM", nullable =  false , length = 11)
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

	@Column(name="CODGRUPOPERSONALIZACAO", nullable =  false , length = 11)
	@XmlElement(name = "codgrupopersonalizacao")
	private Integer codgrupopersonalizacao;

	public void setCodgrupopersonalizacao(Integer codgrupopersonalizacao)
	{
		this.codgrupopersonalizacao = codgrupopersonalizacao;
	}

	public Integer getCodgrupopersonalizacao()
	{
		return codgrupopersonalizacao;
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

	@Column(name="CODPEDIDO", nullable =  true , length = 11)
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

}
