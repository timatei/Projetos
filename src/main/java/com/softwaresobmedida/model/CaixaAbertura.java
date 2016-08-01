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
@Table(name = "CAIXA_ABERTURA")
@SequenceGenerator(name = "INC_CAIXA_ABERTURA", sequenceName = "GEN_CAIXA_ABERTURA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "caixaAbertura") 
public class CaixaAbertura implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public CaixaAbertura() {	
	}

	@Id
	@Column(name="CODCAIXAABERTURA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_CAIXA_ABERTURA")
	@XmlElement(name = "codcaixaabertura")
	private Integer codcaixaabertura;

	public void setCodcaixaabertura(Integer codcaixaabertura)
	{
		this.codcaixaabertura = codcaixaabertura;
	}

	public Integer getCodcaixaabertura()
	{
		return codcaixaabertura;
	}

	@Column(name="CAIA_STATUS", nullable =  false , length = 10)
	@XmlElement(name = "status")
	private String status;

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}

	@Column(name="CAIA_OPERADOR", nullable =  false , length = 20)
	@XmlElement(name = "operador")
	private String operador;

	public void setOperador(String operador)
	{
		this.operador = operador;
	}

	public String getOperador()
	{
		return operador;
	}

	@Column(name="CAIA_ABERTURA_DATA", nullable =  false , length = 19)
	@XmlElement(name = "aberturaData")
	private java.sql.Timestamp aberturaData;

	public void setAberturaData(java.sql.Timestamp aberturaData)
	{
		this.aberturaData = aberturaData;
	}

	public java.sql.Timestamp getAberturaData()
	{
		return aberturaData;
	}

	@Column(name="CAIA_FECHAMENTO_DATA", nullable =  true , length = 19)
	@XmlElement(name = "fechamentoData")
	private java.sql.Timestamp fechamentoData;

	public void setFechamentoData(java.sql.Timestamp fechamentoData)
	{
		this.fechamentoData = fechamentoData;
	}

	public java.sql.Timestamp getFechamentoData()
	{
		return fechamentoData;
	}

	@Column(name="CAIA_VLRINICIAL", nullable =  true , length = 17)
	@XmlElement(name = "vlrinicial")
	private Float vlrinicial= 0f;

	public void setVlrinicial(Float vlrinicial)
	{
		this.vlrinicial = vlrinicial;
	}

	public Float getVlrinicial()
	{
		return vlrinicial;
	}

	@Column(name="CAIA_SALDO_FINAL", nullable =  true , length = 17)
	@XmlElement(name = "saldoFinal")
	private Float saldoFinal= 0f;

	public void setSaldoFinal(Float saldoFinal)
	{
		this.saldoFinal = saldoFinal;
	}

	public Float getSaldoFinal()
	{
		return saldoFinal;
	}

	@Column(name="CAIA_MAQUINA", nullable =  true , length = 10)
	@XmlElement(name = "maquina")
	private String maquina;

	public void setMaquina(String maquina)
	{
		this.maquina = maquina;
	}

	public String getMaquina()
	{
		return maquina;
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

	@Column(name="CAIA_SALDO_ANTERIOR", nullable =  true , length = 17)
	@XmlElement(name = "saldoAnterior")
	private Float saldoAnterior= 0f;

	public void setSaldoAnterior(Float saldoAnterior)
	{
		this.saldoAnterior = saldoAnterior;
	}

	public Float getSaldoAnterior()
	{
		return saldoAnterior;
	}

	@Column(name="CODCAIXAABERTURA_ANTERIOR", nullable =  true , length = 11)
	@XmlElement(name = "anterior")
	private Integer anterior;

	public void setAnterior(Integer anterior)
	{
		this.anterior = anterior;
	}

	public Integer getAnterior()
	{
		return anterior;
	}

	@Column(name="CODPARGERAL", nullable =  true , length = 11)
	@XmlElement(name = "codpargeral")
	private Integer codpargeral;

	public void setCodpargeral(Integer codpargeral)
	{
		this.codpargeral = codpargeral;
	}

	public Integer getCodpargeral()
	{
		return codpargeral;
	}

	@Column(name="CAIA_CENT_005", nullable =  true , length = 17)
	@XmlElement(name = "cent005")
	private Float cent005= 0f;

	public void setCent005(Float cent005)
	{
		this.cent005 = cent005;
	}

	public Float getCent005()
	{
		return cent005;
	}

	@Column(name="CAIA_CENT_010", nullable =  true , length = 17)
	@XmlElement(name = "cent010")
	private Float cent010= 0f;

	public void setCent010(Float cent010)
	{
		this.cent010 = cent010;
	}

	public Float getCent010()
	{
		return cent010;
	}

	@Column(name="CAIA_CENT_025", nullable =  true , length = 17)
	@XmlElement(name = "cent025")
	private Float cent025= 0f;

	public void setCent025(Float cent025)
	{
		this.cent025 = cent025;
	}

	public Float getCent025()
	{
		return cent025;
	}

	@Column(name="CAIA_CENT_050", nullable =  true , length = 17)
	@XmlElement(name = "cent050")
	private Float cent050= 0f;

	public void setCent050(Float cent050)
	{
		this.cent050 = cent050;
	}

	public Float getCent050()
	{
		return cent050;
	}

	@Column(name="CAIA_CENT_100", nullable =  true , length = 17)
	@XmlElement(name = "cent100")
	private Float cent100= 0f;

	public void setCent100(Float cent100)
	{
		this.cent100 = cent100;
	}

	public Float getCent100()
	{
		return cent100;
	}

	@Column(name="CAIA_CEDL_001", nullable =  true , length = 17)
	@XmlElement(name = "cedl001")
	private Float cedl001= 0f;

	public void setCedl001(Float cedl001)
	{
		this.cedl001 = cedl001;
	}

	public Float getCedl001()
	{
		return cedl001;
	}

	@Column(name="CAIA_CEDL_002", nullable =  true , length = 17)
	@XmlElement(name = "cedl002")
	private Float cedl002= 0f;

	public void setCedl002(Float cedl002)
	{
		this.cedl002 = cedl002;
	}

	public Float getCedl002()
	{
		return cedl002;
	}

	@Column(name="CAIA_CEDL_005", nullable =  true , length = 17)
	@XmlElement(name = "cedl005")
	private Float cedl005= 0f;

	public void setCedl005(Float cedl005)
	{
		this.cedl005 = cedl005;
	}

	public Float getCedl005()
	{
		return cedl005;
	}

	@Column(name="CAIA_CEDL_010", nullable =  true , length = 17)
	@XmlElement(name = "cedl010")
	private Float cedl010= 0f;

	public void setCedl010(Float cedl010)
	{
		this.cedl010 = cedl010;
	}

	public Float getCedl010()
	{
		return cedl010;
	}

	@Column(name="CAIA_CEDL_020", nullable =  true , length = 17)
	@XmlElement(name = "cedl020")
	private Float cedl020= 0f;

	public void setCedl020(Float cedl020)
	{
		this.cedl020 = cedl020;
	}

	public Float getCedl020()
	{
		return cedl020;
	}

	@Column(name="CAIA_CEDL_050", nullable =  true , length = 17)
	@XmlElement(name = "cedl050")
	private Float cedl050= 0f;

	public void setCedl050(Float cedl050)
	{
		this.cedl050 = cedl050;
	}

	public Float getCedl050()
	{
		return cedl050;
	}

	@Column(name="CAIA_CEDL_100", nullable =  true , length = 17)
	@XmlElement(name = "cedl100")
	private Float cedl100= 0f;

	public void setCedl100(Float cedl100)
	{
		this.cedl100 = cedl100;
	}

	public Float getCedl100()
	{
		return cedl100;
	}

	@Column(name="CAIA_ABERTURA_HORA", nullable =  true , length = 8)
	@XmlElement(name = "aberturaHora")
	private Float aberturaHora= 0f;

	public void setAberturaHora(Float aberturaHora)
	{
		this.aberturaHora = aberturaHora;
	}

	public Float getAberturaHora()
	{
		return aberturaHora;
	}

}
