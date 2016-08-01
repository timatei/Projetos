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
@Table(name = "CAIXA_ABERTURA")
@SequenceGenerator(name = "INC_CAIXA_ABERTURA", sequenceName = "GEN_CAIXA_ABERTURA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "caixaAbertura") 
public class CaixaAbertura implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codCaixaAbertura";

	public CaixaAbertura() {	
	}

	@Id
	@Column(name="CODCAIXAABERTURA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_CAIXA_ABERTURA")
	@XmlElement(name = "codCaixaAbertura")
	private Integer codCaixaAbertura;
	public void setCodCaixaAbertura(Integer codCaixaAbertura)
	{
		this.codCaixaAbertura = codCaixaAbertura;
	}
	public Integer getCodCaixaAbertura()
	{
		return codCaixaAbertura;
	}

	@Column(name="CAIA_STATUS", nullable =  false , length = 10)
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

	@Column(name="CAIA_OPERADOR", nullable =  false , length = 20)
	@XmlElement(name = "operador")
	private String operador;
	public void setOperador(String operador)
	{
		this.operador = operador;
	}
	public String getOperador()
	{
		return operador;
	}

	@Column(name="CAIA_ABERTURA_DATA", nullable =  false , length = 19)
	@XmlElement(name = "aberturaData")
	private java.sql.Timestamp aberturaData;
	public void setAberturaData(java.sql.Timestamp aberturaData)
	{
		this.aberturaData = aberturaData;
	}
	public java.sql.Timestamp getAberturaData()
	{
		return aberturaData;
	}

	@Column(name="CAIA_FECHAMENTO_DATA", nullable =  true , length = 19)
	@XmlElement(name = "fechamentoData")
	private java.sql.Timestamp fechamentoData;
	public void setFechamentoData(java.sql.Timestamp fechamentoData)
	{
		this.fechamentoData = fechamentoData;
	}
	public java.sql.Timestamp getFechamentoData()
	{
		return fechamentoData;
	}
}
