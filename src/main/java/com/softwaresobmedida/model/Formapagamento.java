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
@Table(name = "FORMAPAGAMENTO")
@SequenceGenerator(name = "INC_FORMAPAGAMENTO", sequenceName = "GEN_FORMAPAGAMENTO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "formapagamento") 
public class Formapagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Formapagamento() {	
	}

	@Id
	@Column(name="CODFORMAPAGAMENTO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_FORMAPAGAMENTO")
	@XmlElement(name = "codFormaPagamento")
	private Integer codFormaPagamento;

	public void setCodFormaPagamento(Integer codFormaPagamento)
	{
		this.codFormaPagamento = codFormaPagamento;
	}

	public Integer getCodFormaPagamento()
	{
		return codFormaPagamento;
	}

	@Column(name="FPG_DESCRICAO", nullable =  false , length = 30)
	@XmlElement(name = "descricao")
	private String descricao;

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return descricao;
	}

	@Column(name="FPG_PARCELAS", nullable =  true , length = 11)
	@XmlElement(name = "parcelas")
	private Integer parcelas;

	public void setParcelas(Integer parcelas)
	{
		this.parcelas = parcelas;
	}

	public Integer getParcelas()
	{
		return parcelas;
	}

	@Column(name="FPG_NUMDIAS", nullable =  true , length = 11)
	@XmlElement(name = "numdias")
	private Integer numdias;

	public void setNumdias(Integer numdias)
	{
		this.numdias = numdias;
	}

	public Integer getNumdias()
	{
		return numdias;
	}

	@Column(name="FPG_NUMDIAS_DEMAIS", nullable =  true , length = 11)
	@XmlElement(name = "numdiasDemais")
	private Integer numdiasDemais;

	public void setNumdiasDemais(Integer numdiasDemais)
	{
		this.numdiasDemais = numdiasDemais;
	}

	public Integer getNumdiasDemais()
	{
		return numdiasDemais;
	}

	@Column(name="FPG_SEPARAR", nullable =  true , length = 1)
	@XmlElement(name = "separar")
	private String separar = "N";

	public void setSeparar(String separar)
	{
		this.separar = separar;
	}

	public String getSeparar()
	{
		return separar;
	}
	
	@Column(name="FPG_VRP", nullable =  true , length = 1)
	@XmlElement(name = "vrp")
	private String vrp = "N";

	public void setVrp(String vrp)
	{
		this.vrp = vrp;
	}

	public String getVrp()
	{
		return vrp;
	}
}
