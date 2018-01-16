package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;


/**
 * The persistent class for the locais database table.
 * 
 */
@Entity
@Table(name="locais")
@NamedQuery(name="Locai.findAll", query="SELECT l FROM Locai l")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Locai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_locais")
	private Integer idLocais;

	private String endereco;

	private BigDecimal latitude;

	private String localidade;

	private BigDecimal longitude;

	private String municipio;

	@Column(name="nome_propriedade")
	private String nomePropriedade;

	public Locai() {
	}

	public Integer getIdLocais() {
		return this.idLocais;
	}

	public void setIdLocais(Integer idLocais) {
		this.idLocais = idLocais;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getLocalidade() {
		return this.localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNomePropriedade() {
		return this.nomePropriedade;
	}

	public void setNomePropriedade(String nomePropriedade) {
		this.nomePropriedade = nomePropriedade;
	}

}