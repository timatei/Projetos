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
@Table(name = "PRODUTO_PERSONALIZACAO")
@SequenceGenerator(name = "INC_PRODUTO_PERSONALIZACAO", sequenceName = "GEN_PRODUTO_PERSONALIZACAO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoPersonalizacao") 
public class ProdutoPersonalizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ProdutoPersonalizacao() {	
	}

	@Id
	@Column(name="CODPRODUTOPERSONALIZACAO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_PERSONALIZACAO")
	@XmlElement(name = "codprodutopersonalizacao")
	private Integer codprodutopersonalizacao;

	public void setCodprodutopersonalizacao(Integer codprodutopersonalizacao)
	{
		this.codprodutopersonalizacao = codprodutopersonalizacao;
	}

	public Integer getCodprodutopersonalizacao()
	{
		return codprodutopersonalizacao;
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
