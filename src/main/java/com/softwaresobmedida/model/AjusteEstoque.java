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
@Table(name = "AJUSTE_ESTOQUE")
@SequenceGenerator(name = "INC_AJUSTE_ESTOQUE", sequenceName = "GEN_AJUSTE_ESTOQUE")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "ajusteEstoque") 
public class AjusteEstoque implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public AjusteEstoque() {	
	}

	@Id
	@Column(name="CODAJUSTEESTOQUE", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_AJUSTE_ESTOQUE")
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

	@Column(name="AJUS_DATA", nullable =  true , length = 10)
	@XmlElement(name = "data")
	private java.sql.Timestamp data;

	public void setData(java.sql.Timestamp data)
	{
		this.data = data;
	}

	public java.sql.Timestamp getData()
	{
		return data;
	}

	@Column(name="AJUS_TIPO", nullable =  false , length = 10)
	@XmlElement(name = "tipo")
	private String tipo;

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo()
	{
		return tipo;
	}

	@Column(name="AJUS_OBS", nullable =  true , length = 300)
	@XmlElement(name = "obs")
	private String obs;

	public void setObs(String obs)
	{
		this.obs = obs;
	}

	public String getObs()
	{
		return obs;
	}

	@Column(name="AJUS_IVENT_PROC", nullable =  false , length = 1)
	@XmlElement(name = "iventProc")
	private String iventProc;

	public void setIventProc(String iventProc)
	{
		this.iventProc = iventProc;
	}

	public String getIventProc()
	{
		return iventProc;
	}

	public void setIventProcBoolean(Boolean value)
	{
		if (value) {
			this.iventProc = "S";
		}
		else {
			this.iventProc = "N";
		}
	}
	public Boolean getIventProcBoolean()
	{
		return ((this.iventProc != null)&&(this.iventProc.equalsIgnoreCase("S")));
	}
	@Column(name="AJUS_IVENT", nullable =  true , length = 1)
	@XmlElement(name = "ivent")
	private String ivent;

	public void setIvent(String ivent)
	{
		this.ivent = ivent;
	}

	public String getIvent()
	{
		return ivent;
	}

	public void setIventBoolean(Boolean value)
	{
		if (value) {
			this.ivent = "S";
		}
		else {
			this.ivent = "N";
		}
	}
	public Boolean getIventBoolean()
	{
		return ((this.ivent != null)&&(this.ivent.equalsIgnoreCase("S")));
	}
	@Column(name="AJUS_QTDE_RAT", nullable =  true , length = 11)
	@XmlElement(name = "qtdeRat")
	private Integer qtdeRat;

	public void setQtdeRat(Integer qtdeRat)
	{
		this.qtdeRat = qtdeRat;
	}

	public Integer getQtdeRat()
	{
		return qtdeRat;
	}

	@Column(name="AJUS_FALTA_ESTOQUE", nullable =  true , length = 1)
	@XmlElement(name = "faltaEstoque")
	private String faltaEstoque;

	public void setFaltaEstoque(String faltaEstoque)
	{
		this.faltaEstoque = faltaEstoque;
	}

	public String getFaltaEstoque()
	{
		return faltaEstoque;
	}

	public void setFaltaEstoqueBoolean(Boolean value)
	{
		if (value) {
			this.faltaEstoque = "S";
		}
		else {
			this.faltaEstoque = "N";
		}
	}
	public Boolean getFaltaEstoqueBoolean()
	{
		return ((this.faltaEstoque != null)&&(this.faltaEstoque.equalsIgnoreCase("S")));
	}
	@Column(name="AJUS_TIPO_SAIDA", nullable =  true , length = 20)
	@XmlElement(name = "tipoSaida")
	private String tipoSaida;

	public void setTipoSaida(String tipoSaida)
	{
		this.tipoSaida = tipoSaida;
	}

	public String getTipoSaida()
	{
		return tipoSaida;
	}

	@Column(name="AJUS_OCORRENCIA", nullable =  true , length = 20)
	@XmlElement(name = "ocorrencia")
	private String ocorrencia;

	public void setOcorrencia(String ocorrencia)
	{
		this.ocorrencia = ocorrencia;
	}

	public String getOcorrencia()
	{
		return ocorrencia;
	}

	@Column(name="AJUS_FILIAL", nullable =  true , length = 20)
	@XmlElement(name = "filial")
	private String filial;

	public void setFilial(String filial)
	{
		this.filial = filial;
	}

	public String getFilial()
	{
		return filial;
	}

	@Column(name="AJUS_EPI", nullable =  true , length = 1)
	@XmlElement(name = "epi")
	private String epi;

	public void setEpi(String epi)
	{
		this.epi = epi;
	}

	public String getEpi()
	{
		return epi;
	}

	public void setEpiBoolean(Boolean value)
	{
		if (value) {
			this.epi = "S";
		}
		else {
			this.epi = "N";
		}
	}
	public Boolean getEpiBoolean()
	{
		return ((this.epi != null)&&(this.epi.equalsIgnoreCase("S")));
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

}
