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

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "PEDVENDA_FECHAMENTO")
@SequenceGenerator(name = "INC_PEDVENDA_FECHAMENTO", sequenceName = "GEN_PEDVENDA_FECHAMENTO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pedVendaFechamento") 
public class PedVendaFechamento implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codPedVendaFechamento";

	public PedVendaFechamento() {	
	}

	@Id
	@Column(name="CODPEDVENDFECHAMENTO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PEDVENDA_FECHAMENTO")
	@XmlElement(name = "codPedVendaFechamento")
	private Integer codPedVendaFechamento;
	
	public void setCodPedVendaFechamento(Integer codPedVendaFechamento) {
		this.codPedVendaFechamento = codPedVendaFechamento;
	}
	
	public Integer getCodPedVendaFechamento() {
		return codPedVendaFechamento;
	}

	@ManyToOne(fetch=FetchType.EAGER)  
	@JoinColumn(name="CODPEDVENDA")
	private PedVenda pedVenda;
	public void setPedVenda(PedVenda pedVenda)
	{
		this.pedVenda = pedVenda;
	}
	public PedVenda getPedVenda()
	{
		return pedVenda;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CODMOEDA")
	@XmlElement(name = "moeda")
	private Moeda moeda;
	
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	
	public Moeda getMoeda() {
		return moeda;
	}

	@Column(name="PEDF_VLR", nullable =  true , length = 17)
	@XmlElement(name = "vlr")
	private Float vlr= 0f;

	public void setVlr(Float vlr)
	{
		this.vlr = vlr;
	}

	public Float getVlr()
	{
		return vlr;
	}

	@Column(name="PEDF_QTDE", nullable =  false , length = 11)
	@XmlElement(name = "qtde")
	private Integer qtde;

	public void setQtde(Integer qtde)
	{
		this.qtde = qtde;
	}

	public Integer getQtde()
	{
		return qtde;
	}

	@Column(name="PEDF_USUARIO", nullable =  true , length = 15)
	@XmlElement(name = "usuario")
	private String usuario;

	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public String getUsuario()
	{
		return usuario;
	}
}
