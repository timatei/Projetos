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
@Table(name = "RES_CONTROLE")
@SequenceGenerator(name = "INC_RES_CONTROLE", sequenceName = "GEN_RES_CONTROLE")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resControle") 
public class ResControle implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ResControle() {	
	}

	@Id
	@Column(name="CODCONTROLE", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_CONTROLE")
	@XmlElement(name = "codcontrole")
	private Integer codcontrole;

	public void setCodcontrole(Integer codcontrole)
	{
		this.codcontrole = codcontrole;
	}

	public Integer getCodcontrole()
	{
		return codcontrole;
	}

	@Column(name="CON_STATUS", nullable =  true , length = 10)
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

	@Column(name="CON_COBRAR_SERVICO", nullable =  true , length = 1)
	@XmlElement(name = "cobrarServico")
	private String cobrarServico;

	public void setCobrarServico(String cobrarServico)
	{
		this.cobrarServico = cobrarServico;
	}

	public String getCobrarServico()
	{
		return cobrarServico;
	}

	public void setCobrarServicoBoolean(Boolean value)
	{
		if (value) {
			this.cobrarServico = "S";
		}
		else {
			this.cobrarServico = "N";
		}
	}
	public Boolean getCobrarServicoBoolean()
	{
		return ((this.cobrarServico != null)&&(this.cobrarServico.equalsIgnoreCase("S")));
	}
}
