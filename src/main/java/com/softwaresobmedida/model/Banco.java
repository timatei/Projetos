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
@Table(name = "BANCO")
@SequenceGenerator(name = "INC_BANCO", sequenceName = "GEN_BANCO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "banco") 
public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Banco() {	
	}

	@Id
	@Column(name="CODBANCO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_BANCO")
	@XmlElement(name = "codbanco")
	private Integer codbanco;

	public void setCodbanco(Integer codbanco)
	{
		this.codbanco = codbanco;
	}

	public Integer getCodbanco()
	{
		return codbanco;
	}

	@Column(name="BAN_DESCRICAO", nullable =  true , length = 30)
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

	@Column(name="BAN_SALDO_INICIAL", nullable =  true , length = 17)
	@XmlElement(name = "saldoInicial")
	private Float saldoInicial= 0f;

	public void setSaldoInicial(Float saldoInicial)
	{
		this.saldoInicial = saldoInicial;
	}

	public Float getSaldoInicial()
	{
		return saldoInicial;
	}

	@Column(name="BAN_SALDO_ATUAL", nullable =  true , length = 17)
	@XmlElement(name = "saldoAtual")
	private Float saldoAtual= 0f;

	public void setSaldoAtual(Float saldoAtual)
	{
		this.saldoAtual = saldoAtual;
	}

	public Float getSaldoAtual()
	{
		return saldoAtual;
	}

	@Column(name="BAN_CONTAS", nullable =  true , length = 1)
	@XmlElement(name = "contas")
	private String contas;

	public void setContas(String contas)
	{
		this.contas = contas;
	}

	public String getContas()
	{
		return contas;
	}

	public void setContasBoolean(Boolean value)
	{
		if (value) {
			this.contas = "S";
		}
		else {
			this.contas = "N";
		}
	}
	public Boolean getContasBoolean()
	{
		return ((this.contas != null)&&(this.contas.equalsIgnoreCase("S")));
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
	@Column(name="BAN_AGENCIA", nullable =  true , length = 15)
	@XmlElement(name = "agencia")
	private String agencia;

	public void setAgencia(String agencia)
	{
		this.agencia = agencia;
	}

	public String getAgencia()
	{
		return agencia;
	}

	@Column(name="BAN_OPERACAO", nullable =  true , length = 5)
	@XmlElement(name = "operacao")
	private String operacao;

	public void setOperacao(String operacao)
	{
		this.operacao = operacao;
	}

	public String getOperacao()
	{
		return operacao;
	}

	@Column(name="BAN_CONTA", nullable =  true , length = 25)
	@XmlElement(name = "conta")
	private String conta;

	public void setConta(String conta)
	{
		this.conta = conta;
	}

	public String getConta()
	{
		return conta;
	}

	@Column(name="BAN_DATA_INICIAL", nullable =  true , length = 10)
	@XmlElement(name = "dataInicial")
	private java.sql.Timestamp dataInicial;

	public void setDataInicial(java.sql.Timestamp dataInicial)
	{
		this.dataInicial = dataInicial;
	}

	public java.sql.Timestamp getDataInicial()
	{
		return dataInicial;
	}

	@Column(name="BAN_SALDO_CONCILIADO", nullable =  true , length = 17)
	@XmlElement(name = "saldoConciliado")
	private Float saldoConciliado= 0f;

	public void setSaldoConciliado(Float saldoConciliado)
	{
		this.saldoConciliado = saldoConciliado;
	}

	public Float getSaldoConciliado()
	{
		return saldoConciliado;
	}

	@Column(name="BAN_SALDO_EXTRATO", nullable =  true , length = 17)
	@XmlElement(name = "saldoExtrato")
	private Float saldoExtrato= 0f;

	public void setSaldoExtrato(Float saldoExtrato)
	{
		this.saldoExtrato = saldoExtrato;
	}

	public Float getSaldoExtrato()
	{
		return saldoExtrato;
	}

	@Column(name="BAN_DATA_EXTRATO", nullable =  true , length = 10)
	@XmlElement(name = "dataExtrato")
	private java.sql.Timestamp dataExtrato;

	public void setDataExtrato(java.sql.Timestamp dataExtrato)
	{
		this.dataExtrato = dataExtrato;
	}

	public java.sql.Timestamp getDataExtrato()
	{
		return dataExtrato;
	}

	@Column(name="BAN_ATIVO", nullable =  false , length = 1)
	@XmlElement(name = "ativo")
	private String ativo;

	public void setAtivo(String ativo)
	{
		this.ativo = ativo;
	}

	public String getAtivo()
	{
		return ativo;
	}

	public void setAtivoBoolean(Boolean value)
	{
		if (value) {
			this.ativo = "S";
		}
		else {
			this.ativo = "N";
		}
	}
	public Boolean getAtivoBoolean()
	{
		return ((this.ativo != null)&&(this.ativo.equalsIgnoreCase("S")));
	}
}
