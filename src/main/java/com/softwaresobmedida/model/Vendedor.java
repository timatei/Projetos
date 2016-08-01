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

	public static String CAMPO_CHAVE = "id";

	public Vendedor() {	
	}

	@Id
	@Column(name="CODVENDEDOR", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_VENDEDOR")
	@XmlElement(name = "codvendedor")
	private Integer codvendedor;

	public void setCodvendedor(Integer codvendedor)
	{
		this.codvendedor = codvendedor;
	}

	public Integer getCodvendedor()
	{
		return codvendedor;
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
	@XmlElement(name = "codsegusu")
	private Integer codsegusu;

	public void setCodsegusu(Integer codsegusu)
	{
		this.codsegusu = codsegusu;
	}

	public Integer getCodsegusu()
	{
		return codsegusu;
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

	@Column(name="SSM_REVISAO", nullable =  true , length = 11)
	@XmlElement(name = "revisao")
	private Integer revisao;

	public void setRevisao(Integer revisao)
	{
		this.revisao = revisao;
	}

	public Integer getRevisao()
	{
		return revisao;
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
	@Column(name="VEN_DADOS_ASSINATURA", nullable =  true , length = 0)
	@XmlElement(name = "dadosAssinatura")
	private String dadosAssinatura;

	public void setDadosAssinatura(String dadosAssinatura)
	{
		this.dadosAssinatura = dadosAssinatura;
	}

	public String getDadosAssinatura()
	{
		return dadosAssinatura;
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

	public void setTipoVendedorBoolean(Boolean value)
	{
		if (value) {
			this.tipoVendedor = "S";
		}
		else {
			this.tipoVendedor = "N";
		}
	}
	public Boolean getTipoVendedorBoolean()
	{
		return ((this.tipoVendedor != null)&&(this.tipoVendedor.equalsIgnoreCase("S")));
	}
}
