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
@Table(name = "PRODUTO_UNIDADE")
@SequenceGenerator(name = "INC_PRODUTO_UNIDADE", sequenceName = "GEN_PRODUTO_UNIDADE")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoUnidade") 
public class ProdutoUnidade implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ProdutoUnidade() {	
	}

	@Id
	@Column(name="CODPRODUTOUNIDADE", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_UNIDADE")
	@XmlElement(name = "codprodutounidade")
	private Integer codprodutounidade;

	public void setCodprodutounidade(Integer codprodutounidade)
	{
		this.codprodutounidade = codprodutounidade;
	}

	public Integer getCodprodutounidade()
	{
		return codprodutounidade;
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

	@Column(name="SSM_MODIFICACAO", nullable =  true , length = 19)
	@XmlElement(name = "modificacao")
	private java.sql.Timestamp modificacao;

	public void setModificacao(java.sql.Timestamp modificacao)
	{
		this.modificacao = modificacao;
	}

	public java.sql.Timestamp getModificacao()
	{
		return modificacao;
	}

	@Column(name="AUX", nullable =  true , length = 1)
	@XmlElement(name = "aux")
	private String aux;

	public void setAux(String aux)
	{
		this.aux = aux;
	}

	public String getAux()
	{
		return aux;
	}

	public void setAuxBoolean(Boolean value)
	{
		if (value) {
			this.aux = "S";
		}
		else {
			this.aux = "N";
		}
	}
	public Boolean getAuxBoolean()
	{
		return ((this.aux != null)&&(this.aux.equalsIgnoreCase("S")));
	}
}
