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
@Table(name = "VENDEDOR")
@SequenceGenerator(name = "INC_VENDEDOR", sequenceName = "GEN_VENDEDOR")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "vendedor") 
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codvendedor";

	public Vendedor() {	
	}

	@Id
	@Column(name="CODVENDEDOR", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_VENDEDOR")
	@XmlElement(name = "codvendedor")
	private Integer codVendedor;

	public void setCodVendedor(Integer codVendedor)
	{
		this.codVendedor = codVendedor;
	}

	public Integer getCodVendedor()
	{
		return codVendedor;
	}

	@Column(name="VEN_NOME", nullable =  true , length = 60)
	@XmlElement(name = "nome")
	private String nome;

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	@Column(name="VEN_PERC_COMISSAO", nullable =  true , length = 17)
	@XmlElement(name = "percComissao")
	private Float percComissao= 0f;

	public void setPercComissao(Float percComissao)
	{
		this.percComissao = percComissao;
	}

	public Float getPercComissao()
	{
		return percComissao;
	}

	@Column(name="CODSEGUSU", nullable =  true , length = 11)
	@XmlElement(name = "codSegUsu")
	private Integer codSegUsu;

	public void setCodSegUsu(Integer codSegUsu)
	{
		this.codSegUsu = codSegUsu;
	}

	public Integer getCodSegUsu()
	{
		return codSegUsu;
	}

	@Column(name="VEN_SENHA", nullable =  true , length = 20)
	@XmlElement(name = "senha")
	private String senha;

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	public String getSenha()
	{
		return senha;
	}

	@Column(name="VEN_TIPO_VENDEDOR", nullable =  true , length = 1)
	@XmlElement(name = "tipoVendedor")
	private String tipoVendedor;

	public void setTipoVendedor(String tipoVendedor)
	{
		this.tipoVendedor = tipoVendedor;
	}

	public String getTipoVendedor()
	{
		return tipoVendedor;
	}
}