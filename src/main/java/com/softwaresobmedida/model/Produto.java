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
@Table(name = "PRODUTO")
@SequenceGenerator(name = "INC_PRODUTO", sequenceName = "GEN_PRODUTO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "produto") 
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Produto() {	
	}

	@Id
	@Column(name="CODPRODUTO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PRODUTO")
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

	@Column(name="PRO_CODPESQ_1", nullable =  false , length = 20)
	@XmlElement(name = "codpesq1")
	private String codpesq1;

	public void setCodpesq1(String codpesq1)
	{
		this.codpesq1 = codpesq1;
	}

	public String getCodpesq1()
	{
		return codpesq1;
	}

	@Column(name="PRO_DESCRICAO", nullable =  false , length = 150)
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

	@Column(name="PRO_ATIVO", nullable =  false , length = 1)
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
	@Column(name="PRO_TIPO_PRODUTO", nullable =  false , length = 1)
	@XmlElement(name = "tipoProduto")
	private String tipoProduto;

	public void setTipoProduto(String tipoProduto)
	{
		this.tipoProduto = tipoProduto;
	}

	public String getTipoProduto()
	{
		return tipoProduto;
	}

	public void setTipoProdutoBoolean(Boolean value)
	{
		if (value) {
			this.tipoProduto = "S";
		}
		else {
			this.tipoProduto = "N";
		}
	}
	public Boolean getTipoProdutoBoolean()
	{
		return ((this.tipoProduto != null)&&(this.tipoProduto.equalsIgnoreCase("S")));
	}
	@Column(name="CODPRODUTOGRUPO", nullable =  false , length = 11)
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

	@Column(name="CODPRODUTOGRUPOSUBGRP", nullable =  true , length = 11)
	@XmlElement(name = "codprodutogruposubgrp")
	private Integer codprodutogruposubgrp;

	public void setCodprodutogruposubgrp(Integer codprodutogruposubgrp)
	{
		this.codprodutogruposubgrp = codprodutogruposubgrp;
	}

	public Integer getCodprodutogruposubgrp()
	{
		return codprodutogruposubgrp;
	}

	@Column(name="CODPRODUTOUNIDADE", nullable =  false , length = 11)
	@XmlElement(name = "codprodutounidade")
	private Integer codprodutounidade;

	public void setCodprodutounidade(Integer codprodutounidade)
	{
		this.codprodutounidade = codprodutounidade;
	}

	public Integer getCodprodutounidade()
	{
		return codprodutounidade;
	}

	@Column(name="PRO_ESTQ_ATUAL", nullable =  true , length = 17)
	@XmlElement(name = "estqAtual")
	private Float estqAtual= 0f;

	public void setEstqAtual(Float estqAtual)
	{
		this.estqAtual = estqAtual;
	}

	public Float getEstqAtual()
	{
		return estqAtual;
	}

	@Column(name="PRO_ESTQ_MIN", nullable =  true , length = 17)
	@XmlElement(name = "estqMin")
	private Float estqMin= 0f;

	public void setEstqMin(Float estqMin)
	{
		this.estqMin = estqMin;
	}

	public Float getEstqMin()
	{
		return estqMin;
	}

	@Column(name="PRO_CALC_PRECO_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "calcPrecoCompra")
	private Float calcPrecoCompra= 0f;

	public void setCalcPrecoCompra(Float calcPrecoCompra)
	{
		this.calcPrecoCompra = calcPrecoCompra;
	}

	public Float getCalcPrecoCompra()
	{
		return calcPrecoCompra;
	}

	@Column(name="PRO_CALC_FRETE_VLR", nullable =  true , length = 17)
	@XmlElement(name = "calcFreteVlr")
	private Float calcFreteVlr= 0f;

	public void setCalcFreteVlr(Float calcFreteVlr)
	{
		this.calcFreteVlr = calcFreteVlr;
	}

	public Float getCalcFreteVlr()
	{
		return calcFreteVlr;
	}

	@Column(name="PRO_CALC_ICMS_PERC", nullable =  true , length = 17)
	@XmlElement(name = "calcIcmsPerc")
	private Float calcIcmsPerc= 0f;

	public void setCalcIcmsPerc(Float calcIcmsPerc)
	{
		this.calcIcmsPerc = calcIcmsPerc;
	}

	public Float getCalcIcmsPerc()
	{
		return calcIcmsPerc;
	}

	@Column(name="PRO_CALC_IPI_PER", nullable =  true , length = 17)
	@XmlElement(name = "calcIpiPer")
	private Float calcIpiPer= 0f;

	public void setCalcIpiPer(Float calcIpiPer)
	{
		this.calcIpiPer = calcIpiPer;
	}

	public Float getCalcIpiPer()
	{
		return calcIpiPer;
	}

	@Column(name="PRO_CALC_OUTROS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "calcOutrosVlr")
	private Float calcOutrosVlr= 0f;

	public void setCalcOutrosVlr(Float calcOutrosVlr)
	{
		this.calcOutrosVlr = calcOutrosVlr;
	}

	public Float getCalcOutrosVlr()
	{
		return calcOutrosVlr;
	}

	@Column(name="PRO_CALC_CUSTO_PRODUTO", nullable =  true , length = 17)
	@XmlElement(name = "calcCustoProduto")
	private Float calcCustoProduto= 0f;

	public void setCalcCustoProduto(Float calcCustoProduto)
	{
		this.calcCustoProduto = calcCustoProduto;
	}

	public Float getCalcCustoProduto()
	{
		return calcCustoProduto;
	}

	@Column(name="PRO_ANTERIOR_PRECO01", nullable =  true , length = 17)
	@XmlElement(name = "anteriorPreco01")
	private Float anteriorPreco01= 0f;

	public void setAnteriorPreco01(Float anteriorPreco01)
	{
		this.anteriorPreco01 = anteriorPreco01;
	}

	public Float getAnteriorPreco01()
	{
		return anteriorPreco01;
	}

	@Column(name="PRO_ANTERIOR_CALC_PRECO_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "anteriorCalcPrecoCompra")
	private Float anteriorCalcPrecoCompra= 0f;

	public void setAnteriorCalcPrecoCompra(Float anteriorCalcPrecoCompra)
	{
		this.anteriorCalcPrecoCompra = anteriorCalcPrecoCompra;
	}

	public Float getAnteriorCalcPrecoCompra()
	{
		return anteriorCalcPrecoCompra;
	}

	@Column(name="PRO_ANTERIOR_CALC_CUSTO_PRODUT", nullable =  true , length = 17)
	@XmlElement(name = "anteriorCalcCustoProdut")
	private Float anteriorCalcCustoProdut= 0f;

	public void setAnteriorCalcCustoProdut(Float anteriorCalcCustoProdut)
	{
		this.anteriorCalcCustoProdut = anteriorCalcCustoProdut;
	}

	public Float getAnteriorCalcCustoProdut()
	{
		return anteriorCalcCustoProdut;
	}

	@Column(name="PRO_DATA_ULT_COMPRA", nullable =  true , length = 10)
	@XmlElement(name = "dataUltCompra")
	private java.sql.Timestamp dataUltCompra;

	public void setDataUltCompra(java.sql.Timestamp dataUltCompra)
	{
		this.dataUltCompra = dataUltCompra;
	}

	public java.sql.Timestamp getDataUltCompra()
	{
		return dataUltCompra;
	}

	@Column(name="PRO_MARKP01", nullable =  true , length = 17)
	@XmlElement(name = "markp01")
	private Float markp01= 0f;

	public void setMarkp01(Float markp01)
	{
		this.markp01 = markp01;
	}

	public Float getMarkp01()
	{
		return markp01;
	}

	@Column(name="PRO_MARKP02", nullable =  true , length = 17)
	@XmlElement(name = "markp02")
	private Float markp02= 0f;

	public void setMarkp02(Float markp02)
	{
		this.markp02 = markp02;
	}

	public Float getMarkp02()
	{
		return markp02;
	}

	@Column(name="PRO_MARKP03", nullable =  true , length = 17)
	@XmlElement(name = "markp03")
	private Float markp03= 0f;

	public void setMarkp03(Float markp03)
	{
		this.markp03 = markp03;
	}

	public Float getMarkp03()
	{
		return markp03;
	}

	@Column(name="PRO_MARKP04", nullable =  true , length = 17)
	@XmlElement(name = "markp04")
	private Float markp04= 0f;

	public void setMarkp04(Float markp04)
	{
		this.markp04 = markp04;
	}

	public Float getMarkp04()
	{
		return markp04;
	}

	@Column(name="PRO_MARKP05", nullable =  true , length = 17)
	@XmlElement(name = "markp05")
	private Float markp05= 0f;

	public void setMarkp05(Float markp05)
	{
		this.markp05 = markp05;
	}

	public Float getMarkp05()
	{
		return markp05;
	}

	@Column(name="PRO_PRECO01", nullable =  true , length = 17)
	@XmlElement(name = "preco01")
	private Float preco01= 0f;

	public void setPreco01(Float preco01)
	{
		this.preco01 = preco01;
	}

	public Float getPreco01()
	{
		return preco01;
	}

	@Column(name="PRO_PRECO02", nullable =  true , length = 17)
	@XmlElement(name = "preco02")
	private Float preco02= 0f;

	public void setPreco02(Float preco02)
	{
		this.preco02 = preco02;
	}

	public Float getPreco02()
	{
		return preco02;
	}

	@Column(name="PRO_PRECO03", nullable =  true , length = 17)
	@XmlElement(name = "preco03")
	private Float preco03= 0f;

	public void setPreco03(Float preco03)
	{
		this.preco03 = preco03;
	}

	public Float getPreco03()
	{
		return preco03;
	}

	@Column(name="PRO_PRECO04", nullable =  true , length = 17)
	@XmlElement(name = "preco04")
	private Float preco04= 0f;

	public void setPreco04(Float preco04)
	{
		this.preco04 = preco04;
	}

	public Float getPreco04()
	{
		return preco04;
	}

	@Column(name="PRO_PRECO05", nullable =  true , length = 17)
	@XmlElement(name = "preco05")
	private Float preco05= 0f;

	public void setPreco05(Float preco05)
	{
		this.preco05 = preco05;
	}

	public Float getPreco05()
	{
		return preco05;
	}

	@Column(name="PRO_ESTQ_INICIAL", nullable =  true , length = 17)
	@XmlElement(name = "estqInicial")
	private Float estqInicial= 0f;

	public void setEstqInicial(Float estqInicial)
	{
		this.estqInicial = estqInicial;
	}

	public Float getEstqInicial()
	{
		return estqInicial;
	}

	@Column(name="PRO_IMAGEM", nullable =  true , length = 200)
	@XmlElement(name = "imagem")
	private String imagem;

	public void setImagem(String imagem)
	{
		this.imagem = imagem;
	}

	public String getImagem()
	{
		return imagem;
	}

	@Column(name="PRO_ALIQ_IMP", nullable =  true , length = 2)
	@XmlElement(name = "aliqImp")
	private String aliqImp;

	public void setAliqImp(String aliqImp)
	{
		this.aliqImp = aliqImp;
	}

	public String getAliqImp()
	{
		return aliqImp;
	}

	@Column(name="PRO_ALT_PRECO", nullable =  false , length = 1)
	@XmlElement(name = "altPreco")
	private String altPreco;

	public void setAltPreco(String altPreco)
	{
		this.altPreco = altPreco;
	}

	public String getAltPreco()
	{
		return altPreco;
	}

	public void setAltPrecoBoolean(Boolean value)
	{
		if (value) {
			this.altPreco = "S";
		}
		else {
			this.altPreco = "N";
		}
	}
	public Boolean getAltPrecoBoolean()
	{
		return ((this.altPreco != null)&&(this.altPreco.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_ST_TRIB", nullable =  true , length = 1)
	@XmlElement(name = "stTrib")
	private String stTrib;

	public void setStTrib(String stTrib)
	{
		this.stTrib = stTrib;
	}

	public String getStTrib()
	{
		return stTrib;
	}

	public void setStTribBoolean(Boolean value)
	{
		if (value) {
			this.stTrib = "S";
		}
		else {
			this.stTrib = "N";
		}
	}
	public Boolean getStTribBoolean()
	{
		return ((this.stTrib != null)&&(this.stTrib.equalsIgnoreCase("S")));
	}
	@Column(name="CODPRODUTOUNIDADE_COMP", nullable =  true , length = 11)
	@XmlElement(name = "comp")
	private Integer comp;

	public void setComp(Integer comp)
	{
		this.comp = comp;
	}

	public Integer getComp()
	{
		return comp;
	}

	@Column(name="PRO_UNDCOMP_QTDE", nullable =  true , length = 17)
	@XmlElement(name = "undcompQtde")
	private Float undcompQtde= 0f;

	public void setUndcompQtde(Float undcompQtde)
	{
		this.undcompQtde = undcompQtde;
	}

	public Float getUndcompQtde()
	{
		return undcompQtde;
	}

	@Column(name="PRO_UNDCOMP_QTDEEMB", nullable =  true , length = 17)
	@XmlElement(name = "undcompQtdeemb")
	private Float undcompQtdeemb= 0f;

	public void setUndcompQtdeemb(Float undcompQtdeemb)
	{
		this.undcompQtdeemb = undcompQtdeemb;
	}

	public Float getUndcompQtdeemb()
	{
		return undcompQtdeemb;
	}

	@Column(name="CODPRODUTOCATESP", nullable =  true , length = 11)
	@XmlElement(name = "codprodutocatesp")
	private Integer codprodutocatesp;

	public void setCodprodutocatesp(Integer codprodutocatesp)
	{
		this.codprodutocatesp = codprodutocatesp;
	}

	public Integer getCodprodutocatesp()
	{
		return codprodutocatesp;
	}

	@Column(name="CODFABRICANTE", nullable =  true , length = 11)
	@XmlElement(name = "codfabricante")
	private Integer codfabricante;

	public void setCodfabricante(Integer codfabricante)
	{
		this.codfabricante = codfabricante;
	}

	public Integer getCodfabricante()
	{
		return codfabricante;
	}

	@Column(name="PRO_LOTE", nullable =  false , length = 1)
	@XmlElement(name = "lote")
	private String lote;

	public void setLote(String lote)
	{
		this.lote = lote;
	}

	public String getLote()
	{
		return lote;
	}

	public void setLoteBoolean(Boolean value)
	{
		if (value) {
			this.lote = "S";
		}
		else {
			this.lote = "N";
		}
	}
	public Boolean getLoteBoolean()
	{
		return ((this.lote != null)&&(this.lote.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_TIPOLISTA", nullable =  false , length = 1)
	@XmlElement(name = "tipolista")
	private String tipolista;

	public void setTipolista(String tipolista)
	{
		this.tipolista = tipolista;
	}

	public String getTipolista()
	{
		return tipolista;
	}

	public void setTipolistaBoolean(Boolean value)
	{
		if (value) {
			this.tipolista = "S";
		}
		else {
			this.tipolista = "N";
		}
	}
	public Boolean getTipolistaBoolean()
	{
		return ((this.tipolista != null)&&(this.tipolista.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_LIC_BOAPRATICA", nullable =  false , length = 1)
	@XmlElement(name = "licBoapratica")
	private String licBoapratica;

	public void setLicBoapratica(String licBoapratica)
	{
		this.licBoapratica = licBoapratica;
	}

	public String getLicBoapratica()
	{
		return licBoapratica;
	}

	public void setLicBoapraticaBoolean(Boolean value)
	{
		if (value) {
			this.licBoapratica = "S";
		}
		else {
			this.licBoapratica = "N";
		}
	}
	public Boolean getLicBoapraticaBoolean()
	{
		return ((this.licBoapratica != null)&&(this.licBoapratica.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_LIC_REGISTRO", nullable =  false , length = 1)
	@XmlElement(name = "licRegistro")
	private String licRegistro;

	public void setLicRegistro(String licRegistro)
	{
		this.licRegistro = licRegistro;
	}

	public String getLicRegistro()
	{
		return licRegistro;
	}

	public void setLicRegistroBoolean(Boolean value)
	{
		if (value) {
			this.licRegistro = "S";
		}
		else {
			this.licRegistro = "N";
		}
	}
	public Boolean getLicRegistroBoolean()
	{
		return ((this.licRegistro != null)&&(this.licRegistro.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_IMP_COZINHA", nullable =  true , length = 1)
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

	public void setImpCozinhaBoolean(Boolean value)
	{
		if (value) {
			this.impCozinha = "S";
		}
		else {
			this.impCozinha = "N";
		}
	}
	public Boolean getImpCozinhaBoolean()
	{
		return ((this.impCozinha != null)&&(this.impCozinha.equalsIgnoreCase("S")));
	}
	@Column(name="CODCLASSFISCAL", nullable =  true , length = 11)
	@XmlElement(name = "codclassfiscal")
	private Integer codclassfiscal;

	public void setCodclassfiscal(Integer codclassfiscal)
	{
		this.codclassfiscal = codclassfiscal;
	}

	public Integer getCodclassfiscal()
	{
		return codclassfiscal;
	}

	@Column(name="PRO_SI_TRIB_APOLO", nullable =  true , length = 3)
	@XmlElement(name = "siTribApolo")
	private String siTribApolo;

	public void setSiTribApolo(String siTribApolo)
	{
		this.siTribApolo = siTribApolo;
	}

	public String getSiTribApolo()
	{
		return siTribApolo;
	}

	@Column(name="CODMARCA", nullable =  true , length = 11)
	@XmlElement(name = "codmarca")
	private Integer codmarca;

	public void setCodmarca(Integer codmarca)
	{
		this.codmarca = codmarca;
	}

	public Integer getCodmarca()
	{
		return codmarca;
	}

	@Column(name="PRO_ALIQ_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcms")
	private Float aliqIcms= 0f;

	public void setAliqIcms(Float aliqIcms)
	{
		this.aliqIcms = aliqIcms;
	}

	public Float getAliqIcms()
	{
		return aliqIcms;
	}

	@Column(name="CODPRODUTOCOR", nullable =  true , length = 11)
	@XmlElement(name = "codprodutocor")
	private Integer codprodutocor;

	public void setCodprodutocor(Integer codprodutocor)
	{
		this.codprodutocor = codprodutocor;
	}

	public Integer getCodprodutocor()
	{
		return codprodutocor;
	}

	@Column(name="CODPRODUTOCURVATURA", nullable =  true , length = 11)
	@XmlElement(name = "codprodutocurvatura")
	private Integer codprodutocurvatura;

	public void setCodprodutocurvatura(Integer codprodutocurvatura)
	{
		this.codprodutocurvatura = codprodutocurvatura;
	}

	public Integer getCodprodutocurvatura()
	{
		return codprodutocurvatura;
	}

	@Column(name="CODPRODUTODIAMETRO", nullable =  true , length = 11)
	@XmlElement(name = "codprodutodiametro")
	private Integer codprodutodiametro;

	public void setCodprodutodiametro(Integer codprodutodiametro)
	{
		this.codprodutodiametro = codprodutodiametro;
	}

	public Integer getCodprodutodiametro()
	{
		return codprodutodiametro;
	}

	@Column(name="CODPRODUTOGRAU", nullable =  true , length = 11)
	@XmlElement(name = "codprodutograu")
	private Integer codprodutograu;

	public void setCodprodutograu(Integer codprodutograu)
	{
		this.codprodutograu = codprodutograu;
	}

	public Integer getCodprodutograu()
	{
		return codprodutograu;
	}

	@Column(name="PRO_REG_ICMS", nullable =  true , length = 1)
	@XmlElement(name = "regIcms")
	private String regIcms;

	public void setRegIcms(String regIcms)
	{
		this.regIcms = regIcms;
	}

	public String getRegIcms()
	{
		return regIcms;
	}

	public void setRegIcmsBoolean(Boolean value)
	{
		if (value) {
			this.regIcms = "S";
		}
		else {
			this.regIcms = "N";
		}
	}
	public Boolean getRegIcmsBoolean()
	{
		return ((this.regIcms != null)&&(this.regIcms.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_VLR_CUSTO_MARGEM", nullable =  true , length = 17)
	@XmlElement(name = "vlrCustoMargem")
	private Float vlrCustoMargem= 0f;

	public void setVlrCustoMargem(Float vlrCustoMargem)
	{
		this.vlrCustoMargem = vlrCustoMargem;
	}

	public Float getVlrCustoMargem()
	{
		return vlrCustoMargem;
	}

	@Column(name="CODPRODUTOTIPOLENTE", nullable =  true , length = 11)
	@XmlElement(name = "codprodutotipolente")
	private Integer codprodutotipolente;

	public void setCodprodutotipolente(Integer codprodutotipolente)
	{
		this.codprodutotipolente = codprodutotipolente;
	}

	public Integer getCodprodutotipolente()
	{
		return codprodutotipolente;
	}

	@Column(name="CODPRODUTOADICAO", nullable =  true , length = 11)
	@XmlElement(name = "codprodutoadicao")
	private Integer codprodutoadicao;

	public void setCodprodutoadicao(Integer codprodutoadicao)
	{
		this.codprodutoadicao = codprodutoadicao;
	}

	public Integer getCodprodutoadicao()
	{
		return codprodutoadicao;
	}

	@Column(name="CODPRODUTOEIXO", nullable =  true , length = 11)
	@XmlElement(name = "codprodutoeixo")
	private Integer codprodutoeixo;

	public void setCodprodutoeixo(Integer codprodutoeixo)
	{
		this.codprodutoeixo = codprodutoeixo;
	}

	public Integer getCodprodutoeixo()
	{
		return codprodutoeixo;
	}

	@Column(name="PRO_CODFAB", nullable =  true , length = 50)
	@XmlElement(name = "codfab")
	private String codfab;

	public void setCodfab(String codfab)
	{
		this.codfab = codfab;
	}

	public String getCodfab()
	{
		return codfab;
	}

	@Column(name="CODPRODUTOCILINDRO", nullable =  true , length = 11)
	@XmlElement(name = "codprodutocilindro")
	private Integer codprodutocilindro;

	public void setCodprodutocilindro(Integer codprodutocilindro)
	{
		this.codprodutocilindro = codprodutocilindro;
	}

	public Integer getCodprodutocilindro()
	{
		return codprodutocilindro;
	}

	@Column(name="PRO_CODCOR", nullable =  true , length = 15)
	@XmlElement(name = "codcor")
	private String codcor;

	public void setCodcor(String codcor)
	{
		this.codcor = codcor;
	}

	public String getCodcor()
	{
		return codcor;
	}

	@Column(name="CODPRODUTOCLONE", nullable =  true , length = 11)
	@XmlElement(name = "codprodutoclone")
	private Integer codprodutoclone;

	public void setCodprodutoclone(Integer codprodutoclone)
	{
		this.codprodutoclone = codprodutoclone;
	}

	public Integer getCodprodutoclone()
	{
		return codprodutoclone;
	}

	@Column(name="PRO_LENTE", nullable =  true , length = 1)
	@XmlElement(name = "lente")
	private String lente;

	public void setLente(String lente)
	{
		this.lente = lente;
	}

	public String getLente()
	{
		return lente;
	}

	public void setLenteBoolean(Boolean value)
	{
		if (value) {
			this.lente = "S";
		}
		else {
			this.lente = "N";
		}
	}
	public Boolean getLenteBoolean()
	{
		return ((this.lente != null)&&(this.lente.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_SERVICO", nullable =  true , length = 1)
	@XmlElement(name = "servico")
	private String servico;

	public void setServico(String servico)
	{
		this.servico = servico;
	}

	public String getServico()
	{
		return servico;
	}

	public void setServicoBoolean(Boolean value)
	{
		if (value) {
			this.servico = "S";
		}
		else {
			this.servico = "N";
		}
	}
	public Boolean getServicoBoolean()
	{
		return ((this.servico != null)&&(this.servico.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_COMPOSTO", nullable =  true , length = 1)
	@XmlElement(name = "composto")
	private String composto;

	public void setComposto(String composto)
	{
		this.composto = composto;
	}

	public String getComposto()
	{
		return composto;
	}

	public void setCompostoBoolean(Boolean value)
	{
		if (value) {
			this.composto = "S";
		}
		else {
			this.composto = "N";
		}
	}
	public Boolean getCompostoBoolean()
	{
		return ((this.composto != null)&&(this.composto.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_IMP_BAR", nullable =  true , length = 1)
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

	public void setImpBarBoolean(Boolean value)
	{
		if (value) {
			this.impBar = "S";
		}
		else {
			this.impBar = "N";
		}
	}
	public Boolean getImpBarBoolean()
	{
		return ((this.impBar != null)&&(this.impBar.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_CODBAR_COMPOSTO", nullable =  true , length = 1)
	@XmlElement(name = "codbarComposto")
	private String codbarComposto;

	public void setCodbarComposto(String codbarComposto)
	{
		this.codbarComposto = codbarComposto;
	}

	public String getCodbarComposto()
	{
		return codbarComposto;
	}

	public void setCodbarCompostoBoolean(Boolean value)
	{
		if (value) {
			this.codbarComposto = "S";
		}
		else {
			this.codbarComposto = "N";
		}
	}
	public Boolean getCodbarCompostoBoolean()
	{
		return ((this.codbarComposto != null)&&(this.codbarComposto.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_LOCALIZACAO", nullable =  true , length = 20)
	@XmlElement(name = "localizacao")
	private String localizacao;

	public void setLocalizacao(String localizacao)
	{
		this.localizacao = localizacao;
	}

	public String getLocalizacao()
	{
		return localizacao;
	}

	@Column(name="PRO_ORIGEM", nullable =  true , length = 30)
	@XmlElement(name = "origem")
	private String origem;

	public void setOrigem(String origem)
	{
		this.origem = origem;
	}

	public String getOrigem()
	{
		return origem;
	}

	@Column(name="PRO_REFERENCIA", nullable =  true , length = 50)
	@XmlElement(name = "referencia")
	private String referencia;

	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
	}

	public String getReferencia()
	{
		return referencia;
	}

	@Column(name="PRO_COMISSAO_1", nullable =  true , length = 17)
	@XmlElement(name = "comissao1")
	private Float comissao1= 0f;

	public void setComissao1(Float comissao1)
	{
		this.comissao1 = comissao1;
	}

	public Float getComissao1()
	{
		return comissao1;
	}

	@Column(name="PRO_COMISSAO_2", nullable =  true , length = 17)
	@XmlElement(name = "comissao2")
	private Float comissao2= 0f;

	public void setComissao2(Float comissao2)
	{
		this.comissao2 = comissao2;
	}

	public Float getComissao2()
	{
		return comissao2;
	}

	@Column(name="PRO_NCM", nullable =  true , length = 15)
	@XmlElement(name = "ncm")
	private String ncm;

	public void setNcm(String ncm)
	{
		this.ncm = ncm;
	}

	public String getNcm()
	{
		return ncm;
	}

	@Column(name="PRO_DIAS_ENTREGA", nullable =  true , length = 11)
	@XmlElement(name = "diasEntrega")
	private Integer diasEntrega;

	public void setDiasEntrega(Integer diasEntrega)
	{
		this.diasEntrega = diasEntrega;
	}

	public Integer getDiasEntrega()
	{
		return diasEntrega;
	}

	@Column(name="PRO_IMP_PIZZA", nullable =  false , length = 1)
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

	public void setImpPizzaBoolean(Boolean value)
	{
		if (value) {
			this.impPizza = "S";
		}
		else {
			this.impPizza = "N";
		}
	}
	public Boolean getImpPizzaBoolean()
	{
		return ((this.impPizza != null)&&(this.impPizza.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_DESC_MAX", nullable =  true , length = 17)
	@XmlElement(name = "descMax")
	private Float descMax= 0f;

	public void setDescMax(Float descMax)
	{
		this.descMax = descMax;
	}

	public Float getDescMax()
	{
		return descMax;
	}

	@Column(name="PRO_REM_CONTROLADO", nullable =  false , length = 1)
	@XmlElement(name = "remControlado")
	private String remControlado;

	public void setRemControlado(String remControlado)
	{
		this.remControlado = remControlado;
	}

	public String getRemControlado()
	{
		return remControlado;
	}

	public void setRemControladoBoolean(Boolean value)
	{
		if (value) {
			this.remControlado = "S";
		}
		else {
			this.remControlado = "N";
		}
	}
	public Boolean getRemControladoBoolean()
	{
		return ((this.remControlado != null)&&(this.remControlado.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_REG_MS", nullable =  true , length = 30)
	@XmlElement(name = "regMs")
	private String regMs;

	public void setRegMs(String regMs)
	{
		this.regMs = regMs;
	}

	public String getRegMs()
	{
		return regMs;
	}

	@Column(name="PRO_REM_GENERICO", nullable =  false , length = 1)
	@XmlElement(name = "remGenerico")
	private String remGenerico;

	public void setRemGenerico(String remGenerico)
	{
		this.remGenerico = remGenerico;
	}

	public String getRemGenerico()
	{
		return remGenerico;
	}

	public void setRemGenericoBoolean(Boolean value)
	{
		if (value) {
			this.remGenerico = "S";
		}
		else {
			this.remGenerico = "N";
		}
	}
	public Boolean getRemGenericoBoolean()
	{
		return ((this.remGenerico != null)&&(this.remGenerico.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_CONTROLA_LOTE", nullable =  false , length = 1)
	@XmlElement(name = "controlaLote")
	private String controlaLote;

	public void setControlaLote(String controlaLote)
	{
		this.controlaLote = controlaLote;
	}

	public String getControlaLote()
	{
		return controlaLote;
	}

	public void setControlaLoteBoolean(Boolean value)
	{
		if (value) {
			this.controlaLote = "S";
		}
		else {
			this.controlaLote = "N";
		}
	}
	public Boolean getControlaLoteBoolean()
	{
		return ((this.controlaLote != null)&&(this.controlaLote.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_NAO_ATUALIZA_CUSTO", nullable =  false , length = 1)
	@XmlElement(name = "naoAtualizaCusto")
	private String naoAtualizaCusto;

	public void setNaoAtualizaCusto(String naoAtualizaCusto)
	{
		this.naoAtualizaCusto = naoAtualizaCusto;
	}

	public String getNaoAtualizaCusto()
	{
		return naoAtualizaCusto;
	}

	public void setNaoAtualizaCustoBoolean(Boolean value)
	{
		if (value) {
			this.naoAtualizaCusto = "S";
		}
		else {
			this.naoAtualizaCusto = "N";
		}
	}
	public Boolean getNaoAtualizaCustoBoolean()
	{
		return ((this.naoAtualizaCusto != null)&&(this.naoAtualizaCusto.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_COMP_PEDIDO", nullable =  true , length = 17)
	@XmlElement(name = "compPedido")
	private Float compPedido= 0f;

	public void setCompPedido(Float compPedido)
	{
		this.compPedido = compPedido;
	}

	public Float getCompPedido()
	{
		return compPedido;
	}

	@Column(name="PRO_COMP_PEDIDO_ANTERIOR", nullable =  true , length = 17)
	@XmlElement(name = "compPedidoAnterior")
	private Float compPedidoAnterior= 0f;

	public void setCompPedidoAnterior(Float compPedidoAnterior)
	{
		this.compPedidoAnterior = compPedidoAnterior;
	}

	public Float getCompPedidoAnterior()
	{
		return compPedidoAnterior;
	}

	@Column(name="PRO_ST_MVA", nullable =  true , length = 17)
	@XmlElement(name = "stMva")
	private Float stMva= 0f;

	public void setStMva(Float stMva)
	{
		this.stMva = stMva;
	}

	public Float getStMva()
	{
		return stMva;
	}

	@Column(name="PRO_ST", nullable =  true , length = 1)
	@XmlElement(name = "st")
	private String st;

	public void setSt(String st)
	{
		this.st = st;
	}

	public String getSt()
	{
		return st;
	}

	public void setStBoolean(Boolean value)
	{
		if (value) {
			this.st = "S";
		}
		else {
			this.st = "N";
		}
	}
	public Boolean getStBoolean()
	{
		return ((this.st != null)&&(this.st.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_ST_ICMS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "stIcmsVlr")
	private Float stIcmsVlr= 0f;

	public void setStIcmsVlr(Float stIcmsVlr)
	{
		this.stIcmsVlr = stIcmsVlr;
	}

	public Float getStIcmsVlr()
	{
		return stIcmsVlr;
	}

	@Column(name="PRO_CALC_ICMS_VLR", nullable =  true , length = 9)
	@XmlElement(name = "calcIcmsVlr")
	private Float calcIcmsVlr= 0f;

	public void setCalcIcmsVlr(Float calcIcmsVlr)
	{
		this.calcIcmsVlr = calcIcmsVlr;
	}

	public Float getCalcIcmsVlr()
	{
		return calcIcmsVlr;
	}

	@Column(name="PRO_CALC_IPI_VLR", nullable =  true , length = 9)
	@XmlElement(name = "calcIpiVlr")
	private Float calcIpiVlr= 0f;

	public void setCalcIpiVlr(Float calcIpiVlr)
	{
		this.calcIpiVlr = calcIpiVlr;
	}

	public Float getCalcIpiVlr()
	{
		return calcIpiVlr;
	}

	@Column(name="PRO_ANTERIOR_ICMS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "anteriorIcmsVlr")
	private Float anteriorIcmsVlr= 0f;

	public void setAnteriorIcmsVlr(Float anteriorIcmsVlr)
	{
		this.anteriorIcmsVlr = anteriorIcmsVlr;
	}

	public Float getAnteriorIcmsVlr()
	{
		return anteriorIcmsVlr;
	}

	@Column(name="PRO_ANTERIOR_IPI_VLR", nullable =  true , length = 17)
	@XmlElement(name = "anteriorIpiVlr")
	private Float anteriorIpiVlr= 0f;

	public void setAnteriorIpiVlr(Float anteriorIpiVlr)
	{
		this.anteriorIpiVlr = anteriorIpiVlr;
	}

	public Float getAnteriorIpiVlr()
	{
		return anteriorIpiVlr;
	}

	@Column(name="PRO_ANTERIOR_ST_ICMS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "anteriorStIcmsVlr")
	private Float anteriorStIcmsVlr= 0f;

	public void setAnteriorStIcmsVlr(Float anteriorStIcmsVlr)
	{
		this.anteriorStIcmsVlr = anteriorStIcmsVlr;
	}

	public Float getAnteriorStIcmsVlr()
	{
		return anteriorStIcmsVlr;
	}

	@Column(name="PRO_ANTERIOR_OUTROS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "anteriorOutrosVlr")
	private Float anteriorOutrosVlr= 0f;

	public void setAnteriorOutrosVlr(Float anteriorOutrosVlr)
	{
		this.anteriorOutrosVlr = anteriorOutrosVlr;
	}

	public Float getAnteriorOutrosVlr()
	{
		return anteriorOutrosVlr;
	}

	@Column(name="PRO_ANTERIOR_FRETE_VLR", nullable =  true , length = 17)
	@XmlElement(name = "anteriorFreteVlr")
	private Float anteriorFreteVlr= 0f;

	public void setAnteriorFreteVlr(Float anteriorFreteVlr)
	{
		this.anteriorFreteVlr = anteriorFreteVlr;
	}

	public Float getAnteriorFreteVlr()
	{
		return anteriorFreteVlr;
	}

	@Column(name="PRO_CALC_IMP_FRONT", nullable =  true , length = 17)
	@XmlElement(name = "calcImpFront")
	private Float calcImpFront= 0f;

	public void setCalcImpFront(Float calcImpFront)
	{
		this.calcImpFront = calcImpFront;
	}

	public Float getCalcImpFront()
	{
		return calcImpFront;
	}

	@Column(name="PRO_CALC_ICMS_BASE", nullable =  true , length = 17)
	@XmlElement(name = "calcIcmsBase")
	private Float calcIcmsBase= 0f;

	public void setCalcIcmsBase(Float calcIcmsBase)
	{
		this.calcIcmsBase = calcIcmsBase;
	}

	public Float getCalcIcmsBase()
	{
		return calcIcmsBase;
	}

	@Column(name="PRO_CALC_FRETE_ICMS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "calcFreteIcmsVlr")
	private Float calcFreteIcmsVlr= 0f;

	public void setCalcFreteIcmsVlr(Float calcFreteIcmsVlr)
	{
		this.calcFreteIcmsVlr = calcFreteIcmsVlr;
	}

	public Float getCalcFreteIcmsVlr()
	{
		return calcFreteIcmsVlr;
	}

	@Column(name="PRO_CALC_FRETE_ICMS_ALIQ", nullable =  true , length = 17)
	@XmlElement(name = "calcFreteIcmsAliq")
	private Float calcFreteIcmsAliq= 0f;

	public void setCalcFreteIcmsAliq(Float calcFreteIcmsAliq)
	{
		this.calcFreteIcmsAliq = calcFreteIcmsAliq;
	}

	public Float getCalcFreteIcmsAliq()
	{
		return calcFreteIcmsAliq;
	}

	@Column(name="PRO_ST_ICMS_BASE", nullable =  true , length = 17)
	@XmlElement(name = "stIcmsBase")
	private Float stIcmsBase= 0f;

	public void setStIcmsBase(Float stIcmsBase)
	{
		this.stIcmsBase = stIcmsBase;
	}

	public Float getStIcmsBase()
	{
		return stIcmsBase;
	}

	@Column(name="PRO_ULT_PRECO_COMPRA", nullable =  true , length = 17)
	@XmlElement(name = "ultPrecoCompra")
	private Float ultPrecoCompra= 0f;

	public void setUltPrecoCompra(Float ultPrecoCompra)
	{
		this.ultPrecoCompra = ultPrecoCompra;
	}

	public Float getUltPrecoCompra()
	{
		return ultPrecoCompra;
	}

	@Column(name="PRO_ULT_IPIVLR", nullable =  true , length = 17)
	@XmlElement(name = "ultIpivlr")
	private Float ultIpivlr= 0f;

	public void setUltIpivlr(Float ultIpivlr)
	{
		this.ultIpivlr = ultIpivlr;
	}

	public Float getUltIpivlr()
	{
		return ultIpivlr;
	}

	@Column(name="PRO_ULT_FRETEVLR", nullable =  true , length = 17)
	@XmlElement(name = "ultFretevlr")
	private Float ultFretevlr= 0f;

	public void setUltFretevlr(Float ultFretevlr)
	{
		this.ultFretevlr = ultFretevlr;
	}

	public Float getUltFretevlr()
	{
		return ultFretevlr;
	}

	@Column(name="PRO_ULT_ICMSSUB", nullable =  true , length = 17)
	@XmlElement(name = "ultIcmssub")
	private Float ultIcmssub= 0f;

	public void setUltIcmssub(Float ultIcmssub)
	{
		this.ultIcmssub = ultIcmssub;
	}

	public Float getUltIcmssub()
	{
		return ultIcmssub;
	}

	@Column(name="PRO_ULT_OUTROSVLR", nullable =  true , length = 17)
	@XmlElement(name = "ultOutrosvlr")
	private Float ultOutrosvlr= 0f;

	public void setUltOutrosvlr(Float ultOutrosvlr)
	{
		this.ultOutrosvlr = ultOutrosvlr;
	}

	public Float getUltOutrosvlr()
	{
		return ultOutrosvlr;
	}

	@Column(name="PRO_ULT_ICMSVLR", nullable =  true , length = 17)
	@XmlElement(name = "ultIcmsvlr")
	private Float ultIcmsvlr= 0f;

	public void setUltIcmsvlr(Float ultIcmsvlr)
	{
		this.ultIcmsvlr = ultIcmsvlr;
	}

	public Float getUltIcmsvlr()
	{
		return ultIcmsvlr;
	}

	@Column(name="PRO_ULT_IMP_FRONT", nullable =  true , length = 17)
	@XmlElement(name = "ultImpFront")
	private Float ultImpFront= 0f;

	public void setUltImpFront(Float ultImpFront)
	{
		this.ultImpFront = ultImpFront;
	}

	public Float getUltImpFront()
	{
		return ultImpFront;
	}

	@Column(name="PRO_ULT_CUSTO", nullable =  true , length = 17)
	@XmlElement(name = "ultCusto")
	private Float ultCusto= 0f;

	public void setUltCusto(Float ultCusto)
	{
		this.ultCusto = ultCusto;
	}

	public Float getUltCusto()
	{
		return ultCusto;
	}

	@Column(name="PRO_ANTERIOR_IMP_FRONT", nullable =  true , length = 17)
	@XmlElement(name = "anteriorImpFront")
	private Float anteriorImpFront= 0f;

	public void setAnteriorImpFront(Float anteriorImpFront)
	{
		this.anteriorImpFront = anteriorImpFront;
	}

	public Float getAnteriorImpFront()
	{
		return anteriorImpFront;
	}

	@Column(name="PRO_VISUAL", nullable =  true , length = 1)
	@XmlElement(name = "visual")
	private String visual;

	public void setVisual(String visual)
	{
		this.visual = visual;
	}

	public String getVisual()
	{
		return visual;
	}

	public void setVisualBoolean(Boolean value)
	{
		if (value) {
			this.visual = "S";
		}
		else {
			this.visual = "N";
		}
	}
	public Boolean getVisualBoolean()
	{
		return ((this.visual != null)&&(this.visual.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_TIPO_SAIDA", nullable =  true , length = 20)
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

	@Column(name="PRO_OCORRENCIA", nullable =  true , length = 20)
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

	@Column(name="PRO_FILIAL", nullable =  true , length = 20)
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

	@Column(name="PRO_ST_MVA_7", nullable =  true , length = 17)
	@XmlElement(name = "stMva7")
	private Float stMva7= 0f;

	public void setStMva7(Float stMva7)
	{
		this.stMva7 = stMva7;
	}

	public Float getStMva7()
	{
		return stMva7;
	}

	@Column(name="PRO_ST_MVA_12", nullable =  true , length = 17)
	@XmlElement(name = "stMva12")
	private Float stMva12= 0f;

	public void setStMva12(Float stMva12)
	{
		this.stMva12 = stMva12;
	}

	public Float getStMva12()
	{
		return stMva12;
	}

	@Column(name="PRO_ESTOQ_MIN_ZERO", nullable =  false , length = 1)
	@XmlElement(name = "estoqMinZero")
	private String estoqMinZero;

	public void setEstoqMinZero(String estoqMinZero)
	{
		this.estoqMinZero = estoqMinZero;
	}

	public String getEstoqMinZero()
	{
		return estoqMinZero;
	}

	public void setEstoqMinZeroBoolean(Boolean value)
	{
		if (value) {
			this.estoqMinZero = "S";
		}
		else {
			this.estoqMinZero = "N";
		}
	}
	public Boolean getEstoqMinZeroBoolean()
	{
		return ((this.estoqMinZero != null)&&(this.estoqMinZero.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_ESTQ_MAX", nullable =  true , length = 17)
	@XmlElement(name = "estqMax")
	private Float estqMax= 0f;

	public void setEstqMax(Float estqMax)
	{
		this.estqMax = estqMax;
	}

	public Float getEstqMax()
	{
		return estqMax;
	}

	@Column(name="PRO_PRECO01_ANT", nullable =  true , length = 17)
	@XmlElement(name = "preco01Ant")
	private Float preco01Ant= 0f;

	public void setPreco01Ant(Float preco01Ant)
	{
		this.preco01Ant = preco01Ant;
	}

	public Float getPreco01Ant()
	{
		return preco01Ant;
	}

	@Column(name="PRO_DT_CADASTRO", nullable =  true , length = 19)
	@XmlElement(name = "dtCadastro")
	private java.sql.Timestamp dtCadastro;

	public void setDtCadastro(java.sql.Timestamp dtCadastro)
	{
		this.dtCadastro = dtCadastro;
	}

	public java.sql.Timestamp getDtCadastro()
	{
		return dtCadastro;
	}

	@Column(name="DATA_ATUALIZ", nullable =  true , length = 19)
	@XmlElement(name = "atualiz")
	private java.sql.Timestamp atualiz;

	public void setAtualiz(java.sql.Timestamp atualiz)
	{
		this.atualiz = atualiz;
	}

	public java.sql.Timestamp getAtualiz()
	{
		return atualiz;
	}

	@Column(name="PRO_CONFIRMAR_ENTREGA", nullable =  true , length = 1)
	@XmlElement(name = "confirmarEntrega")
	private String confirmarEntrega;

	public void setConfirmarEntrega(String confirmarEntrega)
	{
		this.confirmarEntrega = confirmarEntrega;
	}

	public String getConfirmarEntrega()
	{
		return confirmarEntrega;
	}

	public void setConfirmarEntregaBoolean(Boolean value)
	{
		if (value) {
			this.confirmarEntrega = "S";
		}
		else {
			this.confirmarEntrega = "N";
		}
	}
	public Boolean getConfirmarEntregaBoolean()
	{
		return ((this.confirmarEntrega != null)&&(this.confirmarEntrega.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_CST", nullable =  true , length = 3)
	@XmlElement(name = "cst")
	private String cst;

	public void setCst(String cst)
	{
		this.cst = cst;
	}

	public String getCst()
	{
		return cst;
	}

	@Column(name="PRO_FERRAMENTA", nullable =  true , length = 1)
	@XmlElement(name = "ferramenta")
	private String ferramenta;

	public void setFerramenta(String ferramenta)
	{
		this.ferramenta = ferramenta;
	}

	public String getFerramenta()
	{
		return ferramenta;
	}

	public void setFerramentaBoolean(Boolean value)
	{
		if (value) {
			this.ferramenta = "S";
		}
		else {
			this.ferramenta = "N";
		}
	}
	public Boolean getFerramentaBoolean()
	{
		return ((this.ferramenta != null)&&(this.ferramenta.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_EPI", nullable =  true , length = 1)
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
	@Column(name="PRO_MAT_CONSUMO", nullable =  true , length = 1)
	@XmlElement(name = "matConsumo")
	private String matConsumo;

	public void setMatConsumo(String matConsumo)
	{
		this.matConsumo = matConsumo;
	}

	public String getMatConsumo()
	{
		return matConsumo;
	}

	public void setMatConsumoBoolean(Boolean value)
	{
		if (value) {
			this.matConsumo = "S";
		}
		else {
			this.matConsumo = "N";
		}
	}
	public Boolean getMatConsumoBoolean()
	{
		return ((this.matConsumo != null)&&(this.matConsumo.equalsIgnoreCase("S")));
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

	@Column(name="PRO_ESTQ_DATA_ULT_ENTRADA", nullable =  true , length = 10)
	@XmlElement(name = "estqDataUltEntrada")
	private java.sql.Timestamp estqDataUltEntrada;

	public void setEstqDataUltEntrada(java.sql.Timestamp estqDataUltEntrada)
	{
		this.estqDataUltEntrada = estqDataUltEntrada;
	}

	public java.sql.Timestamp getEstqDataUltEntrada()
	{
		return estqDataUltEntrada;
	}

	@Column(name="PRO_ESTQ_DATA_ULT_SAIDA", nullable =  true , length = 10)
	@XmlElement(name = "estqDataUltSaida")
	private java.sql.Timestamp estqDataUltSaida;

	public void setEstqDataUltSaida(java.sql.Timestamp estqDataUltSaida)
	{
		this.estqDataUltSaida = estqDataUltSaida;
	}

	public java.sql.Timestamp getEstqDataUltSaida()
	{
		return estqDataUltSaida;
	}

	@Column(name="PRO_CURVA_ABC", nullable =  true , length = 1)
	@XmlElement(name = "curvaAbc")
	private String curvaAbc;

	public void setCurvaAbc(String curvaAbc)
	{
		this.curvaAbc = curvaAbc;
	}

	public String getCurvaAbc()
	{
		return curvaAbc;
	}

	public void setCurvaAbcBoolean(Boolean value)
	{
		if (value) {
			this.curvaAbc = "S";
		}
		else {
			this.curvaAbc = "N";
		}
	}
	public Boolean getCurvaAbcBoolean()
	{
		return ((this.curvaAbc != null)&&(this.curvaAbc.equalsIgnoreCase("S")));
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
	@Column(name="PRO_DESCRICAO_TEMP", nullable =  true , length = 150)
	@XmlElement(name = "descricaoTemp")
	private String descricaoTemp;

	public void setDescricaoTemp(String descricaoTemp)
	{
		this.descricaoTemp = descricaoTemp;
	}

	public String getDescricaoTemp()
	{
		return descricaoTemp;
	}

	@Column(name="PRO_ICMS_ORIGEM", nullable =  true , length = 1)
	@XmlElement(name = "icmsOrigem")
	private String icmsOrigem;

	public void setIcmsOrigem(String icmsOrigem)
	{
		this.icmsOrigem = icmsOrigem;
	}

	public String getIcmsOrigem()
	{
		return icmsOrigem;
	}

	public void setIcmsOrigemBoolean(Boolean value)
	{
		if (value) {
			this.icmsOrigem = "S";
		}
		else {
			this.icmsOrigem = "N";
		}
	}
	public Boolean getIcmsOrigemBoolean()
	{
		return ((this.icmsOrigem != null)&&(this.icmsOrigem.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_VLR_SERVICO", nullable =  true , length = 17)
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

	@Column(name="PRO_DESC_TECNICA", nullable =  true , length = 0)
	@XmlElement(name = "descTecnica")
	private Float descTecnica= 0f;

	public void setDescTecnica(Float descTecnica)
	{
		this.descTecnica = descTecnica;
	}

	public Float getDescTecnica()
	{
		return descTecnica;
	}

	@Column(name="PRO_PRECO06", nullable =  true , length = 17)
	@XmlElement(name = "preco06")
	private Float preco06= 0f;

	public void setPreco06(Float preco06)
	{
		this.preco06 = preco06;
	}

	public Float getPreco06()
	{
		return preco06;
	}

	@Column(name="PRO_PRECO07", nullable =  true , length = 17)
	@XmlElement(name = "preco07")
	private Float preco07= 0f;

	public void setPreco07(Float preco07)
	{
		this.preco07 = preco07;
	}

	public Float getPreco07()
	{
		return preco07;
	}

	@Column(name="PRO_PRECO08", nullable =  true , length = 17)
	@XmlElement(name = "preco08")
	private Float preco08= 0f;

	public void setPreco08(Float preco08)
	{
		this.preco08 = preco08;
	}

	public Float getPreco08()
	{
		return preco08;
	}

	@Column(name="PRO_PRECO09", nullable =  true , length = 17)
	@XmlElement(name = "preco09")
	private Float preco09= 0f;

	public void setPreco09(Float preco09)
	{
		this.preco09 = preco09;
	}

	public Float getPreco09()
	{
		return preco09;
	}

	@Column(name="PRO_PRECO10", nullable =  true , length = 17)
	@XmlElement(name = "preco10")
	private Float preco10= 0f;

	public void setPreco10(Float preco10)
	{
		this.preco10 = preco10;
	}

	public Float getPreco10()
	{
		return preco10;
	}

	@Column(name="PRO_PRECO11", nullable =  true , length = 17)
	@XmlElement(name = "preco11")
	private Float preco11= 0f;

	public void setPreco11(Float preco11)
	{
		this.preco11 = preco11;
	}

	public Float getPreco11()
	{
		return preco11;
	}

	@Column(name="PRO_PRECO12", nullable =  true , length = 17)
	@XmlElement(name = "preco12")
	private Float preco12= 0f;

	public void setPreco12(Float preco12)
	{
		this.preco12 = preco12;
	}

	public Float getPreco12()
	{
		return preco12;
	}

	@Column(name="PRO_PRECO13", nullable =  true , length = 17)
	@XmlElement(name = "preco13")
	private Float preco13= 0f;

	public void setPreco13(Float preco13)
	{
		this.preco13 = preco13;
	}

	public Float getPreco13()
	{
		return preco13;
	}

	@Column(name="PRO_PRECO14", nullable =  true , length = 17)
	@XmlElement(name = "preco14")
	private Float preco14= 0f;

	public void setPreco14(Float preco14)
	{
		this.preco14 = preco14;
	}

	public Float getPreco14()
	{
		return preco14;
	}

	@Column(name="PRO_PRAZO_ENTREGA", nullable =  true , length = 11)
	@XmlElement(name = "prazoEntrega")
	private Integer prazoEntrega;

	public void setPrazoEntrega(Integer prazoEntrega)
	{
		this.prazoEntrega = prazoEntrega;
	}

	public Integer getPrazoEntrega()
	{
		return prazoEntrega;
	}

	@Column(name="PRO_TIPO_IMPRESSAO", nullable =  true , length = 10)
	@XmlElement(name = "tipoImpressao")
	private String tipoImpressao;

	public void setTipoImpressao(String tipoImpressao)
	{
		this.tipoImpressao = tipoImpressao;
	}

	public String getTipoImpressao()
	{
		return tipoImpressao;
	}

	@Column(name="PRO_CATEGORIA", nullable =  true , length = 16)
	@XmlElement(name = "categoria")
	private String categoria;

	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}

	public String getCategoria()
	{
		return categoria;
	}

	@Column(name="PRO_ALIQ_IPI", nullable =  true , length = 17)
	@XmlElement(name = "aliqIpi")
	private Float aliqIpi= 0f;

	public void setAliqIpi(Float aliqIpi)
	{
		this.aliqIpi = aliqIpi;
	}

	public Float getAliqIpi()
	{
		return aliqIpi;
	}

	@Column(name="PRO_NPERM_SEMESTOQ", nullable =  true , length = 1)
	@XmlElement(name = "npermSemestoq")
	private String npermSemestoq;

	public void setNpermSemestoq(String npermSemestoq)
	{
		this.npermSemestoq = npermSemestoq;
	}

	public String getNpermSemestoq()
	{
		return npermSemestoq;
	}

	public void setNpermSemestoqBoolean(Boolean value)
	{
		if (value) {
			this.npermSemestoq = "S";
		}
		else {
			this.npermSemestoq = "N";
		}
	}
	public Boolean getNpermSemestoqBoolean()
	{
		return ((this.npermSemestoq != null)&&(this.npermSemestoq.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_NPERM_FRACIONADO", nullable =  true , length = 1)
	@XmlElement(name = "npermFracionado")
	private String npermFracionado;

	public void setNpermFracionado(String npermFracionado)
	{
		this.npermFracionado = npermFracionado;
	}

	public String getNpermFracionado()
	{
		return npermFracionado;
	}

	public void setNpermFracionadoBoolean(Boolean value)
	{
		if (value) {
			this.npermFracionado = "S";
		}
		else {
			this.npermFracionado = "N";
		}
	}
	public Boolean getNpermFracionadoBoolean()
	{
		return ((this.npermFracionado != null)&&(this.npermFracionado.equalsIgnoreCase("S")));
	}
	@Column(name="CODCFOP", nullable =  true , length = 4)
	@XmlElement(name = "codcfop")
	private String codcfop;

	public void setCodcfop(String codcfop)
	{
		this.codcfop = codcfop;
	}

	public String getCodcfop()
	{
		return codcfop;
	}

	@Column(name="PRO_ALIQ_ICMS_FORA", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcmsFora")
	private Float aliqIcmsFora= 0f;

	public void setAliqIcmsFora(Float aliqIcmsFora)
	{
		this.aliqIcmsFora = aliqIcmsFora;
	}

	public Float getAliqIcmsFora()
	{
		return aliqIcmsFora;
	}

	@Column(name="PRO_OBS_NFC", nullable =  true , length = 0)
	@XmlElement(name = "obsNfc")
	private Float obsNfc= 0f;

	public void setObsNfc(Float obsNfc)
	{
		this.obsNfc = obsNfc;
	}

	public Float getObsNfc()
	{
		return obsNfc;
	}

	@Column(name="PRO_NORMAL", nullable =  false , length = 1)
	@XmlElement(name = "normal")
	private String normal;

	public void setNormal(String normal)
	{
		this.normal = normal;
	}

	public String getNormal()
	{
		return normal;
	}

	public void setNormalBoolean(Boolean value)
	{
		if (value) {
			this.normal = "S";
		}
		else {
			this.normal = "N";
		}
	}
	public Boolean getNormalBoolean()
	{
		return ((this.normal != null)&&(this.normal.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_CONSUMO", nullable =  true , length = 1)
	@XmlElement(name = "consumo")
	private String consumo;

	public void setConsumo(String consumo)
	{
		this.consumo = consumo;
	}

	public String getConsumo()
	{
		return consumo;
	}

	public void setConsumoBoolean(Boolean value)
	{
		if (value) {
			this.consumo = "S";
		}
		else {
			this.consumo = "N";
		}
	}
	public Boolean getConsumoBoolean()
	{
		return ((this.consumo != null)&&(this.consumo.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PATRIMONIO", nullable =  true , length = 1)
	@XmlElement(name = "patrimonio")
	private String patrimonio;

	public void setPatrimonio(String patrimonio)
	{
		this.patrimonio = patrimonio;
	}

	public String getPatrimonio()
	{
		return patrimonio;
	}

	public void setPatrimonioBoolean(Boolean value)
	{
		if (value) {
			this.patrimonio = "S";
		}
		else {
			this.patrimonio = "N";
		}
	}
	public Boolean getPatrimonioBoolean()
	{
		return ((this.patrimonio != null)&&(this.patrimonio.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_CALIBRADO", nullable =  true , length = 1)
	@XmlElement(name = "calibrado")
	private String calibrado;

	public void setCalibrado(String calibrado)
	{
		this.calibrado = calibrado;
	}

	public String getCalibrado()
	{
		return calibrado;
	}

	public void setCalibradoBoolean(Boolean value)
	{
		if (value) {
			this.calibrado = "S";
		}
		else {
			this.calibrado = "N";
		}
	}
	public Boolean getCalibradoBoolean()
	{
		return ((this.calibrado != null)&&(this.calibrado.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_CONTRIBUINTE", nullable =  true , length = 1)
	@XmlElement(name = "contribuinte")
	private String contribuinte;

	public void setContribuinte(String contribuinte)
	{
		this.contribuinte = contribuinte;
	}

	public String getContribuinte()
	{
		return contribuinte;
	}

	public void setContribuinteBoolean(Boolean value)
	{
		if (value) {
			this.contribuinte = "S";
		}
		else {
			this.contribuinte = "N";
		}
	}
	public Boolean getContribuinteBoolean()
	{
		return ((this.contribuinte != null)&&(this.contribuinte.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_ULT_DESCVLR_NF", nullable =  true , length = 17)
	@XmlElement(name = "ultDescvlrNf")
	private Float ultDescvlrNf= 0f;

	public void setUltDescvlrNf(Float ultDescvlrNf)
	{
		this.ultDescvlrNf = ultDescvlrNf;
	}

	public Float getUltDescvlrNf()
	{
		return ultDescvlrNf;
	}

	@Column(name="PRO_ANTERIOR_DESCVLR_NF", nullable =  true , length = 17)
	@XmlElement(name = "anteriorDescvlrNf")
	private Float anteriorDescvlrNf= 0f;

	public void setAnteriorDescvlrNf(Float anteriorDescvlrNf)
	{
		this.anteriorDescvlrNf = anteriorDescvlrNf;
	}

	public Float getAnteriorDescvlrNf()
	{
		return anteriorDescvlrNf;
	}

	@Column(name="PRO_CALC_DESCVLR_NF", nullable =  true , length = 17)
	@XmlElement(name = "calcDescvlrNf")
	private Float calcDescvlrNf= 0f;

	public void setCalcDescvlrNf(Float calcDescvlrNf)
	{
		this.calcDescvlrNf = calcDescvlrNf;
	}

	public Float getCalcDescvlrNf()
	{
		return calcDescvlrNf;
	}

	@Column(name="PRO_ESTQ_RESERVADO", nullable =  true , length = 17)
	@XmlElement(name = "estqReservado")
	private Float estqReservado= 0f;

	public void setEstqReservado(Float estqReservado)
	{
		this.estqReservado = estqReservado;
	}

	public Float getEstqReservado()
	{
		return estqReservado;
	}

	@Column(name="PRO_ICMS_TIPO", nullable =  true , length = 2)
	@XmlElement(name = "icmsTipo")
	private String icmsTipo;

	public void setIcmsTipo(String icmsTipo)
	{
		this.icmsTipo = icmsTipo;
	}

	public String getIcmsTipo()
	{
		return icmsTipo;
	}

	@Column(name="PRO_IVA_TIPO", nullable =  true , length = 2)
	@XmlElement(name = "ivaTipo")
	private String ivaTipo;

	public void setIvaTipo(String ivaTipo)
	{
		this.ivaTipo = ivaTipo;
	}

	public String getIvaTipo()
	{
		return ivaTipo;
	}

	@Column(name="PRO_ALIQ_ICMS_NCONT", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcmsNcont")
	private Float aliqIcmsNcont= 0f;

	public void setAliqIcmsNcont(Float aliqIcmsNcont)
	{
		this.aliqIcmsNcont = aliqIcmsNcont;
	}

	public Float getAliqIcmsNcont()
	{
		return aliqIcmsNcont;
	}

	@Column(name="PRO_ALIQ_ICMS_FORA_NCONT", nullable =  true , length = 17)
	@XmlElement(name = "aliqIcmsForaNcont")
	private Float aliqIcmsForaNcont= 0f;

	public void setAliqIcmsForaNcont(Float aliqIcmsForaNcont)
	{
		this.aliqIcmsForaNcont = aliqIcmsForaNcont;
	}

	public Float getAliqIcmsForaNcont()
	{
		return aliqIcmsForaNcont;
	}

	@Column(name="PRO_PER_REDUC", nullable =  true , length = 17)
	@XmlElement(name = "perReduc")
	private Float perReduc= 0f;

	public void setPerReduc(Float perReduc)
	{
		this.perReduc = perReduc;
	}

	public Float getPerReduc()
	{
		return perReduc;
	}

	@Column(name="PRO_PER_REDUC_FORA", nullable =  true , length = 17)
	@XmlElement(name = "perReducFora")
	private Float perReducFora= 0f;

	public void setPerReducFora(Float perReducFora)
	{
		this.perReducFora = perReducFora;
	}

	public Float getPerReducFora()
	{
		return perReducFora;
	}

	@Column(name="PRO_PER_REDUC_NCONT", nullable =  true , length = 17)
	@XmlElement(name = "perReducNcont")
	private Float perReducNcont= 0f;

	public void setPerReducNcont(Float perReducNcont)
	{
		this.perReducNcont = perReducNcont;
	}

	public Float getPerReducNcont()
	{
		return perReducNcont;
	}

	@Column(name="PRO_PER_REDUC_FORA_NCONT", nullable =  true , length = 17)
	@XmlElement(name = "perReducForaNcont")
	private Float perReducForaNcont= 0f;

	public void setPerReducForaNcont(Float perReducForaNcont)
	{
		this.perReducForaNcont = perReducForaNcont;
	}

	public Float getPerReducForaNcont()
	{
		return perReducForaNcont;
	}

	@Column(name="PRO_VENDEDOR_CUSTOMIZADO", nullable =  true , length = 1)
	@XmlElement(name = "vendedorCustomizado")
	private String vendedorCustomizado;

	public void setVendedorCustomizado(String vendedorCustomizado)
	{
		this.vendedorCustomizado = vendedorCustomizado;
	}

	public String getVendedorCustomizado()
	{
		return vendedorCustomizado;
	}

	public void setVendedorCustomizadoBoolean(Boolean value)
	{
		if (value) {
			this.vendedorCustomizado = "S";
		}
		else {
			this.vendedorCustomizado = "N";
		}
	}
	public Boolean getVendedorCustomizadoBoolean()
	{
		return ((this.vendedorCustomizado != null)&&(this.vendedorCustomizado.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_VLR_OUTROS", nullable =  true , length = 17)
	@XmlElement(name = "vlrOutros")
	private Float vlrOutros= 0f;

	public void setVlrOutros(Float vlrOutros)
	{
		this.vlrOutros = vlrOutros;
	}

	public Float getVlrOutros()
	{
		return vlrOutros;
	}

	@Column(name="PRO_VLR_ATUAL_BEM", nullable =  true , length = 17)
	@XmlElement(name = "vlrAtualBem")
	private Float vlrAtualBem= 0f;

	public void setVlrAtualBem(Float vlrAtualBem)
	{
		this.vlrAtualBem = vlrAtualBem;
	}

	public Float getVlrAtualBem()
	{
		return vlrAtualBem;
	}

	@Column(name="PRO_PER_DEPRECIACAO", nullable =  true , length = 17)
	@XmlElement(name = "perDepreciacao")
	private Float perDepreciacao= 0f;

	public void setPerDepreciacao(Float perDepreciacao)
	{
		this.perDepreciacao = perDepreciacao;
	}

	public Float getPerDepreciacao()
	{
		return perDepreciacao;
	}

	@Column(name="PRO_REPISTOLAR", nullable =  true , length = 1)
	@XmlElement(name = "repistolar")
	private String repistolar;

	public void setRepistolar(String repistolar)
	{
		this.repistolar = repistolar;
	}

	public String getRepistolar()
	{
		return repistolar;
	}

	public void setRepistolarBoolean(Boolean value)
	{
		if (value) {
			this.repistolar = "S";
		}
		else {
			this.repistolar = "N";
		}
	}
	public Boolean getRepistolarBoolean()
	{
		return ((this.repistolar != null)&&(this.repistolar.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_BALANCA", nullable =  true , length = 1)
	@XmlElement(name = "balanca")
	private String balanca;

	public void setBalanca(String balanca)
	{
		this.balanca = balanca;
	}

	public String getBalanca()
	{
		return balanca;
	}

	public void setBalancaBoolean(Boolean value)
	{
		if (value) {
			this.balanca = "S";
		}
		else {
			this.balanca = "N";
		}
	}
	public Boolean getBalancaBoolean()
	{
		return ((this.balanca != null)&&(this.balanca.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_DIAS_VALIDADE", nullable =  true , length = 11)
	@XmlElement(name = "diasValidade")
	private Integer diasValidade;

	public void setDiasValidade(Integer diasValidade)
	{
		this.diasValidade = diasValidade;
	}

	public Integer getDiasValidade()
	{
		return diasValidade;
	}

	@Column(name="PRO_IAT", nullable =  true , length = 1)
	@XmlElement(name = "iat")
	private String iat;

	public void setIat(String iat)
	{
		this.iat = iat;
	}

	public String getIat()
	{
		return iat;
	}

	public void setIatBoolean(Boolean value)
	{
		if (value) {
			this.iat = "S";
		}
		else {
			this.iat = "N";
		}
	}
	public Boolean getIatBoolean()
	{
		return ((this.iat != null)&&(this.iat.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_IPPT", nullable =  true , length = 1)
	@XmlElement(name = "ippt")
	private String ippt;

	public void setIppt(String ippt)
	{
		this.ippt = ippt;
	}

	public String getIppt()
	{
		return ippt;
	}

	public void setIpptBoolean(Boolean value)
	{
		if (value) {
			this.ippt = "S";
		}
		else {
			this.ippt = "N";
		}
	}
	public Boolean getIpptBoolean()
	{
		return ((this.ippt != null)&&(this.ippt.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_GTIN", nullable =  true , length = 14)
	@XmlElement(name = "gtin")
	private String gtin;

	public void setGtin(String gtin)
	{
		this.gtin = gtin;
	}

	public String getGtin()
	{
		return gtin;
	}

	@Column(name="PRO_NCM_EX", nullable =  true , length = 1)
	@XmlElement(name = "ncmEx")
	private String ncmEx;

	public void setNcmEx(String ncmEx)
	{
		this.ncmEx = ncmEx;
	}

	public String getNcmEx()
	{
		return ncmEx;
	}

	public void setNcmExBoolean(Boolean value)
	{
		if (value) {
			this.ncmEx = "S";
		}
		else {
			this.ncmEx = "N";
		}
	}
	public Boolean getNcmExBoolean()
	{
		return ((this.ncmEx != null)&&(this.ncmEx.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_NCM_TABELA", nullable =  true , length = 1)
	@XmlElement(name = "ncmTabela")
	private String ncmTabela;

	public void setNcmTabela(String ncmTabela)
	{
		this.ncmTabela = ncmTabela;
	}

	public String getNcmTabela()
	{
		return ncmTabela;
	}

	public void setNcmTabelaBoolean(Boolean value)
	{
		if (value) {
			this.ncmTabela = "S";
		}
		else {
			this.ncmTabela = "N";
		}
	}
	public Boolean getNcmTabelaBoolean()
	{
		return ((this.ncmTabela != null)&&(this.ncmTabela.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_NCM_ALIQ", nullable =  true , length = 17)
	@XmlElement(name = "ncmAliq")
	private Float ncmAliq= 0f;

	public void setNcmAliq(Float ncmAliq)
	{
		this.ncmAliq = ncmAliq;
	}

	public Float getNcmAliq()
	{
		return ncmAliq;
	}

	@Column(name="PRO_DATA_ULT_VENDA", nullable =  true , length = 10)
	@XmlElement(name = "dataUltVenda")
	private java.sql.Timestamp dataUltVenda;

	public void setDataUltVenda(java.sql.Timestamp dataUltVenda)
	{
		this.dataUltVenda = dataUltVenda;
	}

	public java.sql.Timestamp getDataUltVenda()
	{
		return dataUltVenda;
	}

	@Column(name="PRO_DESCRICAO_MENOR", nullable =  true , length = 20)
	@XmlElement(name = "descricaoMenor")
	private String descricaoMenor;

	public void setDescricaoMenor(String descricaoMenor)
	{
		this.descricaoMenor = descricaoMenor;
	}

	public String getDescricaoMenor()
	{
		return descricaoMenor;
	}

	@Column(name="PRO_PERSONALIZADO", nullable =  false , length = 1)
	@XmlElement(name = "personalizado")
	private String personalizado;

	public void setPersonalizado(String personalizado)
	{
		this.personalizado = personalizado;
	}

	public String getPersonalizado()
	{
		return personalizado;
	}

	public void setPersonalizadoBoolean(Boolean value)
	{
		if (value) {
			this.personalizado = "S";
		}
		else {
			this.personalizado = "N";
		}
	}
	public Boolean getPersonalizadoBoolean()
	{
		return ((this.personalizado != null)&&(this.personalizado.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_DESC_DINHEIRO", nullable =  true , length = 17)
	@XmlElement(name = "descDinheiro")
	private Float descDinheiro= 0f;

	public void setDescDinheiro(Float descDinheiro)
	{
		this.descDinheiro = descDinheiro;
	}

	public Float getDescDinheiro()
	{
		return descDinheiro;
	}

	@Column(name="PRO_DESC_OUTROS", nullable =  true , length = 17)
	@XmlElement(name = "descOutros")
	private Float descOutros= 0f;

	public void setDescOutros(Float descOutros)
	{
		this.descOutros = descOutros;
	}

	public Float getDescOutros()
	{
		return descOutros;
	}

	@Column(name="PRO_PROMO_TIPO", nullable =  true , length = 1)
	@XmlElement(name = "promoTipo")
	private String promoTipo;

	public void setPromoTipo(String promoTipo)
	{
		this.promoTipo = promoTipo;
	}

	public String getPromoTipo()
	{
		return promoTipo;
	}

	public void setPromoTipoBoolean(Boolean value)
	{
		if (value) {
			this.promoTipo = "S";
		}
		else {
			this.promoTipo = "N";
		}
	}
	public Boolean getPromoTipoBoolean()
	{
		return ((this.promoTipo != null)&&(this.promoTipo.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_DTINI", nullable =  true , length = 10)
	@XmlElement(name = "promoDtini")
	private java.sql.Timestamp promoDtini;

	public void setPromoDtini(java.sql.Timestamp promoDtini)
	{
		this.promoDtini = promoDtini;
	}

	public java.sql.Timestamp getPromoDtini()
	{
		return promoDtini;
	}

	@Column(name="PRO_PROMO_DTFINAL", nullable =  true , length = 10)
	@XmlElement(name = "promoDtfinal")
	private java.sql.Timestamp promoDtfinal;

	public void setPromoDtfinal(java.sql.Timestamp promoDtfinal)
	{
		this.promoDtfinal = promoDtfinal;
	}

	public java.sql.Timestamp getPromoDtfinal()
	{
		return promoDtfinal;
	}

	@Column(name="PRO_PROMO_SEG_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoSegChk")
	private String promoSegChk;

	public void setPromoSegChk(String promoSegChk)
	{
		this.promoSegChk = promoSegChk;
	}

	public String getPromoSegChk()
	{
		return promoSegChk;
	}

	public void setPromoSegChkBoolean(Boolean value)
	{
		if (value) {
			this.promoSegChk = "S";
		}
		else {
			this.promoSegChk = "N";
		}
	}
	public Boolean getPromoSegChkBoolean()
	{
		return ((this.promoSegChk != null)&&(this.promoSegChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_TER_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoTerChk")
	private String promoTerChk;

	public void setPromoTerChk(String promoTerChk)
	{
		this.promoTerChk = promoTerChk;
	}

	public String getPromoTerChk()
	{
		return promoTerChk;
	}

	public void setPromoTerChkBoolean(Boolean value)
	{
		if (value) {
			this.promoTerChk = "S";
		}
		else {
			this.promoTerChk = "N";
		}
	}
	public Boolean getPromoTerChkBoolean()
	{
		return ((this.promoTerChk != null)&&(this.promoTerChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_QUA_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoQuaChk")
	private String promoQuaChk;

	public void setPromoQuaChk(String promoQuaChk)
	{
		this.promoQuaChk = promoQuaChk;
	}

	public String getPromoQuaChk()
	{
		return promoQuaChk;
	}

	public void setPromoQuaChkBoolean(Boolean value)
	{
		if (value) {
			this.promoQuaChk = "S";
		}
		else {
			this.promoQuaChk = "N";
		}
	}
	public Boolean getPromoQuaChkBoolean()
	{
		return ((this.promoQuaChk != null)&&(this.promoQuaChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_QUI_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoQuiChk")
	private String promoQuiChk;

	public void setPromoQuiChk(String promoQuiChk)
	{
		this.promoQuiChk = promoQuiChk;
	}

	public String getPromoQuiChk()
	{
		return promoQuiChk;
	}

	public void setPromoQuiChkBoolean(Boolean value)
	{
		if (value) {
			this.promoQuiChk = "S";
		}
		else {
			this.promoQuiChk = "N";
		}
	}
	public Boolean getPromoQuiChkBoolean()
	{
		return ((this.promoQuiChk != null)&&(this.promoQuiChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_SEX_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoSexChk")
	private String promoSexChk;

	public void setPromoSexChk(String promoSexChk)
	{
		this.promoSexChk = promoSexChk;
	}

	public String getPromoSexChk()
	{
		return promoSexChk;
	}

	public void setPromoSexChkBoolean(Boolean value)
	{
		if (value) {
			this.promoSexChk = "S";
		}
		else {
			this.promoSexChk = "N";
		}
	}
	public Boolean getPromoSexChkBoolean()
	{
		return ((this.promoSexChk != null)&&(this.promoSexChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_SAB_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoSabChk")
	private String promoSabChk;

	public void setPromoSabChk(String promoSabChk)
	{
		this.promoSabChk = promoSabChk;
	}

	public String getPromoSabChk()
	{
		return promoSabChk;
	}

	public void setPromoSabChkBoolean(Boolean value)
	{
		if (value) {
			this.promoSabChk = "S";
		}
		else {
			this.promoSabChk = "N";
		}
	}
	public Boolean getPromoSabChkBoolean()
	{
		return ((this.promoSabChk != null)&&(this.promoSabChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_DOM_CHK", nullable =  true , length = 1)
	@XmlElement(name = "promoDomChk")
	private String promoDomChk;

	public void setPromoDomChk(String promoDomChk)
	{
		this.promoDomChk = promoDomChk;
	}

	public String getPromoDomChk()
	{
		return promoDomChk;
	}

	public void setPromoDomChkBoolean(Boolean value)
	{
		if (value) {
			this.promoDomChk = "S";
		}
		else {
			this.promoDomChk = "N";
		}
	}
	public Boolean getPromoDomChkBoolean()
	{
		return ((this.promoDomChk != null)&&(this.promoDomChk.equalsIgnoreCase("S")));
	}
	@Column(name="PRO_PROMO_SEG_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoSegHrini")
	private String promoSegHrini;

	public void setPromoSegHrini(String promoSegHrini)
	{
		this.promoSegHrini = promoSegHrini;
	}

	public String getPromoSegHrini()
	{
		return promoSegHrini;
	}

	@Column(name="PRO_PROMO_SEG_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoSegHrfinal")
	private String promoSegHrfinal;

	public void setPromoSegHrfinal(String promoSegHrfinal)
	{
		this.promoSegHrfinal = promoSegHrfinal;
	}

	public String getPromoSegHrfinal()
	{
		return promoSegHrfinal;
	}

	@Column(name="PRO_PROMO_TER_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoTerHrini")
	private String promoTerHrini;

	public void setPromoTerHrini(String promoTerHrini)
	{
		this.promoTerHrini = promoTerHrini;
	}

	public String getPromoTerHrini()
	{
		return promoTerHrini;
	}

	@Column(name="PRO_PROMO_TER_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoTerHrfinal")
	private String promoTerHrfinal;

	public void setPromoTerHrfinal(String promoTerHrfinal)
	{
		this.promoTerHrfinal = promoTerHrfinal;
	}

	public String getPromoTerHrfinal()
	{
		return promoTerHrfinal;
	}

	@Column(name="PRO_PROMO_QUA_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoQuaHrini")
	private String promoQuaHrini;

	public void setPromoQuaHrini(String promoQuaHrini)
	{
		this.promoQuaHrini = promoQuaHrini;
	}

	public String getPromoQuaHrini()
	{
		return promoQuaHrini;
	}

	@Column(name="PRO_PROMO_QUA_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoQuaHrfinal")
	private String promoQuaHrfinal;

	public void setPromoQuaHrfinal(String promoQuaHrfinal)
	{
		this.promoQuaHrfinal = promoQuaHrfinal;
	}

	public String getPromoQuaHrfinal()
	{
		return promoQuaHrfinal;
	}

	@Column(name="PRO_PROMO_QUI_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoQuiHrini")
	private String promoQuiHrini;

	public void setPromoQuiHrini(String promoQuiHrini)
	{
		this.promoQuiHrini = promoQuiHrini;
	}

	public String getPromoQuiHrini()
	{
		return promoQuiHrini;
	}

	@Column(name="PRO_PROMO_QUI_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoQuiHrfinal")
	private String promoQuiHrfinal;

	public void setPromoQuiHrfinal(String promoQuiHrfinal)
	{
		this.promoQuiHrfinal = promoQuiHrfinal;
	}

	public String getPromoQuiHrfinal()
	{
		return promoQuiHrfinal;
	}

	@Column(name="PRO_PROMO_SEX_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoSexHrini")
	private String promoSexHrini;

	public void setPromoSexHrini(String promoSexHrini)
	{
		this.promoSexHrini = promoSexHrini;
	}

	public String getPromoSexHrini()
	{
		return promoSexHrini;
	}

	@Column(name="PRO_PROMO_SEX_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoSexHrfinal")
	private String promoSexHrfinal;

	public void setPromoSexHrfinal(String promoSexHrfinal)
	{
		this.promoSexHrfinal = promoSexHrfinal;
	}

	public String getPromoSexHrfinal()
	{
		return promoSexHrfinal;
	}

	@Column(name="PRO_PROMO_SAB_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoSabHrini")
	private String promoSabHrini;

	public void setPromoSabHrini(String promoSabHrini)
	{
		this.promoSabHrini = promoSabHrini;
	}

	public String getPromoSabHrini()
	{
		return promoSabHrini;
	}

	@Column(name="PRO_PROMO_SAB_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoSabHrfinal")
	private String promoSabHrfinal;

	public void setPromoSabHrfinal(String promoSabHrfinal)
	{
		this.promoSabHrfinal = promoSabHrfinal;
	}

	public String getPromoSabHrfinal()
	{
		return promoSabHrfinal;
	}

	@Column(name="PRO_PROMO_DOM_HRINI", nullable =  true , length = 8)
	@XmlElement(name = "promoDomHrini")
	private String promoDomHrini;

	public void setPromoDomHrini(String promoDomHrini)
	{
		this.promoDomHrini = promoDomHrini;
	}

	public String getPromoDomHrini()
	{
		return promoDomHrini;
	}

	@Column(name="PRO_PROMO_DOM_HRFINAL", nullable =  true , length = 8)
	@XmlElement(name = "promoDomHrfinal")
	private String promoDomHrfinal;

	public void setPromoDomHrfinal(String promoDomHrfinal)
	{
		this.promoDomHrfinal = promoDomHrfinal;
	}

	public String getPromoDomHrfinal()
	{
		return promoDomHrfinal;
	}

	@Column(name="PRO_ORDEM", nullable =  true , length = 11)
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

	@Column(name="PRO_ESTQ_ATUAL_ANTES", nullable =  true , length = 17)
	@XmlElement(name = "estqAtualAntes")
	private Float estqAtualAntes= 0f;

	public void setEstqAtualAntes(Float estqAtualAntes)
	{
		this.estqAtualAntes = estqAtualAntes;
	}

	public Float getEstqAtualAntes()
	{
		return estqAtualAntes;
	}

}
