package com.estoque.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "franquia")
public class Franquia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod")
	private Long cod;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cnpj", nullable = false, length = 14)
	private String cnpj;


	public Franquia() {
	}

	@Override
	public String toString() {
		return "Franquia [cod=" + cod + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}

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
	
	
	

}
