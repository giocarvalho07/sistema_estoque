package com.estoque.model;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
	
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(nullable = false, name = "rua")
	private String rua;
	
	@Column(nullable = false, name = "numero")
	private String numero;
	
	@Column(nullable = false, name = "bairro")
	private String bairro;
	
	@Column(nullable = false, length = 9, name = "cep")
	private String cep;
	
	@Column(nullable = false, name = "cidade")
	private String cidade;
	
	@Column(nullable = false, name = "estado")
	private String estado;
	
	@Column(nullable = false, name = "pais")
	private String pais;
	
	
	@OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
	private Franquia franquia;

		
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public Franquia getFranquia() {
		return franquia;
	}


	public void setFranquia(Franquia franquia) {
		this.franquia = franquia;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep
				+ ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", franquia=" + franquia.getNome() + "]";
	}


	public Endereco() {
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
