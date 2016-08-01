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
@Table(name = "AJUSTE_ESTOQUE_ITEM")
@SequenceGenerator(name = "INC_AJUSTE_ESTOQUE_ITEM", sequenceName = "GEN_AJUSTE_ESTOQUE_ITEM")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "ajusteEstoqueItem") 
public class AjusteEstoqueItem implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public AjusteEstoqueItem() {	
	}

	@Id
	@Column(name="CODAJUSTEESTOQUEITEM", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_AJUSTE_ESTOQUE_ITEM")
	@XmlElement(name = "codajusteestoqueitem")
	private Integer codajusteestoqueitem;

	public void setCodajusteestoqueitem(Integer codajusteestoqueitem)
	{
		this.codajusteestoqueitem = codajusteestoqueitem;
	}

	public Integer getCodajusteestoqueitem()
	{
		return codajusteestoqueitem;
	}

	@Column(name="CODAJUSTEESTOQUE", nullable =  false , length = 11)
	@XmlElement(name = "codajusteestoque")
	private Integer codajusteestoque;

	public void setCodajusteestoque(Integer codajusteestoque)
	{
		this.codajusteestoque = codajusteestoque;
	}

	public Integer getCodajusteestoque()
	{
		return codajusteestoque;
	}

	@Column(name="CODPESQUISA", nullable =  true , length = 20)
	@XmlElement(name = "codpesquisa")
	private String codpesquisa;

	public void setCodpesquisa(String codpesquisa)
	{
		this.codpesquisa = codpesquisa;
	}

	public String getCodpesquisa()
	{
		return codpesquisa;
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

	@Column(name="AJUSI_QTDE", nullable =  true , length = 17)
	@XmlElement(name = "qtde")
	private Float qtde= 0f;

	public void setQtde(Float qtde)
	{
		this.qtde = qtde;
	}

	public Float getQtde()
	{
		return qtde;
	}

	@Column(name="AJUSI_NUMLOTE", nullable =  true , length = 20)
	@XmlElement(name = "numlote")
	private String numlote;

	public void setNumlote(String numlote)
	{
		this.numlote = numlote;
	}

	public String getNumlote()
	{
		return numlote;
	}

	@Column(name="AJUSI_DT_VALIDADE", nullable =  true , length = 10)
	@XmlElement(name = "dtValidade")
	private java.sql.Timestamp dtValidade;

	public void setDtValidade(java.sql.Timestamp dtValidade)
	{
		this.dtValidade = dtValidade;
	}

	public java.sql.Timestamp getDtValidade()
	{
		return dtValidade;
	}

	@Column(name="AJUSI_CUSTO", nullable =  true , length = 17)
	@XmlElement(name = "custo")
	private Float custo= 0f;

	public void setCusto(Float custo)
	{
		this.custo = custo;
	}

	public Float getCusto()
	{
		return custo;
	}

	@Column(name="AJUSI_NOME_REQ", nullable =  true , length = 40)
	@XmlElement(name = "nomeReq")
	private String nomeReq;

	public void setNomeReq(String nomeReq)
	{
		this.nomeReq = nomeReq;
	}

	public String getNomeReq()
	{
		return nomeReq;
	}

	@Column(name="CODOBRA", nullable =  true , length = 11)
	@XmlElement(name = "codobra")
	private Integer codobra;

	public void setCodobra(Integer codobra)
	{
		this.codobra = codobra;
	}

	public Integer getCodobra()
	{
		return codobra;
	}

	@Column(name="AJUSI_ESTOQ_ANTERIOR", nullable =  true , length = 17)
	@XmlElement(name = "estoqAnterior")
	private Float estoqAnterior= 0f;

	public void setEstoqAnterior(Float estoqAnterior)
	{
		this.estoqAnterior = estoqAnterior;
	}

	public Float getEstoqAnterior()
	{
		return estoqAnterior;
	}

	@Column(name="AJUSI_QUEBRA", nullable =  true , length = 1)
	@XmlElement(name = "quebra")
	private String quebra;

	public void setQuebra(String quebra)
	{
		this.quebra = quebra;
	}

	public String getQuebra()
	{
		return quebra;
	}

	public void setQuebraBoolean(Boolean value)
	{
		if (value) {
			this.quebra = "S";
		}
		else {
			this.quebra = "N";
		}
	}
	public Boolean getQuebraBoolean()
	{
		return ((this.quebra != null)&&(this.quebra.equalsIgnoreCase("S")));
	}
	@Column(name="CODFUNCIONARIO", nullable =  true , length = 11)
	@XmlElement(name = "codfuncionario")
	private Integer codfuncionario;

	public void setCodfuncionario(Integer codfuncionario)
	{
		this.codfuncionario = codfuncionario;
	}

	public Integer getCodfuncionario()
	{
		return codfuncionario;
	}

	@Column(name="AJUSI_CA", nullable =  true , length = 15)
	@XmlElement(name = "ca")
	private String ca;

	public void setCa(String ca)
	{
		this.ca = ca;
	}

	public String getCa()
	{
		return ca;
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

	@Column(name="CODEMPRESA", nullable =  true , length = 11)
	@XmlElement(name = "codempresa")
	private Integer codempresa;

	public void setCodempresa(Integer codempresa)
	{
		this.codempresa = codempresa;
	}

	public Integer getCodempresa()
	{
		return codempresa;
	}

	@Column(name="AJUSI_NOVOPRECO01", nullable =  true , length = 17)
	@XmlElement(name = "novopreco01")
	private Float novopreco01= 0f;

	public void setNovopreco01(Float novopreco01)
	{
		this.novopreco01 = novopreco01;
	}

	public Float getNovopreco01()
	{
		return novopreco01;
	}

	@Column(name="CODVEICULOMANUTPRODUTO", nullable =  true , length = 11)
	@XmlElement(name = "codveiculomanutproduto")
	private Integer codveiculomanutproduto;

	public void setCodveiculomanutproduto(Integer codveiculomanutproduto)
	{
		this.codveiculomanutproduto = codveiculomanutproduto;
	}

	public Integer getCodveiculomanutproduto()
	{
		return codveiculomanutproduto;
	}

}
