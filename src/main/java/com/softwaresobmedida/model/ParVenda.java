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
@Table(name = "PAR_VENDA")
@SequenceGenerator(name = "INC_PAR_VENDA", sequenceName = "GEN_PAR_VENDA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "parVenda") 
public class ParVenda implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public ParVenda() {	
	}

	@Id
	@Column(name="CODPARVENDA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PAR_VENDA")
	@XmlElement(name = "codparvenda")
	private Integer codparvenda;

	public void setCodparvenda(Integer codparvenda)
	{
		this.codparvenda = codparvenda;
	}

	public Integer getCodparvenda()
	{
		return codparvenda;
	}

	@Column(name="PARV_ECF_MODELO", nullable =  true , length = 11)
	@XmlElement(name = "ecfModelo")
	private Integer ecfModelo;

	public void setEcfModelo(Integer ecfModelo)
	{
		this.ecfModelo = ecfModelo;
	}

	public Integer getEcfModelo()
	{
		return ecfModelo;
	}

	@Column(name="PARV_ECF_PORTA", nullable =  true , length = 4)
	@XmlElement(name = "ecfPorta")
	private String ecfPorta;

	public void setEcfPorta(String ecfPorta)
	{
		this.ecfPorta = ecfPorta;
	}

	public String getEcfPorta()
	{
		return ecfPorta;
	}

	@Column(name="PARV_ECF_TIMEOUT", nullable =  true , length = 11)
	@XmlElement(name = "ecfTimeout")
	private Integer ecfTimeout;

	public void setEcfTimeout(Integer ecfTimeout)
	{
		this.ecfTimeout = ecfTimeout;
	}

	public Integer getEcfTimeout()
	{
		return ecfTimeout;
	}

	@Column(name="PARV_ECF_INTERVALO", nullable =  true , length = 11)
	@XmlElement(name = "ecfIntervalo")
	private Integer ecfIntervalo;

	public void setEcfIntervalo(Integer ecfIntervalo)
	{
		this.ecfIntervalo = ecfIntervalo;
	}

	public Integer getEcfIntervalo()
	{
		return ecfIntervalo;
	}

	@Column(name="PARV_ECF_TENT_NOVA", nullable =  true , length = 1)
	@XmlElement(name = "ecfTentNova")
	private String ecfTentNova;

	public void setEcfTentNova(String ecfTentNova)
	{
		this.ecfTentNova = ecfTentNova;
	}

	public String getEcfTentNova()
	{
		return ecfTentNova;
	}

	public void setEcfTentNovaBoolean(Boolean value)
	{
		if (value) {
			this.ecfTentNova = "S";
		}
		else {
			this.ecfTentNova = "N";
		}
	}
	public Boolean getEcfTentNovaBoolean()
	{
		return ((this.ecfTentNova != null)&&(this.ecfTentNova.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_BLOQ_TECL_MOUSE", nullable =  true , length = 1)
	@XmlElement(name = "ecfBloqTeclMouse")
	private String ecfBloqTeclMouse;

	public void setEcfBloqTeclMouse(String ecfBloqTeclMouse)
	{
		this.ecfBloqTeclMouse = ecfBloqTeclMouse;
	}

	public String getEcfBloqTeclMouse()
	{
		return ecfBloqTeclMouse;
	}

	public void setEcfBloqTeclMouseBoolean(Boolean value)
	{
		if (value) {
			this.ecfBloqTeclMouse = "S";
		}
		else {
			this.ecfBloqTeclMouse = "N";
		}
	}
	public Boolean getEcfBloqTeclMouseBoolean()
	{
		return ((this.ecfBloqTeclMouse != null)&&(this.ecfBloqTeclMouse.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_EXIB_MSG_AGUARDE", nullable =  true , length = 1)
	@XmlElement(name = "ecfExibMsgAguarde")
	private String ecfExibMsgAguarde;

	public void setEcfExibMsgAguarde(String ecfExibMsgAguarde)
	{
		this.ecfExibMsgAguarde = ecfExibMsgAguarde;
	}

	public String getEcfExibMsgAguarde()
	{
		return ecfExibMsgAguarde;
	}

	public void setEcfExibMsgAguardeBoolean(Boolean value)
	{
		if (value) {
			this.ecfExibMsgAguarde = "S";
		}
		else {
			this.ecfExibMsgAguarde = "N";
		}
	}
	public Boolean getEcfExibMsgAguardeBoolean()
	{
		return ((this.ecfExibMsgAguarde != null)&&(this.ecfExibMsgAguarde.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_ARRE_QTDE", nullable =  true , length = 1)
	@XmlElement(name = "ecfArreQtde")
	private String ecfArreQtde;

	public void setEcfArreQtde(String ecfArreQtde)
	{
		this.ecfArreQtde = ecfArreQtde;
	}

	public String getEcfArreQtde()
	{
		return ecfArreQtde;
	}

	public void setEcfArreQtdeBoolean(Boolean value)
	{
		if (value) {
			this.ecfArreQtde = "S";
		}
		else {
			this.ecfArreQtde = "N";
		}
	}
	public Boolean getEcfArreQtdeBoolean()
	{
		return ((this.ecfArreQtde != null)&&(this.ecfArreQtde.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_GAV_SIN_INV", nullable =  true , length = 1)
	@XmlElement(name = "ecfGavSinInv")
	private String ecfGavSinInv;

	public void setEcfGavSinInv(String ecfGavSinInv)
	{
		this.ecfGavSinInv = ecfGavSinInv;
	}

	public String getEcfGavSinInv()
	{
		return ecfGavSinInv;
	}

	public void setEcfGavSinInvBoolean(Boolean value)
	{
		if (value) {
			this.ecfGavSinInv = "S";
		}
		else {
			this.ecfGavSinInv = "N";
		}
	}
	public Boolean getEcfGavSinInvBoolean()
	{
		return ((this.ecfGavSinInv != null)&&(this.ecfGavSinInv.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_VERIF_GAV", nullable =  true , length = 1)
	@XmlElement(name = "ecfVerifGav")
	private String ecfVerifGav;

	public void setEcfVerifGav(String ecfVerifGav)
	{
		this.ecfVerifGav = ecfVerifGav;
	}

	public String getEcfVerifGav()
	{
		return ecfVerifGav;
	}

	public void setEcfVerifGavBoolean(Boolean value)
	{
		if (value) {
			this.ecfVerifGav = "S";
		}
		else {
			this.ecfVerifGav = "N";
		}
	}
	public Boolean getEcfVerifGavBoolean()
	{
		return ((this.ecfVerifGav != null)&&(this.ecfVerifGav.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_ABRI_GAV", nullable =  true , length = 1)
	@XmlElement(name = "ecfAbriGav")
	private String ecfAbriGav;

	public void setEcfAbriGav(String ecfAbriGav)
	{
		this.ecfAbriGav = ecfAbriGav;
	}

	public String getEcfAbriGav()
	{
		return ecfAbriGav;
	}

	public void setEcfAbriGavBoolean(Boolean value)
	{
		if (value) {
			this.ecfAbriGav = "S";
		}
		else {
			this.ecfAbriGav = "N";
		}
	}
	public Boolean getEcfAbriGavBoolean()
	{
		return ((this.ecfAbriGav != null)&&(this.ecfAbriGav.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ECF_ALIQ", nullable =  true , length = 80)
	@XmlElement(name = "ecfAliq")
	private String ecfAliq;

	public void setEcfAliq(String ecfAliq)
	{
		this.ecfAliq = ecfAliq;
	}

	public String getEcfAliq()
	{
		return ecfAliq;
	}

	@Column(name="PARV_ECF_FPG", nullable =  true , length = 200)
	@XmlElement(name = "ecfFpg")
	private String ecfFpg;

	public void setEcfFpg(String ecfFpg)
	{
		this.ecfFpg = ecfFpg;
	}

	public String getEcfFpg()
	{
		return ecfFpg;
	}

	@Column(name="PARV_ECF_MOE", nullable =  true , length = 100)
	@XmlElement(name = "ecfMoe")
	private String ecfMoe;

	public void setEcfMoe(String ecfMoe)
	{
		this.ecfMoe = ecfMoe;
	}

	public String getEcfMoe()
	{
		return ecfMoe;
	}

	@Column(name="PARV_ECF", nullable =  true , length = 1)
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
	@Column(name="PARV_MARGEM_01", nullable =  true , length = 17)
	@XmlElement(name = "margem01")
	private Float margem01= 0f;

	public void setMargem01(Float margem01)
	{
		this.margem01 = margem01;
	}

	public Float getMargem01()
	{
		return margem01;
	}

	@Column(name="PARV_MARGEM_02", nullable =  true , length = 17)
	@XmlElement(name = "margem02")
	private Float margem02= 0f;

	public void setMargem02(Float margem02)
	{
		this.margem02 = margem02;
	}

	public Float getMargem02()
	{
		return margem02;
	}

	@Column(name="PARV_MARGEM_03", nullable =  true , length = 17)
	@XmlElement(name = "margem03")
	private Float margem03= 0f;

	public void setMargem03(Float margem03)
	{
		this.margem03 = margem03;
	}

	public Float getMargem03()
	{
		return margem03;
	}

	@Column(name="PARV_MARGEM_04", nullable =  true , length = 17)
	@XmlElement(name = "margem04")
	private Float margem04= 0f;

	public void setMargem04(Float margem04)
	{
		this.margem04 = margem04;
	}

	public Float getMargem04()
	{
		return margem04;
	}

	@Column(name="PARV_MARGEM_05", nullable =  true , length = 17)
	@XmlElement(name = "margem05")
	private Float margem05= 0f;

	public void setMargem05(Float margem05)
	{
		this.margem05 = margem05;
	}

	public Float getMargem05()
	{
		return margem05;
	}

	@Column(name="CODVENDEDOR_EXT", nullable =  true , length = 11)
	@XmlElement(name = "ext")
	private Integer ext;

	public void setExt(Integer ext)
	{
		this.ext = ext;
	}

	public Integer getExt()
	{
		return ext;
	}

	@Column(name="PARV_CUSTO_ADM", nullable =  true , length = 17)
	@XmlElement(name = "custoAdm")
	private Float custoAdm= 0f;

	public void setCustoAdm(Float custoAdm)
	{
		this.custoAdm = custoAdm;
	}

	public Float getCustoAdm()
	{
		return custoAdm;
	}

	@Column(name="PARV_IMP_FED", nullable =  true , length = 17)
	@XmlElement(name = "impFed")
	private Float impFed= 0f;

	public void setImpFed(Float impFed)
	{
		this.impFed = impFed;
	}

	public Float getImpFed()
	{
		return impFed;
	}

	@Column(name="PARV_SUPER_SIMP", nullable =  true , length = 1)
	@XmlElement(name = "superSimp")
	private String superSimp;

	public void setSuperSimp(String superSimp)
	{
		this.superSimp = superSimp;
	}

	public String getSuperSimp()
	{
		return superSimp;
	}

	public void setSuperSimpBoolean(Boolean value)
	{
		if (value) {
			this.superSimp = "S";
		}
		else {
			this.superSimp = "N";
		}
	}
	public Boolean getSuperSimpBoolean()
	{
		return ((this.superSimp != null)&&(this.superSimp.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_IMP_FRONT", nullable =  true , length = 17)
	@XmlElement(name = "impFront")
	private Float impFront= 0f;

	public void setImpFront(Float impFront)
	{
		this.impFront = impFront;
	}

	public Float getImpFront()
	{
		return impFront;
	}

	@Column(name="PARV_IMP_SAIDA", nullable =  true , length = 17)
	@XmlElement(name = "impSaida")
	private Float impSaida= 0f;

	public void setImpSaida(Float impSaida)
	{
		this.impSaida = impSaida;
	}

	public Float getImpSaida()
	{
		return impSaida;
	}

	@Column(name="CODCENTCUSTO_NFVENDA", nullable =  true , length = 11)
	@XmlElement(name = "nfvenda")
	private Integer nfvenda;

	public void setNfvenda(Integer nfvenda)
	{
		this.nfvenda = nfvenda;
	}

	public Integer getNfvenda()
	{
		return nfvenda;
	}

	@Column(name="CODCENTCUSTO_NFCOMPRA", nullable =  true , length = 11)
	@XmlElement(name = "nfcompra")
	private Integer nfcompra;

	public void setNfcompra(Integer nfcompra)
	{
		this.nfcompra = nfcompra;
	}

	public Integer getNfcompra()
	{
		return nfcompra;
	}

	@Column(name="PARV_ASSINATURA_PEDIDO", nullable =  true , length = 0)
	@XmlElement(name = "assinaturaPedido")
	private Integer assinaturaPedido;

	public void setAssinaturaPedido(Integer assinaturaPedido)
	{
		this.assinaturaPedido = assinaturaPedido;
	}

	public Integer getAssinaturaPedido()
	{
		return assinaturaPedido;
	}

	@Column(name="PARV_OBS_PEDIDO", nullable =  true , length = 0)
	@XmlElement(name = "obsPedido")
	private Integer obsPedido;

	public void setObsPedido(Integer obsPedido)
	{
		this.obsPedido = obsPedido;
	}

	public Integer getObsPedido()
	{
		return obsPedido;
	}

	@Column(name="PARV_IMP_VENDEDOR", nullable =  true , length = 1)
	@XmlElement(name = "impVendedor")
	private String impVendedor;

	public void setImpVendedor(String impVendedor)
	{
		this.impVendedor = impVendedor;
	}

	public String getImpVendedor()
	{
		return impVendedor;
	}

	public void setImpVendedorBoolean(Boolean value)
	{
		if (value) {
			this.impVendedor = "S";
		}
		else {
			this.impVendedor = "N";
		}
	}
	public Boolean getImpVendedorBoolean()
	{
		return ((this.impVendedor != null)&&(this.impVendedor.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_ASSINATURA_2_PEDIDO", nullable =  true , length = 0)
	@XmlElement(name = "assinatura2Pedido")
	private String assinatura2Pedido;

	public void setAssinatura2Pedido(String assinatura2Pedido)
	{
		this.assinatura2Pedido = assinatura2Pedido;
	}

	public String getAssinatura2Pedido()
	{
		return assinatura2Pedido;
	}

	@Column(name="PARV_SENHA_DESCONTO", nullable =  true , length = 20)
	@XmlElement(name = "senhaDesconto")
	private String senhaDesconto;

	public void setSenhaDesconto(String senhaDesconto)
	{
		this.senhaDesconto = senhaDesconto;
	}

	public String getSenhaDesconto()
	{
		return senhaDesconto;
	}

	@Column(name="CODBANCO_PRINCIPAL", nullable =  true , length = 11)
	@XmlElement(name = "principal")
	private Integer principal;

	public void setPrincipal(Integer principal)
	{
		this.principal = principal;
	}

	public Integer getPrincipal()
	{
		return principal;
	}

	@Column(name="CODBANCO_SECUNDARIO", nullable =  true , length = 11)
	@XmlElement(name = "secundario")
	private Integer secundario;

	public void setSecundario(Integer secundario)
	{
		this.secundario = secundario;
	}

	public Integer getSecundario()
	{
		return secundario;
	}

	@Column(name="PARV_ABERTURA_CAIXA", nullable =  true , length = 1)
	@XmlElement(name = "aberturaCaixa")
	private String aberturaCaixa;

	public void setAberturaCaixa(String aberturaCaixa)
	{
		this.aberturaCaixa = aberturaCaixa;
	}

	public String getAberturaCaixa()
	{
		return aberturaCaixa;
	}

	public void setAberturaCaixaBoolean(Boolean value)
	{
		if (value) {
			this.aberturaCaixa = "S";
		}
		else {
			this.aberturaCaixa = "N";
		}
	}
	public Boolean getAberturaCaixaBoolean()
	{
		return ((this.aberturaCaixa != null)&&(this.aberturaCaixa.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_FECHAMENTO_TIPO", nullable =  true , length = 1)
	@XmlElement(name = "fechamentoTipo")
	private String fechamentoTipo;

	public void setFechamentoTipo(String fechamentoTipo)
	{
		this.fechamentoTipo = fechamentoTipo;
	}

	public String getFechamentoTipo()
	{
		return fechamentoTipo;
	}

	public void setFechamentoTipoBoolean(Boolean value)
	{
		if (value) {
			this.fechamentoTipo = "S";
		}
		else {
			this.fechamentoTipo = "N";
		}
	}
	public Boolean getFechamentoTipoBoolean()
	{
		return ((this.fechamentoTipo != null)&&(this.fechamentoTipo.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_DESCONTO_1", nullable =  true , length = 17)
	@XmlElement(name = "desconto1")
	private Float desconto1= 0f;

	public void setDesconto1(Float desconto1)
	{
		this.desconto1 = desconto1;
	}

	public Float getDesconto1()
	{
		return desconto1;
	}

	@Column(name="PARV_DESCONTO_2", nullable =  true , length = 17)
	@XmlElement(name = "desconto2")
	private Float desconto2= 0f;

	public void setDesconto2(Float desconto2)
	{
		this.desconto2 = desconto2;
	}

	public Float getDesconto2()
	{
		return desconto2;
	}

	@Column(name="PARV_DESCONTO_3", nullable =  true , length = 17)
	@XmlElement(name = "desconto3")
	private Float desconto3= 0f;

	public void setDesconto3(Float desconto3)
	{
		this.desconto3 = desconto3;
	}

	public Float getDesconto3()
	{
		return desconto3;
	}

	@Column(name="PARV_SENHA_DESCONTO_2", nullable =  true , length = 20)
	@XmlElement(name = "senhaDesconto2")
	private String senhaDesconto2;

	public void setSenhaDesconto2(String senhaDesconto2)
	{
		this.senhaDesconto2 = senhaDesconto2;
	}

	public String getSenhaDesconto2()
	{
		return senhaDesconto2;
	}

	@Column(name="PARV_SENHA_DESCONTO_3", nullable =  true , length = 20)
	@XmlElement(name = "senhaDesconto3")
	private String senhaDesconto3;

	public void setSenhaDesconto3(String senhaDesconto3)
	{
		this.senhaDesconto3 = senhaDesconto3;
	}

	public String getSenhaDesconto3()
	{
		return senhaDesconto3;
	}

	@Column(name="PARV_CUSTO_TP_LENTE_1", nullable =  true , length = 17)
	@XmlElement(name = "custoTpLente1")
	private Float custoTpLente1= 0f;

	public void setCustoTpLente1(Float custoTpLente1)
	{
		this.custoTpLente1 = custoTpLente1;
	}

	public Float getCustoTpLente1()
	{
		return custoTpLente1;
	}

	@Column(name="PARV_CUSTO_TP_LENTE_2", nullable =  true , length = 17)
	@XmlElement(name = "custoTpLente2")
	private Float custoTpLente2= 0f;

	public void setCustoTpLente2(Float custoTpLente2)
	{
		this.custoTpLente2 = custoTpLente2;
	}

	public Float getCustoTpLente2()
	{
		return custoTpLente2;
	}

	@Column(name="PARV_CUSTO_TP_LENTE_3", nullable =  true , length = 17)
	@XmlElement(name = "custoTpLente3")
	private Float custoTpLente3= 0f;

	public void setCustoTpLente3(Float custoTpLente3)
	{
		this.custoTpLente3 = custoTpLente3;
	}

	public Float getCustoTpLente3()
	{
		return custoTpLente3;
	}

	@Column(name="PARV_QTDE_LINHAS_REL", nullable =  true , length = 11)
	@XmlElement(name = "qtdeLinhasRel")
	private Integer qtdeLinhasRel;

	public void setQtdeLinhasRel(Integer qtdeLinhasRel)
	{
		this.qtdeLinhasRel = qtdeLinhasRel;
	}

	public Integer getQtdeLinhasRel()
	{
		return qtdeLinhasRel;
	}

	@Column(name="PARV_IMPRIMIR_PDV", nullable =  true , length = 1)
	@XmlElement(name = "imprimirPdv")
	private String imprimirPdv;

	public void setImprimirPdv(String imprimirPdv)
	{
		this.imprimirPdv = imprimirPdv;
	}

	public String getImprimirPdv()
	{
		return imprimirPdv;
	}

	public void setImprimirPdvBoolean(Boolean value)
	{
		if (value) {
			this.imprimirPdv = "S";
		}
		else {
			this.imprimirPdv = "N";
		}
	}
	public Boolean getImprimirPdvBoolean()
	{
		return ((this.imprimirPdv != null)&&(this.imprimirPdv.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_NAO_GERAR_CODIGO", nullable =  true , length = 1)
	@XmlElement(name = "naoGerarCodigo")
	private String naoGerarCodigo;

	public void setNaoGerarCodigo(String naoGerarCodigo)
	{
		this.naoGerarCodigo = naoGerarCodigo;
	}

	public String getNaoGerarCodigo()
	{
		return naoGerarCodigo;
	}

	public void setNaoGerarCodigoBoolean(Boolean value)
	{
		if (value) {
			this.naoGerarCodigo = "S";
		}
		else {
			this.naoGerarCodigo = "N";
		}
	}
	public Boolean getNaoGerarCodigoBoolean()
	{
		return ((this.naoGerarCodigo != null)&&(this.naoGerarCodigo.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_CANCEL_SOMENTE_DIA", nullable =  true , length = 1)
	@XmlElement(name = "cancelSomenteDia")
	private String cancelSomenteDia;

	public void setCancelSomenteDia(String cancelSomenteDia)
	{
		this.cancelSomenteDia = cancelSomenteDia;
	}

	public String getCancelSomenteDia()
	{
		return cancelSomenteDia;
	}

	public void setCancelSomenteDiaBoolean(Boolean value)
	{
		if (value) {
			this.cancelSomenteDia = "S";
		}
		else {
			this.cancelSomenteDia = "N";
		}
	}
	public Boolean getCancelSomenteDiaBoolean()
	{
		return ((this.cancelSomenteDia != null)&&(this.cancelSomenteDia.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_SENHA_CANCEL_DEPOIS", nullable =  true , length = 30)
	@XmlElement(name = "senhaCancelDepois")
	private String senhaCancelDepois;

	public void setSenhaCancelDepois(String senhaCancelDepois)
	{
		this.senhaCancelDepois = senhaCancelDepois;
	}

	public String getSenhaCancelDepois()
	{
		return senhaCancelDepois;
	}

	@Column(name="PARV_FUNDO_CAIXA", nullable =  true , length = 1)
	@XmlElement(name = "fundoCaixa")
	private String fundoCaixa;

	public void setFundoCaixa(String fundoCaixa)
	{
		this.fundoCaixa = fundoCaixa;
	}

	public String getFundoCaixa()
	{
		return fundoCaixa;
	}

	public void setFundoCaixaBoolean(Boolean value)
	{
		if (value) {
			this.fundoCaixa = "S";
		}
		else {
			this.fundoCaixa = "N";
		}
	}
	public Boolean getFundoCaixaBoolean()
	{
		return ((this.fundoCaixa != null)&&(this.fundoCaixa.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_MARG_PROD", nullable =  false , length = 1)
	@XmlElement(name = "margProd")
	private String margProd;

	public void setMargProd(String margProd)
	{
		this.margProd = margProd;
	}

	public String getMargProd()
	{
		return margProd;
	}

	public void setMargProdBoolean(Boolean value)
	{
		if (value) {
			this.margProd = "S";
		}
		else {
			this.margProd = "N";
		}
	}
	public Boolean getMargProdBoolean()
	{
		return ((this.margProd != null)&&(this.margProd.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_PREC_PROD_RO", nullable =  false , length = 1)
	@XmlElement(name = "precProdRo")
	private String precProdRo;

	public void setPrecProdRo(String precProdRo)
	{
		this.precProdRo = precProdRo;
	}

	public String getPrecProdRo()
	{
		return precProdRo;
	}

	public void setPrecProdRoBoolean(Boolean value)
	{
		if (value) {
			this.precProdRo = "S";
		}
		else {
			this.precProdRo = "N";
		}
	}
	public Boolean getPrecProdRoBoolean()
	{
		return ((this.precProdRo != null)&&(this.precProdRo.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_QTDE_PROD_PRECO", nullable =  false , length = 2)
	@XmlElement(name = "qtdeProdPreco")
	private String qtdeProdPreco;

	public void setQtdeProdPreco(String qtdeProdPreco)
	{
		this.qtdeProdPreco = qtdeProdPreco;
	}

	public String getQtdeProdPreco()
	{
		return qtdeProdPreco;
	}

	@Column(name="PARV_PRE_VEND_RP", nullable =  false , length = 2)
	@XmlElement(name = "preVendRp")
	private String preVendRp;

	public void setPreVendRp(String preVendRp)
	{
		this.preVendRp = preVendRp;
	}

	public String getPreVendRp()
	{
		return preVendRp;
	}

	@Column(name="PARV_SENHA_CONSULTA", nullable =  true , length = 20)
	@XmlElement(name = "senhaConsulta")
	private String senhaConsulta;

	public void setSenhaConsulta(String senhaConsulta)
	{
		this.senhaConsulta = senhaConsulta;
	}

	public String getSenhaConsulta()
	{
		return senhaConsulta;
	}

	@Column(name="PARV_CUST_AJUSTE", nullable =  true , length = 1)
	@XmlElement(name = "custAjuste")
	private String custAjuste;

	public void setCustAjuste(String custAjuste)
	{
		this.custAjuste = custAjuste;
	}

	public String getCustAjuste()
	{
		return custAjuste;
	}

	public void setCustAjusteBoolean(Boolean value)
	{
		if (value) {
			this.custAjuste = "S";
		}
		else {
			this.custAjuste = "N";
		}
	}
	public Boolean getCustAjusteBoolean()
	{
		return ((this.custAjuste != null)&&(this.custAjuste.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_MSG_ECF", nullable =  true , length = 90)
	@XmlElement(name = "msgEcf")
	private String msgEcf;

	public void setMsgEcf(String msgEcf)
	{
		this.msgEcf = msgEcf;
	}

	public String getMsgEcf()
	{
		return msgEcf;
	}

	@Column(name="PARV_IT_DESC_1", nullable =  true , length = 17)
	@XmlElement(name = "itDesc1")
	private Float itDesc1= 0f;

	public void setItDesc1(Float itDesc1)
	{
		this.itDesc1 = itDesc1;
	}

	public Float getItDesc1()
	{
		return itDesc1;
	}

	@Column(name="PARV_IT_DESC_2", nullable =  true , length = 17)
	@XmlElement(name = "itDesc2")
	private Float itDesc2= 0f;

	public void setItDesc2(Float itDesc2)
	{
		this.itDesc2 = itDesc2;
	}

	public Float getItDesc2()
	{
		return itDesc2;
	}

	@Column(name="PARV_IT_DESC_3", nullable =  true , length = 17)
	@XmlElement(name = "itDesc3")
	private Float itDesc3= 0f;

	public void setItDesc3(Float itDesc3)
	{
		this.itDesc3 = itDesc3;
	}

	public Float getItDesc3()
	{
		return itDesc3;
	}

	@Column(name="PARV_IT_DESC_4", nullable =  true , length = 17)
	@XmlElement(name = "itDesc4")
	private Float itDesc4= 0f;

	public void setItDesc4(Float itDesc4)
	{
		this.itDesc4 = itDesc4;
	}

	public Float getItDesc4()
	{
		return itDesc4;
	}

	@Column(name="PARV_IT_DESC_SENHA_1", nullable =  true , length = 20)
	@XmlElement(name = "itDescSenha1")
	private String itDescSenha1;

	public void setItDescSenha1(String itDescSenha1)
	{
		this.itDescSenha1 = itDescSenha1;
	}

	public String getItDescSenha1()
	{
		return itDescSenha1;
	}

	@Column(name="PARV_IT_DESC_SENHA_2", nullable =  true , length = 20)
	@XmlElement(name = "itDescSenha2")
	private String itDescSenha2;

	public void setItDescSenha2(String itDescSenha2)
	{
		this.itDescSenha2 = itDescSenha2;
	}

	public String getItDescSenha2()
	{
		return itDescSenha2;
	}

	@Column(name="PARV_IT_DESC_SENHA_3", nullable =  true , length = 20)
	@XmlElement(name = "itDescSenha3")
	private String itDescSenha3;

	public void setItDescSenha3(String itDescSenha3)
	{
		this.itDescSenha3 = itDescSenha3;
	}

	public String getItDescSenha3()
	{
		return itDescSenha3;
	}

	@Column(name="PARV_IT_DESC_SENHA_4", nullable =  true , length = 20)
	@XmlElement(name = "itDescSenha4")
	private String itDescSenha4;

	public void setItDescSenha4(String itDescSenha4)
	{
		this.itDescSenha4 = itDescSenha4;
	}

	public String getItDescSenha4()
	{
		return itDescSenha4;
	}

	@Column(name="PARV_DIAS_CARENCIA", nullable =  true , length = 11)
	@XmlElement(name = "diasCarencia")
	private Integer diasCarencia;

	public void setDiasCarencia(Integer diasCarencia)
	{
		this.diasCarencia = diasCarencia;
	}

	public Integer getDiasCarencia()
	{
		return diasCarencia;
	}

	@Column(name="PARV_JUROS_DIA", nullable =  true , length = 17)
	@XmlElement(name = "jurosDia")
	private Float jurosDia= 0f;

	public void setJurosDia(Float jurosDia)
	{
		this.jurosDia = jurosDia;
	}

	public Float getJurosDia()
	{
		return jurosDia;
	}

	@Column(name="PARV_MENOR_PARCELA", nullable =  true , length = 17)
	@XmlElement(name = "menorParcela")
	private Float menorParcela= 0f;

	public void setMenorParcela(Float menorParcela)
	{
		this.menorParcela = menorParcela;
	}

	public Float getMenorParcela()
	{
		return menorParcela;
	}

	@Column(name="PARV_SENHA_MENOR_PARCELA", nullable =  true , length = 15)
	@XmlElement(name = "senhaMenorParcela")
	private String senhaMenorParcela;

	public void setSenhaMenorParcela(String senhaMenorParcela)
	{
		this.senhaMenorParcela = senhaMenorParcela;
	}

	public String getSenhaMenorParcela()
	{
		return senhaMenorParcela;
	}

	@Column(name="CODPESSOA_FRETE_CIF", nullable =  true , length = 11)
	@XmlElement(name = "freteCif")
	private Integer freteCif;

	public void setFreteCif(Integer freteCif)
	{
		this.freteCif = freteCif;
	}

	public Integer getFreteCif()
	{
		return freteCif;
	}

	@Column(name="CODPESSOA_FRETE_FOB", nullable =  true , length = 11)
	@XmlElement(name = "freteFob")
	private Integer freteFob;

	public void setFreteFob(Integer freteFob)
	{
		this.freteFob = freteFob;
	}

	public Integer getFreteFob()
	{
		return freteFob;
	}

	@Column(name="CODMOEDA_FRETE", nullable =  true , length = 11)
	@XmlElement(name = "frete")
	private Integer frete;

	public void setFrete(Integer frete)
	{
		this.frete = frete;
	}

	public Integer getFrete()
	{
		return frete;
	}

	@Column(name="PARV_ESTAC_VLR_DIARIA", nullable =  true , length = 9)
	@XmlElement(name = "estacVlrDiaria")
	private Integer estacVlrDiaria;

	public void setEstacVlrDiaria(Integer estacVlrDiaria)
	{
		this.estacVlrDiaria = estacVlrDiaria;
	}

	public Integer getEstacVlrDiaria()
	{
		return estacVlrDiaria;
	}

	@Column(name="PARV_ESTAC_TOL_HORAS", nullable =  true , length = 9)
	@XmlElement(name = "estacTolHoras")
	private Integer estacTolHoras;

	public void setEstacTolHoras(Integer estacTolHoras)
	{
		this.estacTolHoras = estacTolHoras;
	}

	public Integer getEstacTolHoras()
	{
		return estacTolHoras;
	}

	@Column(name="CODMOEDA_AQUISICAO_VEICULO", nullable =  true , length = 11)
	@XmlElement(name = "aquisicaoVeiculo")
	private Integer aquisicaoVeiculo;

	public void setAquisicaoVeiculo(Integer aquisicaoVeiculo)
	{
		this.aquisicaoVeiculo = aquisicaoVeiculo;
	}

	public Integer getAquisicaoVeiculo()
	{
		return aquisicaoVeiculo;
	}

	@Column(name="PARV_FRETE_VLR_COMBUSTIVEL", nullable =  true , length = 9)
	@XmlElement(name = "freteVlrCombustivel")
	private Integer freteVlrCombustivel;

	public void setFreteVlrCombustivel(Integer freteVlrCombustivel)
	{
		this.freteVlrCombustivel = freteVlrCombustivel;
	}

	public Integer getFreteVlrCombustivel()
	{
		return freteVlrCombustivel;
	}

	@Column(name="PARV_FRETE_IND_KM_RODADOS", nullable =  true , length = 9)
	@XmlElement(name = "freteIndKmRodados")
	private Integer freteIndKmRodados;

	public void setFreteIndKmRodados(Integer freteIndKmRodados)
	{
		this.freteIndKmRodados = freteIndKmRodados;
	}

	public Integer getFreteIndKmRodados()
	{
		return freteIndKmRodados;
	}

	@Column(name="PARV_FRETE_IND_GASTOS_PNEU", nullable =  true , length = 9)
	@XmlElement(name = "freteIndGastosPneu")
	private Integer freteIndGastosPneu;

	public void setFreteIndGastosPneu(Integer freteIndGastosPneu)
	{
		this.freteIndGastosPneu = freteIndGastosPneu;
	}

	public Integer getFreteIndGastosPneu()
	{
		return freteIndGastosPneu;
	}

	@Column(name="PARV_FRETE_IND_MANUTENCAO", nullable =  true , length = 9)
	@XmlElement(name = "freteIndManutencao")
	private Integer freteIndManutencao;

	public void setFreteIndManutencao(Integer freteIndManutencao)
	{
		this.freteIndManutencao = freteIndManutencao;
	}

	public Integer getFreteIndManutencao()
	{
		return freteIndManutencao;
	}

	@Column(name="PARV_ESTAC_VLR_DIARIA_BITREM", nullable =  true , length = 9)
	@XmlElement(name = "estacVlrDiariaBitrem")
	private Integer estacVlrDiariaBitrem;

	public void setEstacVlrDiariaBitrem(Integer estacVlrDiariaBitrem)
	{
		this.estacVlrDiariaBitrem = estacVlrDiariaBitrem;
	}

	public Integer getEstacVlrDiariaBitrem()
	{
		return estacVlrDiariaBitrem;
	}

	@Column(name="PARV_ESTAC_VLR_DIARIA_TRUCK", nullable =  true , length = 9)
	@XmlElement(name = "estacVlrDiariaTruck")
	private Integer estacVlrDiariaTruck;

	public void setEstacVlrDiariaTruck(Integer estacVlrDiariaTruck)
	{
		this.estacVlrDiariaTruck = estacVlrDiariaTruck;
	}

	public Integer getEstacVlrDiariaTruck()
	{
		return estacVlrDiariaTruck;
	}

	@Column(name="PARV_ESTAC_VLR_DIARIA_CARRETA", nullable =  true , length = 9)
	@XmlElement(name = "estacVlrDiariaCarreta")
	private Integer estacVlrDiariaCarreta;

	public void setEstacVlrDiariaCarreta(Integer estacVlrDiariaCarreta)
	{
		this.estacVlrDiariaCarreta = estacVlrDiariaCarreta;
	}

	public Integer getEstacVlrDiariaCarreta()
	{
		return estacVlrDiariaCarreta;
	}

	@Column(name="PARV_ESTAC_QTDE_HORAS_GRATIS", nullable =  true , length = 9)
	@XmlElement(name = "estacQtdeHorasGratis")
	private Integer estacQtdeHorasGratis;

	public void setEstacQtdeHorasGratis(Integer estacQtdeHorasGratis)
	{
		this.estacQtdeHorasGratis = estacQtdeHorasGratis;
	}

	public Integer getEstacQtdeHorasGratis()
	{
		return estacQtdeHorasGratis;
	}

	@Column(name="CODCENTCUSTO_MENSALIDADES", nullable =  true , length = 11)
	@XmlElement(name = "mensalidades")
	private Integer mensalidades;

	public void setMensalidades(Integer mensalidades)
	{
		this.mensalidades = mensalidades;
	}

	public Integer getMensalidades()
	{
		return mensalidades;
	}

	@Column(name="PARV_URL_GERADOR_BOLETOS", nullable =  true , length = 150)
	@XmlElement(name = "urlGeradorBoletos")
	private String urlGeradorBoletos;

	public void setUrlGeradorBoletos(String urlGeradorBoletos)
	{
		this.urlGeradorBoletos = urlGeradorBoletos;
	}

	public String getUrlGeradorBoletos()
	{
		return urlGeradorBoletos;
	}

	@Column(name="PARV_BOLETO_DEMONSTRATIVO1", nullable =  true , length = 255)
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

	@Column(name="PARV_BOLETO_DEMONSTRATIVO2", nullable =  true , length = 255)
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

	@Column(name="PARV_BOLETO_DEMONSTRATIVO3", nullable =  true , length = 255)
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

	@Column(name="PARV_CUSTO_KM", nullable =  true , length = 9)
	@XmlElement(name = "custoKm")
	private String custoKm;

	public void setCustoKm(String custoKm)
	{
		this.custoKm = custoKm;
	}

	public String getCustoKm()
	{
		return custoKm;
	}

	@Column(name="PARV_ESTAC_VLR_DIARIA_TREMINHA", nullable =  true , length = 9)
	@XmlElement(name = "estacVlrDiariaTreminha")
	private String estacVlrDiariaTreminha;

	public void setEstacVlrDiariaTreminha(String estacVlrDiariaTreminha)
	{
		this.estacVlrDiariaTreminha = estacVlrDiariaTreminha;
	}

	public String getEstacVlrDiariaTreminha()
	{
		return estacVlrDiariaTreminha;
	}

	@Column(name="PARV_OBS_PEDCOMPRA", nullable =  true , length = 0)
	@XmlElement(name = "obsPedcompra")
	private String obsPedcompra;

	public void setObsPedcompra(String obsPedcompra)
	{
		this.obsPedcompra = obsPedcompra;
	}

	public String getObsPedcompra()
	{
		return obsPedcompra;
	}

	@Column(name="PARV_TEXTO_TERMO_ENTR_EPI", nullable =  true , length = 0)
	@XmlElement(name = "textoTermoEntrEpi")
	private String textoTermoEntrEpi;

	public void setTextoTermoEntrEpi(String textoTermoEntrEpi)
	{
		this.textoTermoEntrEpi = textoTermoEntrEpi;
	}

	public String getTextoTermoEntrEpi()
	{
		return textoTermoEntrEpi;
	}

	@Column(name="PARV_TXT_FIN_TERMO_ENTR_EPI", nullable =  true , length = 0)
	@XmlElement(name = "txtFinTermoEntrEpi")
	private String txtFinTermoEntrEpi;

	public void setTxtFinTermoEntrEpi(String txtFinTermoEntrEpi)
	{
		this.txtFinTermoEntrEpi = txtFinTermoEntrEpi;
	}

	public String getTxtFinTermoEntrEpi()
	{
		return txtFinTermoEntrEpi;
	}

	@Column(name="PARV_BAL_INTERVALO", nullable =  true , length = 10)
	@XmlElement(name = "balIntervalo")
	private String balIntervalo;

	public void setBalIntervalo(String balIntervalo)
	{
		this.balIntervalo = balIntervalo;
	}

	public String getBalIntervalo()
	{
		return balIntervalo;
	}

	@Column(name="PARV_BAL_MODELO", nullable =  true , length = 20)
	@XmlElement(name = "balModelo")
	private String balModelo;

	public void setBalModelo(String balModelo)
	{
		this.balModelo = balModelo;
	}

	public String getBalModelo()
	{
		return balModelo;
	}

	@Column(name="PARV_BAL_MONITORAR", nullable =  true , length = 1)
	@XmlElement(name = "balMonitorar")
	private String balMonitorar;

	public void setBalMonitorar(String balMonitorar)
	{
		this.balMonitorar = balMonitorar;
	}

	public String getBalMonitorar()
	{
		return balMonitorar;
	}

	public void setBalMonitorarBoolean(Boolean value)
	{
		if (value) {
			this.balMonitorar = "S";
		}
		else {
			this.balMonitorar = "N";
		}
	}
	public Boolean getBalMonitorarBoolean()
	{
		return ((this.balMonitorar != null)&&(this.balMonitorar.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_BAL_PORTA", nullable =  true , length = 10)
	@XmlElement(name = "balPorta")
	private String balPorta;

	public void setBalPorta(String balPorta)
	{
		this.balPorta = balPorta;
	}

	public String getBalPorta()
	{
		return balPorta;
	}

	@Column(name="PARV_BAL_MODELO_BALANCA", nullable =  true , length = 11)
	@XmlElement(name = "balModeloBalanca")
	private Integer balModeloBalanca;

	public void setBalModeloBalanca(Integer balModeloBalanca)
	{
		this.balModeloBalanca = balModeloBalanca;
	}

	public Integer getBalModeloBalanca()
	{
		return balModeloBalanca;
	}

	@Column(name="PARV_BAL_BAUD", nullable =  true , length = 11)
	@XmlElement(name = "balBaud")
	private Integer balBaud;

	public void setBalBaud(Integer balBaud)
	{
		this.balBaud = balBaud;
	}

	public Integer getBalBaud()
	{
		return balBaud;
	}

	@Column(name="PARV_BAL_DATA", nullable =  true , length = 11)
	@XmlElement(name = "balData")
	private Integer balData;

	public void setBalData(Integer balData)
	{
		this.balData = balData;
	}

	public Integer getBalData()
	{
		return balData;
	}

	@Column(name="PARV_BAL_HANDSHAKE", nullable =  true , length = 10)
	@XmlElement(name = "balHandshake")
	private String balHandshake;

	public void setBalHandshake(String balHandshake)
	{
		this.balHandshake = balHandshake;
	}

	public String getBalHandshake()
	{
		return balHandshake;
	}

	@Column(name="PARV_BAL_HARDFLOW", nullable =  true , length = 1)
	@XmlElement(name = "balHardflow")
	private String balHardflow;

	public void setBalHardflow(String balHardflow)
	{
		this.balHardflow = balHardflow;
	}

	public String getBalHardflow()
	{
		return balHardflow;
	}

	public void setBalHardflowBoolean(Boolean value)
	{
		if (value) {
			this.balHardflow = "S";
		}
		else {
			this.balHardflow = "N";
		}
	}
	public Boolean getBalHardflowBoolean()
	{
		return ((this.balHardflow != null)&&(this.balHardflow.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_BAL_PARITY", nullable =  true , length = 10)
	@XmlElement(name = "balParity")
	private String balParity;

	public void setBalParity(String balParity)
	{
		this.balParity = balParity;
	}

	public String getBalParity()
	{
		return balParity;
	}

	@Column(name="PARV_BAL_PROCESS_MESSAGES", nullable =  true , length = 1)
	@XmlElement(name = "balProcessMessages")
	private String balProcessMessages;

	public void setBalProcessMessages(String balProcessMessages)
	{
		this.balProcessMessages = balProcessMessages;
	}

	public String getBalProcessMessages()
	{
		return balProcessMessages;
	}

	public void setBalProcessMessagesBoolean(Boolean value)
	{
		if (value) {
			this.balProcessMessages = "S";
		}
		else {
			this.balProcessMessages = "N";
		}
	}
	public Boolean getBalProcessMessagesBoolean()
	{
		return ((this.balProcessMessages != null)&&(this.balProcessMessages.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_BAL_SENDBYTESCOUNT", nullable =  true , length = 11)
	@XmlElement(name = "balSendbytescount")
	private Integer balSendbytescount;

	public void setBalSendbytescount(Integer balSendbytescount)
	{
		this.balSendbytescount = balSendbytescount;
	}

	public Integer getBalSendbytescount()
	{
		return balSendbytescount;
	}

	@Column(name="PARV_BAL_SENDBYTESINTERVAL", nullable =  true , length = 11)
	@XmlElement(name = "balSendbytesinterval")
	private Integer balSendbytesinterval;

	public void setBalSendbytesinterval(Integer balSendbytesinterval)
	{
		this.balSendbytesinterval = balSendbytesinterval;
	}

	public Integer getBalSendbytesinterval()
	{
		return balSendbytesinterval;
	}

	@Column(name="PARV_BAL_STOP", nullable =  true , length = 10)
	@XmlElement(name = "balStop")
	private String balStop;

	public void setBalStop(String balStop)
	{
		this.balStop = balStop;
	}

	public String getBalStop()
	{
		return balStop;
	}

	@Column(name="PARV_BAL_SOFTFLOW", nullable =  true , length = 1)
	@XmlElement(name = "balSoftflow")
	private String balSoftflow;

	public void setBalSoftflow(String balSoftflow)
	{
		this.balSoftflow = balSoftflow;
	}

	public String getBalSoftflow()
	{
		return balSoftflow;
	}

	public void setBalSoftflowBoolean(Boolean value)
	{
		if (value) {
			this.balSoftflow = "S";
		}
		else {
			this.balSoftflow = "N";
		}
	}
	public Boolean getBalSoftflowBoolean()
	{
		return ((this.balSoftflow != null)&&(this.balSoftflow.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_BOL_TIPO_COBRANCA", nullable =  true , length = 20)
	@XmlElement(name = "bolTipoCobranca")
	private String bolTipoCobranca;

	public void setBolTipoCobranca(String bolTipoCobranca)
	{
		this.bolTipoCobranca = bolTipoCobranca;
	}

	public String getBolTipoCobranca()
	{
		return bolTipoCobranca;
	}

	@Column(name="PARV_BOL_CED_AGENCIA", nullable =  true , length = 10)
	@XmlElement(name = "bolCedAgencia")
	private String bolCedAgencia;

	public void setBolCedAgencia(String bolCedAgencia)
	{
		this.bolCedAgencia = bolCedAgencia;
	}

	public String getBolCedAgencia()
	{
		return bolCedAgencia;
	}

	@Column(name="PARV_BOL_CED_AGENCIA_DIGITO", nullable =  true , length = 1)
	@XmlElement(name = "bolCedAgenciaDigito")
	private String bolCedAgenciaDigito;

	public void setBolCedAgenciaDigito(String bolCedAgenciaDigito)
	{
		this.bolCedAgenciaDigito = bolCedAgenciaDigito;
	}

	public String getBolCedAgenciaDigito()
	{
		return bolCedAgenciaDigito;
	}

	public void setBolCedAgenciaDigitoBoolean(Boolean value)
	{
		if (value) {
			this.bolCedAgenciaDigito = "S";
		}
		else {
			this.bolCedAgenciaDigito = "N";
		}
	}
	public Boolean getBolCedAgenciaDigitoBoolean()
	{
		return ((this.bolCedAgenciaDigito != null)&&(this.bolCedAgenciaDigito.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_BOL_CED_CODIGO", nullable =  true , length = 15)
	@XmlElement(name = "bolCedCodigo")
	private String bolCedCodigo;

	public void setBolCedCodigo(String bolCedCodigo)
	{
		this.bolCedCodigo = bolCedCodigo;
	}

	public String getBolCedCodigo()
	{
		return bolCedCodigo;
	}

	@Column(name="PARV_BOL_CED_COD_TRANSMISSAO", nullable =  true , length = 15)
	@XmlElement(name = "bolCedCodTransmissao")
	private String bolCedCodTransmissao;

	public void setBolCedCodTransmissao(String bolCedCodTransmissao)
	{
		this.bolCedCodTransmissao = bolCedCodTransmissao;
	}

	public String getBolCedCodTransmissao()
	{
		return bolCedCodTransmissao;
	}

	@Column(name="PARV_BOL_CED_CONTA", nullable =  true , length = 15)
	@XmlElement(name = "bolCedConta")
	private String bolCedConta;

	public void setBolCedConta(String bolCedConta)
	{
		this.bolCedConta = bolCedConta;
	}

	public String getBolCedConta()
	{
		return bolCedConta;
	}

	@Column(name="PARV_BOL_CED_CONTA_DIG", nullable =  true , length = 1)
	@XmlElement(name = "bolCedContaDig")
	private String bolCedContaDig;

	public void setBolCedContaDig(String bolCedContaDig)
	{
		this.bolCedContaDig = bolCedContaDig;
	}

	public String getBolCedContaDig()
	{
		return bolCedContaDig;
	}

	public void setBolCedContaDigBoolean(Boolean value)
	{
		if (value) {
			this.bolCedContaDig = "S";
		}
		else {
			this.bolCedContaDig = "N";
		}
	}
	public Boolean getBolCedContaDigBoolean()
	{
		return ((this.bolCedContaDig != null)&&(this.bolCedContaDig.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_BOL_CED_RESP_TRANSMISSAO", nullable =  true , length = 20)
	@XmlElement(name = "bolCedRespTransmissao")
	private String bolCedRespTransmissao;

	public void setBolCedRespTransmissao(String bolCedRespTransmissao)
	{
		this.bolCedRespTransmissao = bolCedRespTransmissao;
	}

	public String getBolCedRespTransmissao()
	{
		return bolCedRespTransmissao;
	}

	@Column(name="PARV_BOL_MSG_PADRAO_EMAIL", nullable =  true , length = 200)
	@XmlElement(name = "bolMsgPadraoEmail")
	private String bolMsgPadraoEmail;

	public void setBolMsgPadraoEmail(String bolMsgPadraoEmail)
	{
		this.bolMsgPadraoEmail = bolMsgPadraoEmail;
	}

	public String getBolMsgPadraoEmail()
	{
		return bolMsgPadraoEmail;
	}

	@Column(name="PARV_GADO_VLR_ARROBA_MERC", nullable =  true , length = 17)
	@XmlElement(name = "gadoVlrArrobaMerc")
	private Float gadoVlrArrobaMerc= 0f;

	public void setGadoVlrArrobaMerc(Float gadoVlrArrobaMerc)
	{
		this.gadoVlrArrobaMerc = gadoVlrArrobaMerc;
	}

	public Float getGadoVlrArrobaMerc()
	{
		return gadoVlrArrobaMerc;
	}

	@Column(name="PARV_OBS_CARNE", nullable =  true , length = 0)
	@XmlElement(name = "obsCarne")
	private Float obsCarne= 0f;

	public void setObsCarne(Float obsCarne)
	{
		this.obsCarne = obsCarne;
	}

	public Float getObsCarne()
	{
		return obsCarne;
	}

	@Column(name="PARV_ECF_VELOC_115200", nullable =  true , length = 1)
	@XmlElement(name = "ecfVeloc115200")
	private String ecfVeloc115200;

	public void setEcfVeloc115200(String ecfVeloc115200)
	{
		this.ecfVeloc115200 = ecfVeloc115200;
	}

	public String getEcfVeloc115200()
	{
		return ecfVeloc115200;
	}

	public void setEcfVeloc115200Boolean(Boolean value)
	{
		if (value) {
			this.ecfVeloc115200 = "S";
		}
		else {
			this.ecfVeloc115200 = "N";
		}
	}
	public Boolean getEcfVeloc115200Boolean()
	{
		return ((this.ecfVeloc115200 != null)&&(this.ecfVeloc115200.equalsIgnoreCase("S")));
	}
	@Column(name="PARV_OBS_ORCAMENTO", nullable =  true , length = 0)
	@XmlElement(name = "obsOrcamento")
	private String obsOrcamento;

	public void setObsOrcamento(String obsOrcamento)
	{
		this.obsOrcamento = obsOrcamento;
	}

	public String getObsOrcamento()
	{
		return obsOrcamento;
	}

	@Column(name="PARV_END_ASS_LADO_ESQUERDO", nullable =  true , length = 255)
	@XmlElement(name = "endAssLadoEsquerdo")
	private String endAssLadoEsquerdo;

	public void setEndAssLadoEsquerdo(String endAssLadoEsquerdo)
	{
		this.endAssLadoEsquerdo = endAssLadoEsquerdo;
	}

	public String getEndAssLadoEsquerdo()
	{
		return endAssLadoEsquerdo;
	}

	@Column(name="PARV_BOL_CED_CONVENIO", nullable =  true , length = 15)
	@XmlElement(name = "bolCedConvenio")
	private String bolCedConvenio;

	public void setBolCedConvenio(String bolCedConvenio)
	{
		this.bolCedConvenio = bolCedConvenio;
	}

	public String getBolCedConvenio()
	{
		return bolCedConvenio;
	}

	@Column(name="PARV_PERC_MULTA", nullable =  true , length = 17)
	@XmlElement(name = "percMulta")
	private Float percMulta= 0f;

	public void setPercMulta(Float percMulta)
	{
		this.percMulta = percMulta;
	}

	public Float getPercMulta()
	{
		return percMulta;
	}

}
