package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the tipo_de_uso database table.
 * 
 */
@Entity
@Table(name="tipo_de_uso")
@NamedQuery(name="TipoDeUso.findAll", query="SELECT t FROM TipoDeUso t")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoDeUso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_de_uso")
	private Integer idTipoDeUso;

	private Boolean banho;

	private Boolean beber;

	@Column(name="criacao_animal")
	private Boolean criacaoAnimal;

	private Boolean industria;

	private Boolean irrigacao;

	private Boolean lavagem;

	private Boolean pesca;

	private Boolean piscicultura;

	private Boolean sanitario;

	private Boolean terceiro;

	public TipoDeUso() {
	}

	public Integer getIdTipoDeUso() {
		return this.idTipoDeUso;
	}

	public void setIdTipoDeUso(Integer idTipoDeUso) {
		this.idTipoDeUso = idTipoDeUso;
	}

	public Boolean getBanho() {
		return this.banho;
	}

	public void setBanho(Boolean banho) {
		this.banho = banho;
	}

	public Boolean getBeber() {
		return this.beber;
	}

	public void setBeber(Boolean beber) {
		this.beber = beber;
	}

	public Boolean getCriacaoAnimal() {
		return this.criacaoAnimal;
	}

	public void setCriacaoAnimal(Boolean criacaoAnimal) {
		this.criacaoAnimal = criacaoAnimal;
	}

	public Boolean getIndustria() {
		return this.industria;
	}

	public void setIndustria(Boolean industria) {
		this.industria = industria;
	}

	public Boolean getIrrigacao() {
		return this.irrigacao;
	}

	public void setIrrigacao(Boolean irrigacao) {
		this.irrigacao = irrigacao;
	}

	public Boolean getLavagem() {
		return this.lavagem;
	}

	public void setLavagem(Boolean lavagem) {
		this.lavagem = lavagem;
	}

	public Boolean getPesca() {
		return this.pesca;
	}

	public void setPesca(Boolean pesca) {
		this.pesca = pesca;
	}

	public Boolean getPiscicultura() {
		return this.piscicultura;
	}

	public void setPiscicultura(Boolean piscicultura) {
		this.piscicultura = piscicultura;
	}

	public Boolean getSanitario() {
		return this.sanitario;
	}

	public void setSanitario(Boolean sanitario) {
		this.sanitario = sanitario;
	}

	public Boolean getTerceiro() {
		return this.terceiro;
	}

	public void setTerceiro(Boolean terceiro) {
		this.terceiro = terceiro;
	}

}