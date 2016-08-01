package com.softwaresobmedida.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CONFIGURACAO_GERAL")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "configuracaoGeral") 
public class ConfiguracaoGeral implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "chave";

	public ConfiguracaoGeral() {	
	}

	@Id
	@Column(name="CONF_CHAVE", nullable =  false , length = 15)
	@XmlElement(name = "chave")
	private String chave;

	public void setChave(String chave)
	{
		this.chave = chave;
	}

	public String getChave()
	{
		return chave;
	}

	@Column(name="CONF_DESCRICAO", nullable =  false , length = 60)
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

	@Column(name="CONF_VLR", nullable =  true , length = 250)
	@XmlElement(name = "vlr")
	private String vlr;

	public void setVlr(String vlr)
	{
		this.vlr = vlr;
	}

	public String getVlr()
	{
		return vlr;
	}

	@Column(name="CONF_TIPO", nullable =  true , length = 3)
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

	@Column(name="CONF_FUNCIONALIDADE", nullable =  true , length = 40)
	@XmlElement(name = "funcionalidade")
	private String funcionalidade;

	public void setFuncionalidade(String funcionalidade)
	{
		this.funcionalidade = funcionalidade;
	}

	public String getFuncionalidade()
	{
		return funcionalidade;
	}

	@Column(name="CONF_MD5", nullable =  true , length = 32)
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
}
