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
@Table(name = "FORMAPAGAMENTO")
@SequenceGenerator(name = "INC_FORMAPAGAMENTO", sequenceName = "GEN_FORMAPAGAMENTO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "formapagamento") 
public class Formapagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Formapagamento() {	
	}

	@Id
	@Column(name="CODFORMAPAGAMENTO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_FORMAPAGAMENTO")
	@XmlElement(name = "codformapagamento")
	private Integer codformapagamento;

	public void setCodformapagamento(Integer codformapagamento)
	{
		this.codformapagamento = codformapagamento;
	}

	public Integer getCodformapagamento()
	{
		return codformapagamento;
	}

	@Column(name="FPG_DESCRICAO", nullable =  false , length = 30)
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

	@Column(name="FPG_PARCELAS", nullable =  true , length = 11)
	@XmlElement(name = "parcelas")
	private Integer parcelas;

	public void setParcelas(Integer parcelas)
	{
		this.parcelas = parcelas;
	}

	public Integer getParcelas()
	{
		return parcelas;
	}

	@Column(name="FPG_NUMDIAS", nullable =  true , length = 11)
	@XmlElement(name = "numdias")
	private Integer numdias;

	public void setNumdias(Integer numdias)
	{
		this.numdias = numdias;
	}

	public Integer getNumdias()
	{
		return numdias;
	}

	@Column(name="FPG_NUMDIAS_DEMAIS", nullable =  true , length = 11)
	@XmlElement(name = "numdiasDemais")
	private Integer numdiasDemais;

	public void setNumdiasDemais(Integer numdiasDemais)
	{
		this.numdiasDemais = numdiasDemais;
	}

	public Integer getNumdiasDemais()
	{
		return numdiasDemais;
	}

	@Column(name="CODMOEDA", nullable =  true , length = 11)
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

	@Column(name="FPG_PER_ACRES", nullable =  true , length = 17)
	@XmlElement(name = "perAcres")
	private Float perAcres= 0f;

	public void setPerAcres(Float perAcres)
	{
		this.perAcres = perAcres;
	}

	public Float getPerAcres()
	{
		return perAcres;
	}

	@Column(name="FPG_SEPARAR", nullable =  false , length = 1)
	@XmlElement(name = "separar")
	private String separar;

	public void setSeparar(String separar)
	{
		this.separar = separar;
	}

	public String getSeparar()
	{
		return separar;
	}

	public void setSepararBoolean(Boolean value)
	{
		if (value) {
			this.separar = "S";
		}
		else {
			this.separar = "N";
		}
	}
	public Boolean getSepararBoolean()
	{
		return ((this.separar != null)&&(this.separar.equalsIgnoreCase("S")));
	}
	@Column(name="FPG_VRP", nullable =  false , length = 1)
	@XmlElement(name = "vrp")
	private String vrp;

	public void setVrp(String vrp)
	{
		this.vrp = vrp;
	}

	public String getVrp()
	{
		return vrp;
	}

	public void setVrpBoolean(Boolean value)
	{
		if (value) {
			this.vrp = "S";
		}
		else {
			this.vrp = "N";
		}
	}
	public Boolean getVrpBoolean()
	{
		return ((this.vrp != null)&&(this.vrp.equalsIgnoreCase("S")));
	}
	@Column(name="FPG_TIPOPRECO", nullable =  true , length = 2)
	@XmlElement(name = "tipopreco")
	private String tipopreco;

	public void setTipopreco(String tipopreco)
	{
		this.tipopreco = tipopreco;
	}

	public String getTipopreco()
	{
		return tipopreco;
	}

	@Column(name="FPG_VLR_MIN", nullable =  true , length = 17)
	@XmlElement(name = "vlrMin")
	private Float vlrMin= 0f;

	public void setVlrMin(Float vlrMin)
	{
		this.vlrMin = vlrMin;
	}

	public Float getVlrMin()
	{
		return vlrMin;
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
	@Column(name="FPG_PER_DESC", nullable =  true , length = 17)
	@XmlElement(name = "perDesc")
	private Float perDesc= 0f;

	public void setPerDesc(Float perDesc)
	{
		this.perDesc = perDesc;
	}

	public Float getPerDesc()
	{
		return perDesc;
	}

}
