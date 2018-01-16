package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


/**
 * The persistent class for the captacao database table.
 * 
 */
@Entity
@NamedQuery(name="Captacao.findAll", query="SELECT c FROM Captacao c")
public class Captacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_captacao")
	private Integer idCaptacao;

	private Boolean eletrica;

	@Column(name="tipo_captacao")
	private String tipoCaptacao;

	@Column(name="usa_combustivel")
	private Boolean usaCombustivel;

	//uni-directional many-to-one association to Formulario
	@JsonProperty (access = Access.WRITE_ONLY)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_form")
	private Formulario formulario;
	
	@ManyToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.LAZY)
	@JoinColumn(name="fk_manancial")
	private Manancial manancial;

	public Captacao() {
	}

	public Integer getIdCaptacao() {
		return this.idCaptacao;
	}

	public void setIdCaptacao(Integer idCaptacao) {
		this.idCaptacao = idCaptacao;
	}

	public Boolean getEletrica() {
		return this.eletrica;
	}

	public void setEletrica(Boolean eletrica) {
		this.eletrica = eletrica;
	}

	public Manancial getManancial() {
		return manancial;
	}

	public void setManancial(Manancial manancial) {
		this.manancial = manancial;
	}

	public String getTipoCaptacao() {
		return this.tipoCaptacao;
	}

	public void setTipoCaptacao(String tipoCaptacao) {
		this.tipoCaptacao = tipoCaptacao;
	}

	public Boolean getUsaCombustivel() {
		return this.usaCombustivel;
	}

	public void setUsaCombustivel(Boolean usaCombustivel) {
		this.usaCombustivel = usaCombustivel;
	}

	public Formulario getFormulario() {
		return this.formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

}