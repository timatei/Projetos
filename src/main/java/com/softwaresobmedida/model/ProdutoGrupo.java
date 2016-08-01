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
@Table(name = "PRODUTO_GRUPO")
@SequenceGenerator(name = "INC_PRODUTO_GRUPO", sequenceName = "GEN_PRODUTO_GRUPO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produtoGrupo") 
public class ProdutoGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ProdutoGrupo() {	
	}

	@Id
	@Column(name="CODPRODUTOGRUPO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO_GRUPO")
	@XmlElement(name = "codprodutogrupo")
	private Integer codprodutogrupo;

	public void setCodprodutogrupo(Integer codprodutogrupo)
	{
		this.codprodutogrupo = codprodutogrupo;
	}

	public Integer getCodprodutogrupo()
	{
		return codprodutogrupo;
	}

	@Column(name="PROG_DESCRICAO", nullable =  false , length = 60)
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

	@Column(name="PROG_IPI_PADRAO", nullable =  true , length = 17)
	@XmlElement(name = "ipiPadrao")
	private Float ipiPadrao= 0f;

	public void setIpiPadrao(Float ipiPadrao)
	{
		this.ipiPadrao = ipiPadrao;
	}

	public Float getIpiPadrao()
	{
		return ipiPadrao;
	}

	@Column(name="PROG_ICMS_PADRAO", nullable =  true , length = 17)
	@XmlElement(name = "icmsPadrao")
	private Float icmsPadrao= 0f;

	public void setIcmsPadrao(Float icmsPadrao)
	{
		this.icmsPadrao = icmsPadrao;
	}

	public Float getIcmsPadrao()
	{
		return icmsPadrao;
	}

	@Column(name="PROG_GRAU1", nullable =  true , length = 6)
	@XmlElement(name = "grau1")
	private String grau1;

	public void setGrau1(String grau1)
	{
		this.grau1 = grau1;
	}

	public String getGrau1()
	{
		return grau1;
	}

	@Column(name="PROG_GRAU2", nullable =  true , length = 6)
	@XmlElement(name = "grau2")
	private String grau2;

	public void setGrau2(String grau2)
	{
		this.grau2 = grau2;
	}

	public String getGrau2()
	{
		return grau2;
	}

	@Column(name="PROG_GRAU3", nullable =  true , length = 6)
	@XmlElement(name = "grau3")
	private String grau3;

	public void setGrau3(String grau3)
	{
		this.grau3 = grau3;
	}

	public String getGrau3()
	{
		return grau3;
	}

	@Column(name="PROG_GRAU4", nullable =  true , length = 6)
	@XmlElement(name = "grau4")
	private String grau4;

	public void setGrau4(String grau4)
	{
		this.grau4 = grau4;
	}

	public String getGrau4()
	{
		return grau4;
	}

	@Column(name="PROG_GRAU5", nullable =  true , length = 6)
	@XmlElement(name = "grau5")
	private String grau5;

	public void setGrau5(String grau5)
	{
		this.grau5 = grau5;
	}

	public String getGrau5()
	{
		return grau5;
	}

	@Column(name="PROG_GRAU6", nullable =  true , length = 6)
	@XmlElement(name = "grau6")
	private String grau6;

	public void setGrau6(String grau6)
	{
		this.grau6 = grau6;
	}

	public String getGrau6()
	{
		return grau6;
	}

	@Column(name="PROG_ULTIMO_NIVEL", nullable =  false , length = 1)
	@XmlElement(name = "ultimoNivel")
	private String ultimoNivel;

	public void setUltimoNivel(String ultimoNivel)
	{
		this.ultimoNivel = ultimoNivel;
	}

	public String getUltimoNivel()
	{
		return ultimoNivel;
	}

	public void setUltimoNivelBoolean(Boolean value)
	{
		if (value) {
			this.ultimoNivel = "S";
		}
		else {
			this.ultimoNivel = "N";
		}
	}
	public Boolean getUltimoNivelBoolean()
	{
		return ((this.ultimoNivel != null)&&(this.ultimoNivel.equalsIgnoreCase("S")));
	}
	@Column(name="PROG_NUMERACAO", nullable =  true , length = 41)
	@XmlElement(name = "numeracao")
	private String numeracao;

	public void setNumeracao(String numeracao)
	{
		this.numeracao = numeracao;
	}

	public String getNumeracao()
	{
		return numeracao;
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
	@Column(name="PROG_IMG", nullable =  true , length = 20)
	@XmlElement(name = "img")
	private String img;

	public void setImg(String img)
	{
		this.img = img;
	}

	public String getImg()
	{
		return img;
	}

	@Column(name="PROG_COR", nullable =  true , length = 15)
	@XmlElement(name = "cor")
	private String cor;

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getCor()
	{
		return cor;
	}

	@Column(name="PROG_ORDEM", nullable =  true , length = 11)
	@XmlElement(name = "ordem")
	private Integer ordem;

	public void setOrdem(Integer ordem)
	{
		this.ordem = ordem;
	}

	public Integer getOrdem()
	{
		return ordem;
	}

	@Column(name="PROG_DESATIVAR_TOUCH", nullable =  true , length = 1)
	@XmlElement(name = "desativarTouch")
	private String desativarTouch;

	public void setDesativarTouch(String desativarTouch)
	{
		this.desativarTouch = desativarTouch;
	}

	public String getDesativarTouch()
	{
		return desativarTouch;
	}

	public void setDesativarTouchBoolean(Boolean value)
	{
		if (value) {
			this.desativarTouch = "S";
		}
		else {
			this.desativarTouch = "N";
		}
	}
	public Boolean getDesativarTouchBoolean()
	{
		return ((this.desativarTouch != null)&&(this.desativarTouch.equalsIgnoreCase("S")));
	}
}
