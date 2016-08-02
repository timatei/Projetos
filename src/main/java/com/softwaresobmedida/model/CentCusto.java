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
@Table(name = "CENTCUSTO")
@SequenceGenerator(name = "INC_CENTCUSTO", sequenceName = "GEN_CENTCUSTO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "centcusto") 
public class CentCusto implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public CentCusto() {	
	}

	@Id
	@Column(name="CODCENTCUSTO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_CENTCUSTO")
	@XmlElement(name = "codCentCusto")
	private Integer codCentCusto;

	public void setCodCentCusto(Integer codCentCusto)
	{
		this.codCentCusto = codCentCusto;
	}

	public Integer getCodCentCusto()
	{
		return codCentCusto;
	}

	@Column(name="CEN_DESCRICAO", nullable =  false , length = 60)
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
}
