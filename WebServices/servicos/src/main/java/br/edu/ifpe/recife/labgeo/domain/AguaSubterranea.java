package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the agua_subterranea database table.
 * 
 */
@Entity
@Table(name="agua_subterranea")
@NamedQuery(name="AguaSubterranea.findAll", query="SELECT a FROM AguaSubterranea a")
public class AguaSubterranea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agua_subterranea")
	private Integer idAguaSubterranea;

	private Boolean coberto;

	@Column(name="diametro_poco_cacimba")
	private double diametroPocoCacimba;

	@Column(name="fk_manancial")
	private Integer fkManancial;

	@Column(name="localizacao_no_leito")
	private Boolean localizacaoNoLeito;

	@Column(name="material_outros")
	private String materialOutros;

	@Column(name="profundidade_nivel_dagua")
	private double profundidadeNivelDagua;

	@Column(name="profundidade_poco_cacimba")
	private double profundidadePocoCacimba;

	@Column(name="tipo_material")
	private String tipoMaterial;

	@Column(name="tipo_poco")
	private String tipoPoco;

	//uni-directional one-to-one association to Formulario
	@OneToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.LAZY)
	@JoinColumn(name="fk_form")
	private Formulario formulario;

	public AguaSubterranea() {
	}

	public Integer getIdAguaSubterranea() {
		return this.idAguaSubterranea;
	}

	public void setIdAguaSubterranea(Integer idAguaSubterranea) {
		this.idAguaSubterranea = idAguaSubterranea;
	}

	public Boolean getCoberto() {
		return this.coberto;
	}

	public void setCoberto(Boolean coberto) {
		this.coberto = coberto;
	}

	public double getDiametroPocoCacimba() {
		return this.diametroPocoCacimba;
	}

	public void setDiametroPocoCacimba(double diametroPocoCacimba) {
		this.diametroPocoCacimba = diametroPocoCacimba;
	}

	public Integer getFkManancial() {
		return this.fkManancial;
	}

	public void setFkManancial(Integer fkManancial) {
		this.fkManancial = fkManancial;
	}

	public Boolean getLocalizacaoNoLeito() {
		return this.localizacaoNoLeito;
	}

	public void setLocalizacaoNoLeito(Boolean localizacaoNoLeito) {
		this.localizacaoNoLeito = localizacaoNoLeito;
	}

	public String getMaterialOutros() {
		return this.materialOutros;
	}

	public void setMaterialOutros(String materialOutros) {
		this.materialOutros = materialOutros;
	}

	public double getProfundidadeNivelDagua() {
		return this.profundidadeNivelDagua;
	}

	public void setProfundidadeNivelDagua(double profundidadeNivelDagua) {
		this.profundidadeNivelDagua = profundidadeNivelDagua;
	}

	public double getProfundidadePocoCacimba() {
		return this.profundidadePocoCacimba;
	}

	public void setProfundidadePocoCacimba(double profundidadePocoCacimba) {
		this.profundidadePocoCacimba = profundidadePocoCacimba;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getTipoPoco() {
		return this.tipoPoco;
	}

	public void setTipoPoco(String tipoPoco) {
		this.tipoPoco = tipoPoco;
	}

	public Formulario getFormulario() {
		return this.formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

}