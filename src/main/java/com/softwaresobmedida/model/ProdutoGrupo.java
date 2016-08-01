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
@Table(name = "PRODUTO_GRUPO")
@SequenceGenerator(name = "INC_PRODUTO_GRUPO", sequenceName = "GEN_PRODUTO_GRUPO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoGrupo") 
public class ProdutoGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codProdutoGrupo";

	public ProdutoGrupo() {	
	}

	@Id
	@Column(name="CODPRODUTOGRUPO", nullable = true, length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_GRUPO")
	@XmlElement(name = "codProdutoGrupo")
	private Integer codProdutoGrupo;
	
	public Integer getCodProdutoGrupo() {
		return codProdutoGrupo;
	}
	
	public void setCodProdutoGrupo(Integer codProdutoGrupo) {
		this.codProdutoGrupo = codProdutoGrupo;
	}

	@Column(name="PROG_DESCRICAO", nullable = true, length = 60)
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
	
	
	@Column(name="PROG_DESATIVAR_TOUCH", nullable = false, length = 1)
	private String desativarTouch;
	
	public void setDesativarTouch(String desativarTouch) {
		this.desativarTouch = desativarTouch;
	}
	
	public String getDesativarTouch() {
		return desativarTouch;
	}
	
	@Column(name="PROG_ORDEM", nullable = false, length = 11)
	private Integer ordem;
	
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	public Integer getOrdem() {
		return ordem;
	}
	
	// METODO IMPORTANTE PARA COMPARAR OBJETOS
	@Override  
	public boolean equals(Object obj){  
		if (this == obj)  
			return true;  
		if (obj == null)  
			return false;  
		if (!(obj instanceof ProdutoGrupo)) //<<<<-------- MUDAR A CLASSE AQUI  
			return false;  
		ProdutoGrupo other = (ProdutoGrupo) obj;   //<<<<-------- MUDAR A CLASSE AQUI
		if (codProdutoGrupo == null){   //<<<<-------- MUDAR A CAMPO AQUI
			if (other.codProdutoGrupo != null)     //<<<<-------- MUDAR A CAMPO AQUI
				return false;  
		} else if (!codProdutoGrupo.equals(other.codProdutoGrupo))   //<<<<-------- MUDAR A CAMPO AQUI
			return false;  
		return true;  
	}
	
	public int hashCode() {
		return toString().hashCode();
	}	
}
