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
@Table(name = "PAR_GERAL")
@SequenceGenerator(name = "INC_PAR_GERAL", sequenceName = "GEN_PAR_GERAL")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "parGeral") 
public class ParGeral implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ParGeral() {	
	}

	@Id
	@Column(name="CODPARGERAL", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PAR_GERAL")
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

	@Column(name="PARG_EMPRESA", nullable =  false , length = 100)
	@XmlElement(name = "empresa")
	private String empresa;

	public void setEmpresa(String empresa)
	{
		this.empresa = empresa;
	}

	public String getEmpresa()
	{
		return empresa;
	}

	@Column(name="PARG_ENDERECO", nullable =  true , length = 150)
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

	@Column(name="PARG_BAIRRO", nullable =  true , length = 50)
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

	@Column(name="PARG_CIDADE", nullable =  true , length = 50)
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

	@Column(name="PARG_UF", nullable =  true , length = 2)
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

	@Column(name="PARG_CEP", nullable =  true , length = 10)
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

	@Column(name="PARG_TELEFONE", nullable =  true , length = 55)
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

	@Column(name="PARG_CPFCGC", nullable =  true , length = 20)
	@XmlElement(name = "cpfcgc")
	private String cpfcgc;

	public void setCpfcgc(String cpfcgc)
	{
		this.cpfcgc = cpfcgc;
	}

	public String getCpfcgc()
	{
		return cpfcgc;
	}

	@Column(name="PARG_IE", nullable =  true , length = 20)
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

	@Column(name="PARG_FIGURA", nullable =  true , length = 200)
	@XmlElement(name = "figura")
	private String figura;

	public void setFigura(String figura)
	{
		this.figura = figura;
	}

	public String getFigura()
	{
		return figura;
	}

	@Column(name="PARG_ATUALIZACAO", nullable =  true , length = 11)
	@XmlElement(name = "atualizacao")
	private Integer atualizacao;

	public void setAtualizacao(Integer atualizacao)
	{
		this.atualizacao = atualizacao;
	}

	public Integer getAtualizacao()
	{
		return atualizacao;
	}

	@Column(name="PARG_LOGO_REL", nullable =  true , length = 200)
	@XmlElement(name = "logoRel")
	private String logoRel;

	public void setLogoRel(String logoRel)
	{
		this.logoRel = logoRel;
	}

	public String getLogoRel()
	{
		return logoRel;
	}

	@Column(name="PARG_IM", nullable =  true , length = 30)
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

	@Column(name="PARG_EMAIL_NOME", nullable =  true , length = 60)
	@XmlElement(name = "emailNome")
	private String emailNome;

	public void setEmailNome(String emailNome)
	{
		this.emailNome = emailNome;
	}

	public String getEmailNome()
	{
		return emailNome;
	}

	@Column(name="PARG_EMAIL", nullable =  true , length = 40)
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

	@Column(name="PARG_EMAIL_LOGIN", nullable =  true , length = 40)
	@XmlElement(name = "emailLogin")
	private String emailLogin;

	public void setEmailLogin(String emailLogin)
	{
		this.emailLogin = emailLogin;
	}

	public String getEmailLogin()
	{
		return emailLogin;
	}

	@Column(name="PARG_EMAIL_SENHA", nullable =  true , length = 20)
	@XmlElement(name = "emailSenha")
	private String emailSenha;

	public void setEmailSenha(String emailSenha)
	{
		this.emailSenha = emailSenha;
	}

	public String getEmailSenha()
	{
		return emailSenha;
	}

	@Column(name="PARG_EMAIL_SMTP", nullable =  true , length = 60)
	@XmlElement(name = "emailSmtp")
	private String emailSmtp;

	public void setEmailSmtp(String emailSmtp)
	{
		this.emailSmtp = emailSmtp;
	}

	public String getEmailSmtp()
	{
		return emailSmtp;
	}

	@Column(name="PARG_EMAIL_PORT", nullable =  true , length = 11)
	@XmlElement(name = "emailPort")
	private Integer emailPort;

	public void setEmailPort(Integer emailPort)
	{
		this.emailPort = emailPort;
	}

	public Integer getEmailPort()
	{
		return emailPort;
	}

	@Column(name="PARG_EMAIL_SSL", nullable =  true , length = 1)
	@XmlElement(name = "emailSsl")
	private String emailSsl;

	public void setEmailSsl(String emailSsl)
	{
		this.emailSsl = emailSsl;
	}

	public String getEmailSsl()
	{
		return emailSsl;
	}

	public void setEmailSslBoolean(Boolean value)
	{
		if (value) {
			this.emailSsl = "S";
		}
		else {
			this.emailSsl = "N";
		}
	}
	public Boolean getEmailSslBoolean()
	{
		return ((this.emailSsl != null)&&(this.emailSsl.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_SITE", nullable =  true , length = 60)
	@XmlElement(name = "site")
	private String site;

	public void setSite(String site)
	{
		this.site = site;
	}

	public String getSite()
	{
		return site;
	}

	@Column(name="PARG_RAZAOSOCIAL", nullable =  true , length = 100)
	@XmlElement(name = "razaosocial")
	private String razaosocial;

	public void setRazaosocial(String razaosocial)
	{
		this.razaosocial = razaosocial;
	}

	public String getRazaosocial()
	{
		return razaosocial;
	}

	@Column(name="PARG_NUMERO", nullable =  true , length = 10)
	@XmlElement(name = "numero")
	private String numero;

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getNumero()
	{
		return numero;
	}

	@Column(name="PARG_COMPLEMENTO", nullable =  true , length = 100)
	@XmlElement(name = "complemento")
	private String complemento;

	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}

	public String getComplemento()
	{
		return complemento;
	}

	@Column(name="PARG_CODCIDADE", nullable =  true , length = 10)
	@XmlElement(name = "codcidade")
	private String codcidade;

	public void setCodcidade(String codcidade)
	{
		this.codcidade = codcidade;
	}

	public String getCodcidade()
	{
		return codcidade;
	}

	@Column(name="PARG_NFE", nullable =  true , length = 1)
	@XmlElement(name = "nfe")
	private String nfe;

	public void setNfe(String nfe)
	{
		this.nfe = nfe;
	}

	public String getNfe()
	{
		return nfe;
	}

	public void setNfeBoolean(Boolean value)
	{
		if (value) {
			this.nfe = "S";
		}
		else {
			this.nfe = "N";
		}
	}
	public Boolean getNfeBoolean()
	{
		return ((this.nfe != null)&&(this.nfe.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_NFE_CERT_CAMINHO", nullable =  true , length = 200)
	@XmlElement(name = "nfeCertCaminho")
	private String nfeCertCaminho;

	public void setNfeCertCaminho(String nfeCertCaminho)
	{
		this.nfeCertCaminho = nfeCertCaminho;
	}

	public String getNfeCertCaminho()
	{
		return nfeCertCaminho;
	}

	@Column(name="PARG_NFE_CERT_NR", nullable =  true , length = 50)
	@XmlElement(name = "nfeCertNr")
	private String nfeCertNr;

	public void setNfeCertNr(String nfeCertNr)
	{
		this.nfeCertNr = nfeCertNr;
	}

	public String getNfeCertNr()
	{
		return nfeCertNr;
	}

	@Column(name="PARG_NFE_CERT_SENHA", nullable =  true , length = 20)
	@XmlElement(name = "nfeCertSenha")
	private String nfeCertSenha;

	public void setNfeCertSenha(String nfeCertSenha)
	{
		this.nfeCertSenha = nfeCertSenha;
	}

	public String getNfeCertSenha()
	{
		return nfeCertSenha;
	}

	@Column(name="PARG_NFE_DANFE", nullable =  true , length = 1)
	@XmlElement(name = "nfeDanfe")
	private String nfeDanfe;

	public void setNfeDanfe(String nfeDanfe)
	{
		this.nfeDanfe = nfeDanfe;
	}

	public String getNfeDanfe()
	{
		return nfeDanfe;
	}

	public void setNfeDanfeBoolean(Boolean value)
	{
		if (value) {
			this.nfeDanfe = "S";
		}
		else {
			this.nfeDanfe = "N";
		}
	}
	public Boolean getNfeDanfeBoolean()
	{
		return ((this.nfeDanfe != null)&&(this.nfeDanfe.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_NFE_FE", nullable =  true , length = 1)
	@XmlElement(name = "nfeFe")
	private String nfeFe;

	public void setNfeFe(String nfeFe)
	{
		this.nfeFe = nfeFe;
	}

	public String getNfeFe()
	{
		return nfeFe;
	}

	public void setNfeFeBoolean(Boolean value)
	{
		if (value) {
			this.nfeFe = "S";
		}
		else {
			this.nfeFe = "N";
		}
	}
	public Boolean getNfeFeBoolean()
	{
		return ((this.nfeFe != null)&&(this.nfeFe.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_NFE_LOG", nullable =  true , length = 200)
	@XmlElement(name = "nfeLog")
	private String nfeLog;

	public void setNfeLog(String nfeLog)
	{
		this.nfeLog = nfeLog;
	}

	public String getNfeLog()
	{
		return nfeLog;
	}

	@Column(name="PARG_NFE_LOGO", nullable =  true , length = 1)
	@XmlElement(name = "nfeLogo")
	private String nfeLogo;

	public void setNfeLogo(String nfeLogo)
	{
		this.nfeLogo = nfeLogo;
	}

	public String getNfeLogo()
	{
		return nfeLogo;
	}

	public void setNfeLogoBoolean(Boolean value)
	{
		if (value) {
			this.nfeLogo = "S";
		}
		else {
			this.nfeLogo = "N";
		}
	}
	public Boolean getNfeLogoBoolean()
	{
		return ((this.nfeLogo != null)&&(this.nfeLogo.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_NFE_WS_UF", nullable =  true , length = 2)
	@XmlElement(name = "nfeWsUf")
	private String nfeWsUf;

	public void setNfeWsUf(String nfeWsUf)
	{
		this.nfeWsUf = nfeWsUf;
	}

	public String getNfeWsUf()
	{
		return nfeWsUf;
	}

	@Column(name="PARG_NFE_WS_AMBIENTE", nullable =  true , length = 1)
	@XmlElement(name = "nfeWsAmbiente")
	private String nfeWsAmbiente;

	public void setNfeWsAmbiente(String nfeWsAmbiente)
	{
		this.nfeWsAmbiente = nfeWsAmbiente;
	}

	public String getNfeWsAmbiente()
	{
		return nfeWsAmbiente;
	}

	public void setNfeWsAmbienteBoolean(Boolean value)
	{
		if (value) {
			this.nfeWsAmbiente = "S";
		}
		else {
			this.nfeWsAmbiente = "N";
		}
	}
	public Boolean getNfeWsAmbienteBoolean()
	{
		return ((this.nfeWsAmbiente != null)&&(this.nfeWsAmbiente.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_NFE_PROXY_HOST", nullable =  true , length = 20)
	@XmlElement(name = "nfeProxyHost")
	private String nfeProxyHost;

	public void setNfeProxyHost(String nfeProxyHost)
	{
		this.nfeProxyHost = nfeProxyHost;
	}

	public String getNfeProxyHost()
	{
		return nfeProxyHost;
	}

	@Column(name="PARG_NFE_PROXY_PORTA", nullable =  true , length = 11)
	@XmlElement(name = "nfeProxyPorta")
	private Integer nfeProxyPorta;

	public void setNfeProxyPorta(Integer nfeProxyPorta)
	{
		this.nfeProxyPorta = nfeProxyPorta;
	}

	public Integer getNfeProxyPorta()
	{
		return nfeProxyPorta;
	}

	@Column(name="PARG_NFE_PROXY_USER", nullable =  true , length = 30)
	@XmlElement(name = "nfeProxyUser")
	private String nfeProxyUser;

	public void setNfeProxyUser(String nfeProxyUser)
	{
		this.nfeProxyUser = nfeProxyUser;
	}

	public String getNfeProxyUser()
	{
		return nfeProxyUser;
	}

	@Column(name="PARG_NFE_PROXY_PASSWORD", nullable =  true , length = 30)
	@XmlElement(name = "nfeProxyPassword")
	private String nfeProxyPassword;

	public void setNfeProxyPassword(String nfeProxyPassword)
	{
		this.nfeProxyPassword = nfeProxyPassword;
	}

	public String getNfeProxyPassword()
	{
		return nfeProxyPassword;
	}

	@Column(name="PARG_VERSAO", nullable =  true , length = 15)
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

	@Column(name="PARG_OPCAO_TRIBUTARIA", nullable =  true , length = 25)
	@XmlElement(name = "opcaoTributaria")
	private String opcaoTributaria;

	public void setOpcaoTributaria(String opcaoTributaria)
	{
		this.opcaoTributaria = opcaoTributaria;
	}

	public String getOpcaoTributaria()
	{
		return opcaoTributaria;
	}

	@Column(name="PARG_SEGMENTO", nullable =  true , length = 15)
	@XmlElement(name = "segmento")
	private String segmento;

	public void setSegmento(String segmento)
	{
		this.segmento = segmento;
	}

	public String getSegmento()
	{
		return segmento;
	}

	@Column(name="PARG_SISTEMA_EXCLUSIVO", nullable =  true , length = 15)
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

	@Column(name="PARG_ENVIAR_EMAIL_ERRO", nullable =  true , length = 1)
	@XmlElement(name = "enviarEmailErro")
	private String enviarEmailErro;

	public void setEnviarEmailErro(String enviarEmailErro)
	{
		this.enviarEmailErro = enviarEmailErro;
	}

	public String getEnviarEmailErro()
	{
		return enviarEmailErro;
	}

	public void setEnviarEmailErroBoolean(Boolean value)
	{
		if (value) {
			this.enviarEmailErro = "S";
		}
		else {
			this.enviarEmailErro = "N";
		}
	}
	public Boolean getEnviarEmailErroBoolean()
	{
		return ((this.enviarEmailErro != null)&&(this.enviarEmailErro.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_CONSULTA_DLL", nullable =  true , length = 19)
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

	@Column(name="PARG_ENDERECO_PASTA_ARQUIVOS", nullable =  true , length = 255)
	@XmlElement(name = "enderecoPastaArquivos")
	private String enderecoPastaArquivos;

	public void setEnderecoPastaArquivos(String enderecoPastaArquivos)
	{
		this.enderecoPastaArquivos = enderecoPastaArquivos;
	}

	public String getEnderecoPastaArquivos()
	{
		return enderecoPastaArquivos;
	}

	@Column(name="PARG_PAFVERSAO", nullable =  true , length = 15)
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

	@Column(name="PARG_PLC_TX_SUP_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcTxSupPer")
	private Float plcTxSupPer= 0f;

	public void setPlcTxSupPer(Float plcTxSupPer)
	{
		this.plcTxSupPer = plcTxSupPer;
	}

	public Float getPlcTxSupPer()
	{
		return plcTxSupPer;
	}

	@Column(name="PARG_PLC_TX_SUP_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcTxSupAlt")
	private String plcTxSupAlt;

	public void setPlcTxSupAlt(String plcTxSupAlt)
	{
		this.plcTxSupAlt = plcTxSupAlt;
	}

	public String getPlcTxSupAlt()
	{
		return plcTxSupAlt;
	}

	public void setPlcTxSupAltBoolean(Boolean value)
	{
		if (value) {
			this.plcTxSupAlt = "S";
		}
		else {
			this.plcTxSupAlt = "N";
		}
	}
	public Boolean getPlcTxSupAltBoolean()
	{
		return ((this.plcTxSupAlt != null)&&(this.plcTxSupAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_TX_ADM_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcTxAdmPer")
	private Float plcTxAdmPer= 0f;

	public void setPlcTxAdmPer(Float plcTxAdmPer)
	{
		this.plcTxAdmPer = plcTxAdmPer;
	}

	public Float getPlcTxAdmPer()
	{
		return plcTxAdmPer;
	}

	@Column(name="PARG_PLC_TX_ADM_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcTxAdmAlt")
	private String plcTxAdmAlt;

	public void setPlcTxAdmAlt(String plcTxAdmAlt)
	{
		this.plcTxAdmAlt = plcTxAdmAlt;
	}

	public String getPlcTxAdmAlt()
	{
		return plcTxAdmAlt;
	}

	public void setPlcTxAdmAltBoolean(Boolean value)
	{
		if (value) {
			this.plcTxAdmAlt = "S";
		}
		else {
			this.plcTxAdmAlt = "N";
		}
	}
	public Boolean getPlcTxAdmAltBoolean()
	{
		return ((this.plcTxAdmAlt != null)&&(this.plcTxAdmAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_TX_COM_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcTxComPer")
	private Float plcTxComPer= 0f;

	public void setPlcTxComPer(Float plcTxComPer)
	{
		this.plcTxComPer = plcTxComPer;
	}

	public Float getPlcTxComPer()
	{
		return plcTxComPer;
	}

	@Column(name="PARG_PLC_TX_COM_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcTxComAlt")
	private String plcTxComAlt;

	public void setPlcTxComAlt(String plcTxComAlt)
	{
		this.plcTxComAlt = plcTxComAlt;
	}

	public String getPlcTxComAlt()
	{
		return plcTxComAlt;
	}

	public void setPlcTxComAltBoolean(Boolean value)
	{
		if (value) {
			this.plcTxComAlt = "S";
		}
		else {
			this.plcTxComAlt = "N";
		}
	}
	public Boolean getPlcTxComAltBoolean()
	{
		return ((this.plcTxComAlt != null)&&(this.plcTxComAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_OT_PRV_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcOtPrvPer")
	private Float plcOtPrvPer= 0f;

	public void setPlcOtPrvPer(Float plcOtPrvPer)
	{
		this.plcOtPrvPer = plcOtPrvPer;
	}

	public Float getPlcOtPrvPer()
	{
		return plcOtPrvPer;
	}

	@Column(name="PARG_PLC_OT_PRV_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcOtPrvAlt")
	private String plcOtPrvAlt;

	public void setPlcOtPrvAlt(String plcOtPrvAlt)
	{
		this.plcOtPrvAlt = plcOtPrvAlt;
	}

	public String getPlcOtPrvAlt()
	{
		return plcOtPrvAlt;
	}

	public void setPlcOtPrvAltBoolean(Boolean value)
	{
		if (value) {
			this.plcOtPrvAlt = "S";
		}
		else {
			this.plcOtPrvAlt = "N";
		}
	}
	public Boolean getPlcOtPrvAltBoolean()
	{
		return ((this.plcOtPrvAlt != null)&&(this.plcOtPrvAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_OT_CON_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcOtConPer")
	private Float plcOtConPer= 0f;

	public void setPlcOtConPer(Float plcOtConPer)
	{
		this.plcOtConPer = plcOtConPer;
	}

	public Float getPlcOtConPer()
	{
		return plcOtConPer;
	}

	@Column(name="PARG_PLC_OT_CON_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcOtConAlt")
	private String plcOtConAlt;

	public void setPlcOtConAlt(String plcOtConAlt)
	{
		this.plcOtConAlt = plcOtConAlt;
	}

	public String getPlcOtConAlt()
	{
		return plcOtConAlt;
	}

	public void setPlcOtConAltBoolean(Boolean value)
	{
		if (value) {
			this.plcOtConAlt = "S";
		}
		else {
			this.plcOtConAlt = "N";
		}
	}
	public Boolean getPlcOtConAltBoolean()
	{
		return ((this.plcOtConAlt != null)&&(this.plcOtConAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_OT_COM_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcOtComPer")
	private Float plcOtComPer= 0f;

	public void setPlcOtComPer(Float plcOtComPer)
	{
		this.plcOtComPer = plcOtComPer;
	}

	public Float getPlcOtComPer()
	{
		return plcOtComPer;
	}

	@Column(name="PARG_PLC_OT_COM_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcOtComAlt")
	private String plcOtComAlt;

	public void setPlcOtComAlt(String plcOtComAlt)
	{
		this.plcOtComAlt = plcOtComAlt;
	}

	public String getPlcOtComAlt()
	{
		return plcOtComAlt;
	}

	public void setPlcOtComAltBoolean(Boolean value)
	{
		if (value) {
			this.plcOtComAlt = "S";
		}
		else {
			this.plcOtComAlt = "N";
		}
	}
	public Boolean getPlcOtComAltBoolean()
	{
		return ((this.plcOtComAlt != null)&&(this.plcOtComAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_OT_ONU_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcOtOnuPer")
	private Float plcOtOnuPer= 0f;

	public void setPlcOtOnuPer(Float plcOtOnuPer)
	{
		this.plcOtOnuPer = plcOtOnuPer;
	}

	public Float getPlcOtOnuPer()
	{
		return plcOtOnuPer;
	}

	@Column(name="PARG_PLC_OT_ONU_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcOtOnuAlt")
	private String plcOtOnuAlt;

	public void setPlcOtOnuAlt(String plcOtOnuAlt)
	{
		this.plcOtOnuAlt = plcOtOnuAlt;
	}

	public String getPlcOtOnuAlt()
	{
		return plcOtOnuAlt;
	}

	public void setPlcOtOnuAltBoolean(Boolean value)
	{
		if (value) {
			this.plcOtOnuAlt = "S";
		}
		else {
			this.plcOtOnuAlt = "N";
		}
	}
	public Boolean getPlcOtOnuAltBoolean()
	{
		return ((this.plcOtOnuAlt != null)&&(this.plcOtOnuAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_OT_MNG_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcOtMngPer")
	private Float plcOtMngPer= 0f;

	public void setPlcOtMngPer(Float plcOtMngPer)
	{
		this.plcOtMngPer = plcOtMngPer;
	}

	public Float getPlcOtMngPer()
	{
		return plcOtMngPer;
	}

	@Column(name="PARG_PLC_OT_MNG_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcOtMngAlt")
	private String plcOtMngAlt;

	public void setPlcOtMngAlt(String plcOtMngAlt)
	{
		this.plcOtMngAlt = plcOtMngAlt;
	}

	public String getPlcOtMngAlt()
	{
		return plcOtMngAlt;
	}

	public void setPlcOtMngAltBoolean(Boolean value)
	{
		if (value) {
			this.plcOtMngAlt = "S";
		}
		else {
			this.plcOtMngAlt = "N";
		}
	}
	public Boolean getPlcOtMngAltBoolean()
	{
		return ((this.plcOtMngAlt != null)&&(this.plcOtMngAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_OT_MLC_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcOtMlcPer")
	private Float plcOtMlcPer= 0f;

	public void setPlcOtMlcPer(Float plcOtMlcPer)
	{
		this.plcOtMlcPer = plcOtMlcPer;
	}

	public Float getPlcOtMlcPer()
	{
		return plcOtMlcPer;
	}

	@Column(name="PARG_PLC_OT_MLC_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcOtMlcAlt")
	private String plcOtMlcAlt;

	public void setPlcOtMlcAlt(String plcOtMlcAlt)
	{
		this.plcOtMlcAlt = plcOtMlcAlt;
	}

	public String getPlcOtMlcAlt()
	{
		return plcOtMlcAlt;
	}

	public void setPlcOtMlcAltBoolean(Boolean value)
	{
		if (value) {
			this.plcOtMlcAlt = "S";
		}
		else {
			this.plcOtMlcAlt = "N";
		}
	}
	public Boolean getPlcOtMlcAltBoolean()
	{
		return ((this.plcOtMlcAlt != null)&&(this.plcOtMlcAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_IRL_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImIrlPer")
	private Float plcImIrlPer= 0f;

	public void setPlcImIrlPer(Float plcImIrlPer)
	{
		this.plcImIrlPer = plcImIrlPer;
	}

	public Float getPlcImIrlPer()
	{
		return plcImIrlPer;
	}

	@Column(name="PARG_PLC_IM_IRL_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImIrlAlt")
	private String plcImIrlAlt;

	public void setPlcImIrlAlt(String plcImIrlAlt)
	{
		this.plcImIrlAlt = plcImIrlAlt;
	}

	public String getPlcImIrlAlt()
	{
		return plcImIrlAlt;
	}

	public void setPlcImIrlAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImIrlAlt = "S";
		}
		else {
			this.plcImIrlAlt = "N";
		}
	}
	public Boolean getPlcImIrlAltBoolean()
	{
		return ((this.plcImIrlAlt != null)&&(this.plcImIrlAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_CSL_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImCslPer")
	private Float plcImCslPer= 0f;

	public void setPlcImCslPer(Float plcImCslPer)
	{
		this.plcImCslPer = plcImCslPer;
	}

	public Float getPlcImCslPer()
	{
		return plcImCslPer;
	}

	@Column(name="PARG_PLC_IM_CSL_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImCslAlt")
	private String plcImCslAlt;

	public void setPlcImCslAlt(String plcImCslAlt)
	{
		this.plcImCslAlt = plcImCslAlt;
	}

	public String getPlcImCslAlt()
	{
		return plcImCslAlt;
	}

	public void setPlcImCslAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImCslAlt = "S";
		}
		else {
			this.plcImCslAlt = "N";
		}
	}
	public Boolean getPlcImCslAltBoolean()
	{
		return ((this.plcImCslAlt != null)&&(this.plcImCslAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_IRC_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImIrcPer")
	private Float plcImIrcPer= 0f;

	public void setPlcImIrcPer(Float plcImIrcPer)
	{
		this.plcImIrcPer = plcImIrcPer;
	}

	public Float getPlcImIrcPer()
	{
		return plcImIrcPer;
	}

	@Column(name="PARG_PLC_IM_IRC_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImIrcAlt")
	private String plcImIrcAlt;

	public void setPlcImIrcAlt(String plcImIrcAlt)
	{
		this.plcImIrcAlt = plcImIrcAlt;
	}

	public String getPlcImIrcAlt()
	{
		return plcImIrcAlt;
	}

	public void setPlcImIrcAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImIrcAlt = "S";
		}
		else {
			this.plcImIrcAlt = "N";
		}
	}
	public Boolean getPlcImIrcAltBoolean()
	{
		return ((this.plcImIrcAlt != null)&&(this.plcImIrcAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_CPM_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImCpmPer")
	private Float plcImCpmPer= 0f;

	public void setPlcImCpmPer(Float plcImCpmPer)
	{
		this.plcImCpmPer = plcImCpmPer;
	}

	public Float getPlcImCpmPer()
	{
		return plcImCpmPer;
	}

	@Column(name="PARG_PLC_IM_CPM_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImCpmAlt")
	private String plcImCpmAlt;

	public void setPlcImCpmAlt(String plcImCpmAlt)
	{
		this.plcImCpmAlt = plcImCpmAlt;
	}

	public String getPlcImCpmAlt()
	{
		return plcImCpmAlt;
	}

	public void setPlcImCpmAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImCpmAlt = "S";
		}
		else {
			this.plcImCpmAlt = "N";
		}
	}
	public Boolean getPlcImCpmAltBoolean()
	{
		return ((this.plcImCpmAlt != null)&&(this.plcImCpmAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_ISS_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImIssPer")
	private Float plcImIssPer= 0f;

	public void setPlcImIssPer(Float plcImIssPer)
	{
		this.plcImIssPer = plcImIssPer;
	}

	public Float getPlcImIssPer()
	{
		return plcImIssPer;
	}

	@Column(name="PARG_PLC_IM_ISS_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImIssAlt")
	private String plcImIssAlt;

	public void setPlcImIssAlt(String plcImIssAlt)
	{
		this.plcImIssAlt = plcImIssAlt;
	}

	public String getPlcImIssAlt()
	{
		return plcImIssAlt;
	}

	public void setPlcImIssAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImIssAlt = "S";
		}
		else {
			this.plcImIssAlt = "N";
		}
	}
	public Boolean getPlcImIssAltBoolean()
	{
		return ((this.plcImIssAlt != null)&&(this.plcImIssAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_PIS_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImPisPer")
	private Float plcImPisPer= 0f;

	public void setPlcImPisPer(Float plcImPisPer)
	{
		this.plcImPisPer = plcImPisPer;
	}

	public Float getPlcImPisPer()
	{
		return plcImPisPer;
	}

	@Column(name="PARG_PLC_IM_PIS_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImPisAlt")
	private String plcImPisAlt;

	public void setPlcImPisAlt(String plcImPisAlt)
	{
		this.plcImPisAlt = plcImPisAlt;
	}

	public String getPlcImPisAlt()
	{
		return plcImPisAlt;
	}

	public void setPlcImPisAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImPisAlt = "S";
		}
		else {
			this.plcImPisAlt = "N";
		}
	}
	public Boolean getPlcImPisAltBoolean()
	{
		return ((this.plcImPisAlt != null)&&(this.plcImPisAlt.equalsIgnoreCase("S")));
	}
	@Column(name="PARG_PLC_IM_COF_PER", nullable =  true , length = 17)
	@XmlElement(name = "plcImCofPer")
	private Float plcImCofPer= 0f;

	public void setPlcImCofPer(Float plcImCofPer)
	{
		this.plcImCofPer = plcImCofPer;
	}

	public Float getPlcImCofPer()
	{
		return plcImCofPer;
	}

	@Column(name="PARG_PLC_IM_COF_ALT", nullable =  true , length = 1)
	@XmlElement(name = "plcImCofAlt")
	private String plcImCofAlt;

	public void setPlcImCofAlt(String plcImCofAlt)
	{
		this.plcImCofAlt = plcImCofAlt;
	}

	public String getPlcImCofAlt()
	{
		return plcImCofAlt;
	}

	public void setPlcImCofAltBoolean(Boolean value)
	{
		if (value) {
			this.plcImCofAlt = "S";
		}
		else {
			this.plcImCofAlt = "N";
		}
	}
	public Boolean getPlcImCofAltBoolean()
	{
		return ((this.plcImCofAlt != null)&&(this.plcImCofAlt.equalsIgnoreCase("S")));
	}
}
