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
@Table(name = "IMPRESSAO")
@SequenceGenerator(name = "INC_IMPRESSAO", sequenceName = "GEN_IMPRESSAO")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "impressao") 
public class Impressao implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "id";

	public Impressao() {	
	}

	@Id
	@Column(name="CODIMPRESSAO", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_IMPRESSAO")
	@XmlElement(name = "codimpressao")
	private Integer codimpressao;

	public void setCodimpressao(Integer codimpressao)
	{
		this.codimpressao = codimpressao;
	}

	public Integer getCodimpressao()
	{
		return codimpressao;
	}

	@Column(name="IMP_DATAHORA", nullable =  false , length = 19)
	@XmlElement(name = "datahora")
	private java.sql.Timestamp datahora;

	public void setDatahora(java.sql.Timestamp datahora)
	{
		this.datahora = datahora;
	}

	public java.sql.Timestamp getDatahora()
	{
		return datahora;
	}

	@Column(name="IMP_USUARIO", nullable =  false , length = 20)
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

	@Column(name="IMP_CENTRALIZADOR", nullable =  false , length = 25)
	@XmlElement(name = "centralizador")
	private String centralizador;

	public void setCentralizador(String centralizador)
	{
		this.centralizador = centralizador;
	}

	public String getCentralizador()
	{
		return centralizador;
	}

	@Column(name="IMP_FINALIZADO", nullable =  false , length = 1)
	@XmlElement(name = "finalizado")
	private String finalizado;

	public void setFinalizado(String finalizado)
	{
		this.finalizado = finalizado;
	}

	public String getFinalizado()
	{
		return finalizado;
	}

	public void setFinalizadoBoolean(Boolean value)
	{
		if (value) {
			this.finalizado = "S";
		}
		else {
			this.finalizado = "N";
		}
	}
	public Boolean getFinalizadoBoolean()
	{
		return ((this.finalizado != null)&&(this.finalizado.equalsIgnoreCase("S")));
	}
	@Column(name="IMP_TEXTO", nullable =  true , length = 0)
	@XmlElement(name = "texto")
	private String texto;

	public void setTexto(String texto)
	{
		this.texto = texto;
	}

	public String getTexto()
	{
		return texto;
	}

	@Column(name="CODCONTROLE", nullable =  true , length = 11)
	@XmlElement(name = "codcontrole")
	private Integer codcontrole;

	public void setCodcontrole(Integer codcontrole)
	{
		this.codcontrole = codcontrole;
	}

	public Integer getCodcontrole()
	{
		return codcontrole;
	}

	@Column(name="IMP_TITULO", nullable =  true , length = 40)
	@XmlElement(name = "titulo")
	private String titulo;

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getTitulo()
	{
		return titulo;
	}

	@Column(name="IMP_CANCELADO", nullable =  false , length = 1)
	@XmlElement(name = "cancelado")
	private String cancelado;

	public void setCancelado(String cancelado)
	{
		this.cancelado = cancelado;
	}

	public String getCancelado()
	{
		return cancelado;
	}

	public void setCanceladoBoolean(Boolean value)
	{
		if (value) {
			this.cancelado = "S";
		}
		else {
			this.cancelado = "N";
		}
	}
	public Boolean getCanceladoBoolean()
	{
		return ((this.cancelado != null)&&(this.cancelado.equalsIgnoreCase("S")));
	}
}
