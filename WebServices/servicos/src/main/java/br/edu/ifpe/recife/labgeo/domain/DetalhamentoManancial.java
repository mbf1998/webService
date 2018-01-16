package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.math.BigDecimal;


/**
 * The persistent class for the detalhamento_manancial database table.
 * 
 */
@Entity
@Table(name="detalhamento_manancial")
@NamedQuery(name="DetalhamentoManancial.findAll", query="SELECT d FROM DetalhamentoManancial d")
public class DetalhamentoManancial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detalhamento")
	private Integer idDetalhamento;

	@Column(name="caixa_protecao_nascente")
	private Boolean caixaProtecaoNascente;

	@Column(name="distancia_captacao")
	private BigDecimal distanciaCaptacao;

	@Column(name="nome_manancial")
	private String nomeManancial;

	@Column(name="origem_agua_tanque_pedra")
	private String origemAguaTanquePedra;

	@Column(name="tipo_captacao_mecanizada")
	private Boolean tipoCaptacaoMecanizada;

	@Column(name="tipo_captacao_retirada_manual")
	private Boolean tipoCaptacaoRetiradaManual;

	@Column(name="tipo_captacao_vazao")
	private BigDecimal tipoCaptacaoVazao;

	@Column(name="tipo_tanque")
	private String tipoTanque;

	//uni-directional many-to-one association to Formulario
	@JsonProperty (access = Access.WRITE_ONLY)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_form")
	private Formulario formulario;

	//bi-directional one-to-one association to Manancial
	@OneToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.LAZY)
	@JoinColumn(name="fk_manancial")
	private Manancial manancial;

	public DetalhamentoManancial() {
	}

	public Integer getIdDetalhamento() {
		return this.idDetalhamento;
	}

	public void setIdDetalhamento(Integer idDetalhamento) {
		this.idDetalhamento = idDetalhamento;
	}

	public Boolean getCaixaProtecaoNascente() {
		return this.caixaProtecaoNascente;
	}

	public void setCaixaProtecaoNascente(Boolean caixaProtecaoNascente) {
		this.caixaProtecaoNascente = caixaProtecaoNascente;
	}

	public BigDecimal getDistanciaCaptacao() {
		return this.distanciaCaptacao;
	}

	public void setDistanciaCaptacao(BigDecimal distanciaCaptacao) {
		this.distanciaCaptacao = distanciaCaptacao;
	}

	public String getNomeManancial() {
		return this.nomeManancial;
	}

	public void setNomeManancial(String nomeManancial) {
		this.nomeManancial = nomeManancial;
	}

	public String getOrigemAguaTanquePedra() {
		return this.origemAguaTanquePedra;
	}

	public void setOrigemAguaTanquePedra(String origemAguaTanquePedra) {
		this.origemAguaTanquePedra = origemAguaTanquePedra;
	}

	public Boolean getTipoCaptacaoMecanizada() {
		return this.tipoCaptacaoMecanizada;
	}

	public void setTipoCaptacaoMecanizada(Boolean tipoCaptacaoMecanizada) {
		this.tipoCaptacaoMecanizada = tipoCaptacaoMecanizada;
	}

	public Boolean getTipoCaptacaoRetiradaManual() {
		return this.tipoCaptacaoRetiradaManual;
	}

	public void setTipoCaptacaoRetiradaManual(Boolean tipoCaptacaoRetiradaManual) {
		this.tipoCaptacaoRetiradaManual = tipoCaptacaoRetiradaManual;
	}

	public BigDecimal getTipoCaptacaoVazao() {
		return this.tipoCaptacaoVazao;
	}

	public void setTipoCaptacaoVazao(BigDecimal tipoCaptacaoVazao) {
		this.tipoCaptacaoVazao = tipoCaptacaoVazao;
	}

	public String getTipoTanque() {
		return this.tipoTanque;
	}

	public void setTipoTanque(String tipoTanque) {
		this.tipoTanque = tipoTanque;
	}

	public Formulario getFormulario() {
		return this.formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

	public Manancial getManancial() {
		return this.manancial;
	}

	public void setManancial(Manancial manancial) {
		this.manancial = manancial;
	}

}