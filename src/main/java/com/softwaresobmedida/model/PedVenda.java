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
@Table(name = "PEDVENDA")
@SequenceGenerator(name = "INC_PEDVENDA", sequenceName = "GEN_PEDVENDA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pedvenda") 
public class PedVenda implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public PedVenda() {	
	}

	@Id
	@Column(name="CODPEDVENDA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PEDVENDA")
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

	@Column(name="PEDV_TIPOPRECO", nullable =  false , length = 2)
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

	@Column(name="PEDV_DATA_ENTRADA", nullable =  false , length = 10)
	@XmlElement(name = "dataEntrada")
	private java.sql.Timestamp dataEntrada;

	public void setDataEntrada(java.sql.Timestamp dataEntrada)
	{
		this.dataEntrada = dataEntrada;
	}

	public java.sql.Timestamp getDataEntrada()
	{
		return dataEntrada;
	}

	@Column(name="PEDV_STATUS", nullable =  false , length = 15)
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

	@Column(name="PEDV_DESC_VLR", nullable =  true , length = 17)
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

	@Column(name="PEDV_DESC_PERC", nullable =  true , length = 17)
	@XmlElement(name = "descPerc")
	private Float descPerc= 0f;

	public void setDescPerc(Float descPerc)
	{
		this.descPerc = descPerc;
	}

	public Float getDescPerc()
	{
		return descPerc;
	}

	@Column(name="PEDV_ACRE_PERC", nullable =  true , length = 17)
	@XmlElement(name = "acrePerc")
	private Float acrePerc= 0f;

	public void setAcrePerc(Float acrePerc)
	{
		this.acrePerc = acrePerc;
	}

	public Float getAcrePerc()
	{
		return acrePerc;
	}

	@Column(name="PEDV_ACRE_VLR", nullable =  true , length = 17)
	@XmlElement(name = "acreVlr")
	private Float acreVlr= 0f;

	public void setAcreVlr(Float acreVlr)
	{
		this.acreVlr = acreVlr;
	}

	public Float getAcreVlr()
	{
		return acreVlr;
	}

	@Column(name="PEDV_TOTAL_PRODUTOS", nullable =  true , length = 17)
	@XmlElement(name = "totalProdutos")
	private Float totalProdutos= 0f;

	public void setTotalProdutos(Float totalProdutos)
	{
		this.totalProdutos = totalProdutos;
	}

	public Float getTotalProdutos()
	{
		return totalProdutos;
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

	@Column(name="PEDV_TOTAL_PEDIDO", nullable =  true , length = 17)
	@XmlElement(name = "totalPedido")
	private Float totalPedido= 0f;

	public void setTotalPedido(Float totalPedido)
	{
		this.totalPedido = totalPedido;
	}

	public Float getTotalPedido()
	{
		return totalPedido;
	}

	@Column(name="CODVENDEDOR_EXTERNO", nullable =  true , length = 11)
	@XmlElement(name = "externo")
	private Integer externo;

	public void setExterno(Integer externo)
	{
		this.externo = externo;
	}

	public Integer getExterno()
	{
		return externo;
	}

	@Column(name="PEDV_VEN_INT_COMIS", nullable =  true , length = 17)
	@XmlElement(name = "venIntComis")
	private Float venIntComis= 0f;

	public void setVenIntComis(Float venIntComis)
	{
		this.venIntComis = venIntComis;
	}

	public Float getVenIntComis()
	{
		return venIntComis;
	}

	@Column(name="PEDV_VEN_EXT_COMIS", nullable =  true , length = 17)
	@XmlElement(name = "venExtComis")
	private Float venExtComis= 0f;

	public void setVenExtComis(Float venExtComis)
	{
		this.venExtComis = venExtComis;
	}

	public Float getVenExtComis()
	{
		return venExtComis;
	}

	@Column(name="PEDV_ENTREGA", nullable =  true , length = 7)
	@XmlElement(name = "entrega")
	private String entrega;

	public void setEntrega(String entrega)
	{
		this.entrega = entrega;
	}

	public String getEntrega()
	{
		return entrega;
	}

	@Column(name="PEDV_TIPO", nullable =  true , length = 10)
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

	@Column(name="PEDV_CONTATO", nullable =  true , length = 30)
	@XmlElement(name = "contato")
	private String contato;

	public void setContato(String contato)
	{
		this.contato = contato;
	}

	public String getContato()
	{
		return contato;
	}

	@Column(name="PEDV_TELEFONE", nullable =  true , length = 20)
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

	@Column(name="PEDV_EMAIL", nullable =  true , length = 60)
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

	@Column(name="PEDV_DDD", nullable =  true , length = 3)
	@XmlElement(name = "ddd")
	private String ddd;

	public void setDdd(String ddd)
	{
		this.ddd = ddd;
	}

	public String getDdd()
	{
		return ddd;
	}

	@Column(name="PEDV_OBS", nullable =  true , length = 300)
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

	@Column(name="PEDV_NF", nullable =  true , length = 1)
	@XmlElement(name = "nf")
	private String nf;

	public void setNf(String nf)
	{
		this.nf = nf;
	}

	public String getNf()
	{
		return nf;
	}

	public void setNfBoolean(Boolean value)
	{
		if (value) {
			this.nf = "S";
		}
		else {
			this.nf = "N";
		}
	}
	public Boolean getNfBoolean()
	{
		return ((this.nf != null)&&(this.nf.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_RAPIDA", nullable =  true , length = 1)
	@XmlElement(name = "rapida")
	private String rapida;

	public void setRapida(String rapida)
	{
		this.rapida = rapida;
	}

	public String getRapida()
	{
		return rapida;
	}

	public void setRapidaBoolean(Boolean value)
	{
		if (value) {
			this.rapida = "S";
		}
		else {
			this.rapida = "N";
		}
	}
	public Boolean getRapidaBoolean()
	{
		return ((this.rapida != null)&&(this.rapida.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_VLRTROCA", nullable =  true , length = 17)
	@XmlElement(name = "vlrtroca")
	private Float vlrtroca= 0f;

	public void setVlrtroca(Float vlrtroca)
	{
		this.vlrtroca = vlrtroca;
	}

	public Float getVlrtroca()
	{
		return vlrtroca;
	}

	@Column(name="PEDV_TOTAL_COMISSAO", nullable =  true , length = 17)
	@XmlElement(name = "totalComissao")
	private Float totalComissao= 0f;

	public void setTotalComissao(Float totalComissao)
	{
		this.totalComissao = totalComissao;
	}

	public Float getTotalComissao()
	{
		return totalComissao;
	}

	@Column(name="PEDV_REIMPRESSAO", nullable =  true , length = 1)
	@XmlElement(name = "reimpressao")
	private String reimpressao;

	public void setReimpressao(String reimpressao)
	{
		this.reimpressao = reimpressao;
	}

	public String getReimpressao()
	{
		return reimpressao;
	}

	public void setReimpressaoBoolean(Boolean value)
	{
		if (value) {
			this.reimpressao = "S";
		}
		else {
			this.reimpressao = "N";
		}
	}
	public Boolean getReimpressaoBoolean()
	{
		return ((this.reimpressao != null)&&(this.reimpressao.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_DESC_PADRAO", nullable =  true , length = 17)
	@XmlElement(name = "descPadrao")
	private Float descPadrao= 0f;

	public void setDescPadrao(Float descPadrao)
	{
		this.descPadrao = descPadrao;
	}

	public Float getDescPadrao()
	{
		return descPadrao;
	}

	@Column(name="PEDV_ECF", nullable =  true , length = 1)
	@XmlElement(name = "ecf")
	private String ecf;

	public void setEcf(String ecf)
	{
		this.ecf = ecf;
	}

	public String getEcf()
	{
		return ecf;
	}

	public void setEcfBoolean(Boolean value)
	{
		if (value) {
			this.ecf = "S";
		}
		else {
			this.ecf = "N";
		}
	}
	public Boolean getEcfBoolean()
	{
		return ((this.ecf != null)&&(this.ecf.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_USUARIO", nullable =  true , length = 15)
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

	@Column(name="PEDV_VLRCOVERT", nullable =  true , length = 17)
	@XmlElement(name = "vlrcovert")
	private Float vlrcovert= 0f;

	public void setVlrcovert(Float vlrcovert)
	{
		this.vlrcovert = vlrcovert;
	}

	public Float getVlrcovert()
	{
		return vlrcovert;
	}

	@Column(name="PEDV_VLRSERVICO", nullable =  true , length = 17)
	@XmlElement(name = "vlrservico")
	private Float vlrservico= 0f;

	public void setVlrservico(Float vlrservico)
	{
		this.vlrservico = vlrservico;
	}

	public Float getVlrservico()
	{
		return vlrservico;
	}

	@Column(name="PEDV_ECF_DATA", nullable =  true , length = 19)
	@XmlElement(name = "ecfData")
	private java.sql.Timestamp ecfData;

	public void setEcfData(java.sql.Timestamp ecfData)
	{
		this.ecfData = ecfData;
	}

	public java.sql.Timestamp getEcfData()
	{
		return ecfData;
	}

	@Column(name="PEDV_NR_PEDIDO", nullable =  true , length = 11)
	@XmlElement(name = "nrPedido")
	private Integer nrPedido;

	public void setNrPedido(Integer nrPedido)
	{
		this.nrPedido = nrPedido;
	}

	public Integer getNrPedido()
	{
		return nrPedido;
	}

	@Column(name="PEDV_DATA_FATURAMENTO", nullable =  true , length = 19)
	@XmlElement(name = "dataFaturamento")
	private java.sql.Timestamp dataFaturamento;

	public void setDataFaturamento(java.sql.Timestamp dataFaturamento)
	{
		this.dataFaturamento = dataFaturamento;
	}

	public java.sql.Timestamp getDataFaturamento()
	{
		return dataFaturamento;
	}

	@Column(name="PEDV_HORA_PEDIDO", nullable =  true , length = 8)
	@XmlElement(name = "horaPedido")
	private java.sql.Timestamp horaPedido;

	public void setHoraPedido(java.sql.Timestamp horaPedido)
	{
		this.horaPedido = horaPedido;
	}

	public java.sql.Timestamp getHoraPedido()
	{
		return horaPedido;
	}

	@Column(name="PEDV_VLR2", nullable =  true , length = 17)
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

	@Column(name="PEDV_SEDEX_VLR", nullable =  true , length = 17)
	@XmlElement(name = "sedexVlr")
	private Float sedexVlr= 0f;

	public void setSedexVlr(Float sedexVlr)
	{
		this.sedexVlr = sedexVlr;
	}

	public Float getSedexVlr()
	{
		return sedexVlr;
	}

	@Column(name="PEDV_ACRESCIMO_FINANCEIRO", nullable =  true , length = 17)
	@XmlElement(name = "acrescimoFinanceiro")
	private Float acrescimoFinanceiro= 0f;

	public void setAcrescimoFinanceiro(Float acrescimoFinanceiro)
	{
		this.acrescimoFinanceiro = acrescimoFinanceiro;
	}

	public Float getAcrescimoFinanceiro()
	{
		return acrescimoFinanceiro;
	}

	@Column(name="PEDV_COMP_PEDIDO_ATUALIZADO", nullable =  true , length = 1)
	@XmlElement(name = "compPedidoAtualizado")
	private String compPedidoAtualizado;

	public void setCompPedidoAtualizado(String compPedidoAtualizado)
	{
		this.compPedidoAtualizado = compPedidoAtualizado;
	}

	public String getCompPedidoAtualizado()
	{
		return compPedidoAtualizado;
	}

	public void setCompPedidoAtualizadoBoolean(Boolean value)
	{
		if (value) {
			this.compPedidoAtualizado = "S";
		}
		else {
			this.compPedidoAtualizado = "N";
		}
	}
	public Boolean getCompPedidoAtualizadoBoolean()
	{
		return ((this.compPedidoAtualizado != null)&&(this.compPedidoAtualizado.equalsIgnoreCase("S")));
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

	@Column(name="PEDV_DATA_FINALIZACAO", nullable =  true , length = 19)
	@XmlElement(name = "dataFinalizacao")
	private java.sql.Timestamp dataFinalizacao;

	public void setDataFinalizacao(java.sql.Timestamp dataFinalizacao)
	{
		this.dataFinalizacao = dataFinalizacao;
	}

	public java.sql.Timestamp getDataFinalizacao()
	{
		return dataFinalizacao;
	}

	@Column(name="PEDV_SOFTWARE_PARA", nullable =  true , length = 50)
	@XmlElement(name = "softwarePara")
	private String softwarePara;

	public void setSoftwarePara(String softwarePara)
	{
		this.softwarePara = softwarePara;
	}

	public String getSoftwarePara()
	{
		return softwarePara;
	}

	@Column(name="PEDV_QTDE_COMPUTADORES", nullable =  true , length = 11)
	@XmlElement(name = "qtdeComputadores")
	private Integer qtdeComputadores;

	public void setQtdeComputadores(Integer qtdeComputadores)
	{
		this.qtdeComputadores = qtdeComputadores;
	}

	public Integer getQtdeComputadores()
	{
		return qtdeComputadores;
	}

	@Column(name="PEDV_DIA_VCTO_MENSALIDADE", nullable =  true , length = 11)
	@XmlElement(name = "diaVctoMensalidade")
	private Integer diaVctoMensalidade;

	public void setDiaVctoMensalidade(Integer diaVctoMensalidade)
	{
		this.diaVctoMensalidade = diaVctoMensalidade;
	}

	public Integer getDiaVctoMensalidade()
	{
		return diaVctoMensalidade;
	}

	@Column(name="PEDV_MES_ANO_REFERENCIA", nullable =  true , length = 15)
	@XmlElement(name = "mesAnoReferencia")
	private String mesAnoReferencia;

	public void setMesAnoReferencia(String mesAnoReferencia)
	{
		this.mesAnoReferencia = mesAnoReferencia;
	}

	public String getMesAnoReferencia()
	{
		return mesAnoReferencia;
	}

	@Column(name="PEDV_DATA_VCTO_INICIAL", nullable =  true , length = 10)
	@XmlElement(name = "dataVctoInicial")
	private java.sql.Timestamp dataVctoInicial;

	public void setDataVctoInicial(java.sql.Timestamp dataVctoInicial)
	{
		this.dataVctoInicial = dataVctoInicial;
	}

	public java.sql.Timestamp getDataVctoInicial()
	{
		return dataVctoInicial;
	}

	@Column(name="PEDV_COMARCA", nullable =  true , length = 30)
	@XmlElement(name = "comarca")
	private String comarca;

	public void setComarca(String comarca)
	{
		this.comarca = comarca;
	}

	public String getComarca()
	{
		return comarca;
	}

	@Column(name="PEDV_CONTRATO_GERADO", nullable =  true , length = 1)
	@XmlElement(name = "contratoGerado")
	private String contratoGerado;

	public void setContratoGerado(String contratoGerado)
	{
		this.contratoGerado = contratoGerado;
	}

	public String getContratoGerado()
	{
		return contratoGerado;
	}

	public void setContratoGeradoBoolean(Boolean value)
	{
		if (value) {
			this.contratoGerado = "S";
		}
		else {
			this.contratoGerado = "N";
		}
	}
	public Boolean getContratoGeradoBoolean()
	{
		return ((this.contratoGerado != null)&&(this.contratoGerado.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_VALOR_MENSALIDADE", nullable =  true , length = 9)
	@XmlElement(name = "valorMensalidade")
	private String valorMensalidade;

	public void setValorMensalidade(String valorMensalidade)
	{
		this.valorMensalidade = valorMensalidade;
	}

	public String getValorMensalidade()
	{
		return valorMensalidade;
	}

	@Column(name="PEDV_QTDE_MESES", nullable =  true , length = 11)
	@XmlElement(name = "qtdeMeses")
	private Integer qtdeMeses;

	public void setQtdeMeses(Integer qtdeMeses)
	{
		this.qtdeMeses = qtdeMeses;
	}

	public Integer getQtdeMeses()
	{
		return qtdeMeses;
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

	@Column(name="PEDV_TOTAL_CUSTO_PRODUTOS", nullable =  true , length = 17)
	@XmlElement(name = "totalCustoProdutos")
	private Float totalCustoProdutos= 0f;

	public void setTotalCustoProdutos(Float totalCustoProdutos)
	{
		this.totalCustoProdutos = totalCustoProdutos;
	}

	public Float getTotalCustoProdutos()
	{
		return totalCustoProdutos;
	}

	@Column(name="PEDV_CATEGORIA", nullable =  true , length = 35)
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

	@Column(name="PEDV_TOKEN", nullable =  true , length = 30)
	@XmlElement(name = "token")
	private String token;

	public void setToken(String token)
	{
		this.token = token;
	}

	public String getToken()
	{
		return token;
	}

	@Column(name="PEDV_PAYERID", nullable =  true , length = 30)
	@XmlElement(name = "payerid")
	private String payerid;

	public void setPayerid(String payerid)
	{
		this.payerid = payerid;
	}

	public String getPayerid()
	{
		return payerid;
	}

	@Column(name="PEDV_PAYPAL_STATUS", nullable =  true , length = 30)
	@XmlElement(name = "paypalStatus")
	private String paypalStatus;

	public void setPaypalStatus(String paypalStatus)
	{
		this.paypalStatus = paypalStatus;
	}

	public String getPaypalStatus()
	{
		return paypalStatus;
	}

	@Column(name="PEDV_DATA_INSTALACAO", nullable =  true , length = 10)
	@XmlElement(name = "dataInstalacao")
	private java.sql.Timestamp dataInstalacao;

	public void setDataInstalacao(java.sql.Timestamp dataInstalacao)
	{
		this.dataInstalacao = dataInstalacao;
	}

	public java.sql.Timestamp getDataInstalacao()
	{
		return dataInstalacao;
	}

	@Column(name="PEDV_HORA_INSTALACAO", nullable =  true , length = 8)
	@XmlElement(name = "horaInstalacao")
	private java.sql.Timestamp horaInstalacao;

	public void setHoraInstalacao(java.sql.Timestamp horaInstalacao)
	{
		this.horaInstalacao = horaInstalacao;
	}

	public java.sql.Timestamp getHoraInstalacao()
	{
		return horaInstalacao;
	}

	@Column(name="PEDV_IMPRESSO", nullable =  true , length = 1)
	@XmlElement(name = "impresso")
	private String impresso;

	public void setImpresso(String impresso)
	{
		this.impresso = impresso;
	}

	public String getImpresso()
	{
		return impresso;
	}

	public void setImpressoBoolean(Boolean value)
	{
		if (value) {
			this.impresso = "S";
		}
		else {
			this.impresso = "N";
		}
	}
	public Boolean getImpressoBoolean()
	{
		return ((this.impresso != null)&&(this.impresso.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_ALTERACAO_DATAHORA", nullable =  true , length = 19)
	@XmlElement(name = "alteracaoDatahora")
	private java.sql.Timestamp alteracaoDatahora;

	public void setAlteracaoDatahora(java.sql.Timestamp alteracaoDatahora)
	{
		this.alteracaoDatahora = alteracaoDatahora;
	}

	public java.sql.Timestamp getAlteracaoDatahora()
	{
		return alteracaoDatahora;
	}

	@Column(name="PEDV_ALTERACAO_USUARIO", nullable =  true , length = 15)
	@XmlElement(name = "alteracaoUsuario")
	private String alteracaoUsuario;

	public void setAlteracaoUsuario(String alteracaoUsuario)
	{
		this.alteracaoUsuario = alteracaoUsuario;
	}

	public String getAlteracaoUsuario()
	{
		return alteracaoUsuario;
	}

	@Column(name="PEDV_EXCLUSAO_DATAHORA", nullable =  true , length = 19)
	@XmlElement(name = "exclusaoDatahora")
	private java.sql.Timestamp exclusaoDatahora;

	public void setExclusaoDatahora(java.sql.Timestamp exclusaoDatahora)
	{
		this.exclusaoDatahora = exclusaoDatahora;
	}

	public java.sql.Timestamp getExclusaoDatahora()
	{
		return exclusaoDatahora;
	}

	@Column(name="PEDV_EXCLUSAO_USUARIO", nullable =  true , length = 15)
	@XmlElement(name = "exclusaoUsuario")
	private String exclusaoUsuario;

	public void setExclusaoUsuario(String exclusaoUsuario)
	{
		this.exclusaoUsuario = exclusaoUsuario;
	}

	public String getExclusaoUsuario()
	{
		return exclusaoUsuario;
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

	@Column(name="PEDV_PESAGEM_GERADA", nullable =  true , length = 1)
	@XmlElement(name = "pesagemGerada")
	private String pesagemGerada;

	public void setPesagemGerada(String pesagemGerada)
	{
		this.pesagemGerada = pesagemGerada;
	}

	public String getPesagemGerada()
	{
		return pesagemGerada;
	}

	public void setPesagemGeradaBoolean(Boolean value)
	{
		if (value) {
			this.pesagemGerada = "S";
		}
		else {
			this.pesagemGerada = "N";
		}
	}
	public Boolean getPesagemGeradaBoolean()
	{
		return ((this.pesagemGerada != null)&&(this.pesagemGerada.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_PESO_TOTAL_BRUTO", nullable =  true , length = 17)
	@XmlElement(name = "pesoTotalBruto")
	private Float pesoTotalBruto= 0f;

	public void setPesoTotalBruto(Float pesoTotalBruto)
	{
		this.pesoTotalBruto = pesoTotalBruto;
	}

	public Float getPesoTotalBruto()
	{
		return pesoTotalBruto;
	}

	@Column(name="PEDV_PESO_TOTAL_LIQUIDO", nullable =  true , length = 17)
	@XmlElement(name = "pesoTotalLiquido")
	private Float pesoTotalLiquido= 0f;

	public void setPesoTotalLiquido(Float pesoTotalLiquido)
	{
		this.pesoTotalLiquido = pesoTotalLiquido;
	}

	public Float getPesoTotalLiquido()
	{
		return pesoTotalLiquido;
	}

	@Column(name="PEDV_QTDE_ANIMAIS_CLASSIF", nullable =  true , length = 9)
	@XmlElement(name = "qtdeAnimaisClassif")
	private Float qtdeAnimaisClassif= 0f;

	public void setQtdeAnimaisClassif(Float qtdeAnimaisClassif)
	{
		this.qtdeAnimaisClassif = qtdeAnimaisClassif;
	}

	public Float getQtdeAnimaisClassif()
	{
		return qtdeAnimaisClassif;
	}

	@Column(name="PEDV_CONFERIDO", nullable =  true , length = 1)
	@XmlElement(name = "conferido")
	private String conferido;

	public void setConferido(String conferido)
	{
		this.conferido = conferido;
	}

	public String getConferido()
	{
		return conferido;
	}

	public void setConferidoBoolean(Boolean value)
	{
		if (value) {
			this.conferido = "S";
		}
		else {
			this.conferido = "N";
		}
	}
	public Boolean getConferidoBoolean()
	{
		return ((this.conferido != null)&&(this.conferido.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_USUARIO_CONFERENCIA", nullable =  true , length = 15)
	@XmlElement(name = "usuarioConferencia")
	private String usuarioConferencia;

	public void setUsuarioConferencia(String usuarioConferencia)
	{
		this.usuarioConferencia = usuarioConferencia;
	}

	public String getUsuarioConferencia()
	{
		return usuarioConferencia;
	}

	@Column(name="PEDV_DATAHORA_CONFERENCIA", nullable =  true , length = 19)
	@XmlElement(name = "datahoraConferencia")
	private java.sql.Timestamp datahoraConferencia;

	public void setDatahoraConferencia(java.sql.Timestamp datahoraConferencia)
	{
		this.datahoraConferencia = datahoraConferencia;
	}

	public java.sql.Timestamp getDatahoraConferencia()
	{
		return datahoraConferencia;
	}

	@Column(name="PEDV_ANIMAIS_ESTOQUE_BAIXADO", nullable =  true , length = 1)
	@XmlElement(name = "animaisEstoqueBaixado")
	private String animaisEstoqueBaixado;

	public void setAnimaisEstoqueBaixado(String animaisEstoqueBaixado)
	{
		this.animaisEstoqueBaixado = animaisEstoqueBaixado;
	}

	public String getAnimaisEstoqueBaixado()
	{
		return animaisEstoqueBaixado;
	}

	public void setAnimaisEstoqueBaixadoBoolean(Boolean value)
	{
		if (value) {
			this.animaisEstoqueBaixado = "S";
		}
		else {
			this.animaisEstoqueBaixado = "N";
		}
	}
	public Boolean getAnimaisEstoqueBaixadoBoolean()
	{
		return ((this.animaisEstoqueBaixado != null)&&(this.animaisEstoqueBaixado.equalsIgnoreCase("S")));
	}
	@Column(name="CODANIMALPESAGEM", nullable =  true , length = 11)
	@XmlElement(name = "codanimalpesagem")
	private Integer codanimalpesagem;

	public void setCodanimalpesagem(Integer codanimalpesagem)
	{
		this.codanimalpesagem = codanimalpesagem;
	}

	public Integer getCodanimalpesagem()
	{
		return codanimalpesagem;
	}

	@Column(name="PEDV_ARQUIVADO", nullable =  true , length = 1)
	@XmlElement(name = "arquivado")
	private String arquivado;

	public void setArquivado(String arquivado)
	{
		this.arquivado = arquivado;
	}

	public String getArquivado()
	{
		return arquivado;
	}

	public void setArquivadoBoolean(Boolean value)
	{
		if (value) {
			this.arquivado = "S";
		}
		else {
			this.arquivado = "N";
		}
	}
	public Boolean getArquivadoBoolean()
	{
		return ((this.arquivado != null)&&(this.arquivado.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_DATAHORA_ARQUIVAMENTO", nullable =  true , length = 19)
	@XmlElement(name = "datahoraArquivamento")
	private java.sql.Timestamp datahoraArquivamento;

	public void setDatahoraArquivamento(java.sql.Timestamp datahoraArquivamento)
	{
		this.datahoraArquivamento = datahoraArquivamento;
	}

	public java.sql.Timestamp getDatahoraArquivamento()
	{
		return datahoraArquivamento;
	}

	@Column(name="PEDV_USUARIO_ARQUIVAMENTO", nullable =  true , length = 15)
	@XmlElement(name = "usuarioArquivamento")
	private String usuarioArquivamento;

	public void setUsuarioArquivamento(String usuarioArquivamento)
	{
		this.usuarioArquivamento = usuarioArquivamento;
	}

	public String getUsuarioArquivamento()
	{
		return usuarioArquivamento;
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
	@Column(name="PEDV_APROVACAO_DATAHORA", nullable =  true , length = 19)
	@XmlElement(name = "aprovacaoDatahora")
	private java.sql.Timestamp aprovacaoDatahora;

	public void setAprovacaoDatahora(java.sql.Timestamp aprovacaoDatahora)
	{
		this.aprovacaoDatahora = aprovacaoDatahora;
	}

	public java.sql.Timestamp getAprovacaoDatahora()
	{
		return aprovacaoDatahora;
	}

	@Column(name="PEDV_APROVACAO_USUARIO", nullable =  true , length = 15)
	@XmlElement(name = "aprovacaoUsuario")
	private String aprovacaoUsuario;

	public void setAprovacaoUsuario(String aprovacaoUsuario)
	{
		this.aprovacaoUsuario = aprovacaoUsuario;
	}

	public String getAprovacaoUsuario()
	{
		return aprovacaoUsuario;
	}

	@Column(name="PEDV_DATA_PREV_ENTREGA", nullable =  true , length = 10)
	@XmlElement(name = "dataPrevEntrega")
	private java.sql.Timestamp dataPrevEntrega;

	public void setDataPrevEntrega(java.sql.Timestamp dataPrevEntrega)
	{
		this.dataPrevEntrega = dataPrevEntrega;
	}

	public java.sql.Timestamp getDataPrevEntrega()
	{
		return dataPrevEntrega;
	}

	@Column(name="PEDV_TOTAL_DESPESAS", nullable =  true , length = 17)
	@XmlElement(name = "totalDespesas")
	private Float totalDespesas= 0f;

	public void setTotalDespesas(Float totalDespesas)
	{
		this.totalDespesas = totalDespesas;
	}

	public Float getTotalDespesas()
	{
		return totalDespesas;
	}

	@Column(name="PEDV_TIPO_PESAGEM", nullable =  true , length = 15)
	@XmlElement(name = "tipoPesagem")
	private String tipoPesagem;

	public void setTipoPesagem(String tipoPesagem)
	{
		this.tipoPesagem = tipoPesagem;
	}

	public String getTipoPesagem()
	{
		return tipoPesagem;
	}

	@Column(name="PEDV_CONSUMO", nullable =  true , length = 1)
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
	@Column(name="PEDV_ALTERNATIVA", nullable =  true , length = 1)
	@XmlElement(name = "alternativa")
	private String alternativa;

	public void setAlternativa(String alternativa)
	{
		this.alternativa = alternativa;
	}

	public String getAlternativa()
	{
		return alternativa;
	}

	public void setAlternativaBoolean(Boolean value)
	{
		if (value) {
			this.alternativa = "S";
		}
		else {
			this.alternativa = "N";
		}
	}
	public Boolean getAlternativaBoolean()
	{
		return ((this.alternativa != null)&&(this.alternativa.equalsIgnoreCase("S")));
	}
	@Column(name="CODPEDVENDA_ANTERIOR", nullable =  true , length = 11)
	@XmlElement(name = "anterior")
	private Integer anterior;

	public void setAnterior(Integer anterior)
	{
		this.anterior = anterior;
	}

	public Integer getAnterior()
	{
		return anterior;
	}

	@Column(name="PEDV_REVISADO", nullable =  true , length = 1)
	@XmlElement(name = "revisado")
	private String revisado;

	public void setRevisado(String revisado)
	{
		this.revisado = revisado;
	}

	public String getRevisado()
	{
		return revisado;
	}

	public void setRevisadoBoolean(Boolean value)
	{
		if (value) {
			this.revisado = "S";
		}
		else {
			this.revisado = "N";
		}
	}
	public Boolean getRevisadoBoolean()
	{
		return ((this.revisado != null)&&(this.revisado.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_NR_REVISAO", nullable =  true , length = 11)
	@XmlElement(name = "nrRevisao")
	private Integer nrRevisao;

	public void setNrRevisao(Integer nrRevisao)
	{
		this.nrRevisao = nrRevisao;
	}

	public Integer getNrRevisao()
	{
		return nrRevisao;
	}

	@Column(name="PEDV_DATAHORA_REVISAO", nullable =  true , length = 19)
	@XmlElement(name = "datahoraRevisao")
	private java.sql.Timestamp datahoraRevisao;

	public void setDatahoraRevisao(java.sql.Timestamp datahoraRevisao)
	{
		this.datahoraRevisao = datahoraRevisao;
	}

	public java.sql.Timestamp getDatahoraRevisao()
	{
		return datahoraRevisao;
	}

	@Column(name="PEDV_USUARIO_REVISAO", nullable =  true , length = 15)
	@XmlElement(name = "usuarioRevisao")
	private String usuarioRevisao;

	public void setUsuarioRevisao(String usuarioRevisao)
	{
		this.usuarioRevisao = usuarioRevisao;
	}

	public String getUsuarioRevisao()
	{
		return usuarioRevisao;
	}

	@Column(name="PEDV_TOTAL_BC_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "totalBcIcms")
	private Float totalBcIcms= 0f;

	public void setTotalBcIcms(Float totalBcIcms)
	{
		this.totalBcIcms = totalBcIcms;
	}

	public Float getTotalBcIcms()
	{
		return totalBcIcms;
	}

	@Column(name="PEDV_TOTAL_ICMS", nullable =  true , length = 17)
	@XmlElement(name = "totalIcms")
	private Float totalIcms= 0f;

	public void setTotalIcms(Float totalIcms)
	{
		this.totalIcms = totalIcms;
	}

	public Float getTotalIcms()
	{
		return totalIcms;
	}

	@Column(name="PEDV_TOTAL_IPI", nullable =  true , length = 17)
	@XmlElement(name = "totalIpi")
	private Float totalIpi= 0f;

	public void setTotalIpi(Float totalIpi)
	{
		this.totalIpi = totalIpi;
	}

	public Float getTotalIpi()
	{
		return totalIpi;
	}

	@Column(name="PEDV_TIPO_FRETE", nullable =  true , length = 3)
	@XmlElement(name = "tipoFrete")
	private String tipoFrete;

	public void setTipoFrete(String tipoFrete)
	{
		this.tipoFrete = tipoFrete;
	}

	public String getTipoFrete()
	{
		return tipoFrete;
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

	@Column(name="PEDV_PLACA", nullable =  true , length = 7)
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

	@Column(name="PEDV_KM", nullable =  true , length = 11)
	@XmlElement(name = "km")
	private Integer km;

	public void setKm(Integer km)
	{
		this.km = km;
	}

	public Integer getKm()
	{
		return km;
	}

	@Column(name="PEDV_MODELO", nullable =  true , length = 30)
	@XmlElement(name = "modelo")
	private String modelo;

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public String getModelo()
	{
		return modelo;
	}

	@Column(name="PEDV_DATA_SAIDA_ANIMAL", nullable =  true , length = 10)
	@XmlElement(name = "dataSaidaAnimal")
	private java.sql.Timestamp dataSaidaAnimal;

	public void setDataSaidaAnimal(java.sql.Timestamp dataSaidaAnimal)
	{
		this.dataSaidaAnimal = dataSaidaAnimal;
	}

	public java.sql.Timestamp getDataSaidaAnimal()
	{
		return dataSaidaAnimal;
	}

	@Column(name="PEDV_DATA_ABATE_ANIMAL", nullable =  true , length = 10)
	@XmlElement(name = "dataAbateAnimal")
	private java.sql.Timestamp dataAbateAnimal;

	public void setDataAbateAnimal(java.sql.Timestamp dataAbateAnimal)
	{
		this.dataAbateAnimal = dataAbateAnimal;
	}

	public java.sql.Timestamp getDataAbateAnimal()
	{
		return dataAbateAnimal;
	}

	@Column(name="PEDV_PED_CLI", nullable =  true , length = 15)
	@XmlElement(name = "pedCli")
	private String pedCli;

	public void setPedCli(String pedCli)
	{
		this.pedCli = pedCli;
	}

	public String getPedCli()
	{
		return pedCli;
	}

	@Column(name="PEDV_NR_EMPREITADA", nullable =  true , length = 8)
	@XmlElement(name = "nrEmpreitada")
	private String nrEmpreitada;

	public void setNrEmpreitada(String nrEmpreitada)
	{
		this.nrEmpreitada = nrEmpreitada;
	}

	public String getNrEmpreitada()
	{
		return nrEmpreitada;
	}

	@Column(name="PEDV_EXPORTADO", nullable =  true , length = 1)
	@XmlElement(name = "exportado")
	private String exportado;

	public void setExportado(String exportado)
	{
		this.exportado = exportado;
	}

	public String getExportado()
	{
		return exportado;
	}

	public void setExportadoBoolean(Boolean value)
	{
		if (value) {
			this.exportado = "S";
		}
		else {
			this.exportado = "N";
		}
	}
	public Boolean getExportadoBoolean()
	{
		return ((this.exportado != null)&&(this.exportado.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_DATAHORA_EXPORTACAO", nullable =  true , length = 19)
	@XmlElement(name = "datahoraExportacao")
	private java.sql.Timestamp datahoraExportacao;

	public void setDatahoraExportacao(java.sql.Timestamp datahoraExportacao)
	{
		this.datahoraExportacao = datahoraExportacao;
	}

	public java.sql.Timestamp getDatahoraExportacao()
	{
		return datahoraExportacao;
	}

	@Column(name="PEDV_CODPEDVENDA_EXPORTADO", nullable =  true , length = 11)
	@XmlElement(name = "codpedvendaExportado")
	private Integer codpedvendaExportado;

	public void setCodpedvendaExportado(Integer codpedvendaExportado)
	{
		this.codpedvendaExportado = codpedvendaExportado;
	}

	public Integer getCodpedvendaExportado()
	{
		return codpedvendaExportado;
	}

	@Column(name="PEDV_ESTOQUISTA", nullable =  true , length = 20)
	@XmlElement(name = "estoquista")
	private String estoquista;

	public void setEstoquista(String estoquista)
	{
		this.estoquista = estoquista;
	}

	public String getEstoquista()
	{
		return estoquista;
	}

	@Column(name="CODFORMAPAGAMENTO_SEGUNDA", nullable =  true , length = 11)
	@XmlElement(name = "segunda")
	private Integer segunda;

	public void setSegunda(Integer segunda)
	{
		this.segunda = segunda;
	}

	public Integer getSegunda()
	{
		return segunda;
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

	@Column(name="PEDV_USUARIO_FATURAMENTO", nullable =  true , length = 15)
	@XmlElement(name = "usuarioFaturamento")
	private String usuarioFaturamento;

	public void setUsuarioFaturamento(String usuarioFaturamento)
	{
		this.usuarioFaturamento = usuarioFaturamento;
	}

	public String getUsuarioFaturamento()
	{
		return usuarioFaturamento;
	}

	@Column(name="PEDV_NAO_GERAR_FINANCEIRO", nullable =  true , length = 1)
	@XmlElement(name = "naoGerarFinanceiro")
	private String naoGerarFinanceiro;

	public void setNaoGerarFinanceiro(String naoGerarFinanceiro)
	{
		this.naoGerarFinanceiro = naoGerarFinanceiro;
	}

	public String getNaoGerarFinanceiro()
	{
		return naoGerarFinanceiro;
	}

	public void setNaoGerarFinanceiroBoolean(Boolean value)
	{
		if (value) {
			this.naoGerarFinanceiro = "S";
		}
		else {
			this.naoGerarFinanceiro = "N";
		}
	}
	public Boolean getNaoGerarFinanceiroBoolean()
	{
		return ((this.naoGerarFinanceiro != null)&&(this.naoGerarFinanceiro.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_DATA_LIBERACAO", nullable =  true , length = 19)
	@XmlElement(name = "dataLiberacao")
	private java.sql.Timestamp dataLiberacao;

	public void setDataLiberacao(java.sql.Timestamp dataLiberacao)
	{
		this.dataLiberacao = dataLiberacao;
	}

	public java.sql.Timestamp getDataLiberacao()
	{
		return dataLiberacao;
	}

	@Column(name="PEDV_DATA_ENTREGA", nullable =  true , length = 19)
	@XmlElement(name = "dataEntrega")
	private java.sql.Timestamp dataEntrega;

	public void setDataEntrega(java.sql.Timestamp dataEntrega)
	{
		this.dataEntrega = dataEntrega;
	}

	public java.sql.Timestamp getDataEntrega()
	{
		return dataEntrega;
	}

	@Column(name="PEDV_DATA_ENTREGA_FIM", nullable =  true , length = 19)
	@XmlElement(name = "dataEntregaFim")
	private java.sql.Timestamp dataEntregaFim;

	public void setDataEntregaFim(java.sql.Timestamp dataEntregaFim)
	{
		this.dataEntregaFim = dataEntregaFim;
	}

	public java.sql.Timestamp getDataEntregaFim()
	{
		return dataEntregaFim;
	}

	@Column(name="CODGARCONENTREGADOR", nullable =  true , length = 11)
	@XmlElement(name = "codgarconentregador")
	private Integer codgarconentregador;

	public void setCodgarconentregador(Integer codgarconentregador)
	{
		this.codgarconentregador = codgarconentregador;
	}

	public Integer getCodgarconentregador()
	{
		return codgarconentregador;
	}

	@Column(name="CODENTREGA", nullable =  true , length = 11)
	@XmlElement(name = "codentrega")
	private Integer codentrega;

	public void setCodentrega(Integer codentrega)
	{
		this.codentrega = codentrega;
	}

	public Integer getCodentrega()
	{
		return codentrega;
	}

	@Column(name="PEDV_DESCONTO_FINANCEIRO", nullable =  true , length = 17)
	@XmlElement(name = "descontoFinanceiro")
	private Float descontoFinanceiro= 0f;

	public void setDescontoFinanceiro(Float descontoFinanceiro)
	{
		this.descontoFinanceiro = descontoFinanceiro;
	}

	public Float getDescontoFinanceiro()
	{
		return descontoFinanceiro;
	}

	@Column(name="PEDV_LIBERADO", nullable =  true , length = 1)
	@XmlElement(name = "liberado")
	private String liberado;

	public void setLiberado(String liberado)
	{
		this.liberado = liberado;
	}

	public String getLiberado()
	{
		return liberado;
	}

	public void setLiberadoBoolean(Boolean value)
	{
		if (value) {
			this.liberado = "S";
		}
		else {
			this.liberado = "N";
		}
	}
	public Boolean getLiberadoBoolean()
	{
		return ((this.liberado != null)&&(this.liberado.equalsIgnoreCase("S")));
	}
	@Column(name="PEDV_LIBERADO_MTV", nullable =  true , length = 50)
	@XmlElement(name = "liberadoMtv")
	private String liberadoMtv;

	public void setLiberadoMtv(String liberadoMtv)
	{
		this.liberadoMtv = liberadoMtv;
	}

	public String getLiberadoMtv()
	{
		return liberadoMtv;
	}

	@Column(name="PEDV_LIBERADO_USR", nullable =  true , length = 15)
	@XmlElement(name = "liberadoUsr")
	private String liberadoUsr;

	public void setLiberadoUsr(String liberadoUsr)
	{
		this.liberadoUsr = liberadoUsr;
	}

	public String getLiberadoUsr()
	{
		return liberadoUsr;
	}

	@Column(name="PEDV_MARCA", nullable =  true , length = 30)
	@XmlElement(name = "marca")
	private String marca;

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getMarca()
	{
		return marca;
	}

	@Column(name="PEDV_COR", nullable =  true , length = 30)
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

	@Column(name="PEDV_ANO", nullable =  true , length = 5)
	@XmlElement(name = "ano")
	private String ano;

	public void setAno(String ano)
	{
		this.ano = ano;
	}

	public String getAno()
	{
		return ano;
	}

	@Column(name="PEDV_OS_DTAPROV", nullable =  true , length = 19)
	@XmlElement(name = "osDtaprov")
	private java.sql.Timestamp osDtaprov;

	public void setOsDtaprov(java.sql.Timestamp osDtaprov)
	{
		this.osDtaprov = osDtaprov;
	}

	public java.sql.Timestamp getOsDtaprov()
	{
		return osDtaprov;
	}

	@Column(name="PEDV_OS_STATUS", nullable =  true , length = 15)
	@XmlElement(name = "osStatus")
	private String osStatus;

	public void setOsStatus(String osStatus)
	{
		this.osStatus = osStatus;
	}

	public String getOsStatus()
	{
		return osStatus;
	}

	@Column(name="PEDV_GERADO_ENTREGA", nullable =  true , length = 1)
	@XmlElement(name = "geradoEntrega")
	private String geradoEntrega;

	public void setGeradoEntrega(String geradoEntrega)
	{
		this.geradoEntrega = geradoEntrega;
	}

	public String getGeradoEntrega()
	{
		return geradoEntrega;
	}

	public void setGeradoEntregaBoolean(Boolean value)
	{
		if (value) {
			this.geradoEntrega = "S";
		}
		else {
			this.geradoEntrega = "N";
		}
	}
	public Boolean getGeradoEntregaBoolean()
	{
		return ((this.geradoEntrega != null)&&(this.geradoEntrega.equalsIgnoreCase("S")));
	}
	@Column(name="CODMEDICO", nullable =  true , length = 11)
	@XmlElement(name = "codmedico")
	private Integer codmedico;

	public void setCodmedico(Integer codmedico)
	{
		this.codmedico = codmedico;
	}

	public Integer getCodmedico()
	{
		return codmedico;
	}

}
