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
@Table(name = "GRUPO_PERSONALIZACAO_ITEM")
@SequenceGenerator(name = "INC_GRUPO_PERSONALIZACAO_ITEM", sequenceName = "GEN_GRUPO_PERSONALIZACAO_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "grupoPersonalizacaoItem") 
public class GrupoPersonalizacaoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public GrupoPersonalizacaoItem() {	
	}

	@Id
	@Column(name="CODGRUPOPERSONALIZACAOITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_GRUPO_PERSONALIZACAO_ITEM")
	@XmlElement(name = "codgrupopersonalizacaoitem")
	private Integer codgrupopersonalizacaoitem;

	public void setCodgrupopersonalizacaoitem(Integer codgrupopersonalizacaoitem)
	{
		this.codgrupopersonalizacaoitem = codgrupopersonalizacaoitem;
	}

	public Integer getCodgrupopersonalizacaoitem()
	{
		return codgrupopersonalizacaoitem;
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

	@Column(name="CODPESQUISA", nullable =  true , length = 20)
	@XmlElement(name = "codpesquisa")
	private String codpesquisa;

	public void setCodpesquisa(String codpesquisa)
	{
		this.codpesquisa = codpesquisa;
	}

	public String getCodpesquisa()
	{
		return codpesquisa;
	}

}
