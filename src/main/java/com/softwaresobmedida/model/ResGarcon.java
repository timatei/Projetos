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
@Table(name = "RES_GARCON")
@SequenceGenerator(name = "INC_RES_GARCON", sequenceName = "GEN_RES_GARCON")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "resGarcon") 
public class ResGarcon implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codGarcon";

	public ResGarcon() {	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_RES_GARCON")

	@Column(name="CODGARCON", nullable =  false , length = 11)
	@XmlElement(name = "codGarcon")
	private Integer codGarcon;
	
	public void setCodGarcon(Integer codGarcon) {
		this.codGarcon = codGarcon;
	}
	
	public Integer getCodGarcon() {
		return codGarcon;
	}

	@Column(name="GAR_NOME", nullable =  false , length = 60)
	@XmlElement(name = "nome")
	private String nome;

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	@Column(name="GAR_SENHA", nullable =  true , length = 20)
	private String senha;

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	public String getSenha()
	{
		return senha;
	}

	@Column(name="GAR_PERC", nullable =  true , length = 17)
	@XmlElement(name = "perc")
	private Float perc= 0f;

	public void setPerc(Float perc)
	{
		this.perc = perc;
	}

	public Float getPerc()
	{
		return perc;
	}

	@Column(name="GAN_ENTREGADOR", nullable =  true , length = 1)
	@XmlElement(name = "entregador")
	private String entregador;

	public void setEntregador(String entregador)
	{
		this.entregador = entregador;
	}

	public String getEntregador()
	{
		return entregador;
	}
}
