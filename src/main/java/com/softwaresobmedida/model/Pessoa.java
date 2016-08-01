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
@Table(name = "PESSOA")
@SequenceGenerator(name = "INC_PESSOA", sequenceName = "GEN_PESSOA")

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "pessoa") 
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String CAMPO_CHAVE = "codPessoa";

	public Pessoa() {	
	}

	@Id
	@Column(name="CODPESSOA", nullable =  false , length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "INC_PESSOA")
	@XmlElement(name = "codPessoa")
	private Integer codPessoa;
	
	public Integer getCodPessoa() {
		return codPessoa;
	}
	public void setCodPessoa(Integer codPessoa) {
		this.codPessoa = codPessoa;
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
}
