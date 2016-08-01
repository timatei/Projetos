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
@Table(name = "CONTAS")
@SequenceGenerator(name = "INC_CONTAS", sequenceName = "GEN_CONTAS")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "contas") 
public class Contas implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Contas() {	
	}

	@Id
	@Column(name="CODCONTA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_CONTAS")
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

	@Column(name="CON_TIPO", nullable =  false , length = 3)
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

	@Column(name="CON_STATUS", nullable =  false , length = 8)
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

	@Column(name="CON_NUMDOC", nullable =  false , length = 10)
	@XmlElement(name = "numdoc")
	private String numdoc;

	public void setNumdoc(String numdoc)
	{
		this.numdoc = numdoc;
	}

	public String getNumdoc()
	{
		return numdoc;
	}

	@Column(name="CON_PARCELA", nullable =  false , length = 5)
	@XmlElement(name = "parcela")
	private String parcela;

	public void setParcela(String parcela)
	{
		this.parcela = parcela;
	}

	public String getParcela()
	{
		return parcela;
	}

	@Column(name="CON_DTENTR", nullable =  false , length = 10)
	@XmlElement(name = "dtentr")
	private java.sql.Timestamp dtentr;

	public void setDtentr(java.sql.Timestamp dtentr)
	{
		this.dtentr = dtentr;
	}

	public java.sql.Timestamp getDtentr()
	{
		return dtentr;
	}

	@Column(name="CON_DTEMIS", nullable =  false , length = 10)
	@XmlElement(name = "dtemis")
	private java.sql.Timestamp dtemis;

	public void setDtemis(java.sql.Timestamp dtemis)
	{
		this.dtemis = dtemis;
	}

	public java.sql.Timestamp getDtemis()
	{
		return dtemis;
	}

	@Column(name="CON_DTVENC", nullable =  false , length = 10)
	@XmlElement(name = "dtvenc")
	private java.sql.Timestamp dtvenc;

	public void setDtvenc(java.sql.Timestamp dtvenc)
	{
		this.dtvenc = dtvenc;
	}

	public java.sql.Timestamp getDtvenc()
	{
		return dtvenc;
	}

	@Column(name="CODPESSOA", nullable =  false , length = 11)
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

	@Column(name="CON_DESC_VLR", nullable =  true , length = 17)
	@XmlElement(name = "descVlr")
	private Float descVlr= 0f;

	public void setDescVlr(Float descVlr)
	{
		this.descVlr = descVlr;
	}

	public Float getDescVlr()
	{
		return descVlr;
	}

	@Column(name="CON_ACRES_VLR", nullable =  true , length = 17)
	@XmlElement(name = "acresVlr")
	private Float acresVlr= 0f;

	public void setAcresVlr(Float acresVlr)
	{
		this.acresVlr = acresVlr;
	}

	public Float getAcresVlr()
	{
		return acresVlr;
	}

	@Column(name="CON_JUROS_VLR", nullable =  true , length = 17)
	@XmlElement(name = "jurosVlr")
	private Float jurosVlr= 0f;

	public void setJurosVlr(Float jurosVlr)
	{
		this.jurosVlr = jurosVlr;
	}

	public Float getJurosVlr()
	{
		return jurosVlr;
	}

	@Column(name="CON_DESC_IMPOSTOS", nullable =  true , length = 17)
	@XmlElement(name = "descImpostos")
	private Float descImpostos= 0f;

	public void setDescImpostos(Float descImpostos)
	{
		this.descImpostos = descImpostos;
	}

	public Float getDescImpostos()
	{
		return descImpostos;
	}

	@Column(name="CON_VLRPARCELA", nullable =  true , length = 17)
	@XmlElement(name = "vlrparcela")
	private Float vlrparcela= 0f;

	public void setVlrparcela(Float vlrparcela)
	{
		this.vlrparcela = vlrparcela;
	}

	public Float getVlrparcela()
	{
		return vlrparcela;
	}

	@Column(name="CON_VLRTOTAL", nullable =  true , length = 17)
	@XmlElement(name = "vlrtotal")
	private Float vlrtotal= 0f;

	public void setVlrtotal(Float vlrtotal)
	{
		this.vlrtotal = vlrtotal;
	}

	public Float getVlrtotal()
	{
		return vlrtotal;
	}

	@Column(name="CON_VLRPAGO", nullable =  true , length = 17)
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

	@Column(name="CON_OBS", nullable =  true , length = 150)
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

	@Column(name="CODNFVENDA", nullable =  true , length = 11)
	@XmlElement(name = "codnfvenda")
	private Integer codnfvenda;

	public void setCodnfvenda(Integer codnfvenda)
	{
		this.codnfvenda = codnfvenda;
	}

	public Integer getCodnfvenda()
	{
		return codnfvenda;
	}

	@Column(name="CODSERIE", nullable =  true , length = 3)
	@XmlElement(name = "codserie")
	private String codserie;

	public void setCodserie(String codserie)
	{
		this.codserie = codserie;
	}

	public String getCodserie()
	{
		return codserie;
	}

	@Column(name="CODNFCOMPRA", nullable =  true , length = 11)
	@XmlElement(name = "codnfcompra")
	private Integer codnfcompra;

	public void setCodnfcompra(Integer codnfcompra)
	{
		this.codnfcompra = codnfcompra;
	}

	public Integer getCodnfcompra()
	{
		return codnfcompra;
	}

	@Column(name="CODPEDVENDA", nullable =  true , length = 11)
	@XmlElement(name = "codpedvenda")
	private Integer codpedvenda;

	public void setCodpedvenda(Integer codpedvenda)
	{
		this.codpedvenda = codpedvenda;
	}

	public Integer getCodpedvenda()
	{
		return codpedvenda;
	}

	@Column(name="CON_NRBOLETO", nullable =  true , length = 11)
	@XmlElement(name = "nrboleto")
	private Integer nrboleto;

	public void setNrboleto(Integer nrboleto)
	{
		this.nrboleto = nrboleto;
	}

	public Integer getNrboleto()
	{
		return nrboleto;
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

	@Column(name="CODALUGUEL", nullable =  true , length = 11)
	@XmlElement(name = "codaluguel")
	private Integer codaluguel;

	public void setCodaluguel(Integer codaluguel)
	{
		this.codaluguel = codaluguel;
	}

	public Integer getCodaluguel()
	{
		return codaluguel;
	}

	@Column(name="CODOSSIMPLES", nullable =  true , length = 11)
	@XmlElement(name = "codossimples")
	private Integer codossimples;

	public void setCodossimples(Integer codossimples)
	{
		this.codossimples = codossimples;
	}

	public Integer getCodossimples()
	{
		return codossimples;
	}

	@Column(name="CON_CHEQ_NUM", nullable =  true , length = 17)
	@XmlElement(name = "cheqNum")
	private Float cheqNum= 0f;

	public void setCheqNum(Float cheqNum)
	{
		this.cheqNum = cheqNum;
	}

	public Float getCheqNum()
	{
		return cheqNum;
	}

	@Column(name="CON_CHEQ_BANCO", nullable =  true , length = 15)
	@XmlElement(name = "cheqBanco")
	private String cheqBanco;

	public void setCheqBanco(String cheqBanco)
	{
		this.cheqBanco = cheqBanco;
	}

	public String getCheqBanco()
	{
		return cheqBanco;
	}

	@Column(name="CON_CHEQ_AGENCIA", nullable =  true , length = 10)
	@XmlElement(name = "cheqAgencia")
	private String cheqAgencia;

	public void setCheqAgencia(String cheqAgencia)
	{
		this.cheqAgencia = cheqAgencia;
	}

	public String getCheqAgencia()
	{
		return cheqAgencia;
	}

	@Column(name="CON_CHEQ_CONTA", nullable =  true , length = 15)
	@XmlElement(name = "cheqConta")
	private String cheqConta;

	public void setCheqConta(String cheqConta)
	{
		this.cheqConta = cheqConta;
	}

	public String getCheqConta()
	{
		return cheqConta;
	}

	@Column(name="CON_CHEQ_EMITIDO", nullable =  true , length = 20)
	@XmlElement(name = "cheqEmitido")
	private String cheqEmitido;

	public void setCheqEmitido(String cheqEmitido)
	{
		this.cheqEmitido = cheqEmitido;
	}

	public String getCheqEmitido()
	{
		return cheqEmitido;
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

	@Column(name="CODOSPRINCIPAL", nullable =  true , length = 11)
	@XmlElement(name = "codosprincipal")
	private Integer codosprincipal;

	public void setCodosprincipal(Integer codosprincipal)
	{
		this.codosprincipal = codosprincipal;
	}

	public Integer getCodosprincipal()
	{
		return codosprincipal;
	}

	@Column(name="CODREFATURA", nullable =  true , length = 11)
	@XmlElement(name = "codrefatura")
	private Integer codrefatura;

	public void setCodrefatura(Integer codrefatura)
	{
		this.codrefatura = codrefatura;
	}

	public Integer getCodrefatura()
	{
		return codrefatura;
	}

	@Column(name="CON_POS_NRAUTORIZACAO", nullable =  true , length = 30)
	@XmlElement(name = "posNrautorizacao")
	private String posNrautorizacao;

	public void setPosNrautorizacao(String posNrautorizacao)
	{
		this.posNrautorizacao = posNrautorizacao;
	}

	public String getPosNrautorizacao()
	{
		return posNrautorizacao;
	}

	@Column(name="CON_POS_NOME", nullable =  true , length = 30)
	@XmlElement(name = "posNome")
	private String posNome;

	public void setPosNome(String posNome)
	{
		this.posNome = posNome;
	}

	public String getPosNome()
	{
		return posNome;
	}

	@Column(name="CON_VLR1", nullable =  true , length = 17)
	@XmlElement(name = "vlr1")
	private Float vlr1= 0f;

	public void setVlr1(Float vlr1)
	{
		this.vlr1 = vlr1;
	}

	public Float getVlr1()
	{
		return vlr1;
	}

	@Column(name="CON_VLR2", nullable =  true , length = 17)
	@XmlElement(name = "vlr2")
	private Float vlr2= 0f;

	public void setVlr2(Float vlr2)
	{
		this.vlr2 = vlr2;
	}

	public Float getVlr2()
	{
		return vlr2;
	}

	@Column(name="CON_CHEQ_CPF", nullable =  true , length = 15)
	@XmlElement(name = "cheqCpf")
	private String cheqCpf;

	public void setCheqCpf(String cheqCpf)
	{
		this.cheqCpf = cheqCpf;
	}

	public String getCheqCpf()
	{
		return cheqCpf;
	}

	@Column(name="CON_NR_PED", nullable =  true , length = 11)
	@XmlElement(name = "nrPed")
	private Integer nrPed;

	public void setNrPed(Integer nrPed)
	{
		this.nrPed = nrPed;
	}

	public Integer getNrPed()
	{
		return nrPed;
	}

	@Column(name="CODFRETE", nullable =  true , length = 11)
	@XmlElement(name = "codfrete")
	private Integer codfrete;

	public void setCodfrete(Integer codfrete)
	{
		this.codfrete = codfrete;
	}

	public Integer getCodfrete()
	{
		return codfrete;
	}

	@Column(name="CODVEICULO", nullable =  true , length = 11)
	@XmlElement(name = "codveiculo")
	private Integer codveiculo;

	public void setCodveiculo(Integer codveiculo)
	{
		this.codveiculo = codveiculo;
	}

	public Integer getCodveiculo()
	{
		return codveiculo;
	}

	@Column(name="CODPEDCOMPRA", nullable =  true , length = 11)
	@XmlElement(name = "codpedcompra")
	private Integer codpedcompra;

	public void setCodpedcompra(Integer codpedcompra)
	{
		this.codpedcompra = codpedcompra;
	}

	public Integer getCodpedcompra()
	{
		return codpedcompra;
	}

	@Column(name="CON_BOLETO_GERADO", nullable =  true , length = 1)
	@XmlElement(name = "boletoGerado")
	private String boletoGerado;

	public void setBoletoGerado(String boletoGerado)
	{
		this.boletoGerado = boletoGerado;
	}

	public String getBoletoGerado()
	{
		return boletoGerado;
	}

	public void setBoletoGeradoBoolean(Boolean value)
	{
		if (value) {
			this.boletoGerado = "S";
		}
		else {
			this.boletoGerado = "N";
		}
	}
	public Boolean getBoletoGeradoBoolean()
	{
		return ((this.boletoGerado != null)&&(this.boletoGerado.equalsIgnoreCase("S")));
	}
	@Column(name="CON_BOLETO_DEMONSTRATIVO1", nullable =  true , length = 255)
	@XmlElement(name = "boletoDemonstrativo1")
	private String boletoDemonstrativo1;

	public void setBoletoDemonstrativo1(String boletoDemonstrativo1)
	{
		this.boletoDemonstrativo1 = boletoDemonstrativo1;
	}

	public String getBoletoDemonstrativo1()
	{
		return boletoDemonstrativo1;
	}

	@Column(name="CON_BOLETO_DEMONSTRATIVO2", nullable =  true , length = 255)
	@XmlElement(name = "boletoDemonstrativo2")
	private String boletoDemonstrativo2;

	public void setBoletoDemonstrativo2(String boletoDemonstrativo2)
	{
		this.boletoDemonstrativo2 = boletoDemonstrativo2;
	}

	public String getBoletoDemonstrativo2()
	{
		return boletoDemonstrativo2;
	}

	@Column(name="CON_BOLETO_DEMONSTRATIVO3", nullable =  true , length = 255)
	@XmlElement(name = "boletoDemonstrativo3")
	private String boletoDemonstrativo3;

	public void setBoletoDemonstrativo3(String boletoDemonstrativo3)
	{
		this.boletoDemonstrativo3 = boletoDemonstrativo3;
	}

	public String getBoletoDemonstrativo3()
	{
		return boletoDemonstrativo3;
	}

	@Column(name="CODCONTASPEDECF", nullable =  true , length = 11)
	@XmlElement(name = "codcontaspedecf")
	private Integer codcontaspedecf;

	public void setCodcontaspedecf(Integer codcontaspedecf)
	{
		this.codcontaspedecf = codcontaspedecf;
	}

	public Integer getCodcontaspedecf()
	{
		return codcontaspedecf;
	}

	@Column(name="CON_AUTORIZADA", nullable =  true , length = 1)
	@XmlElement(name = "autorizada")
	private String autorizada;

	public void setAutorizada(String autorizada)
	{
		this.autorizada = autorizada;
	}

	public String getAutorizada()
	{
		return autorizada;
	}

	public void setAutorizadaBoolean(Boolean value)
	{
		if (value) {
			this.autorizada = "S";
		}
		else {
			this.autorizada = "N";
		}
	}
	public Boolean getAutorizadaBoolean()
	{
		return ((this.autorizada != null)&&(this.autorizada.equalsIgnoreCase("S")));
	}
	@Column(name="CODGUIA", nullable =  true , length = 11)
	@XmlElement(name = "codguia")
	private Integer codguia;

	public void setCodguia(Integer codguia)
	{
		this.codguia = codguia;
	}

	public Integer getCodguia()
	{
		return codguia;
	}

	@Column(name="CON_VLR_JUROS_CREDIARIO", nullable =  true , length = 9)
	@XmlElement(name = "vlrJurosCrediario")
	private Integer vlrJurosCrediario;

	public void setVlrJurosCrediario(Integer vlrJurosCrediario)
	{
		this.vlrJurosCrediario = vlrJurosCrediario;
	}

	public Integer getVlrJurosCrediario()
	{
		return vlrJurosCrediario;
	}

	@Column(name="CODPLANOASSISTENCIA", nullable =  true , length = 11)
	@XmlElement(name = "codplanoassistencia")
	private Integer codplanoassistencia;

	public void setCodplanoassistencia(Integer codplanoassistencia)
	{
		this.codplanoassistencia = codplanoassistencia;
	}

	public Integer getCodplanoassistencia()
	{
		return codplanoassistencia;
	}

	@Column(name="CON_DTPREVISTA", nullable =  true , length = 10)
	@XmlElement(name = "dtprevista")
	private java.sql.Timestamp dtprevista;

	public void setDtprevista(java.sql.Timestamp dtprevista)
	{
		this.dtprevista = dtprevista;
	}

	public java.sql.Timestamp getDtprevista()
	{
		return dtprevista;
	}

	@Column(name="CON_SUSPENSAO_USUARIO", nullable =  true , length = 15)
	@XmlElement(name = "suspensaoUsuario")
	private String suspensaoUsuario;

	public void setSuspensaoUsuario(String suspensaoUsuario)
	{
		this.suspensaoUsuario = suspensaoUsuario;
	}

	public String getSuspensaoUsuario()
	{
		return suspensaoUsuario;
	}

	@Column(name="CON_SUSPENSAO_DATAHORA", nullable =  true , length = 19)
	@XmlElement(name = "suspensaoDatahora")
	private java.sql.Timestamp suspensaoDatahora;

	public void setSuspensaoDatahora(java.sql.Timestamp suspensaoDatahora)
	{
		this.suspensaoDatahora = suspensaoDatahora;
	}

	public java.sql.Timestamp getSuspensaoDatahora()
	{
		return suspensaoDatahora;
	}

	@Column(name="CON_AUTORIZACAO_USUARIO", nullable =  true , length = 15)
	@XmlElement(name = "autorizacaoUsuario")
	private String autorizacaoUsuario;

	public void setAutorizacaoUsuario(String autorizacaoUsuario)
	{
		this.autorizacaoUsuario = autorizacaoUsuario;
	}

	public String getAutorizacaoUsuario()
	{
		return autorizacaoUsuario;
	}

	@Column(name="CON_AUTORIZACAO_DATAHORA", nullable =  true , length = 19)
	@XmlElement(name = "autorizacaoDatahora")
	private java.sql.Timestamp autorizacaoDatahora;

	public void setAutorizacaoDatahora(java.sql.Timestamp autorizacaoDatahora)
	{
		this.autorizacaoDatahora = autorizacaoDatahora;
	}

	public java.sql.Timestamp getAutorizacaoDatahora()
	{
		return autorizacaoDatahora;
	}

	@Column(name="CON_SUSPENSAO_JUSTIF", nullable =  true , length = 150)
	@XmlElement(name = "suspensaoJustif")
	private String suspensaoJustif;

	public void setSuspensaoJustif(String suspensaoJustif)
	{
		this.suspensaoJustif = suspensaoJustif;
	}

	public String getSuspensaoJustif()
	{
		return suspensaoJustif;
	}

	@Column(name="CON_AUTORIZACAO_JUSTIF", nullable =  true , length = 150)
	@XmlElement(name = "autorizacaoJustif")
	private String autorizacaoJustif;

	public void setAutorizacaoJustif(String autorizacaoJustif)
	{
		this.autorizacaoJustif = autorizacaoJustif;
	}

	public String getAutorizacaoJustif()
	{
		return autorizacaoJustif;
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

	@Column(name="CODBOLETO", nullable =  true , length = 11)
	@XmlElement(name = "codboleto")
	private Integer codboleto;

	public void setCodboleto(Integer codboleto)
	{
		this.codboleto = codboleto;
	}

	public Integer getCodboleto()
	{
		return codboleto;
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
	@Column(name="CODBANCO_BX", nullable =  true , length = 11)
	@XmlElement(name = "bx")
	private Integer bx;

	public void setBx(Integer bx)
	{
		this.bx = bx;
	}

	public Integer getBx()
	{
		return bx;
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

	@Column(name="CON_USUARIO", nullable =  true , length = 15)
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

	@Column(name="CON_DTULTBX", nullable =  true , length = 10)
	@XmlElement(name = "dtultbx")
	private java.sql.Timestamp dtultbx;

	public void setDtultbx(java.sql.Timestamp dtultbx)
	{
		this.dtultbx = dtultbx;
	}

	public java.sql.Timestamp getDtultbx()
	{
		return dtultbx;
	}

	@Column(name="CON_VLR_ADIANTAMENTO", nullable =  true , length = 17)
	@XmlElement(name = "vlrAdiantamento")
	private Float vlrAdiantamento= 0f;

	public void setVlrAdiantamento(Float vlrAdiantamento)
	{
		this.vlrAdiantamento = vlrAdiantamento;
	}

	public Float getVlrAdiantamento()
	{
		return vlrAdiantamento;
	}

	@Column(name="CON_NAO_CALC_JUROS", nullable =  true , length = 1)
	@XmlElement(name = "naoCalcJuros")
	private String naoCalcJuros;

	public void setNaoCalcJuros(String naoCalcJuros)
	{
		this.naoCalcJuros = naoCalcJuros;
	}

	public String getNaoCalcJuros()
	{
		return naoCalcJuros;
	}

	public void setNaoCalcJurosBoolean(Boolean value)
	{
		if (value) {
			this.naoCalcJuros = "S";
		}
		else {
			this.naoCalcJuros = "N";
		}
	}
	public Boolean getNaoCalcJurosBoolean()
	{
		return ((this.naoCalcJuros != null)&&(this.naoCalcJuros.equalsIgnoreCase("S")));
	}
	@Column(name="CON_MULTA_VLR", nullable =  true , length = 17)
	@XmlElement(name = "multaVlr")
	private Float multaVlr= 0f;

	public void setMultaVlr(Float multaVlr)
	{
		this.multaVlr = multaVlr;
	}

	public Float getMultaVlr()
	{
		return multaVlr;
	}

	@Column(name="CON_NAO_CALC_MULTA", nullable =  true , length = 1)
	@XmlElement(name = "naoCalcMulta")
	private String naoCalcMulta;

	public void setNaoCalcMulta(String naoCalcMulta)
	{
		this.naoCalcMulta = naoCalcMulta;
	}

	public String getNaoCalcMulta()
	{
		return naoCalcMulta;
	}

	public void setNaoCalcMultaBoolean(Boolean value)
	{
		if (value) {
			this.naoCalcMulta = "S";
		}
		else {
			this.naoCalcMulta = "N";
		}
	}
	public Boolean getNaoCalcMultaBoolean()
	{
		return ((this.naoCalcMulta != null)&&(this.naoCalcMulta.equalsIgnoreCase("S")));
	}
	@Column(name="CON_NRBOLETO_ALF", nullable =  true , length = 30)
	@XmlElement(name = "nrboletoAlf")
	private String nrboletoAlf;

	public void setNrboletoAlf(String nrboletoAlf)
	{
		this.nrboletoAlf = nrboletoAlf;
	}

	public String getNrboletoAlf()
	{
		return nrboletoAlf;
	}

	@Column(name="CON_PROTESTADO", nullable =  true , length = 1)
	@XmlElement(name = "protestado")
	private String protestado;

	public void setProtestado(String protestado)
	{
		this.protestado = protestado;
	}

	public String getProtestado()
	{
		return protestado;
	}

	public void setProtestadoBoolean(Boolean value)
	{
		if (value) {
			this.protestado = "S";
		}
		else {
			this.protestado = "N";
		}
	}
	public Boolean getProtestadoBoolean()
	{
		return ((this.protestado != null)&&(this.protestado.equalsIgnoreCase("S")));
	}
	@Column(name="CON_NUMDOC_BOLETO", nullable =  true , length = 15)
	@XmlElement(name = "numdocBoleto")
	private String numdocBoleto;

	public void setNumdocBoleto(String numdocBoleto)
	{
		this.numdocBoleto = numdocBoleto;
	}

	public String getNumdocBoleto()
	{
		return numdocBoleto;
	}

}
