package com.softwaresobmedida.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "GRUPO_PERSONALIZACAO")
@SequenceGenerator(name = "INC_GRUPO_PERSONALIZACAO", sequenceName = "GEN_GRUPO_PERSONALIZACAO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "grupoPersonalizacao") 
public class GrupoPersonalizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codGrupoPersonalizacao";

	public GrupoPersonalizacao() {	
	}

	@Id
	@Column(name="CODGRUPOPERSONALIZACAO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_GRUPO_PERSONALIZACAO")
	@XmlElement(name = "codGrupoPersonalizacao")
	private Integer codGrupoPersonalizacao;

	public void setCodGrupoPersonalizacao(Integer codGrupoPersonalizacao) {
		this.codGrupoPersonalizacao = codGrupoPersonalizacao;
	}

	public Integer getCodGrupoPersonalizacao() {
		return codGrupoPersonalizacao;
	}

	@Column(name="GRPP_DESCRICAO", nullable =  true , length = 30)
	@XmlElement(name = "descricao")
	private String descricao;

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@OneToMany(mappedBy = "grupoPersonalizacao", 
			targetEntity = GrupoPersonalizacaoItem.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	@XmlElement(name = "itens")
	private List<GrupoPersonalizacaoItem> itens;
	public void setItens(List<GrupoPersonalizacaoItem> itens) {
		this.itens = itens;
	}
	public List<GrupoPersonalizacaoItem> getItens() {
		return itens;
	}
}
