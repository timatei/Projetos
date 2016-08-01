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
@Table(name = "MOEDA")
@SequenceGenerator(name = "INC_MOEDA", sequenceName = "GEN_MOEDA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "moeda") 
public class Moeda implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Moeda() {	
	}

	@Id
	@Column(name="CODMOEDA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_MOEDA")
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

	@Column(name="MOE_DESCRICAO", nullable =  false , length = 20)
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

	@Column(name="MOE_TIPO", nullable =  false , length = 1)
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

	public void setTipoBoolean(Boolean value)
	{
		if (value) {
			this.tipo = "S";
		}
		else {
			this.tipo = "N";
		}
	}
	public Boolean getTipoBoolean()
	{
		return ((this.tipo != null)&&(this.tipo.equalsIgnoreCase("S")));
	}
	@Column(name="MOE_PER_DESC", nullable =  true , length = 17)
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

	@Column(name="MOE_DIAS_COMP", nullable =  true , length = 11)
	@XmlElement(name = "diasComp")
	private Integer diasComp;

	public void setDiasComp(Integer diasComp)
	{
		this.diasComp = diasComp;
	}

	public Integer getDiasComp()
	{
		return diasComp;
	}

	@Column(name="MOE_CODECF", nullable =  true , length = 5)
	@XmlElement(name = "codecf")
	private String codecf;

	public void setCodecf(String codecf)
	{
		this.codecf = codecf;
	}

	public String getCodecf()
	{
		return codecf;
	}

	@Column(name="MOE_NAO_VIS_FECH", nullable =  true , length = 1)
	@XmlElement(name = "naoVisFech")
	private String naoVisFech;

	public void setNaoVisFech(String naoVisFech)
	{
		this.naoVisFech = naoVisFech;
	}

	public String getNaoVisFech()
	{
		return naoVisFech;
	}

	public void setNaoVisFechBoolean(Boolean value)
	{
		if (value) {
			this.naoVisFech = "S";
		}
		else {
			this.naoVisFech = "N";
		}
	}
	public Boolean getNaoVisFechBoolean()
	{
		return ((this.naoVisFech != null)&&(this.naoVisFech.equalsIgnoreCase("S")));
	}
	@Column(name="MOE_DADOS_POS", nullable =  true , length = 1)
	@XmlElement(name = "dadosPos")
	private String dadosPos;

	public void setDadosPos(String dadosPos)
	{
		this.dadosPos = dadosPos;
	}

	public String getDadosPos()
	{
		return dadosPos;
	}

	public void setDadosPosBoolean(Boolean value)
	{
		if (value) {
			this.dadosPos = "S";
		}
		else {
			this.dadosPos = "N";
		}
	}
	public Boolean getDadosPosBoolean()
	{
		return ((this.dadosPos != null)&&(this.dadosPos.equalsIgnoreCase("S")));
	}
	@Column(name="MOE_BAIXAR_SEMPRE", nullable =  true , length = 1)
	@XmlElement(name = "baixarSempre")
	private String baixarSempre;

	public void setBaixarSempre(String baixarSempre)
	{
		this.baixarSempre = baixarSempre;
	}

	public String getBaixarSempre()
	{
		return baixarSempre;
	}

	public void setBaixarSempreBoolean(Boolean value)
	{
		if (value) {
			this.baixarSempre = "S";
		}
		else {
			this.baixarSempre = "N";
		}
	}
	public Boolean getBaixarSempreBoolean()
	{
		return ((this.baixarSempre != null)&&(this.baixarSempre.equalsIgnoreCase("S")));
	}
	@Column(name="MOE_NUMDIAS", nullable =  true , length = 11)
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

	@Column(name="MOE_NUMDIAS_DEMAIS", nullable =  true , length = 11)
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

	@Column(name="MOE_CON_CHE", nullable =  false , length = 1)
	@XmlElement(name = "conChe")
	private String conChe;

	public void setConChe(String conChe)
	{
		this.conChe = conChe;
	}

	public String getConChe()
	{
		return conChe;
	}

	public void setConCheBoolean(Boolean value)
	{
		if (value) {
			this.conChe = "S";
		}
		else {
			this.conChe = "N";
		}
	}
	public Boolean getConCheBoolean()
	{
		return ((this.conChe != null)&&(this.conChe.equalsIgnoreCase("S")));
	}
	@Column(name="MOE_GP", nullable =  false , length = 11)
	@XmlElement(name = "gp")
	private Integer gp;

	public void setGp(Integer gp)
	{
		this.gp = gp;
	}

	public Integer getGp()
	{
		return gp;
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
	@Column(name="MOE_DESCRICAO_ECF", nullable =  true , length = 30)
	@XmlElement(name = "descricaoEcf")
	private String descricaoEcf;

	public void setDescricaoEcf(String descricaoEcf)
	{
		this.descricaoEcf = descricaoEcf;
	}

	public String getDescricaoEcf()
	{
		return descricaoEcf;
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

}
