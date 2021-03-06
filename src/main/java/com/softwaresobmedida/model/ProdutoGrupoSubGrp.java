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
@Table(name = "PRODUTO_GRUPO_SUBGRP")
@SequenceGenerator(name = "INC_PRODUTO_GRUPO_SUBGRP", sequenceName = "GEN_PRODUTO_GRUPO_SUBGRP")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoGrupoSubGrp") 
public class ProdutoGrupoSubGrp implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codProdutoGrupoSubGrp";

	public ProdutoGrupoSubGrp() {	
	}

	@Id
	@Column(name="CODPRODUTOGRUPOSUBGRP", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_GRUPO_SUBGRP")
	@XmlElement(name = "codProdutoGrupoSubGrp")
	private Integer codProdutoGrupoSubGrp;

	public void setCodProdutoGrupoSubGrp(Integer codProdutoGrupoSubGrp)
	{
		this.codProdutoGrupoSubGrp = codProdutoGrupoSubGrp;
	}

	public Integer getCodProdutoGrupoSubGrp()
	{
		return codProdutoGrupoSubGrp;
	}

	@Column(name="CODPRODUTOGRUPO", nullable =  false , length = 11)
	@XmlElement(name = "codProdutoGrupo")
	private Integer codProdutoGrupo;

	public void setCodProdutoGrupo(Integer codProdutoGrupo)
	{
		this.codProdutoGrupo = codProdutoGrupo;
	}

	public Integer getCodProdutoGrupo()
	{
		return codProdutoGrupo;
	}

	@Column(name="PROGS_DESCRICAO", nullable =  false , length = 60)
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

	@Column(name="PROGS_ORDEM", nullable =  true , length = 11)
	@XmlElement(name = "ordem")
	private Integer ordem;

	public void setOrdem(Integer ordem)
	{
		this.ordem = ordem;
	}

	public Integer getOrdem() {
		return ordem;
	}
}
