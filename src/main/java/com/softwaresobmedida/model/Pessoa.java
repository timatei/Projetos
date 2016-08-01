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
@Table(name = "PESSOA")
@SequenceGenerator(name = "INC_PESSOA", sequenceName = "GEN_PESSOA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pessoa") 
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Pessoa() {	
	}

	@Id
	@Column(name="CODPESSOA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PESSOA")
	@XmlElement(name = "codpessoa")
	private Integer codpessoa;

	public void setCodpessoa(Integer codpessoa)
	{
		this.codpessoa = codpessoa;
	}

	public Integer getCodpessoa()
	{
		return codpessoa;
	}

	@Column(name="PES_TIPO_PESSOA", nullable =  false , length = 1)
	@XmlElement(name = "tipoPessoa")
	private String tipoPessoa;

	public void setTipoPessoa(String tipoPessoa)
	{
		this.tipoPessoa = tipoPessoa;
	}

	public String getTipoPessoa()
	{
		return tipoPessoa;
	}

	public void setTipoPessoaBoolean(Boolean value)
	{
		if (value) {
			this.tipoPessoa = "S";
		}
		else {
			this.tipoPessoa = "N";
		}
	}
	public Boolean getTipoPessoaBoolean()
	{
		return ((this.tipoPessoa != null)&&(this.tipoPessoa.equalsIgnoreCase("S")));
	}
	@Column(name="PES_NOME", nullable =  true , length = 60)
	@XmlElement(name = "nome")
	private String nome;

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	@Column(name="PES_RAZAO_SOCIAL", nullable =  true , length = 60)
	@XmlElement(name = "razaoSocial")
	private String razaoSocial;

	public void setRazaoSocial(String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial()
	{
		return razaoSocial;
	}

	@Column(name="PES_CPFCNPJ", nullable =  true , length = 20)
	@XmlElement(name = "cpfcnpj")
	private String cpfcnpj;

	public void setCpfcnpj(String cpfcnpj)
	{
		this.cpfcnpj = cpfcnpj;
	}

	public String getCpfcnpj()
	{
		return cpfcnpj;
	}

	@Column(name="PES_IE", nullable =  true , length = 30)
	@XmlElement(name = "ie")
	private String ie;

	public void setIe(String ie)
	{
		this.ie = ie;
	}

	public String getIe()
	{
		return ie;
	}

	@Column(name="PES_IM", nullable =  true , length = 30)
	@XmlElement(name = "im")
	private String im;

	public void setIm(String im)
	{
		this.im = im;
	}

	public String getIm()
	{
		return im;
	}

	@Column(name="PES_ENDERECO", nullable =  true , length = 80)
	@XmlElement(name = "endereco")
	private String endereco;

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getEndereco()
	{
		return endereco;
	}

	@Column(name="PES_ENDERECO_NUMERO", nullable =  true , length = 11)
	@XmlElement(name = "enderecoNumero")
	private Integer enderecoNumero;

	public void setEnderecoNumero(Integer enderecoNumero)
	{
		this.enderecoNumero = enderecoNumero;
	}

	public Integer getEnderecoNumero()
	{
		return enderecoNumero;
	}

	@Column(name="PES_ENDERECO_COMPLEMENTO", nullable =  true , length = 30)
	@XmlElement(name = "enderecoComplemento")
	private String enderecoComplemento;

	public void setEnderecoComplemento(String enderecoComplemento)
	{
		this.enderecoComplemento = enderecoComplemento;
	}

	public String getEnderecoComplemento()
	{
		return enderecoComplemento;
	}

	@Column(name="PES_BAIRRO", nullable =  true , length = 50)
	@XmlElement(name = "bairro")
	private String bairro;

	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	public String getBairro()
	{
		return bairro;
	}

	@Column(name="PES_CIDADE", nullable =  true , length = 50)
	@XmlElement(name = "cidade")
	private String cidade;

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}

	public String getCidade()
	{
		return cidade;
	}

	@Column(name="PES_UF", nullable =  true , length = 2)
	@XmlElement(name = "uf")
	private String uf;

	public void setUf(String uf)
	{
		this.uf = uf;
	}

	public String getUf()
	{
		return uf;
	}

	@Column(name="PES_CEP", nullable =  true , length = 9)
	@XmlElement(name = "cep")
	private String cep;

	public void setCep(String cep)
	{
		this.cep = cep;
	}

	public String getCep()
	{
		return cep;
	}

	@Column(name="PES_TELEFONE_DDD", nullable =  true , length = 2)
	@XmlElement(name = "telefoneDdd")
	private String telefoneDdd;

	public void setTelefoneDdd(String telefoneDdd)
	{
		this.telefoneDdd = telefoneDdd;
	}

	public String getTelefoneDdd()
	{
		return telefoneDdd;
	}

	@Column(name="PES_TELEFONE", nullable =  true , length = 9)
	@XmlElement(name = "telefone")
	private String telefone;

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	public String getTelefone()
	{
		return telefone;
	}

	@Column(name="PES_FAX_DDD", nullable =  true , length = 2)
	@XmlElement(name = "faxDdd")
	private String faxDdd;

	public void setFaxDdd(String faxDdd)
	{
		this.faxDdd = faxDdd;
	}

	public String getFaxDdd()
	{
		return faxDdd;
	}

	@Column(name="PES_FAX", nullable =  true , length = 9)
	@XmlElement(name = "fax")
	private String fax;

	public void setFax(String fax)
	{
		this.fax = fax;
	}

	public String getFax()
	{
		return fax;
	}

	@Column(name="PES_CELULAR_DDD", nullable =  true , length = 2)
	@XmlElement(name = "celularDdd")
	private String celularDdd;

	public void setCelularDdd(String celularDdd)
	{
		this.celularDdd = celularDdd;
	}

	public String getCelularDdd()
	{
		return celularDdd;
	}

	@Column(name="PES_CELULAR", nullable =  true , length = 9)
	@XmlElement(name = "celular")
	private String celular;

	public void setCelular(String celular)
	{
		this.celular = celular;
	}

	public String getCelular()
	{
		return celular;
	}

	@Column(name="PES_CONTATOS", nullable =  true , length = 60)
	@XmlElement(name = "contatos")
	private String contatos;

	public void setContatos(String contatos)
	{
		this.contatos = contatos;
	}

	public String getContatos()
	{
		return contatos;
	}

	@Column(name="PES_EMAIL", nullable =  true , length = 60)
	@XmlElement(name = "email")
	private String email;

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	@Column(name="PES_HOMEPAGE", nullable =  true , length = 60)
	@XmlElement(name = "homepage")
	private String homepage;

	public void setHomepage(String homepage)
	{
		this.homepage = homepage;
	}

	public String getHomepage()
	{
		return homepage;
	}

	@Column(name="PES_PONTO_REFERENCIA", nullable =  true , length = 0)
	@XmlElement(name = "pontoReferencia")
	private String pontoReferencia;

	public void setPontoReferencia(String pontoReferencia)
	{
		this.pontoReferencia = pontoReferencia;
	}

	public String getPontoReferencia()
	{
		return pontoReferencia;
	}

	@Column(name="PES_CLASS_CLI", nullable =  false , length = 1)
	@XmlElement(name = "classCli")
	private String classCli;

	public void setClassCli(String classCli)
	{
		this.classCli = classCli;
	}

	public String getClassCli()
	{
		return classCli;
	}

	public void setClassCliBoolean(Boolean value)
	{
		if (value) {
			this.classCli = "S";
		}
		else {
			this.classCli = "N";
		}
	}
	public Boolean getClassCliBoolean()
	{
		return ((this.classCli != null)&&(this.classCli.equalsIgnoreCase("S")));
	}
	@Column(name="PES_CLASS_FOR", nullable =  false , length = 1)
	@XmlElement(name = "classFor")
	private String classFor;

	public void setClassFor(String classFor)
	{
		this.classFor = classFor;
	}

	public String getClassFor()
	{
		return classFor;
	}

	public void setClassForBoolean(Boolean value)
	{
		if (value) {
			this.classFor = "S";
		}
		else {
			this.classFor = "N";
		}
	}
	public Boolean getClassForBoolean()
	{
		return ((this.classFor != null)&&(this.classFor.equalsIgnoreCase("S")));
	}
	@Column(name="PES_CLASS_TRA", nullable =  false , length = 1)
	@XmlElement(name = "classTra")
	private String classTra;

	public void setClassTra(String classTra)
	{
		this.classTra = classTra;
	}

	public String getClassTra()
	{
		return classTra;
	}

	public void setClassTraBoolean(Boolean value)
	{
		if (value) {
			this.classTra = "S";
		}
		else {
			this.classTra = "N";
		}
	}
	public Boolean getClassTraBoolean()
	{
		return ((this.classTra != null)&&(this.classTra.equalsIgnoreCase("S")));
	}
	@Column(name="PES_ATIVO", nullable =  false , length = 1)
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
	@Column(name="PES_CLASS_FAB", nullable =  false , length = 1)
	@XmlElement(name = "classFab")
	private String classFab;

	public void setClassFab(String classFab)
	{
		this.classFab = classFab;
	}

	public String getClassFab()
	{
		return classFab;
	}

	public void setClassFabBoolean(Boolean value)
	{
		if (value) {
			this.classFab = "S";
		}
		else {
			this.classFab = "N";
		}
	}
	public Boolean getClassFabBoolean()
	{
		return ((this.classFab != null)&&(this.classFab.equalsIgnoreCase("S")));
	}
	@Column(name="PES_LIMITE_CREDITO", nullable =  true , length = 17)
	@XmlElement(name = "limiteCredito")
	private Float limiteCredito= 0f;

	public void setLimiteCredito(Float limiteCredito)
	{
		this.limiteCredito = limiteCredito;
	}

	public Float getLimiteCredito()
	{
		return limiteCredito;
	}

	@Column(name="PES_CONSUMIDOR_FINAL", nullable =  true , length = 1)
	@XmlElement(name = "consumidorFinal")
	private String consumidorFinal;

	public void setConsumidorFinal(String consumidorFinal)
	{
		this.consumidorFinal = consumidorFinal;
	}

	public String getConsumidorFinal()
	{
		return consumidorFinal;
	}

	public void setConsumidorFinalBoolean(Boolean value)
	{
		if (value) {
			this.consumidorFinal = "S";
		}
		else {
			this.consumidorFinal = "N";
		}
	}
	public Boolean getConsumidorFinalBoolean()
	{
		return ((this.consumidorFinal != null)&&(this.consumidorFinal.equalsIgnoreCase("S")));
	}
	@Column(name="PES_DSP", nullable =  true , length = 20)
	@XmlElement(name = "dsp")
	private String dsp;

	public void setDsp(String dsp)
	{
		this.dsp = dsp;
	}

	public String getDsp()
	{
		return dsp;
	}

	@Column(name="PES_OBS", nullable =  true , length = 600)
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

	@Column(name="CODVENDEDOR", nullable =  true , length = 11)
	@XmlElement(name = "codvendedor")
	private Integer codvendedor;

	public void setCodvendedor(Integer codvendedor)
	{
		this.codvendedor = codvendedor;
	}

	public Integer getCodvendedor()
	{
		return codvendedor;
	}

	@Column(name="PES_VEN_COMISSAO", nullable =  true , length = 17)
	@XmlElement(name = "venComissao")
	private Float venComissao= 0f;

	public void setVenComissao(Float venComissao)
	{
		this.venComissao = venComissao;
	}

	public Float getVenComissao()
	{
		return venComissao;
	}

	@Column(name="PES_PRECO_01", nullable =  true , length = 1)
	@XmlElement(name = "preco01")
	private String preco01;

	public void setPreco01(String preco01)
	{
		this.preco01 = preco01;
	}

	public String getPreco01()
	{
		return preco01;
	}

	public void setPreco01Boolean(Boolean value)
	{
		if (value) {
			this.preco01 = "S";
		}
		else {
			this.preco01 = "N";
		}
	}
	public Boolean getPreco01Boolean()
	{
		return ((this.preco01 != null)&&(this.preco01.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PRECO_02", nullable =  true , length = 1)
	@XmlElement(name = "preco02")
	private String preco02;

	public void setPreco02(String preco02)
	{
		this.preco02 = preco02;
	}

	public String getPreco02()
	{
		return preco02;
	}

	public void setPreco02Boolean(Boolean value)
	{
		if (value) {
			this.preco02 = "S";
		}
		else {
			this.preco02 = "N";
		}
	}
	public Boolean getPreco02Boolean()
	{
		return ((this.preco02 != null)&&(this.preco02.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PRECO_03", nullable =  true , length = 1)
	@XmlElement(name = "preco03")
	private String preco03;

	public void setPreco03(String preco03)
	{
		this.preco03 = preco03;
	}

	public String getPreco03()
	{
		return preco03;
	}

	public void setPreco03Boolean(Boolean value)
	{
		if (value) {
			this.preco03 = "S";
		}
		else {
			this.preco03 = "N";
		}
	}
	public Boolean getPreco03Boolean()
	{
		return ((this.preco03 != null)&&(this.preco03.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PRECO_04", nullable =  true , length = 1)
	@XmlElement(name = "preco04")
	private String preco04;

	public void setPreco04(String preco04)
	{
		this.preco04 = preco04;
	}

	public String getPreco04()
	{
		return preco04;
	}

	public void setPreco04Boolean(Boolean value)
	{
		if (value) {
			this.preco04 = "S";
		}
		else {
			this.preco04 = "N";
		}
	}
	public Boolean getPreco04Boolean()
	{
		return ((this.preco04 != null)&&(this.preco04.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PRECO_05", nullable =  true , length = 1)
	@XmlElement(name = "preco05")
	private String preco05;

	public void setPreco05(String preco05)
	{
		this.preco05 = preco05;
	}

	public String getPreco05()
	{
		return preco05;
	}

	public void setPreco05Boolean(Boolean value)
	{
		if (value) {
			this.preco05 = "S";
		}
		else {
			this.preco05 = "N";
		}
	}
	public Boolean getPreco05Boolean()
	{
		return ((this.preco05 != null)&&(this.preco05.equalsIgnoreCase("S")));
	}
	@Column(name="PES_DESC_MAX", nullable =  true , length = 17)
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

	@Column(name="PES_MEDICO", nullable =  true , length = 1)
	@XmlElement(name = "medico")
	private String medico;

	public void setMedico(String medico)
	{
		this.medico = medico;
	}

	public String getMedico()
	{
		return medico;
	}

	public void setMedicoBoolean(Boolean value)
	{
		if (value) {
			this.medico = "S";
		}
		else {
			this.medico = "N";
		}
	}
	public Boolean getMedicoBoolean()
	{
		return ((this.medico != null)&&(this.medico.equalsIgnoreCase("S")));
	}
	@Column(name="PES_OPTICA", nullable =  true , length = 1)
	@XmlElement(name = "optica")
	private String optica;

	public void setOptica(String optica)
	{
		this.optica = optica;
	}

	public String getOptica()
	{
		return optica;
	}

	public void setOpticaBoolean(Boolean value)
	{
		if (value) {
			this.optica = "S";
		}
		else {
			this.optica = "N";
		}
	}
	public Boolean getOpticaBoolean()
	{
		return ((this.optica != null)&&(this.optica.equalsIgnoreCase("S")));
	}
	@Column(name="PES_DATA", nullable =  true , length = 19)
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

	@Column(name="PES_SEXO", nullable =  true , length = 1)
	@XmlElement(name = "sexo")
	private String sexo;

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	public String getSexo()
	{
		return sexo;
	}

	public void setSexoBoolean(Boolean value)
	{
		if (value) {
			this.sexo = "S";
		}
		else {
			this.sexo = "N";
		}
	}
	public Boolean getSexoBoolean()
	{
		return ((this.sexo != null)&&(this.sexo.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PROFISSAO", nullable =  true , length = 30)
	@XmlElement(name = "profissao")
	private String profissao;

	public void setProfissao(String profissao)
	{
		this.profissao = profissao;
	}

	public String getProfissao()
	{
		return profissao;
	}

	@Column(name="PES_FILHOS", nullable =  true , length = 1)
	@XmlElement(name = "filhos")
	private String filhos;

	public void setFilhos(String filhos)
	{
		this.filhos = filhos;
	}

	public String getFilhos()
	{
		return filhos;
	}

	public void setFilhosBoolean(Boolean value)
	{
		if (value) {
			this.filhos = "S";
		}
		else {
			this.filhos = "N";
		}
	}
	public Boolean getFilhosBoolean()
	{
		return ((this.filhos != null)&&(this.filhos.equalsIgnoreCase("S")));
	}
	@Column(name="PES_TP_CAD_LOJA", nullable =  true , length = 1)
	@XmlElement(name = "tpCadLoja")
	private String tpCadLoja;

	public void setTpCadLoja(String tpCadLoja)
	{
		this.tpCadLoja = tpCadLoja;
	}

	public String getTpCadLoja()
	{
		return tpCadLoja;
	}

	public void setTpCadLojaBoolean(Boolean value)
	{
		if (value) {
			this.tpCadLoja = "S";
		}
		else {
			this.tpCadLoja = "N";
		}
	}
	public Boolean getTpCadLojaBoolean()
	{
		return ((this.tpCadLoja != null)&&(this.tpCadLoja.equalsIgnoreCase("S")));
	}
	@Column(name="PES_TP_CAD_OUTR", nullable =  true , length = 1)
	@XmlElement(name = "tpCadOutr")
	private String tpCadOutr;

	public void setTpCadOutr(String tpCadOutr)
	{
		this.tpCadOutr = tpCadOutr;
	}

	public String getTpCadOutr()
	{
		return tpCadOutr;
	}

	public void setTpCadOutrBoolean(Boolean value)
	{
		if (value) {
			this.tpCadOutr = "S";
		}
		else {
			this.tpCadOutr = "N";
		}
	}
	public Boolean getTpCadOutrBoolean()
	{
		return ((this.tpCadOutr != null)&&(this.tpCadOutr.equalsIgnoreCase("S")));
	}
	@Column(name="PES_TP_CAD_CART", nullable =  true , length = 1)
	@XmlElement(name = "tpCadCart")
	private String tpCadCart;

	public void setTpCadCart(String tpCadCart)
	{
		this.tpCadCart = tpCadCart;
	}

	public String getTpCadCart()
	{
		return tpCadCart;
	}

	public void setTpCadCartBoolean(Boolean value)
	{
		if (value) {
			this.tpCadCart = "S";
		}
		else {
			this.tpCadCart = "N";
		}
	}
	public Boolean getTpCadCartBoolean()
	{
		return ((this.tpCadCart != null)&&(this.tpCadCart.equalsIgnoreCase("S")));
	}
	@Column(name="PES_ADICAO", nullable =  true , length = 20)
	@XmlElement(name = "adicao")
	private String adicao;

	public void setAdicao(String adicao)
	{
		this.adicao = adicao;
	}

	public String getAdicao()
	{
		return adicao;
	}

	@Column(name="PES_LNG_OD_ESF", nullable =  true , length = 15)
	@XmlElement(name = "lngOdEsf")
	private String lngOdEsf;

	public void setLngOdEsf(String lngOdEsf)
	{
		this.lngOdEsf = lngOdEsf;
	}

	public String getLngOdEsf()
	{
		return lngOdEsf;
	}

	@Column(name="PES_LNG_OD_CIL", nullable =  true , length = 15)
	@XmlElement(name = "lngOdCil")
	private String lngOdCil;

	public void setLngOdCil(String lngOdCil)
	{
		this.lngOdCil = lngOdCil;
	}

	public String getLngOdCil()
	{
		return lngOdCil;
	}

	@Column(name="PES_LNG_OD_EIXO", nullable =  true , length = 15)
	@XmlElement(name = "lngOdEixo")
	private String lngOdEixo;

	public void setLngOdEixo(String lngOdEixo)
	{
		this.lngOdEixo = lngOdEixo;
	}

	public String getLngOdEixo()
	{
		return lngOdEixo;
	}

	@Column(name="PES_LNG_OD_ALT", nullable =  true , length = 15)
	@XmlElement(name = "lngOdAlt")
	private String lngOdAlt;

	public void setLngOdAlt(String lngOdAlt)
	{
		this.lngOdAlt = lngOdAlt;
	}

	public String getLngOdAlt()
	{
		return lngOdAlt;
	}

	@Column(name="PES_LNG_OD_DNP", nullable =  true , length = 15)
	@XmlElement(name = "lngOdDnp")
	private String lngOdDnp;

	public void setLngOdDnp(String lngOdDnp)
	{
		this.lngOdDnp = lngOdDnp;
	}

	public String getLngOdDnp()
	{
		return lngOdDnp;
	}

	@Column(name="PES_LNG_OE_ESF", nullable =  true , length = 15)
	@XmlElement(name = "lngOeEsf")
	private String lngOeEsf;

	public void setLngOeEsf(String lngOeEsf)
	{
		this.lngOeEsf = lngOeEsf;
	}

	public String getLngOeEsf()
	{
		return lngOeEsf;
	}

	@Column(name="PES_LNG_OE_CIL", nullable =  true , length = 15)
	@XmlElement(name = "lngOeCil")
	private String lngOeCil;

	public void setLngOeCil(String lngOeCil)
	{
		this.lngOeCil = lngOeCil;
	}

	public String getLngOeCil()
	{
		return lngOeCil;
	}

	@Column(name="PES_LNG_OE_EIXO", nullable =  true , length = 15)
	@XmlElement(name = "lngOeEixo")
	private String lngOeEixo;

	public void setLngOeEixo(String lngOeEixo)
	{
		this.lngOeEixo = lngOeEixo;
	}

	public String getLngOeEixo()
	{
		return lngOeEixo;
	}

	@Column(name="PES_LNG_OE_ALT", nullable =  true , length = 15)
	@XmlElement(name = "lngOeAlt")
	private String lngOeAlt;

	public void setLngOeAlt(String lngOeAlt)
	{
		this.lngOeAlt = lngOeAlt;
	}

	public String getLngOeAlt()
	{
		return lngOeAlt;
	}

	@Column(name="PES_LNG_OE_DNP", nullable =  true , length = 15)
	@XmlElement(name = "lngOeDnp")
	private String lngOeDnp;

	public void setLngOeDnp(String lngOeDnp)
	{
		this.lngOeDnp = lngOeDnp;
	}

	public String getLngOeDnp()
	{
		return lngOeDnp;
	}

	@Column(name="PES_PRT_OD_ESF", nullable =  true , length = 15)
	@XmlElement(name = "prtOdEsf")
	private String prtOdEsf;

	public void setPrtOdEsf(String prtOdEsf)
	{
		this.prtOdEsf = prtOdEsf;
	}

	public String getPrtOdEsf()
	{
		return prtOdEsf;
	}

	@Column(name="PES_PRT_OD_CIL", nullable =  true , length = 15)
	@XmlElement(name = "prtOdCil")
	private String prtOdCil;

	public void setPrtOdCil(String prtOdCil)
	{
		this.prtOdCil = prtOdCil;
	}

	public String getPrtOdCil()
	{
		return prtOdCil;
	}

	@Column(name="PES_PRT_OD_EIXO", nullable =  true , length = 15)
	@XmlElement(name = "prtOdEixo")
	private String prtOdEixo;

	public void setPrtOdEixo(String prtOdEixo)
	{
		this.prtOdEixo = prtOdEixo;
	}

	public String getPrtOdEixo()
	{
		return prtOdEixo;
	}

	@Column(name="PES_PRT_OD_ALT", nullable =  true , length = 15)
	@XmlElement(name = "prtOdAlt")
	private String prtOdAlt;

	public void setPrtOdAlt(String prtOdAlt)
	{
		this.prtOdAlt = prtOdAlt;
	}

	public String getPrtOdAlt()
	{
		return prtOdAlt;
	}

	@Column(name="PES_PRT_OD_DNP", nullable =  true , length = 15)
	@XmlElement(name = "prtOdDnp")
	private String prtOdDnp;

	public void setPrtOdDnp(String prtOdDnp)
	{
		this.prtOdDnp = prtOdDnp;
	}

	public String getPrtOdDnp()
	{
		return prtOdDnp;
	}

	@Column(name="PES_PRT_OE_ESF", nullable =  true , length = 15)
	@XmlElement(name = "prtOeEsf")
	private String prtOeEsf;

	public void setPrtOeEsf(String prtOeEsf)
	{
		this.prtOeEsf = prtOeEsf;
	}

	public String getPrtOeEsf()
	{
		return prtOeEsf;
	}

	@Column(name="PES_PRT_OE_CIL", nullable =  true , length = 15)
	@XmlElement(name = "prtOeCil")
	private String prtOeCil;

	public void setPrtOeCil(String prtOeCil)
	{
		this.prtOeCil = prtOeCil;
	}

	public String getPrtOeCil()
	{
		return prtOeCil;
	}

	@Column(name="PES_PRT_OE_EIXO", nullable =  true , length = 15)
	@XmlElement(name = "prtOeEixo")
	private String prtOeEixo;

	public void setPrtOeEixo(String prtOeEixo)
	{
		this.prtOeEixo = prtOeEixo;
	}

	public String getPrtOeEixo()
	{
		return prtOeEixo;
	}

	@Column(name="PES_PRT_OE_ALT", nullable =  true , length = 15)
	@XmlElement(name = "prtOeAlt")
	private String prtOeAlt;

	public void setPrtOeAlt(String prtOeAlt)
	{
		this.prtOeAlt = prtOeAlt;
	}

	public String getPrtOeAlt()
	{
		return prtOeAlt;
	}

	@Column(name="PES_PRT_OE_DNP", nullable =  true , length = 15)
	@XmlElement(name = "prtOeDnp")
	private String prtOeDnp;

	public void setPrtOeDnp(String prtOeDnp)
	{
		this.prtOeDnp = prtOeDnp;
	}

	public String getPrtOeDnp()
	{
		return prtOeDnp;
	}

	@Column(name="PES_CNH_CATEGORIA", nullable =  true , length = 4)
	@XmlElement(name = "cnhCategoria")
	private String cnhCategoria;

	public void setCnhCategoria(String cnhCategoria)
	{
		this.cnhCategoria = cnhCategoria;
	}

	public String getCnhCategoria()
	{
		return cnhCategoria;
	}

	@Column(name="PES_CNH_NUMERO", nullable =  true , length = 11)
	@XmlElement(name = "cnhNumero")
	private Integer cnhNumero;

	public void setCnhNumero(Integer cnhNumero)
	{
		this.cnhNumero = cnhNumero;
	}

	public Integer getCnhNumero()
	{
		return cnhNumero;
	}

	@Column(name="PES_CNH_DT_1CART", nullable =  true , length = 10)
	@XmlElement(name = "cnhDt1cart")
	private java.sql.Timestamp cnhDt1cart;

	public void setCnhDt1cart(java.sql.Timestamp cnhDt1cart)
	{
		this.cnhDt1cart = cnhDt1cart;
	}

	public java.sql.Timestamp getCnhDt1cart()
	{
		return cnhDt1cart;
	}

	@Column(name="PES_CNH_DT_EMISSAO", nullable =  true , length = 10)
	@XmlElement(name = "cnhDtEmissao")
	private java.sql.Timestamp cnhDtEmissao;

	public void setCnhDtEmissao(java.sql.Timestamp cnhDtEmissao)
	{
		this.cnhDtEmissao = cnhDtEmissao;
	}

	public java.sql.Timestamp getCnhDtEmissao()
	{
		return cnhDtEmissao;
	}

	@Column(name="PES_CNH_OBS", nullable =  true , length = 200)
	@XmlElement(name = "cnhObs")
	private String cnhObs;

	public void setCnhObs(String cnhObs)
	{
		this.cnhObs = cnhObs;
	}

	public String getCnhObs()
	{
		return cnhObs;
	}

	@Column(name="PES_PLACA", nullable =  true , length = 8)
	@XmlElement(name = "placa")
	private String placa;

	public void setPlaca(String placa)
	{
		this.placa = placa;
	}

	public String getPlaca()
	{
		return placa;
	}

	@Column(name="PES_VEI_MODELO", nullable =  true , length = 30)
	@XmlElement(name = "veiModelo")
	private String veiModelo;

	public void setVeiModelo(String veiModelo)
	{
		this.veiModelo = veiModelo;
	}

	public String getVeiModelo()
	{
		return veiModelo;
	}

	@Column(name="PES_VEI_COR", nullable =  true , length = 20)
	@XmlElement(name = "veiCor")
	private String veiCor;

	public void setVeiCor(String veiCor)
	{
		this.veiCor = veiCor;
	}

	public String getVeiCor()
	{
		return veiCor;
	}

	@Column(name="PES_DT_NASC", nullable =  true , length = 10)
	@XmlElement(name = "dtNasc")
	private java.sql.Timestamp dtNasc;

	public void setDtNasc(java.sql.Timestamp dtNasc)
	{
		this.dtNasc = dtNasc;
	}

	public java.sql.Timestamp getDtNasc()
	{
		return dtNasc;
	}

	@Column(name="PES_PAI", nullable =  true , length = 60)
	@XmlElement(name = "pai")
	private String pai;

	public void setPai(String pai)
	{
		this.pai = pai;
	}

	public String getPai()
	{
		return pai;
	}

	@Column(name="PES_MAE", nullable =  true , length = 60)
	@XmlElement(name = "mae")
	private String mae;

	public void setMae(String mae)
	{
		this.mae = mae;
	}

	public String getMae()
	{
		return mae;
	}

	@Column(name="PES_ESCOLIDADE", nullable =  true , length = 20)
	@XmlElement(name = "escolidade")
	private String escolidade;

	public void setEscolidade(String escolidade)
	{
		this.escolidade = escolidade;
	}

	public String getEscolidade()
	{
		return escolidade;
	}

	@Column(name="PES_FONTE", nullable =  true , length = 20)
	@XmlElement(name = "fonte")
	private String fonte;

	public void setFonte(String fonte)
	{
		this.fonte = fonte;
	}

	public String getFonte()
	{
		return fonte;
	}

	@Column(name="PES_ESCOLA", nullable =  true , length = 40)
	@XmlElement(name = "escola")
	private String escola;

	public void setEscola(String escola)
	{
		this.escola = escola;
	}

	public String getEscola()
	{
		return escola;
	}

	@Column(name="PES_ESTADO_CIVIL", nullable =  true , length = 20)
	@XmlElement(name = "estadoCivil")
	private String estadoCivil;

	public void setEstadoCivil(String estadoCivil)
	{
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil()
	{
		return estadoCivil;
	}

	@Column(name="CODCIDADE", nullable =  true , length = 11)
	@XmlElement(name = "codcidade")
	private Integer codcidade;

	public void setCodcidade(Integer codcidade)
	{
		this.codcidade = codcidade;
	}

	public Integer getCodcidade()
	{
		return codcidade;
	}

	@Column(name="PES_NATURALIDADE", nullable =  true , length = 25)
	@XmlElement(name = "naturalidade")
	private String naturalidade;

	public void setNaturalidade(String naturalidade)
	{
		this.naturalidade = naturalidade;
	}

	public String getNaturalidade()
	{
		return naturalidade;
	}

	@Column(name="PES_ESCOLA_SERIE", nullable =  true , length = 20)
	@XmlElement(name = "escolaSerie")
	private String escolaSerie;

	public void setEscolaSerie(String escolaSerie)
	{
		this.escolaSerie = escolaSerie;
	}

	public String getEscolaSerie()
	{
		return escolaSerie;
	}

	@Column(name="PES_RG", nullable =  true , length = 30)
	@XmlElement(name = "rg")
	private String rg;

	public void setRg(String rg)
	{
		this.rg = rg;
	}

	public String getRg()
	{
		return rg;
	}

	@Column(name="PES_PARCERIA", nullable =  true , length = 35)
	@XmlElement(name = "parceria")
	private String parceria;

	public void setParceria(String parceria)
	{
		this.parceria = parceria;
	}

	public String getParceria()
	{
		return parceria;
	}

	@Column(name="PES_GRADE", nullable =  true , length = 35)
	@XmlElement(name = "grade")
	private String grade;

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public String getGrade()
	{
		return grade;
	}

	@Column(name="PES_FATURAMENTO", nullable =  true , length = 35)
	@XmlElement(name = "faturamento")
	private String faturamento;

	public void setFaturamento(String faturamento)
	{
		this.faturamento = faturamento;
	}

	public String getFaturamento()
	{
		return faturamento;
	}

	@Column(name="CODFONTE", nullable =  true , length = 11)
	@XmlElement(name = "codfonte")
	private Integer codfonte;

	public void setCodfonte(Integer codfonte)
	{
		this.codfonte = codfonte;
	}

	public Integer getCodfonte()
	{
		return codfonte;
	}

	@Column(name="CODGRADE", nullable =  true , length = 11)
	@XmlElement(name = "codgrade")
	private Integer codgrade;

	public void setCodgrade(Integer codgrade)
	{
		this.codgrade = codgrade;
	}

	public Integer getCodgrade()
	{
		return codgrade;
	}

	@Column(name="CODFAIXAFATURAMENTO", nullable =  true , length = 11)
	@XmlElement(name = "codfaixafaturamento")
	private Integer codfaixafaturamento;

	public void setCodfaixafaturamento(Integer codfaixafaturamento)
	{
		this.codfaixafaturamento = codfaixafaturamento;
	}

	public Integer getCodfaixafaturamento()
	{
		return codfaixafaturamento;
	}

	@Column(name="CODPARCERIA", nullable =  true , length = 11)
	@XmlElement(name = "codparceria")
	private Integer codparceria;

	public void setCodparceria(Integer codparceria)
	{
		this.codparceria = codparceria;
	}

	public Integer getCodparceria()
	{
		return codparceria;
	}

	@Column(name="PES_MEDIA_FATURAMENTO", nullable =  true , length = 17)
	@XmlElement(name = "mediaFaturamento")
	private Float mediaFaturamento= 0f;

	public void setMediaFaturamento(Float mediaFaturamento)
	{
		this.mediaFaturamento = mediaFaturamento;
	}

	public Float getMediaFaturamento()
	{
		return mediaFaturamento;
	}

	@Column(name="CODFAIXAFATURAMENTO_ANT", nullable =  true , length = 11)
	@XmlElement(name = "ant")
	private Integer ant;

	public void setAnt(Integer ant)
	{
		this.ant = ant;
	}

	public Integer getAnt()
	{
		return ant;
	}

	@Column(name="PES_ATENDIMENTO", nullable =  true , length = 30)
	@XmlElement(name = "atendimento")
	private String atendimento;

	public void setAtendimento(String atendimento)
	{
		this.atendimento = atendimento;
	}

	public String getAtendimento()
	{
		return atendimento;
	}

	@Column(name="CODFAIXAFATURAMENTO_SIMUL", nullable =  true , length = 11)
	@XmlElement(name = "simul")
	private Integer simul;

	public void setSimul(Integer simul)
	{
		this.simul = simul;
	}

	public Integer getSimul()
	{
		return simul;
	}

	@Column(name="CODFAIXAFATURAMENTO_SIMUL_AN", nullable =  true , length = 11)
	@XmlElement(name = "simulAn")
	private Integer simulAn;

	public void setSimulAn(Integer simulAn)
	{
		this.simulAn = simulAn;
	}

	public Integer getSimulAn()
	{
		return simulAn;
	}

	@Column(name="PES_MEDIA_FATURAMENTO_SIM", nullable =  true , length = 17)
	@XmlElement(name = "mediaFaturamentoSim")
	private Float mediaFaturamentoSim= 0f;

	public void setMediaFaturamentoSim(Float mediaFaturamentoSim)
	{
		this.mediaFaturamentoSim = mediaFaturamentoSim;
	}

	public Float getMediaFaturamentoSim()
	{
		return mediaFaturamentoSim;
	}

	@Column(name="PES_PAIS", nullable =  true , length = 60)
	@XmlElement(name = "pais")
	private String pais;

	public void setPais(String pais)
	{
		this.pais = pais;
	}

	public String getPais()
	{
		return pais;
	}

	@Column(name="PES_CLASS_FUN", nullable =  false , length = 1)
	@XmlElement(name = "classFun")
	private String classFun;

	public void setClassFun(String classFun)
	{
		this.classFun = classFun;
	}

	public String getClassFun()
	{
		return classFun;
	}

	public void setClassFunBoolean(Boolean value)
	{
		if (value) {
			this.classFun = "S";
		}
		else {
			this.classFun = "N";
		}
	}
	public Boolean getClassFunBoolean()
	{
		return ((this.classFun != null)&&(this.classFun.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PREV_PROX_VENDA", nullable =  true , length = 10)
	@XmlElement(name = "prevProxVenda")
	private java.sql.Timestamp prevProxVenda;

	public void setPrevProxVenda(java.sql.Timestamp prevProxVenda)
	{
		this.prevProxVenda = prevProxVenda;
	}

	public java.sql.Timestamp getPrevProxVenda()
	{
		return prevProxVenda;
	}

	@Column(name="PES_CLASS_PARC", nullable =  true , length = 1)
	@XmlElement(name = "classParc")
	private String classParc;

	public void setClassParc(String classParc)
	{
		this.classParc = classParc;
	}

	public String getClassParc()
	{
		return classParc;
	}

	public void setClassParcBoolean(Boolean value)
	{
		if (value) {
			this.classParc = "S";
		}
		else {
			this.classParc = "N";
		}
	}
	public Boolean getClassParcBoolean()
	{
		return ((this.classParc != null)&&(this.classParc.equalsIgnoreCase("S")));
	}
	@Column(name="PES_CODCLI", nullable =  true , length = 11)
	@XmlElement(name = "codcli")
	private Integer codcli;

	public void setCodcli(Integer codcli)
	{
		this.codcli = codcli;
	}

	public Integer getCodcli()
	{
		return codcli;
	}

	@Column(name="PES_CLASSIFICACAO", nullable =  true , length = 1)
	@XmlElement(name = "classificacao")
	private String classificacao;

	public void setClassificacao(String classificacao)
	{
		this.classificacao = classificacao;
	}

	public String getClassificacao()
	{
		return classificacao;
	}

	public void setClassificacaoBoolean(Boolean value)
	{
		if (value) {
			this.classificacao = "S";
		}
		else {
			this.classificacao = "N";
		}
	}
	public Boolean getClassificacaoBoolean()
	{
		return ((this.classificacao != null)&&(this.classificacao.equalsIgnoreCase("S")));
	}
	@Column(name="PES_TRAB_EMPRESA", nullable =  true , length = 20)
	@XmlElement(name = "trabEmpresa")
	private String trabEmpresa;

	public void setTrabEmpresa(String trabEmpresa)
	{
		this.trabEmpresa = trabEmpresa;
	}

	public String getTrabEmpresa()
	{
		return trabEmpresa;
	}

	@Column(name="PES_TRAB_DT_ADMISSAO", nullable =  true , length = 10)
	@XmlElement(name = "trabDtAdmissao")
	private java.sql.Timestamp trabDtAdmissao;

	public void setTrabDtAdmissao(java.sql.Timestamp trabDtAdmissao)
	{
		this.trabDtAdmissao = trabDtAdmissao;
	}

	public java.sql.Timestamp getTrabDtAdmissao()
	{
		return trabDtAdmissao;
	}

	@Column(name="PES_TRAB_ENDERECO", nullable =  true , length = 80)
	@XmlElement(name = "trabEndereco")
	private String trabEndereco;

	public void setTrabEndereco(String trabEndereco)
	{
		this.trabEndereco = trabEndereco;
	}

	public String getTrabEndereco()
	{
		return trabEndereco;
	}

	@Column(name="PES_TRAB_CARGO", nullable =  true , length = 30)
	@XmlElement(name = "trabCargo")
	private String trabCargo;

	public void setTrabCargo(String trabCargo)
	{
		this.trabCargo = trabCargo;
	}

	public String getTrabCargo()
	{
		return trabCargo;
	}

	@Column(name="PES_TRAB_SALARIO", nullable =  true , length = 9)
	@XmlElement(name = "trabSalario")
	private String trabSalario;

	public void setTrabSalario(String trabSalario)
	{
		this.trabSalario = trabSalario;
	}

	public String getTrabSalario()
	{
		return trabSalario;
	}

	@Column(name="PES_COBR_ENDERECO", nullable =  true , length = 80)
	@XmlElement(name = "cobrEndereco")
	private String cobrEndereco;

	public void setCobrEndereco(String cobrEndereco)
	{
		this.cobrEndereco = cobrEndereco;
	}

	public String getCobrEndereco()
	{
		return cobrEndereco;
	}

	@Column(name="PES_COBR_ENDERECO_NUMERO", nullable =  true , length = 11)
	@XmlElement(name = "cobrEnderecoNumero")
	private Integer cobrEnderecoNumero;

	public void setCobrEnderecoNumero(Integer cobrEnderecoNumero)
	{
		this.cobrEnderecoNumero = cobrEnderecoNumero;
	}

	public Integer getCobrEnderecoNumero()
	{
		return cobrEnderecoNumero;
	}

	@Column(name="PES_COBR_ENDERECO_COMPLEMENTO", nullable =  true , length = 30)
	@XmlElement(name = "cobrEnderecoComplemento")
	private String cobrEnderecoComplemento;

	public void setCobrEnderecoComplemento(String cobrEnderecoComplemento)
	{
		this.cobrEnderecoComplemento = cobrEnderecoComplemento;
	}

	public String getCobrEnderecoComplemento()
	{
		return cobrEnderecoComplemento;
	}

	@Column(name="PES_COBR_ENDERECO_BAIRRO", nullable =  true , length = 50)
	@XmlElement(name = "cobrEnderecoBairro")
	private String cobrEnderecoBairro;

	public void setCobrEnderecoBairro(String cobrEnderecoBairro)
	{
		this.cobrEnderecoBairro = cobrEnderecoBairro;
	}

	public String getCobrEnderecoBairro()
	{
		return cobrEnderecoBairro;
	}

	@Column(name="PES_COBR_ENDERECO_CIDADE", nullable =  true , length = 40)
	@XmlElement(name = "cobrEnderecoCidade")
	private String cobrEnderecoCidade;

	public void setCobrEnderecoCidade(String cobrEnderecoCidade)
	{
		this.cobrEnderecoCidade = cobrEnderecoCidade;
	}

	public String getCobrEnderecoCidade()
	{
		return cobrEnderecoCidade;
	}

	@Column(name="PES_COBR_ENDERECO_CEP", nullable =  true , length = 9)
	@XmlElement(name = "cobrEnderecoCep")
	private String cobrEnderecoCep;

	public void setCobrEnderecoCep(String cobrEnderecoCep)
	{
		this.cobrEnderecoCep = cobrEnderecoCep;
	}

	public String getCobrEnderecoCep()
	{
		return cobrEnderecoCep;
	}

	@Column(name="PES_COBR_ENDERECO_PONTO_REF", nullable =  true , length = 0)
	@XmlElement(name = "cobrEnderecoPontoRef")
	private String cobrEnderecoPontoRef;

	public void setCobrEnderecoPontoRef(String cobrEnderecoPontoRef)
	{
		this.cobrEnderecoPontoRef = cobrEnderecoPontoRef;
	}

	public String getCobrEnderecoPontoRef()
	{
		return cobrEnderecoPontoRef;
	}

	@Column(name="PES_AVAL_NOME", nullable =  true , length = 60)
	@XmlElement(name = "avalNome")
	private String avalNome;

	public void setAvalNome(String avalNome)
	{
		this.avalNome = avalNome;
	}

	public String getAvalNome()
	{
		return avalNome;
	}

	@Column(name="PES_AVAL_RG", nullable =  true , length = 20)
	@XmlElement(name = "avalRg")
	private String avalRg;

	public void setAvalRg(String avalRg)
	{
		this.avalRg = avalRg;
	}

	public String getAvalRg()
	{
		return avalRg;
	}

	@Column(name="PES_AVAL_CPF", nullable =  true , length = 20)
	@XmlElement(name = "avalCpf")
	private String avalCpf;

	public void setAvalCpf(String avalCpf)
	{
		this.avalCpf = avalCpf;
	}

	public String getAvalCpf()
	{
		return avalCpf;
	}

	@Column(name="PES_AVAL_DT_NASC", nullable =  true , length = 10)
	@XmlElement(name = "avalDtNasc")
	private java.sql.Timestamp avalDtNasc;

	public void setAvalDtNasc(java.sql.Timestamp avalDtNasc)
	{
		this.avalDtNasc = avalDtNasc;
	}

	public java.sql.Timestamp getAvalDtNasc()
	{
		return avalDtNasc;
	}

	@Column(name="PES_AVAL_ENDERECO", nullable =  true , length = 80)
	@XmlElement(name = "avalEndereco")
	private String avalEndereco;

	public void setAvalEndereco(String avalEndereco)
	{
		this.avalEndereco = avalEndereco;
	}

	public String getAvalEndereco()
	{
		return avalEndereco;
	}

	@Column(name="PES_AVAL_TELEFONE_DDD", nullable =  true , length = 2)
	@XmlElement(name = "avalTelefoneDdd")
	private String avalTelefoneDdd;

	public void setAvalTelefoneDdd(String avalTelefoneDdd)
	{
		this.avalTelefoneDdd = avalTelefoneDdd;
	}

	public String getAvalTelefoneDdd()
	{
		return avalTelefoneDdd;
	}

	@Column(name="PES_AVAL_TELEFONE", nullable =  true , length = 9)
	@XmlElement(name = "avalTelefone")
	private String avalTelefone;

	public void setAvalTelefone(String avalTelefone)
	{
		this.avalTelefone = avalTelefone;
	}

	public String getAvalTelefone()
	{
		return avalTelefone;
	}

	@Column(name="PES_AVAL_CARGO_PROFISSAO", nullable =  true , length = 30)
	@XmlElement(name = "avalCargoProfissao")
	private String avalCargoProfissao;

	public void setAvalCargoProfissao(String avalCargoProfissao)
	{
		this.avalCargoProfissao = avalCargoProfissao;
	}

	public String getAvalCargoProfissao()
	{
		return avalCargoProfissao;
	}

	@Column(name="PES_AVAL_EMPRESA", nullable =  true , length = 20)
	@XmlElement(name = "avalEmpresa")
	private String avalEmpresa;

	public void setAvalEmpresa(String avalEmpresa)
	{
		this.avalEmpresa = avalEmpresa;
	}

	public String getAvalEmpresa()
	{
		return avalEmpresa;
	}

	@Column(name="PES_AVAL_SALARIO", nullable =  true , length = 9)
	@XmlElement(name = "avalSalario")
	private String avalSalario;

	public void setAvalSalario(String avalSalario)
	{
		this.avalSalario = avalSalario;
	}

	public String getAvalSalario()
	{
		return avalSalario;
	}

	@Column(name="PES_REF_PES1_NOME", nullable =  true , length = 30)
	@XmlElement(name = "refPes1Nome")
	private String refPes1Nome;

	public void setRefPes1Nome(String refPes1Nome)
	{
		this.refPes1Nome = refPes1Nome;
	}

	public String getRefPes1Nome()
	{
		return refPes1Nome;
	}

	@Column(name="PES_REF_PES1_TELEFONES", nullable =  true , length = 30)
	@XmlElement(name = "refPes1Telefones")
	private String refPes1Telefones;

	public void setRefPes1Telefones(String refPes1Telefones)
	{
		this.refPes1Telefones = refPes1Telefones;
	}

	public String getRefPes1Telefones()
	{
		return refPes1Telefones;
	}

	@Column(name="PES_REF_PES1_ENDERECO", nullable =  true , length = 80)
	@XmlElement(name = "refPes1Endereco")
	private String refPes1Endereco;

	public void setRefPes1Endereco(String refPes1Endereco)
	{
		this.refPes1Endereco = refPes1Endereco;
	}

	public String getRefPes1Endereco()
	{
		return refPes1Endereco;
	}

	@Column(name="PES_REF_PES2_NOME", nullable =  true , length = 30)
	@XmlElement(name = "refPes2Nome")
	private String refPes2Nome;

	public void setRefPes2Nome(String refPes2Nome)
	{
		this.refPes2Nome = refPes2Nome;
	}

	public String getRefPes2Nome()
	{
		return refPes2Nome;
	}

	@Column(name="PES_REF_PES2_TELEFONES", nullable =  true , length = 30)
	@XmlElement(name = "refPes2Telefones")
	private String refPes2Telefones;

	public void setRefPes2Telefones(String refPes2Telefones)
	{
		this.refPes2Telefones = refPes2Telefones;
	}

	public String getRefPes2Telefones()
	{
		return refPes2Telefones;
	}

	@Column(name="PES_REF_PES2_ENDERECO", nullable =  true , length = 80)
	@XmlElement(name = "refPes2Endereco")
	private String refPes2Endereco;

	public void setRefPes2Endereco(String refPes2Endereco)
	{
		this.refPes2Endereco = refPes2Endereco;
	}

	public String getRefPes2Endereco()
	{
		return refPes2Endereco;
	}

	@Column(name="PES_REF_COM1_ESTABELECIMENTO", nullable =  true , length = 30)
	@XmlElement(name = "refCom1Estabelecimento")
	private String refCom1Estabelecimento;

	public void setRefCom1Estabelecimento(String refCom1Estabelecimento)
	{
		this.refCom1Estabelecimento = refCom1Estabelecimento;
	}

	public String getRefCom1Estabelecimento()
	{
		return refCom1Estabelecimento;
	}

	@Column(name="PES_REF_COM1_DT_COMPRA", nullable =  true , length = 10)
	@XmlElement(name = "refCom1DtCompra")
	private java.sql.Timestamp refCom1DtCompra;

	public void setRefCom1DtCompra(java.sql.Timestamp refCom1DtCompra)
	{
		this.refCom1DtCompra = refCom1DtCompra;
	}

	public java.sql.Timestamp getRefCom1DtCompra()
	{
		return refCom1DtCompra;
	}

	@Column(name="PES_REF_COM1_VLR_COMPRA", nullable =  true , length = 9)
	@XmlElement(name = "refCom1VlrCompra")
	private java.sql.Timestamp refCom1VlrCompra;

	public void setRefCom1VlrCompra(java.sql.Timestamp refCom1VlrCompra)
	{
		this.refCom1VlrCompra = refCom1VlrCompra;
	}

	public java.sql.Timestamp getRefCom1VlrCompra()
	{
		return refCom1VlrCompra;
	}

	@Column(name="PES_REF_COM1_QTDE_PARCELAS", nullable =  true , length = 11)
	@XmlElement(name = "refCom1QtdeParcelas")
	private Integer refCom1QtdeParcelas;

	public void setRefCom1QtdeParcelas(Integer refCom1QtdeParcelas)
	{
		this.refCom1QtdeParcelas = refCom1QtdeParcelas;
	}

	public Integer getRefCom1QtdeParcelas()
	{
		return refCom1QtdeParcelas;
	}

	@Column(name="PES_REF_COM2_ESTABELECIMENTO", nullable =  true , length = 30)
	@XmlElement(name = "refCom2Estabelecimento")
	private String refCom2Estabelecimento;

	public void setRefCom2Estabelecimento(String refCom2Estabelecimento)
	{
		this.refCom2Estabelecimento = refCom2Estabelecimento;
	}

	public String getRefCom2Estabelecimento()
	{
		return refCom2Estabelecimento;
	}

	@Column(name="PES_REF_COM2_DT_COMPRA", nullable =  true , length = 10)
	@XmlElement(name = "refCom2DtCompra")
	private java.sql.Timestamp refCom2DtCompra;

	public void setRefCom2DtCompra(java.sql.Timestamp refCom2DtCompra)
	{
		this.refCom2DtCompra = refCom2DtCompra;
	}

	public java.sql.Timestamp getRefCom2DtCompra()
	{
		return refCom2DtCompra;
	}

	@Column(name="PES_REF_COM2_VLR_COMPRA", nullable =  true , length = 9)
	@XmlElement(name = "refCom2VlrCompra")
	private java.sql.Timestamp refCom2VlrCompra;

	public void setRefCom2VlrCompra(java.sql.Timestamp refCom2VlrCompra)
	{
		this.refCom2VlrCompra = refCom2VlrCompra;
	}

	public java.sql.Timestamp getRefCom2VlrCompra()
	{
		return refCom2VlrCompra;
	}

	@Column(name="PES_REF_COM2_QTDE_PARCELAS", nullable =  true , length = 11)
	@XmlElement(name = "refCom2QtdeParcelas")
	private Integer refCom2QtdeParcelas;

	public void setRefCom2QtdeParcelas(Integer refCom2QtdeParcelas)
	{
		this.refCom2QtdeParcelas = refCom2QtdeParcelas;
	}

	public Integer getRefCom2QtdeParcelas()
	{
		return refCom2QtdeParcelas;
	}

	@Column(name="PES_GRUPO", nullable =  true , length = 30)
	@XmlElement(name = "grupo")
	private String grupo;

	public void setGrupo(String grupo)
	{
		this.grupo = grupo;
	}

	public String getGrupo()
	{
		return grupo;
	}

	@Column(name="CODPESSOAGRUPO", nullable =  true , length = 11)
	@XmlElement(name = "codpessoagrupo")
	private Integer codpessoagrupo;

	public void setCodpessoagrupo(Integer codpessoagrupo)
	{
		this.codpessoagrupo = codpessoagrupo;
	}

	public Integer getCodpessoagrupo()
	{
		return codpessoagrupo;
	}

	@Column(name="CODVEICULOMARCA", nullable =  true , length = 11)
	@XmlElement(name = "codveiculomarca")
	private Integer codveiculomarca;

	public void setCodveiculomarca(Integer codveiculomarca)
	{
		this.codveiculomarca = codveiculomarca;
	}

	public Integer getCodveiculomarca()
	{
		return codveiculomarca;
	}

	@Column(name="CODVEICULOMODELO", nullable =  true , length = 11)
	@XmlElement(name = "codveiculomodelo")
	private Integer codveiculomodelo;

	public void setCodveiculomodelo(Integer codveiculomodelo)
	{
		this.codveiculomodelo = codveiculomodelo;
	}

	public Integer getCodveiculomodelo()
	{
		return codveiculomodelo;
	}

	@Column(name="CODVEICULOCOR", nullable =  true , length = 11)
	@XmlElement(name = "codveiculocor")
	private Integer codveiculocor;

	public void setCodveiculocor(Integer codveiculocor)
	{
		this.codveiculocor = codveiculocor;
	}

	public Integer getCodveiculocor()
	{
		return codveiculocor;
	}

	@Column(name="PES_VEI_ANO", nullable =  true , length = 4)
	@XmlElement(name = "veiAno")
	private String veiAno;

	public void setVeiAno(String veiAno)
	{
		this.veiAno = veiAno;
	}

	public String getVeiAno()
	{
		return veiAno;
	}

	@Column(name="PES_MES_REAJUSTE", nullable =  true , length = 10)
	@XmlElement(name = "mesReajuste")
	private String mesReajuste;

	public void setMesReajuste(String mesReajuste)
	{
		this.mesReajuste = mesReajuste;
	}

	public String getMesReajuste()
	{
		return mesReajuste;
	}

	@Column(name="PES_USUARIO", nullable =  true , length = 15)
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

	@Column(name="PES_SKYPE", nullable =  true , length = 30)
	@XmlElement(name = "skype")
	private String skype;

	public void setSkype(String skype)
	{
		this.skype = skype;
	}

	public String getSkype()
	{
		return skype;
	}

	@Column(name="PES_MSN", nullable =  true , length = 30)
	@XmlElement(name = "msn")
	private String msn;

	public void setMsn(String msn)
	{
		this.msn = msn;
	}

	public String getMsn()
	{
		return msn;
	}

	@Column(name="PES_PAYPAL", nullable =  true , length = 30)
	@XmlElement(name = "paypal")
	private String paypal;

	public void setPaypal(String paypal)
	{
		this.paypal = paypal;
	}

	public String getPaypal()
	{
		return paypal;
	}

	@Column(name="CODPAIS", nullable =  true , length = 11)
	@XmlElement(name = "codpais")
	private Integer codpais;

	public void setCodpais(Integer codpais)
	{
		this.codpais = codpais;
	}

	public Integer getCodpais()
	{
		return codpais;
	}

	@Column(name="PES_PROVINCIA", nullable =  true , length = 20)
	@XmlElement(name = "provincia")
	private String provincia;

	public void setProvincia(String provincia)
	{
		this.provincia = provincia;
	}

	public String getProvincia()
	{
		return provincia;
	}

	@Column(name="PES_NIVEL", nullable =  true , length = 11)
	@XmlElement(name = "nivel")
	private Integer nivel;

	public void setNivel(Integer nivel)
	{
		this.nivel = nivel;
	}

	public Integer getNivel()
	{
		return nivel;
	}

	@Column(name="PES_PONTOS", nullable =  true , length = 17)
	@XmlElement(name = "pontos")
	private Float pontos= 0f;

	public void setPontos(Float pontos)
	{
		this.pontos = pontos;
	}

	public Float getPontos()
	{
		return pontos;
	}

	@Column(name="PES_PONTOS_RECEBIDOS", nullable =  true , length = 17)
	@XmlElement(name = "pontosRecebidos")
	private Float pontosRecebidos= 0f;

	public void setPontosRecebidos(Float pontosRecebidos)
	{
		this.pontosRecebidos = pontosRecebidos;
	}

	public Float getPontosRecebidos()
	{
		return pontosRecebidos;
	}

	@Column(name="PES_COMISSAO_1", nullable =  true , length = 17)
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

	@Column(name="PES_COMISSAO_2", nullable =  true , length = 17)
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

	@Column(name="PES_COMISSAO_3", nullable =  true , length = 17)
	@XmlElement(name = "comissao3")
	private Float comissao3= 0f;

	public void setComissao3(Float comissao3)
	{
		this.comissao3 = comissao3;
	}

	public Float getComissao3()
	{
		return comissao3;
	}

	@Column(name="PES_COMISSAO_4", nullable =  true , length = 17)
	@XmlElement(name = "comissao4")
	private Float comissao4= 0f;

	public void setComissao4(Float comissao4)
	{
		this.comissao4 = comissao4;
	}

	public Float getComissao4()
	{
		return comissao4;
	}

	@Column(name="PES_COMISSAO_5", nullable =  true , length = 17)
	@XmlElement(name = "comissao5")
	private Float comissao5= 0f;

	public void setComissao5(Float comissao5)
	{
		this.comissao5 = comissao5;
	}

	public Float getComissao5()
	{
		return comissao5;
	}

	@Column(name="CODTRANSPORTADORA", nullable =  true , length = 11)
	@XmlElement(name = "codtransportadora")
	private Integer codtransportadora;

	public void setCodtransportadora(Integer codtransportadora)
	{
		this.codtransportadora = codtransportadora;
	}

	public Integer getCodtransportadora()
	{
		return codtransportadora;
	}

	@Column(name="PES_LOGIN", nullable =  true , length = 15)
	@XmlElement(name = "login")
	private String login;

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getLogin()
	{
		return login;
	}

	@Column(name="PES_SENHA", nullable =  true , length = 15)
	@XmlElement(name = "senha")
	private String senha;

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	public String getSenha()
	{
		return senha;
	}

	@Column(name="PES_FASE", nullable =  true , length = 30)
	@XmlElement(name = "fase")
	private String fase;

	public void setFase(String fase)
	{
		this.fase = fase;
	}

	public String getFase()
	{
		return fase;
	}

	@Column(name="CODPESSOAEMPRESA", nullable =  true , length = 11)
	@XmlElement(name = "codpessoaempresa")
	private Integer codpessoaempresa;

	public void setCodpessoaempresa(Integer codpessoaempresa)
	{
		this.codpessoaempresa = codpessoaempresa;
	}

	public Integer getCodpessoaempresa()
	{
		return codpessoaempresa;
	}

	@Column(name="CODCARGO", nullable =  true , length = 11)
	@XmlElement(name = "codcargo")
	private Integer codcargo;

	public void setCodcargo(Integer codcargo)
	{
		this.codcargo = codcargo;
	}

	public Integer getCodcargo()
	{
		return codcargo;
	}

	@Column(name="CODFORMAPAGAMENTO", nullable =  true , length = 11)
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

	@Column(name="CODROTAENTREGA", nullable =  true , length = 11)
	@XmlElement(name = "codrotaentrega")
	private Integer codrotaentrega;

	public void setCodrotaentrega(Integer codrotaentrega)
	{
		this.codrotaentrega = codrotaentrega;
	}

	public Integer getCodrotaentrega()
	{
		return codrotaentrega;
	}

	@Column(name="PES_ANIMAL_RACA", nullable =  true , length = 30)
	@XmlElement(name = "animalRaca")
	private String animalRaca;

	public void setAnimalRaca(String animalRaca)
	{
		this.animalRaca = animalRaca;
	}

	public String getAnimalRaca()
	{
		return animalRaca;
	}

	@Column(name="PES_ANIMAL_PROPRIETARIO", nullable =  true , length = 30)
	@XmlElement(name = "animalProprietario")
	private String animalProprietario;

	public void setAnimalProprietario(String animalProprietario)
	{
		this.animalProprietario = animalProprietario;
	}

	public String getAnimalProprietario()
	{
		return animalProprietario;
	}

	@Column(name="PES_ANIMAL_NOME_VETER", nullable =  true , length = 30)
	@XmlElement(name = "animalNomeVeter")
	private String animalNomeVeter;

	public void setAnimalNomeVeter(String animalNomeVeter)
	{
		this.animalNomeVeter = animalNomeVeter;
	}

	public String getAnimalNomeVeter()
	{
		return animalNomeVeter;
	}

	@Column(name="PES_ANIMAL_COR", nullable =  true , length = 30)
	@XmlElement(name = "animalCor")
	private String animalCor;

	public void setAnimalCor(String animalCor)
	{
		this.animalCor = animalCor;
	}

	public String getAnimalCor()
	{
		return animalCor;
	}

	@Column(name="PES_ANIMAL_RACAO", nullable =  true , length = 30)
	@XmlElement(name = "animalRacao")
	private String animalRacao;

	public void setAnimalRacao(String animalRacao)
	{
		this.animalRacao = animalRacao;
	}

	public String getAnimalRacao()
	{
		return animalRacao;
	}

	@Column(name="PES_ANIMAL", nullable =  true , length = 1)
	@XmlElement(name = "animal")
	private String animal;

	public void setAnimal(String animal)
	{
		this.animal = animal;
	}

	public String getAnimal()
	{
		return animal;
	}

	public void setAnimalBoolean(Boolean value)
	{
		if (value) {
			this.animal = "S";
		}
		else {
			this.animal = "N";
		}
	}
	public Boolean getAnimalBoolean()
	{
		return ((this.animal != null)&&(this.animal.equalsIgnoreCase("S")));
	}
	@Column(name="CODSOFTWARE", nullable =  true , length = 11)
	@XmlElement(name = "codsoftware")
	private Integer codsoftware;

	public void setCodsoftware(Integer codsoftware)
	{
		this.codsoftware = codsoftware;
	}

	public Integer getCodsoftware()
	{
		return codsoftware;
	}

	@Column(name="PES_CLASS_INSEMINADOR", nullable =  true , length = 1)
	@XmlElement(name = "classInseminador")
	private String classInseminador;

	public void setClassInseminador(String classInseminador)
	{
		this.classInseminador = classInseminador;
	}

	public String getClassInseminador()
	{
		return classInseminador;
	}

	public void setClassInseminadorBoolean(Boolean value)
	{
		if (value) {
			this.classInseminador = "S";
		}
		else {
			this.classInseminador = "N";
		}
	}
	public Boolean getClassInseminadorBoolean()
	{
		return ((this.classInseminador != null)&&(this.classInseminador.equalsIgnoreCase("S")));
	}
	@Column(name="PES_RESPONSAVEL_CPF", nullable =  true , length = 14)
	@XmlElement(name = "responsavelCpf")
	private String responsavelCpf;

	public void setResponsavelCpf(String responsavelCpf)
	{
		this.responsavelCpf = responsavelCpf;
	}

	public String getResponsavelCpf()
	{
		return responsavelCpf;
	}

	@Column(name="PES_RESPONSAVEL_NOME", nullable =  true , length = 60)
	@XmlElement(name = "responsavelNome")
	private String responsavelNome;

	public void setResponsavelNome(String responsavelNome)
	{
		this.responsavelNome = responsavelNome;
	}

	public String getResponsavelNome()
	{
		return responsavelNome;
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

	@Column(name="PES_DADOS_BANCARIOS", nullable =  true , length = 0)
	@XmlElement(name = "dadosBancarios")
	private Integer dadosBancarios;

	public void setDadosBancarios(Integer dadosBancarios)
	{
		this.dadosBancarios = dadosBancarios;
	}

	public Integer getDadosBancarios()
	{
		return dadosBancarios;
	}

	@Column(name="PES_DATA_DLL", nullable =  true , length = 19)
	@XmlElement(name = "dataDll")
	private java.sql.Timestamp dataDll;

	public void setDataDll(java.sql.Timestamp dataDll)
	{
		this.dataDll = dataDll;
	}

	public java.sql.Timestamp getDataDll()
	{
		return dataDll;
	}

	@Column(name="PES_CONSULTA_DLL", nullable =  true , length = 19)
	@XmlElement(name = "consultaDll")
	private java.sql.Timestamp consultaDll;

	public void setConsultaDll(java.sql.Timestamp consultaDll)
	{
		this.consultaDll = consultaDll;
	}

	public java.sql.Timestamp getConsultaDll()
	{
		return consultaDll;
	}

	@Column(name="PES_BAN_FAVORECIDO", nullable =  true , length = 50)
	@XmlElement(name = "banFavorecido")
	private String banFavorecido;

	public void setBanFavorecido(String banFavorecido)
	{
		this.banFavorecido = banFavorecido;
	}

	public String getBanFavorecido()
	{
		return banFavorecido;
	}

	@Column(name="PES_BAN_BANCO", nullable =  true , length = 15)
	@XmlElement(name = "banBanco")
	private String banBanco;

	public void setBanBanco(String banBanco)
	{
		this.banBanco = banBanco;
	}

	public String getBanBanco()
	{
		return banBanco;
	}

	@Column(name="PES_BAN_AGENCIA", nullable =  true , length = 10)
	@XmlElement(name = "banAgencia")
	private String banAgencia;

	public void setBanAgencia(String banAgencia)
	{
		this.banAgencia = banAgencia;
	}

	public String getBanAgencia()
	{
		return banAgencia;
	}

	@Column(name="PES_BAN_CONTA_CORRENTE", nullable =  true , length = 10)
	@XmlElement(name = "banContaCorrente")
	private String banContaCorrente;

	public void setBanContaCorrente(String banContaCorrente)
	{
		this.banContaCorrente = banContaCorrente;
	}

	public String getBanContaCorrente()
	{
		return banContaCorrente;
	}

	@Column(name="PES_BAN_CPFCNPJ_FAVORECIDO", nullable =  true , length = 18)
	@XmlElement(name = "banCpfcnpjFavorecido")
	private String banCpfcnpjFavorecido;

	public void setBanCpfcnpjFavorecido(String banCpfcnpjFavorecido)
	{
		this.banCpfcnpjFavorecido = banCpfcnpjFavorecido;
	}

	public String getBanCpfcnpjFavorecido()
	{
		return banCpfcnpjFavorecido;
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
	@Column(name="CODESCOLA", nullable =  true , length = 11)
	@XmlElement(name = "codescola")
	private Integer codescola;

	public void setCodescola(Integer codescola)
	{
		this.codescola = codescola;
	}

	public Integer getCodescola()
	{
		return codescola;
	}

	@Column(name="CODTRECHO", nullable =  true , length = 11)
	@XmlElement(name = "codtrecho")
	private Integer codtrecho;

	public void setCodtrecho(Integer codtrecho)
	{
		this.codtrecho = codtrecho;
	}

	public Integer getCodtrecho()
	{
		return codtrecho;
	}

	@Column(name="CODDEPARTAMENTO", nullable =  true , length = 11)
	@XmlElement(name = "coddepartamento")
	private Integer coddepartamento;

	public void setCoddepartamento(Integer coddepartamento)
	{
		this.coddepartamento = coddepartamento;
	}

	public Integer getCoddepartamento()
	{
		return coddepartamento;
	}

	@Column(name="PES_PRECO_06", nullable =  true , length = 1)
	@XmlElement(name = "preco06")
	private String preco06;

	public void setPreco06(String preco06)
	{
		this.preco06 = preco06;
	}

	public String getPreco06()
	{
		return preco06;
	}

	public void setPreco06Boolean(Boolean value)
	{
		if (value) {
			this.preco06 = "S";
		}
		else {
			this.preco06 = "N";
		}
	}
	public Boolean getPreco06Boolean()
	{
		return ((this.preco06 != null)&&(this.preco06.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PRECO_07", nullable =  true , length = 1)
	@XmlElement(name = "preco07")
	private String preco07;

	public void setPreco07(String preco07)
	{
		this.preco07 = preco07;
	}

	public String getPreco07()
	{
		return preco07;
	}

	public void setPreco07Boolean(Boolean value)
	{
		if (value) {
			this.preco07 = "S";
		}
		else {
			this.preco07 = "N";
		}
	}
	public Boolean getPreco07Boolean()
	{
		return ((this.preco07 != null)&&(this.preco07.equalsIgnoreCase("S")));
	}
	@Column(name="PES_PRECO_08", nullable =  true , length = 1)
	@XmlElement(name = "preco08")
	private String preco08;

	public void setPreco08(String preco08)
	{
		this.preco08 = preco08;
	}

	public String getPreco08()
	{
		return preco08;
	}

	public void setPreco08Boolean(Boolean value)
	{
		if (value) {
			this.preco08 = "S";
		}
		else {
			this.preco08 = "N";
		}
	}
	public Boolean getPreco08Boolean()
	{
		return ((this.preco08 != null)&&(this.preco08.equalsIgnoreCase("S")));
	}
	@Column(name="PES_SUBFORNECEDOR", nullable =  true , length = 1)
	@XmlElement(name = "subfornecedor")
	private String subfornecedor;

	public void setSubfornecedor(String subfornecedor)
	{
		this.subfornecedor = subfornecedor;
	}

	public String getSubfornecedor()
	{
		return subfornecedor;
	}

	public void setSubfornecedorBoolean(Boolean value)
	{
		if (value) {
			this.subfornecedor = "S";
		}
		else {
			this.subfornecedor = "N";
		}
	}
	public Boolean getSubfornecedorBoolean()
	{
		return ((this.subfornecedor != null)&&(this.subfornecedor.equalsIgnoreCase("S")));
	}
	@Column(name="CODCENTCUSTO", nullable =  true , length = 11)
	@XmlElement(name = "codcentcusto")
	private Integer codcentcusto;

	public void setCodcentcusto(Integer codcentcusto)
	{
		this.codcentcusto = codcentcusto;
	}

	public Integer getCodcentcusto()
	{
		return codcentcusto;
	}

	@Column(name="PES_EMAIL_NFE", nullable =  true , length = 60)
	@XmlElement(name = "emailNfe")
	private String emailNfe;

	public void setEmailNfe(String emailNfe)
	{
		this.emailNfe = emailNfe;
	}

	public String getEmailNfe()
	{
		return emailNfe;
	}

	@Column(name="PES_SISTEMA_EXCLUSIVO", nullable =  true , length = 15)
	@XmlElement(name = "sistemaExclusivo")
	private String sistemaExclusivo;

	public void setSistemaExclusivo(String sistemaExclusivo)
	{
		this.sistemaExclusivo = sistemaExclusivo;
	}

	public String getSistemaExclusivo()
	{
		return sistemaExclusivo;
	}

	@Column(name="PES_VERSAO", nullable =  true , length = 15)
	@XmlElement(name = "versao")
	private String versao;

	public void setVersao(String versao)
	{
		this.versao = versao;
	}

	public String getVersao()
	{
		return versao;
	}

	@Column(name="PES_PAFVERSAO", nullable =  true , length = 15)
	@XmlElement(name = "pafversao")
	private String pafversao;

	public void setPafversao(String pafversao)
	{
		this.pafversao = pafversao;
	}

	public String getPafversao()
	{
		return pafversao;
	}

	@Column(name="PES_ASO_PROPRIO", nullable =  true , length = 1)
	@XmlElement(name = "asoProprio")
	private String asoProprio;

	public void setAsoProprio(String asoProprio)
	{
		this.asoProprio = asoProprio;
	}

	public String getAsoProprio()
	{
		return asoProprio;
	}

	public void setAsoProprioBoolean(Boolean value)
	{
		if (value) {
			this.asoProprio = "S";
		}
		else {
			this.asoProprio = "N";
		}
	}
	public Boolean getAsoProprioBoolean()
	{
		return ((this.asoProprio != null)&&(this.asoProprio.equalsIgnoreCase("S")));
	}
	@Column(name="PES_RESPONSAVEL", nullable =  true , length = 30)
	@XmlElement(name = "responsavel")
	private String responsavel;

	public void setResponsavel(String responsavel)
	{
		this.responsavel = responsavel;
	}

	public String getResponsavel()
	{
		return responsavel;
	}

	@Column(name="PES_NATURALIDADE_UF", nullable =  true , length = 2)
	@XmlElement(name = "naturalidadeUf")
	private String naturalidadeUf;

	public void setNaturalidadeUf(String naturalidadeUf)
	{
		this.naturalidadeUf = naturalidadeUf;
	}

	public String getNaturalidadeUf()
	{
		return naturalidadeUf;
	}

	@Column(name="PES_ESCOLA_ANO", nullable =  true , length = 4)
	@XmlElement(name = "escolaAno")
	private String escolaAno;

	public void setEscolaAno(String escolaAno)
	{
		this.escolaAno = escolaAno;
	}

	public String getEscolaAno()
	{
		return escolaAno;
	}

	@Column(name="PES_ESCOLA_CIDADE", nullable =  true , length = 50)
	@XmlElement(name = "escolaCidade")
	private String escolaCidade;

	public void setEscolaCidade(String escolaCidade)
	{
		this.escolaCidade = escolaCidade;
	}

	public String getEscolaCidade()
	{
		return escolaCidade;
	}

	@Column(name="PES_ESCOLA_UF", nullable =  true , length = 2)
	@XmlElement(name = "escolaUf")
	private String escolaUf;

	public void setEscolaUf(String escolaUf)
	{
		this.escolaUf = escolaUf;
	}

	public String getEscolaUf()
	{
		return escolaUf;
	}

	@Column(name="PES_RG_ORGAO", nullable =  true , length = 20)
	@XmlElement(name = "rgOrgao")
	private String rgOrgao;

	public void setRgOrgao(String rgOrgao)
	{
		this.rgOrgao = rgOrgao;
	}

	public String getRgOrgao()
	{
		return rgOrgao;
	}

	@Column(name="PES_POPULAR", nullable =  true , length = 1)
	@XmlElement(name = "popular")
	private String popular;

	public void setPopular(String popular)
	{
		this.popular = popular;
	}

	public String getPopular()
	{
		return popular;
	}

	public void setPopularBoolean(Boolean value)
	{
		if (value) {
			this.popular = "S";
		}
		else {
			this.popular = "N";
		}
	}
	public Boolean getPopularBoolean()
	{
		return ((this.popular != null)&&(this.popular.equalsIgnoreCase("S")));
	}
	@Column(name="PES_MATRICULA", nullable =  true , length = 11)
	@XmlElement(name = "matricula")
	private Integer matricula;

	public void setMatricula(Integer matricula)
	{
		this.matricula = matricula;
	}

	public Integer getMatricula()
	{
		return matricula;
	}

	@Column(name="CODPRORHPERFILESCALA", nullable =  true , length = 11)
	@XmlElement(name = "codprorhperfilescala")
	private Integer codprorhperfilescala;

	public void setCodprorhperfilescala(Integer codprorhperfilescala)
	{
		this.codprorhperfilescala = codprorhperfilescala;
	}

	public Integer getCodprorhperfilescala()
	{
		return codprorhperfilescala;
	}

	@Column(name="PES_DT_TRABALHO", nullable =  true , length = 10)
	@XmlElement(name = "dtTrabalho")
	private java.sql.Timestamp dtTrabalho;

	public void setDtTrabalho(java.sql.Timestamp dtTrabalho)
	{
		this.dtTrabalho = dtTrabalho;
	}

	public java.sql.Timestamp getDtTrabalho()
	{
		return dtTrabalho;
	}

	@Column(name="CODPRORHESCALA", nullable =  true , length = 11)
	@XmlElement(name = "codprorhescala")
	private Integer codprorhescala;

	public void setCodprorhescala(Integer codprorhescala)
	{
		this.codprorhescala = codprorhescala;
	}

	public Integer getCodprorhescala()
	{
		return codprorhescala;
	}

	@Column(name="PES_GUIA_ALTURA", nullable =  true , length = 1)
	@XmlElement(name = "guiaAltura")
	private String guiaAltura;

	public void setGuiaAltura(String guiaAltura)
	{
		this.guiaAltura = guiaAltura;
	}

	public String getGuiaAltura()
	{
		return guiaAltura;
	}

	public void setGuiaAlturaBoolean(Boolean value)
	{
		if (value) {
			this.guiaAltura = "S";
		}
		else {
			this.guiaAltura = "N";
		}
	}
	public Boolean getGuiaAlturaBoolean()
	{
		return ((this.guiaAltura != null)&&(this.guiaAltura.equalsIgnoreCase("S")));
	}
	@Column(name="PES_GUIA_ALIMENTO", nullable =  true , length = 1)
	@XmlElement(name = "guiaAlimento")
	private String guiaAlimento;

	public void setGuiaAlimento(String guiaAlimento)
	{
		this.guiaAlimento = guiaAlimento;
	}

	public String getGuiaAlimento()
	{
		return guiaAlimento;
	}

	public void setGuiaAlimentoBoolean(Boolean value)
	{
		if (value) {
			this.guiaAlimento = "S";
		}
		else {
			this.guiaAlimento = "N";
		}
	}
	public Boolean getGuiaAlimentoBoolean()
	{
		return ((this.guiaAlimento != null)&&(this.guiaAlimento.equalsIgnoreCase("S")));
	}
	@Column(name="PES_GUIA_ELETRICIDADE", nullable =  true , length = 1)
	@XmlElement(name = "guiaEletricidade")
	private String guiaEletricidade;

	public void setGuiaEletricidade(String guiaEletricidade)
	{
		this.guiaEletricidade = guiaEletricidade;
	}

	public String getGuiaEletricidade()
	{
		return guiaEletricidade;
	}

	public void setGuiaEletricidadeBoolean(Boolean value)
	{
		if (value) {
			this.guiaEletricidade = "S";
		}
		else {
			this.guiaEletricidade = "N";
		}
	}
	public Boolean getGuiaEletricidadeBoolean()
	{
		return ((this.guiaEletricidade != null)&&(this.guiaEletricidade.equalsIgnoreCase("S")));
	}
}
