package com.softwaresobmedida.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RES_PEDIDO_ITEM_PERSO")
@SequenceGenerator(name = "INC_RES_PEDIDO_ITEM_PERSO", sequenceName = "GEN_RES_PEDIDO_ITEM_PERSO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resPedidoItemPerso") 
public class ResPedidoItemPerso implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codResPedidoItemPerso";

	public ResPedidoItemPerso() {	
	}

	@Id
	@Column(name="CODRESPEDIDOITEMPERSO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_PEDIDO_ITEM_PERSO")
	@XmlElement(name = "codResPedidoItemPerso")
	private Integer codResPedidoItemPerso;

	public void setCodResPedidoItemPerso(Integer codResPedidoItemPerso)
	{
		this.codResPedidoItemPerso = codResPedidoItemPerso;
	}

	public Integer getCodResPedidoItemPerso()
	{
		return codResPedidoItemPerso;
	}

	@ManyToOne(fetch=FetchType.EAGER)  
	@JoinColumn(name="CODPEDIDOITEM")
	private ResPedidoItem resPedidoItem;
	
	public void setResPedidoItem(ResPedidoItem resPedidoItem) {
		this.resPedidoItem = resPedidoItem;
	}
	
	public ResPedidoItem getResPedidoItem() {
		return resPedidoItem;
	}
	
	@Column(name="CODPRODUTO", nullable = true, length = 11)
	@XmlElement(name = "codProduto")
	private Integer codProduto;
	
	public Integer getCodProduto() {
		return codProduto;
	}
	
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}


	@Column(name="CODGRUPOPERSONALIZACAO", nullable =  false , length = 11)
	@XmlElement(name = "codGrupoPersonalizacao")
	private Integer codGrupoPersonalizacao;

	public void setCodGrupoPersonalizacao(Integer codGrupoPersonalizacao)
	{
		this.codGrupoPersonalizacao = codGrupoPersonalizacao;
	}

	public Integer getCodGrupoPersonalizacao()
	{
		return codGrupoPersonalizacao;
	}

	@Column(name="PEDI_VLRUNIT", nullable =  true , length = 17)
	@XmlElement(name = "vlrUnit")
	private Float vlrUnit= 0f;

	public void setVlrUnit(Float vlrUnit)
	{
		this.vlrUnit = vlrUnit;
	}

	public Float getVlrUnit()
	{
		return vlrUnit;
	}

	@Column(name="CODPEDIDO", nullable =  true , length = 11)
	@XmlElement(name = "codPedido")
	private Integer codPedido;

	public void setCodPedido(Integer codPedido)
	{
		this.codPedido = codPedido;
	}

	public Integer getCodPedido()
	{
		return codPedido;
	}
}
