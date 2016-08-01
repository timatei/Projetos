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
@Table(name = "PAR_VENDA")
@SequenceGenerator(name = "INC_PAR_VENDA", sequenceName = "GEN_PAR_VENDA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "parVenda") 
public class ParVenda implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ParVenda() {	
	}

	@Id
	@Column(name="CODPARVENDA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PAR_VENDA")
	@XmlElement(name = "codParVenda")
	private Integer codParVenda;

	public void setCodParVenda(Integer codParVenda)
	{
		this.codParVenda = codParVenda;
	}

	public Integer getCodParVenda()
	{
		return codParVenda;
	}

	@Column(name="CODPESSOA_DEFAULT", nullable =  true , length = 11)
	@XmlElement(name = "pessoaDefault")
	private Integer pessoaDefault;

	public void setPessoaDefault(Integer pessoaDefault)
	{
		this.pessoaDefault = pessoaDefault;
	}

	public Integer getPessoaDefault()
	{
		return pessoaDefault;
	}
	
	@Column(name="PARV_ABERTURA_CAIXA", nullable =  true , length = 1)
	@XmlElement(name = "aberturaCaixa")
	private String aberturaCaixa;

	public void setAberturaCaixa(String aberturaCaixa)
	{
		this.aberturaCaixa = aberturaCaixa;
	}

	public String getAberturaCaixa()
	{
		return aberturaCaixa;
	}

	public void setAberturaCaixaBoolean(Boolean value)
	{
		if (value) {
			this.aberturaCaixa = "S";
		}
		else {
			this.aberturaCaixa = "N";
		}
	}
	public Boolean getAberturaCaixaBoolean()
	{
		return ((this.aberturaCaixa != null)&&(this.aberturaCaixa.equalsIgnoreCase("S")));
	}

	
	@Column(name="PARV_FECHAMENTO_TIPO", nullable =  true , length = 1)
	@XmlElement(name = "fechamentoTipo")
	private String fechamentoTipo;

	public void setFechamentoTipo(String fechamentoTipo)
	{
		this.fechamentoTipo = fechamentoTipo;
	}

	public String getFechamentoTipo()
	{
		return fechamentoTipo;
	}

	public void setFechamentoTipoBoolean(Boolean value)
	{
		if (value) {
			this.fechamentoTipo = "S";
		}
		else {
			this.fechamentoTipo = "N";
		}
	}
	public Boolean getFechamentoTipoBoolean()
	{
		return ((this.fechamentoTipo != null)&&(this.fechamentoTipo.equalsIgnoreCase("S")));
	}
}
