package com.estoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "franquia")
public class Franquia {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod")
	private Long cod;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cnpj", nullable = false, length = 14)
	private String cnpj;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Franquia(Long cod, String nome, String cnpj, Endereco endereco) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public Franquia() {
	}

	@Override
	public String toString() {
		return "Franquia [cod=" + cod + ", nome=" + nome + ", cnpj=" + cnpj + ", endereco=" + endereco + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
