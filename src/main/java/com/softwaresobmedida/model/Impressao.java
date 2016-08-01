package com.softwaresobmedida.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.softwaresobmedida.util.TimestampAdapter;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="IMPRESSAO")
@SequenceGenerator(name = "INC_IMPRESSAO", sequenceName = "GEN_IMPRESSAO")
public class Impressao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static String CAMPO_CHAVE = "codImpressao";
	
	@Id
	@Column(name="CODIMPRESSAO", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_IMPRESSAO")
	@XmlElement(name = "CODIMPRESSAO")
	private Integer codImpressao;

	@Column(name="IMP_DATAHORA", columnDefinition = "TIMESTAMP")
	@XmlElement(name = "IMP_DATAHORA")
    @XmlJavaTypeAdapter(TimestampAdapter.class)	
	private Timestamp impDataHora = new Timestamp(System.currentTimeMillis());
	
	@Column(name="IMP_USUARIO", nullable = false, length = 20)
	@XmlElement(name = "IMP_USUARIO")
	private String impUsuario;
	
	@Column(name="IMP_CENTRALIZADOR", nullable = false, length = 20)
	@XmlElement(name = "IMP_CENTRALIZADOR")
	private String impCentralizador = "COZINHA";
	
	@Column(name="IMP_FINALIZADO", nullable = false, length = 1)
	@XmlElement(name = "IMP_FINALIZADO")
	private String impFinalizado = "N";
	
	@Column(name="IMP_TEXTO", nullable = false, columnDefinition = "BLOB SUB_TYPE 2 SEGMENT SIZE 1")
	@XmlElement(name = "IMP_TEXTO")	
	private String impTexto;
	
	@Column(name="CODCONTROLE", nullable =  false , length = 11)
	@XmlElement(name = "codControle")
	private Integer codControle;
	
	@Column(name="IMP_TITULO", nullable = false, length = 50)
	@XmlElement(name = "IMP_TITULO")
	private String impTitulo;

	@Column(name="IMP_CANCELADO", nullable = false, length = 1)
	@XmlElement(name = "IMP_CANCELADO")
	private String impCancelado = "N";
	
	public Integer getCodImpressao() {
		return codImpressao;
	}
	
	public void setCodImpressao(Integer codImpressao) {
		this.codImpressao = codImpressao;
	}
	
	public Timestamp getImpDataHora() {
		return impDataHora;
	}

	public void setImpDataHora(Timestamp impDataHora) {
		this.impDataHora = impDataHora;
	}

	public String getImpUsuario() {
		return impUsuario;
	}

	public void setImpUsuario(String impUsuario) {
		this.impUsuario = impUsuario;
	}

	public String getImpCentralizador() {
		return impCentralizador;
	}

	public void setImpCentralizador(String impCentralizador) {
		this.impCentralizador = impCentralizador;
	}

	public String getImpTitulo() {
		return impTitulo;
	}

	public void setImpTitulo(String impTitulo) {
		this.impTitulo = impTitulo;
	}

	public String getImpTexto() {
		return impTexto;
	}

	public void setImpTexto(String impTexto) {
		this.impTexto = impTexto;
	}
	
	public String getImpFinalizado() {
		return impFinalizado;
	}
	
	public void setImpFinalizado(String impFinalizado) {
		this.impFinalizado = impFinalizado;
	}
	
	public void setImpCancelado(String impCancelado) {
		this.impCancelado = impCancelado;
	}
	
	public String getImpCancelado() {
		return impCancelado;
	}

	public void setCodControle(Integer codControle) {
		this.codControle = codControle;
	}
	
	public Integer getCodControle() {
		return codControle;
	}
	
}
