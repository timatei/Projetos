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
@Table(name = "PRODUTO_UNIDADE")
@SequenceGenerator(name = "INC_PRODUTO_UNIDADE", sequenceName = "GEN_PRODUTO_UNIDADE")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoUnidade") 
public class ProdutoUnidade implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codProdutoUnidade";

	public ProdutoUnidade() {	
	}

	@Id
	@Column(name="CODPRODUTOUNIDADE", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_UNIDADE")
	@XmlElement(name = "codProdutoUnidade")
	private Integer codProdutoUnidade;
	
	public Integer getCodProdutoUnidade() {
		return codProdutoUnidade;
	}
	
	public void setCodProdutoUnidade(Integer codProdutoUnidade) {
		this.codProdutoUnidade = codProdutoUnidade;
	}
	
	@Column(name="PROU_DESCRICAO", nullable =  false , length = 20)
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

	@Column(name="PROU_SIGLA", nullable =  false , length = 4)
	@XmlElement(name = "sigla")
	private String sigla;

	public void setSigla(String sigla)
	{
		this.sigla = sigla;
	}

	public String getSigla()
	{
		return sigla;
	}
	
	// METODO IMPORTANTE PARA COMPARAR OBJETOS
	@Override  
	public boolean equals(Object obj){  
		if (this == obj)  
			return true;  
		if (obj == null)  
			return false;  
		if (!(obj instanceof ProdutoUnidade)) //<<<<-------- MUDAR A CLASSE AQUI  
			return false;  
		ProdutoUnidade other = (ProdutoUnidade) obj;   //<<<<-------- MUDAR A CLASSE AQUI
		if (codProdutoUnidade == null){   //<<<<-------- MUDAR A CAMPO AQUI
			if (other.codProdutoUnidade != null)  
				return false;  
		} else if (!codProdutoUnidade.equals(other.codProdutoUnidade))   //<<<<-------- MUDAR A CAMPO AQUI
			return false;  
		return true;  
	}
	
	public int hashCode() {
		return toString().hashCode();
	}	
}
