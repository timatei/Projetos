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
@Table(name = "PAR_RESTAURANTE")
@SequenceGenerator(name = "INC_PAR_RESTAURANTE", sequenceName = "GEN_PAR_RESTAURANTE")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "parRestaurante") 
public class ParRestaurante implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codParRestaurante";

	public ParRestaurante() {	
	}

	@Id
	@Column(name="CODPARRESTAURANTE", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PAR_RESTAURANTE")
	@XmlElement(name = "codParRestaurante")
	private Integer codParRestaurante;

	public void setCodParRestaurante(Integer codParRestaurante)
	{
		this.codParRestaurante = codParRestaurante;
	}

	public Integer getCodParRestaurante()
	{
		return codParRestaurante;
	}

	@Column(name="PARR_CONTROLE_NOME", nullable =  true , length = 20)
	@XmlElement(name = "controleNome")
	private String controleNome;

	public void setControleNome(String controleNome)
	{
		this.controleNome = controleNome;
	}

	public String getControleNome()
	{
		return controleNome;
	}

	@Column(name="PARR_TRABALHAR_REST", nullable =  true , length = 1)
	@XmlElement(name = "trabalharRest")
	private String trabalharRest;

	public void setTrabalharRest(String trabalharRest)
	{
		this.trabalharRest = trabalharRest;
	}

	public String getTrabalharRest()
	{
		return trabalharRest;
	}

	public void setTrabalharRestBoolean(Boolean value)
	{
		if (value) {
			this.trabalharRest = "S";
		}
		else {
			this.trabalharRest = "N";
		}
	}
	public Boolean getTrabalharRestBoolean()
	{
		return ((this.trabalharRest != null)&&(this.trabalharRest.equalsIgnoreCase("S")));
	}
	@Column(name="PARR_IMP_COZINHA", nullable =  true , length = 100)
	@XmlElement(name = "impCozinha")
	private String impCozinha;

	public void setImpCozinha(String impCozinha)
	{
		this.impCozinha = impCozinha;
	}

	public String getImpCozinha()
	{
		return impCozinha;
	}

	@Column(name="PARR_LINHA_FINAL_IMPRESSAO", nullable =  true , length = 11)
	@XmlElement(name = "linhaFinalImpressao")
	private Integer linhaFinalImpressao;

	public void setLinhaFinalImpressao(Integer linhaFinalImpressao)
	{
		this.linhaFinalImpressao = linhaFinalImpressao;
	}

	public Integer getLinhaFinalImpressao()
	{
		return linhaFinalImpressao;
	}

	@Column(name="PARR_IMP_EXTRATO", nullable =  true , length = 50)
	@XmlElement(name = "impExtrato")
	private String impExtrato;

	public void setImpExtrato(String impExtrato)
	{
		this.impExtrato = impExtrato;
	}

	public String getImpExtrato()
	{
		return impExtrato;
	}

	@Column(name="PARR_VLR_COVERT", nullable =  true , length = 17)
	@XmlElement(name = "vlrCovert")
	private Float vlrCovert= 0f;

	public void setVlrCovert(Float vlrCovert)
	{
		this.vlrCovert = vlrCovert;
	}

	public Float getVlrCovert()
	{
		return vlrCovert;
	}

	@Column(name="PARR_IMPRIMIR_IEIM", nullable =  true , length = 1)
	@XmlElement(name = "imprimirIeim")
	private String imprimirIeim;

	public void setImprimirIeim(String imprimirIeim)
	{
		this.imprimirIeim = imprimirIeim;
	}

	public String getImprimirIeim()
	{
		return imprimirIeim;
	}

	public void setImprimirIeimBoolean(Boolean value)
	{
		if (value) {
			this.imprimirIeim = "S";
		}
		else {
			this.imprimirIeim = "N";
		}
	}
	public Boolean getImprimirIeimBoolean()
	{
		return ((this.imprimirIeim != null)&&(this.imprimirIeim.equalsIgnoreCase("S")));
	}
	@Column(name="PARR_SELECIONAR_GARCON", nullable =  true , length = 1)
	@XmlElement(name = "selecionarGarcon")
	private String selecionarGarcon;

	public void setSelecionarGarcon(String selecionarGarcon)
	{
		this.selecionarGarcon = selecionarGarcon;
	}

	public String getSelecionarGarcon()
	{
		return selecionarGarcon;
	}

	public void setSelecionarGarconBoolean(Boolean value)
	{
		if (value) {
			this.selecionarGarcon = "S";
		}
		else {
			this.selecionarGarcon = "N";
		}
	}
	public Boolean getSelecionarGarconBoolean()
	{
		return ((this.selecionarGarcon != null)&&(this.selecionarGarcon.equalsIgnoreCase("S")));
	}
	@Column(name="PARR_CODPESQ_VENDA", nullable =  true , length = 1)
	@XmlElement(name = "codpesqVenda")
	private String codpesqVenda;

	public void setCodpesqVenda(String codpesqVenda)
	{
		this.codpesqVenda = codpesqVenda;
	}

	public String getCodpesqVenda()
	{
		return codpesqVenda;
	}

	public void setCodpesqVendaBoolean(Boolean value)
	{
		if (value) {
			this.codpesqVenda = "S";
		}
		else {
			this.codpesqVenda = "N";
		}
	}
	public Boolean getCodpesqVendaBoolean()
	{
		return ((this.codpesqVenda != null)&&(this.codpesqVenda.equalsIgnoreCase("S")));
	}
	@Column(name="PARR_SOMENTE_DURACAO", nullable =  true , length = 1)
	@XmlElement(name = "somenteDuracao")
	private String somenteDuracao;

	public void setSomenteDuracao(String somenteDuracao)
	{
		this.somenteDuracao = somenteDuracao;
	}

	public String getSomenteDuracao()
	{
		return somenteDuracao;
	}

	public void setSomenteDuracaoBoolean(Boolean value)
	{
		if (value) {
			this.somenteDuracao = "S";
		}
		else {
			this.somenteDuracao = "N";
		}
	}
	public Boolean getSomenteDuracaoBoolean()
	{
		return ((this.somenteDuracao != null)&&(this.somenteDuracao.equalsIgnoreCase("S")));
	}
	@Column(name="PARR_IMP_BAR", nullable =  true , length = 100)
	@XmlElement(name = "impBar")
	private String impBar;

	public void setImpBar(String impBar)
	{
		this.impBar = impBar;
	}

	public String getImpBar()
	{
		return impBar;
	}

	@Column(name="PARR_VLR_SERVICO", nullable =  true , length = 17)
	@XmlElement(name = "vlrServico")
	private Float vlrServico= 0f;

	public void setVlrServico(Float vlrServico)
	{
		this.vlrServico = vlrServico;
	}

	public Float getVlrServico()
	{
		return vlrServico;
	}

	@Column(name="PARR_IMP_PIZZA", nullable =  true , length = 100)
	@XmlElement(name = "impPizza")
	private String impPizza;

	public void setImpPizza(String impPizza)
	{
		this.impPizza = impPizza;
	}

	public String getImpPizza()
	{
		return impPizza;
	}
}
