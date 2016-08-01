package com.softwaresobmedida.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "MOEDA")
@SequenceGenerator(name = "INC_MOEDA", sequenceName = "GEN_MOEDA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "moeda") 
public class Moeda implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codMoeda";

	public Moeda() {	
	}

	@Id
	@Column(name="CODMOEDA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_MOEDA")
	@XmlElement(name = "codMoeda")
	private Integer codMoeda;
	
	public Integer getCodMoeda() {
		return codMoeda;
	}
	
	public void setCodMoeda(Integer codMoeda) {
		this.codMoeda = codMoeda;
	}

	@Column(name="MOE_DESCRICAO", nullable =  false , length = 20)
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

	@Column(name="MOE_TIPO", nullable =  false , length = 1)
	@XmlElement(name = "tipo")
	private String tipo;

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo()
	{
		return tipo;
	}
}
