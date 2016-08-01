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
@Table(name = "PRODUTO_PERSONALIZACAO")
@SequenceGenerator(name = "INC_PRODUTO_PERSONALIZACAO", sequenceName = "GEN_PRODUTOPERSONALIZACAO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoPersonalizacao") 
public class ProdutoPersonalizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codProdutoPersonalizacao";

	public ProdutoPersonalizacao() {	
	}

	@Id
	@Column(name="CODPRODUTOPERSONALIZACAO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_PERSONALIZACAO")
	@XmlElement(name = "codProdutoPersonalizacao")
	private Integer codProdutoPersonalizacao;
	public void setCodProdutoPersonalizacao(Integer codProdutoPersonalizacao) {
		this.codProdutoPersonalizacao = codProdutoPersonalizacao;
	}
	public Integer getCodProdutoPersonalizacao() {
		return codProdutoPersonalizacao;
	}

	@ManyToOne(fetch=FetchType.EAGER)  
	@JoinColumn(name="CODPRODUTO")
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	@OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="CODGRUPOPERSONALIZACAO")
	@XmlElement(name = "grupoPersonalizacao")
	private GrupoPersonalizacao grupoPersonalizacao;
	public void setGrupoPersonalizacao(GrupoPersonalizacao grupoPersonalizacao) {
		this.grupoPersonalizacao = grupoPersonalizacao;
	}
	public GrupoPersonalizacao getGrupoPersonalizacao() {
		return grupoPersonalizacao;
	}

	@Column(name="PROP_QTDE_MINIMA", nullable =  true , length = 17)
	@XmlElement(name = "qtdeMinima")
	private Float qtdeMinima= 0f;
	public void setQtdeMinima(Float qtdeMinima)
	{
		this.qtdeMinima = qtdeMinima;
	}
	public Float getQtdeMinima()
	{
		return qtdeMinima;
	}

	@Column(name="PROP_QTDE_MAXIMA", nullable =  true , length = 17)
	@XmlElement(name = "qtdeMaxima")
	private Float qtdeMaxima= 0f;
	public void setQtdeMaxima(Float qtdeMaxima)
	{
		this.qtdeMaxima = qtdeMaxima;
	}
	public Float getQtdeMaxima()
	{
		return qtdeMaxima;
	}

	@Column(name="PROP_TIPO", nullable =  false , length = 2)
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

	@Column(name="PROP_VALOR", nullable =  true , length = 17)
	@XmlElement(name = "valor")
	private Float valor= 0f;
	public void setValor(Float valor)
	{
		this.valor = valor;
	}
	public Float getValor()
	{
		return valor;
	}
}