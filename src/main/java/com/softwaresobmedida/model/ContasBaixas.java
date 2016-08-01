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
@Table(name = "CONTAS_BAIXAS")
@SequenceGenerator(name = "INC_CONTAS_BAIXAS", sequenceName = "GEN_CONTAS_BAIXAS")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "contasBaixas") 
public class ContasBaixas implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ContasBaixas() {	
	}

	@Id
	@Column(name="CODCONTABAIXA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_CONTAS_BAIXAS")
	@XmlElement(name = "codcontabaixa")
	private Integer codcontabaixa;

	public void setCodcontabaixa(Integer codcontabaixa)
	{
		this.codcontabaixa = codcontabaixa;
	}

	public Integer getCodcontabaixa()
	{
		return codcontabaixa;
	}

	@Column(name="CODCONTA", nullable =  false , length = 11)
	@XmlElement(name = "codconta")
	private Integer codconta;

	public void setCodconta(Integer codconta)
	{
		this.codconta = codconta;
	}

	public Integer getCodconta()
	{
		return codconta;
	}

	@Column(name="CODMOEDA", nullable =  false , length = 11)
	@XmlElement(name = "codmoeda")
	private Integer codmoeda;

	public void setCodmoeda(Integer codmoeda)
	{
		this.codmoeda = codmoeda;
	}

	public Integer getCodmoeda()
	{
		return codmoeda;
	}

	@Column(name="COBX_DTPAG", nullable =  false , length = 10)
	@XmlElement(name = "dtpag")
	private java.sql.Timestamp dtpag;

	public void setDtpag(java.sql.Timestamp dtpag)
	{
		this.dtpag = dtpag;
	}

	public java.sql.Timestamp getDtpag()
	{
		return dtpag;
	}

	@Column(name="COBX_VLRPAGO", nullable =  true , length = 17)
	@XmlElement(name = "vlrpago")
	private Float vlrpago= 0f;

	public void setVlrpago(Float vlrpago)
	{
		this.vlrpago = vlrpago;
	}

	public Float getVlrpago()
	{
		return vlrpago;
	}

	@Column(name="COBX_OBS", nullable =  true , length = 0)
	@XmlElement(name = "obs")
	private Float obs= 0f;

	public void setObs(Float obs)
	{
		this.obs = obs;
	}

	public Float getObs()
	{
		return obs;
	}

	@Column(name="CODBANCO", nullable =  true , length = 11)
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

	@Column(name="COBX_NUMCHEQ", nullable =  true , length = 20)
	@XmlElement(name = "numcheq")
	private String numcheq;

	public void setNumcheq(String numcheq)
	{
		this.numcheq = numcheq;
	}

	public String getNumcheq()
	{
		return numcheq;
	}

	@Column(name="COBX_BANCO", nullable =  true , length = 10)
	@XmlElement(name = "banco")
	private String banco;

	public void setBanco(String banco)
	{
		this.banco = banco;
	}

	public String getBanco()
	{
		return banco;
	}

	@Column(name="COBX_BNC_AGENCIA", nullable =  true , length = 10)
	@XmlElement(name = "bncAgencia")
	private String bncAgencia;

	public void setBncAgencia(String bncAgencia)
	{
		this.bncAgencia = bncAgencia;
	}

	public String getBncAgencia()
	{
		return bncAgencia;
	}

	@Column(name="COBX_BNC_NRCONTA", nullable =  true , length = 15)
	@XmlElement(name = "bncNrconta")
	private String bncNrconta;

	public void setBncNrconta(String bncNrconta)
	{
		this.bncNrconta = bncNrconta;
	}

	public String getBncNrconta()
	{
		return bncNrconta;
	}

	@Column(name="COBX_BNC_NM_EMITENTE", nullable =  true , length = 30)
	@XmlElement(name = "bncNmEmitente")
	private String bncNmEmitente;

	public void setBncNmEmitente(String bncNmEmitente)
	{
		this.bncNmEmitente = bncNmEmitente;
	}

	public String getBncNmEmitente()
	{
		return bncNmEmitente;
	}

	@Column(name="CODBANCONAOCONTA", nullable =  true , length = 11)
	@XmlElement(name = "codbanconaoconta")
	private Integer codbanconaoconta;

	public void setCodbanconaoconta(Integer codbanconaoconta)
	{
		this.codbanconaoconta = codbanconaoconta;
	}

	public Integer getCodbanconaoconta()
	{
		return codbanconaoconta;
	}

	@Column(name="COBX_BNC_NM_CPF", nullable =  true , length = 15)
	@XmlElement(name = "bncNmCpf")
	private String bncNmCpf;

	public void setBncNmCpf(String bncNmCpf)
	{
		this.bncNmCpf = bncNmCpf;
	}

	public String getBncNmCpf()
	{
		return bncNmCpf;
	}

	@Column(name="CODCAIXAABERTURA", nullable =  true , length = 11)
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

	@Column(name="COBX_DIAS_VENC", nullable =  true , length = 11)
	@XmlElement(name = "diasVenc")
	private Integer diasVenc;

	public void setDiasVenc(Integer diasVenc)
	{
		this.diasVenc = diasVenc;
	}

	public Integer getDiasVenc()
	{
		return diasVenc;
	}

	@Column(name="COBX_USUARIO", nullable =  true , length = 20)
	@XmlElement(name = "usuario")
	private String usuario;

	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public String getUsuario()
	{
		return usuario;
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

	@Column(name="CODNTCREDITO", nullable =  true , length = 11)
	@XmlElement(name = "codntcredito")
	private Integer codntcredito;

	public void setCodntcredito(Integer codntcredito)
	{
		this.codntcredito = codntcredito;
	}

	public Integer getCodntcredito()
	{
		return codntcredito;
	}

	@Column(name="COBX_DATAHORA", nullable =  true , length = 19)
	@XmlElement(name = "datahora")
	private java.sql.Timestamp datahora;

	public void setDatahora(java.sql.Timestamp datahora)
	{
		this.datahora = datahora;
	}

	public java.sql.Timestamp getDatahora()
	{
		return datahora;
	}

	@Column(name="CODBANCOEXTRATO", nullable =  true , length = 11)
	@XmlElement(name = "codbancoextrato")
	private Integer codbancoextrato;

	public void setCodbancoextrato(Integer codbancoextrato)
	{
		this.codbancoextrato = codbancoextrato;
	}

	public Integer getCodbancoextrato()
	{
		return codbancoextrato;
	}

}
