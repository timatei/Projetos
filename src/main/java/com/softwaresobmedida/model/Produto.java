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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "PRODUTO")
@SequenceGenerator(name = "INC_PRODUTO", sequenceName = "GEN_PRODUTO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produto") 
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codProduto";

	public Produto() {	
	}

	@Id
	@Column(name="CODPRODUTO", nullable = true, length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO")
	@XmlElement(name = "codProduto")
	private Integer codProduto;
	
	public Integer getCodProduto() {
		return codProduto;
	}
	
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	@Column(name="PRO_CODPESQ_1", nullable = true, length = 20)
	@XmlElement(name = "codPesq1")	
	private String codPesq1;
	
	public String getCodPesq1() {
		return codPesq1;
	}
	
	public void setCodPesq1(String codPesq1) {
		this.codPesq1 = codPesq1;
	}

	@Column(name="PRO_DESCRICAO", nullable = true, length = 150)
	@XmlElement(name = "descricao")
	private String descricao;

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao()
	{
		return descricao;
	}

	@Column(name="PRO_ATIVO", nullable = true, length = 1)
	@XmlElement(name = "ativo")
	private String ativo;

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivoBoolean(Boolean value) {
		if (value) {
			this.ativo = "S";
		}
		else {
			this.ativo = "N";
		}
	}
	
	public Boolean getAtivoBoolean() {
		return ((this.ativo != null)&&(this.ativo.equalsIgnoreCase("S")));
	}

	@Column(name="PRO_TIPO_PRODUTO", nullable = true, length = 1)
	@XmlElement(name = "tipoProduto")	
	private String tipoProduto = "0";

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="CODPRODUTOGRUPO")
	@XmlElement(name = "produtoGrupo")
	private ProdutoGrupo produtoGrupo;
	public void setProdutoGrupo(ProdutoGrupo produtoGrupo) {
		this.produtoGrupo = produtoGrupo;
	}
	public ProdutoGrupo getProdutoGrupo() {
		return produtoGrupo;
	}
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="CODPRODUTOGRUPOSUBGRP")
	@XmlElement(name = "produtoGrupoSubGrp")
	private ProdutoGrupoSubGrp produtoGrupoSubGrp;
	public void setProdutoGrupoSubGrp(ProdutoGrupoSubGrp produtoGrupoSubGrp) {
		this.produtoGrupoSubGrp = produtoGrupoSubGrp;
	}
	public ProdutoGrupoSubGrp getProdutoGrupoSubGrp() {
		return produtoGrupoSubGrp;
	}

	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="CODPRODUTOUNIDADE")
	@XmlElement(name = "produtoUnidade")
	private ProdutoUnidade produtoUnidade;
	public void setProdutoUnidade(ProdutoUnidade produtoUnidade) {
		this.produtoUnidade = produtoUnidade;
	}
	public ProdutoUnidade getProdutoUnidade() {
		return produtoUnidade;
	}

	@Column(name="PRO_ESTQ_ATUAL", nullable =  true , length = 17)
	@XmlElement(name = "estqAtual")
	private Float estqAtual= 0f;

	public void setEstqAtual(Float estqAtual) {
		this.estqAtual = estqAtual;
	}

	public Float getEstqAtual() {
		return estqAtual;
	}
	
	@Column(name="PRO_PRECO01", nullable =  true , length = 17)
	@XmlElement(name = "preco01")
	private Float preco01 = 0f;

	public void setPreco01(Float preco01) {
		this.preco01 = preco01;
	}

	public Float getPreco01() {
		return preco01;
	}
	
	@Column(name="PRO_CALC_CUSTO_PRODUTO", nullable =  true , length = 17)
	private Float calcCustoProduto= 0f;

	public void setCalcCustoProduto(Float calcCustoProduto) {
		this.calcCustoProduto = calcCustoProduto;
	}

	public Float getCalcCustoProduto() {
		return calcCustoProduto;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	@Column(name="PRO_IMP_BAR", nullable = true, length = 1)
	@XmlElement(name = "impBar")	
	private String impBar = "N";
	public void setImpBar(String impBar) {
		this.impBar = impBar;
	}
	public String getImpBar() {
		return impBar;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	@Column(name="PRO_IMP_COZINHA", nullable = true, length = 1)
	@XmlElement(name = "impCozinha")	
	private String impCozinha = "N";
	public void setImpCozinha(String impCozinha) {
		this.impCozinha = impCozinha;
	}
	public String getImpCozinha() {
		return impCozinha;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////	
	@Column(name="PRO_PERSONALIZADO", nullable = true, length = 1)
	@XmlElement(name = "personalizado")	
	private String personalizado = "N";
	public void setPersonalizado(String personalizado) {
		this.personalizado = personalizado;
	}
	public String getPersonalizado() {
		return personalizado;
	}
	//
	@Column(name="PRO_COMPOSTO", nullable = true, length = 1)
	@XmlElement(name = "composto")	
	private String composto = "N";
	public void setComposto(String composto) {
		this.composto = composto;
	}
	public String getComposto() {
		return composto;
	}	
	////////////////////////////////////////////////////////////////////////////////////////////////	
	@Column(name="PRO_IMP_PIZZA", nullable = true, length = 1)
	@XmlElement(name = "impPizza")	
	private String impPizza = "N";
	public void setImpPizza(String impPizza) {
		this.impPizza = impPizza;
	}
	public String getImpPizza() {
		return impPizza;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	// METODO IMPORTANTE PARA COMPARAR OBJETOS
	@Override  
	public boolean equals(Object obj){  
		if (this == obj)  
			return true;  
		if (obj == null)  
			return false;  
		if (!(obj instanceof Produto)) //<<<<-------- MUDAR A CLASSE AQUI  
			return false;  
		Produto other = (Produto) obj;   //<<<<-------- MUDAR A CLASSE AQUI
		if (codProduto == null){   //<<<<-------- MUDAR A CAMPO AQUI
			if (other.codProduto != null)   //<<<<-------- MUDAR A CAMPO AQUI
				return false;  
		} else if (!codProduto.equals(other.codProduto))   //<<<<-------- MUDAR A CAMPO AQUI
			return false;  
		return true;  
	}
	
	public int hashCode() {
		return toString().hashCode();
	}

	@OneToMany(mappedBy = "produto", 
			targetEntity = ProdutoPersonalizacao.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	@XmlElement(name = "personalizacoes")
	private List<ProdutoPersonalizacao> personalizacoes;
	public void setPersonalizacoes(List<ProdutoPersonalizacao> personalizacoes) {
		this.personalizacoes = personalizacoes;
	}
	public List<ProdutoPersonalizacao> getPersonalizacoes() {
		return personalizacoes;
	}
}