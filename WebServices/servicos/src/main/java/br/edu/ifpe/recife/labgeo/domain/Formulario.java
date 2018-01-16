package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the formulario database table.
 * 
 */
@Entity
@NamedQuery(name="Formulario.findAll", query="SELECT f FROM Formulario f")
public class Formulario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_form")
	private String idForm;

	@Column(name="abastecimento_outros_mananciais")
	private Boolean abastecimentoOutrosMananciais;

	@Column(name="abastecimento_rede_publica")
	private Boolean abastecimentoRedePublica;

	@Column(name="anos_extremos")
	private String anosExtremos;

	private Boolean consumidor;

	@Column(name="data_hora")
	private Timestamp dataHora;

	private String ddd;

	private String email;

	private Boolean fornecedor;

	@Column(name="fotos_ate")
	private String fotosAte;

	@Column(name="fotos_de")
	private String fotosDe;

	@Column(name="nome_entrevistado")
	private String nomeEntrevistado;

	@Column(name="possui_acude")
	private Boolean possuiAcude;

	@Column(name="possui_barragem")
	private Boolean possuiBarragem;

	@Column(name="possui_barreiro")
	private Boolean possuiBarreiro;

	@Column(name="possui_cacimba")
	private Boolean possuiCacimba;

	@Column(name="possui_cacimbao")
	private Boolean possuiCacimbao;

	@Column(name="possui_olho_dagua")
	private Boolean possuiOlhoDagua;

	@Column(name="possui_poco_tubular")
	private Boolean possuiPocoTubular;

	@Column(name="possui_rio")
	private Boolean possuiRio;

	@Column(name="possui_tanque_pedra")
	private Boolean possuiTanquePedra;

	@Column(name="residentes_domicilio")
	private String residentesDomicilio;

	@Column(name="responsavel_1")
	private String responsavel1;

	@Column(name="responsavel_2")
	private String responsavel2;

	@Column(name="tel_cel")
	private String telCel;

	@Column(name="tel_fixo")
	private String telFixo;

	@Column(name="trecho_entrevista")
	private String trechoEntrevista;

	//uni-directional many-to-one association to Locai
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="fk_locais")
	private Locai locais;

	//uni-directional many-to-one association to TipoDeUso
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="fk_tipo_de_uso")
	private TipoDeUso tipoDeUso;

	//bi-directional many-to-one association to Manancial
	@OneToMany(mappedBy="formulario", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private List<Manancial> mananciais;

	public Formulario() {
	}

	public String getIdForm() {
		return this.idForm;
	}

	public void setIdForm(String idForm) {
		this.idForm = idForm;
	}

	public Boolean getAbastecimentoOutrosMananciais() {
		return this.abastecimentoOutrosMananciais;
	}

	public void setAbastecimentoOutrosMananciais(Boolean abastecimentoOutrosMananciais) {
		this.abastecimentoOutrosMananciais = abastecimentoOutrosMananciais;
	}

	public Boolean getAbastecimentoRedePublica() {
		return this.abastecimentoRedePublica;
	}

	public void setAbastecimentoRedePublica(Boolean abastecimentoRedePublica) {
		this.abastecimentoRedePublica = abastecimentoRedePublica;
	}

	public String getAnosExtremos() {
		return this.anosExtremos;
	}

	public void setAnosExtremos(String anosExtremos) {
		this.anosExtremos = anosExtremos;
	}

	public Boolean getConsumidor() {
		return this.consumidor;
	}

	public void setConsumidor(Boolean consumidor) {
		this.consumidor = consumidor;
	}

	public Timestamp getDataHora() {
		return this.dataHora;
	}

	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}

	public String getDdd() {
		return this.ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Boolean fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getFotosAte() {
		return this.fotosAte;
	}

	public void setFotosAte(String fotosAte) {
		this.fotosAte = fotosAte;
	}

	public String getFotosDe() {
		return this.fotosDe;
	}

	public void setFotosDe(String fotosDe) {
		this.fotosDe = fotosDe;
	}

	public String getNomeEntrevistado() {
		return this.nomeEntrevistado;
	}

	public void setNomeEntrevistado(String nomeEntrevistado) {
		this.nomeEntrevistado = nomeEntrevistado;
	}

	public Boolean getPossuiAcude() {
		return this.possuiAcude;
	}

	public void setPossuiAcude(Boolean possuiAcude) {
		this.possuiAcude = possuiAcude;
	}

	public Boolean getPossuiBarragem() {
		return this.possuiBarragem;
	}

	public void setPossuiBarragem(Boolean possuiBarragem) {
		this.possuiBarragem = possuiBarragem;
	}

	public Boolean getPossuiBarreiro() {
		return this.possuiBarreiro;
	}

	public void setPossuiBarreiro(Boolean possuiBarreiro) {
		this.possuiBarreiro = possuiBarreiro;
	}

	public Boolean getPossuiCacimba() {
		return this.possuiCacimba;
	}

	public void setPossuiCacimba(Boolean possuiCacimba) {
		this.possuiCacimba = possuiCacimba;
	}

	public Boolean getPossuiCacimbao() {
		return this.possuiCacimbao;
	}

	public void setPossuiCacimbao(Boolean possuiCacimbao) {
		this.possuiCacimbao = possuiCacimbao;
	}

	public Boolean getPossuiOlhoDagua() {
		return this.possuiOlhoDagua;
	}

	public void setPossuiOlhoDagua(Boolean possuiOlhoDagua) {
		this.possuiOlhoDagua = possuiOlhoDagua;
	}

	public Boolean getPossuiPocoTubular() {
		return this.possuiPocoTubular;
	}

	public void setPossuiPocoTubular(Boolean possuiPocoTubular) {
		this.possuiPocoTubular = possuiPocoTubular;
	}

	public Boolean getPossuiRio() {
		return this.possuiRio;
	}

	public void setPossuiRio(Boolean possuiRio) {
		this.possuiRio = possuiRio;
	}

	public Boolean getPossuiTanquePedra() {
		return this.possuiTanquePedra;
	}

	public void setPossuiTanquePedra(Boolean possuiTanquePedra) {
		this.possuiTanquePedra = possuiTanquePedra;
	}

	public String getResidentesDomicilio() {
		return this.residentesDomicilio;
	}

	public void setResidentesDomicilio(String residentesDomicilio) {
		this.residentesDomicilio = residentesDomicilio;
	}

	public String getResponsavel1() {
		return this.responsavel1;
	}

	public void setResponsavel1(String responsavel1) {
		this.responsavel1 = responsavel1;
	}

	public String getResponsavel2() {
		return this.responsavel2;
	}

	public void setResponsavel2(String responsavel2) {
		this.responsavel2 = responsavel2;
	}

	public String getTelCel() {
		return this.telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public String getTelFixo() {
		return this.telFixo;
	}

	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}

	public String getTrechoEntrevista() {
		return this.trechoEntrevista;
	}

	public void setTrechoEntrevista(String trechoEntrevista) {
		this.trechoEntrevista = trechoEntrevista;
	}

	public Locai getLocais() {
		return this.locais;
	}

	public void setLocais(Locai locais) {
		this.locais = locais;
	}

	public TipoDeUso getTipoDeUso() {
		return this.tipoDeUso;
	}

	public void setTipoDeUso(TipoDeUso tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}

	public List<Manancial> getMananciais() {
		return this.mananciais;
	}

	public void setMananciais(List<Manancial> mananciais) {
		this.mananciais = mananciais;
	}

	public Manancial addManancial(Manancial manancial) {
		getMananciais().add(manancial);
		manancial.setFormulario(this);

		return manancial;
	}

	public Manancial removeManancial(Manancial manancial) {
		getMananciais().remove(manancial);
		manancial.setFormulario(null);

		return manancial;
	}

}