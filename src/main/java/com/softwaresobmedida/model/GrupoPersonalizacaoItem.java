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
@Table(name = "GRUPO_PERSONALIZACAO_ITEM")
@SequenceGenerator(name = "INC_GRUPO_PERSONALIZACAO_ITEM", sequenceName = "GEN_GRUPO_PERSONALIZACAO_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "grupoPersonalizacaoItem") 
public class GrupoPersonalizacaoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codGrupoPersonalizacaoItem";

	public GrupoPersonalizacaoItem() {	
	}

	@Id
	@Column(name="CODGRUPOPERSONALIZACAOITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_GRUPO_PERSONALIZACAO_ITEM")
	@XmlElement(name = "codGrupoPersonalizacaoItem")
	private Integer codGrupoPersonalizacaoItem;

	public void setCodGrupoPersonalizacaoItem(Integer codGrupoPersonalizacaoItem)
	{
		this.codGrupoPersonalizacaoItem = codGrupoPersonalizacaoItem;
	}

	public Integer getCodGrupoPersonalizacaoItem()
	{
		return codGrupoPersonalizacaoItem;
	}

	@ManyToOne(fetch=FetchType.EAGER)  
	@JoinColumn(name="CODGRUPOPERSONALIZACAO")
	private GrupoPersonalizacao grupoPersonalizacao;
	
	public void setGrupoPersonalizacao(GrupoPersonalizacao grupoPersonalizacao) {
		this.grupoPersonalizacao = grupoPersonalizacao;
	}
	
	public GrupoPersonalizacao getGrupoPersonalizacao() {
		return grupoPersonalizacao;
	}

	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="CODPRODUTO")
	@XmlElement(name = "produto")
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Column(name="CODPESQUISA", nullable = true, length = 20)
	private String codPesquisa;
	
	public String getCodPesquisa() {
		return codPesquisa;
	}
	
	public void setCodPesquisa(String codPesquisa) {
		this.codPesquisa = codPesquisa;
	}
}
