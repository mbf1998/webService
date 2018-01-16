package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the manancial database table.
 * 
 */
@Entity
@NamedQuery(name="Manancial.findAll", query="SELECT m FROM Manancial m")
public class Manancial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_manancial")
	private Integer idManancial;

	@Column(name="houve_alteracao_captacao")
	private Boolean houveAlteracaoCaptacao;

	private BigDecimal latitude;

	private BigDecimal longitude;

	@Column(name="manancial_atende_bem")
	private String manancialAtendeBem;

	@Column(name="periodo_dia_mes")
	private String periodoDiaMes;

	@Column(name="razao_alteracao_vazao")
	private String razaoAlteracaoVazao;

	@Column(name="tempo_de_uso_manancial")
	private String tempoDeUsoManancial;

	@Column(name="tempo_hra_dia")
	private BigDecimal tempoHraDia;

	@Column(name="tipo_captacao_potencia_bombas")
	private String tipoCaptacaoPotenciaBombas;

	@Column(name="vazao_media")
	private BigDecimal vazaoMedia;

	//uni-directional one-to-one association to AguaSubterranea
	@OneToOne(cascade={CascadeType.REMOVE}, fetch=FetchType.LAZY)
	@JoinColumn(name="id_manancial", referencedColumnName="fk_manancial")
	private AguaSubterranea aguaSubterranea;

	//bi-directional many-to-one association to Captacao
	@OneToMany(mappedBy="manancial", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Captacao> captacoes;

	//bi-directional many-to-one association to Formulario
	@JsonProperty (access = Access.WRITE_ONLY)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_form")
	private Formulario formulario;

	//uni-directional many-to-one association to TipoDeUso
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="fk_tipo_de_uso")
	private TipoDeUso tipoDeUso;

	//uni-directional many-to-one association to TipoManancial
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.PERSIST})
	@JoinColumn(name="fk_tipo_manancial")
	private TipoManancial tipoManancial;

	//uni-directional one-to-one association to DetalhamentoManancial
	@OneToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "manancial")
	private DetalhamentoManancial detalhamentoManancial;

	public Manancial() {
	}

	public Integer getIdManancial() {
		return this.idManancial;
	}

	public void setIdManancial(Integer idManancial) {
		this.idManancial = idManancial;
	}

	public Boolean getHouveAlteracaoCaptacao() {
		return this.houveAlteracaoCaptacao;
	}

	public void setHouveAlteracaoCaptacao(Boolean houveAlteracaoCaptacao) {
		this.houveAlteracaoCaptacao = houveAlteracaoCaptacao;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getManancialAtendeBem() {
		return this.manancialAtendeBem;
	}

	public void setManancialAtendeBem(String manancialAtendeBem) {
		this.manancialAtendeBem = manancialAtendeBem;
	}

	public String getPeriodoDiaMes() {
		return this.periodoDiaMes;
	}

	public void setPeriodoDiaMes(String periodoDiaMes) {
		this.periodoDiaMes = periodoDiaMes;
	}

	public String getRazaoAlteracaoVazao() {
		return this.razaoAlteracaoVazao;
	}

	public void setRazaoAlteracaoVazao(String razaoAlteracaoVazao) {
		this.razaoAlteracaoVazao = razaoAlteracaoVazao;
	}

	public String getTempoDeUsoManancial() {
		return this.tempoDeUsoManancial;
	}

	public void setTempoDeUsoManancial(String tempoDeUsoManancial) {
		this.tempoDeUsoManancial = tempoDeUsoManancial;
	}

	public BigDecimal getTempoHraDia() {
		return this.tempoHraDia;
	}

	public void setTempoHraDia(BigDecimal tempoHraDia) {
		this.tempoHraDia = tempoHraDia;
	}

	public String getTipoCaptacaoPotenciaBombas() {
		return this.tipoCaptacaoPotenciaBombas;
	}

	public void setTipoCaptacaoPotenciaBombas(String tipoCaptacaoPotenciaBombas) {
		this.tipoCaptacaoPotenciaBombas = tipoCaptacaoPotenciaBombas;
	}

	public BigDecimal getVazaoMedia() {
		return this.vazaoMedia;
	}

	public void setVazaoMedia(BigDecimal vazaoMedia) {
		this.vazaoMedia = vazaoMedia;
	}

	public AguaSubterranea getAguaSubterranea() {
		return this.aguaSubterranea;
	}

	public void setAguaSubterranea(AguaSubterranea aguaSubterranea) {
		this.aguaSubterranea = aguaSubterranea;
	}

	public List<Captacao> getCaptacoes() {
		return captacoes;
	}

	public void setCaptacoes(List<Captacao> captacoes) {
		this.captacoes = captacoes;
	}

	public Formulario getFormulario() {
		return this.formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

	public TipoDeUso getTipoDeUso() {
		return this.tipoDeUso;
	}

	public void setTipoDeUso(TipoDeUso tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}

	public TipoManancial getTipoManancial() {
		return this.tipoManancial;
	}

	public void setTipoManancial(TipoManancial tipoManancial) {
		this.tipoManancial = tipoManancial;
	}

	public DetalhamentoManancial getDetalhamentoManancial() {
		return this.detalhamentoManancial;
	}

	public void setDetalhamentoManancial(DetalhamentoManancial detalhamentoManancial) {
		this.detalhamentoManancial = detalhamentoManancial;
	}

}