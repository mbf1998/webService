package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the questionario database table.
 * 
 */
@Entity
@NamedQuery(name="Questionario.findAll", query="SELECT q FROM Questionario q")
public class Questionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_questionario")
	private Integer idQuestionario;

	@Column(name="acesso_agua_encanada")
	private Boolean acessoAguaEncanada;

	@Column(name="acesso_rede_eletrica")
	private Boolean acessoRedeEletrica;

	@Column(name="acesso_telefone")
	private Boolean acessoTelefone;

	@Column(name="agua_salobra_diminuicao")
	private Boolean aguaSalobraDiminuicao;

	private BigDecimal altitude;

	@Column(name="altualmente_irriga_cultivo")
	private Boolean altualmenteIrrigaCultivo;

	@Column(name="analise_fertilidade_solo")
	private Boolean analiseFertilidadeSolo;

	@Column(name="analise_qualidade_agua_poco")
	private Boolean analiseQualidadeAguaPoco;

	@Column(name="ano_perfurado_poco")
	private Integer anoPerfuradoPoco;

	@Column(name="anormalidade_solo_anos")
	private Boolean anormalidadeSoloAnos;

	@Column(name="area_plantada_cultivo")
	private BigDecimal areaPlantadaCultivo;

	@Column(name="area_plantada_lavoura")
	private BigDecimal areaPlantadaLavoura;

	@Column(name="area_plantada_mata")
	private BigDecimal areaPlantadaMata;

	@Column(name="cacimba_abastec_humano")
	private Boolean cacimbaAbastecHumano;

	@Column(name="cacimba_agua_irrigacao")
	private Boolean cacimbaAguaIrrigacao;

	@Column(name="cacimba_dess_animais")
	private Boolean cacimbaDessAnimais;

	@Column(name="caso_sim_diagnostico_agua_poco")
	private String casoSimDiagnosticoAguaPoco;

	@Column(name="caso_sim_diagnostico_analise")
	private String casoSimDiagnosticoAnalise;

	@Column(name="caso_sim_perenes")
	private Boolean casoSimPerenes;

	@Column(name="caso_sim_quais_tecnicas")
	private String casoSimQuaisTecnicas;

	@Column(name="caso_sim_tempo_periodos_seca")
	private String casoSimTempoPeriodosSeca;

	@Column(name="celular_rural_telefone")
	private Boolean celularRuralTelefone;

	@Column(name="celular_telefone")
	private Boolean celularTelefone;

	@Column(name="ceu_aberto_esgoto")
	private Boolean ceuAbertoEsgoto;

	@Column(name="coleta_publica_residuos")
	private Boolean coletaPublicaResiduos;

	@Column(name="compra_agua_propriedade")
	private Boolean compraAguaPropriedade;

	private String comunidade;

	@Column(name="condicoes_casa")
	private String condicoesCasa;

	@Column(name="corrego_abastec_humano")
	private Boolean corregoAbastecHumano;

	@Column(name="corrego_agua_irrigacao")
	private Boolean corregoAguaIrrigacao;

	@Column(name="corrego_dess_animais")
	private Boolean corregoDessAnimais;

	@Column(name="cultivo")
	private Boolean cultivo;

	@Column(name="cultivo_tecnicas_plantio")
	private Boolean cultivoTecnicasPlantio;

	@Column(name="cultivou_lavoura")
	private Boolean cultivouLavoura;

	@Column(name="culturas_cultivo")
	private String culturasCultivo;

	@Column(name="culturas_lavoura")
	private String culturasLavoura;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="data_entrevista")
	private Date dataEntrevista;
	
	//@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_hora_sincronizacao")
	private Date dataHoraSincronizacao;

	@Column(name="descarte_aberto_residuos")
	private Boolean descarteAbertoResiduos;

	@Column(name="diminuicao_vazao_poco")
	private Boolean diminuicaoVazaoPoco;

	@Column(name="empregados_pertence")
	private Boolean empregadosPertence;

	@Column(name="enterra_vala_residuos")
	private Boolean enterraValaResiduos;

	@Column(name="erosoes_solos_propriedade")
	private Boolean erosoesSolosPropriedade;

	@Column(name="escolaridade_entrevistado")
	private String escolaridadeEntrevistado;

	@Column(name="existem_domicilios_estab")
	private Boolean existemDomiciliosEstab;

	@Column(name="faz_desmatamento")
	private Boolean fazDesmatamento;

	@Column(name="faz_queimadas")
	private Boolean fazQueimadas;

	@Column(name="faz_uso_cob_morta")
	private Boolean fazUsoCobMorta;

	@Column(name="filha_pertence")
	private Boolean filhaPertence;

	@Column(name="filho_pertence")
	private Boolean filhoPertence;

	@Column(name="fixa_telefone")
	private Boolean fixaTelefone;

	@Column(name="fossa_negra_esgoto")
	private Boolean fossaNegraEsgoto;

	@Column(name="fossa_seca_esgoto")
	private Boolean fossaSecaEsgoto;

	@Column(name="genro_nora_pertence")
	private Boolean genroNoraPertence;

	@Column(name="incorporacao_estrume_solo")
	private Boolean incorporacaoEstrumeSolo;

	@Column(name="irmaos_pertence")
	private Boolean irmaosPertence;

	private BigDecimal latitude;

	private BigDecimal longitude;

	@Column(name="maleficios_ext_areia_ambiente")
	private Boolean maleficiosExtAreiaAmbiente;

	@Column(name="mata_ciliar_nascentes")
	private Boolean mataCiliarNascentes;

	@Column(name="mata_nativa")
	private Boolean mataNativa;

	@Column(name="nascentes_corregos_propriedade")
	private Boolean nascentesCorregosPropriedade;

	@Column(name="nome_entrevistado")
	private String nomeEntrevistado;

	@Column(name="numero_formulario")
	private String numeroFormulario;

	@Column(name="ocupacao_entrevistado")
	private String ocupacaoEntrevistado;

	@Column(name="outros_abastec_humano")
	private Boolean outrosAbastecHumano;

	@Column(name="outros_agua_irrigacao")
	private Boolean outrosAguaIrrigacao;

	@Column(name="outros_dess_animais")
	private Boolean outrosDessAnimais;

	@Column(name="outros_moradia")
	private String outrosMoradia;

	@Column(name="outros_pertence")
	private Boolean outrosPertence;

	@Column(name="outros_quais_abastec_humano")
	private String outrosQuaisAbastecHumano;

	@Column(name="outros_quais_agua_irrigacao")
	private String outrosQuaisAguaIrrigacao;

	@Column(name="outros_quais_dess_animais")
	private String outrosQuaisDessAnimais;

	@Column(name="pais_sogro_pertence")
	private Boolean paisSogroPertence;

	@Column(name="periodos_seca")
	private Boolean periodosSeca;

	@Column(name="poco_abastec_humano")
	private Boolean pocoAbastecHumano;

	@Column(name="poco_agua_irrigacao")
	private Boolean pocoAguaIrrigacao;

	@Column(name="poco_coletivo_moradia")
	private Boolean pocoColetivoMoradia;

	@Column(name="poco_dess_animais")
	private Boolean pocoDessAnimais;

	@Column(name="poco_individual_moradia")
	private Boolean pocoIndividualMoradia;

	@Column(name="preco_agua")
	private BigDecimal precoAgua;

	@Column(name="profundidade_poco")
	private BigDecimal profundidadePoco;

	@Column(name="qtd_criacao_aves")
	private Integer qtdCriacaoAves;

	@Column(name="qtd_criacao_bovina")
	private Integer qtdCriacaoBovina;

	@Column(name="qtd_criacao_caprina")
	private Integer qtdCriacaoCaprina;

	@Column(name="qtd_criacao_ovina")
	private Integer qtdCriacaoOvina;

	@Column(name="qtd_criacao_suina")
	private Integer qtdCriacaoSuina;

	@Column(name="quais_usos_agua_poco")
	private String quaisUsosAguaPoco;

	@Column(name="queima_residuos")
	private Boolean queimaResiduos;

	@Column(name="rede_publica_moradia")
	private Boolean redePublicaMoradia;

	@Column(name="renda_mensal_familia")
	private String rendaMensalFamilia;

	@Column(name="reservatorio_abastec_humano")
	private Boolean reservatorioAbastecHumano;

	@Column(name="reservatorio_agua_irrigacao")
	private Boolean reservatorioAguaIrrigacao;

	@Column(name="reservatorio_dess_animais")
	private Boolean reservatorioDessAnimais;

	@Column(name="responsavel_estabelecimento")
	private String responsavelEstabelecimento;

	@Column(name="rio_abastec_humano")
	private Boolean rioAbastecHumano;

	@Column(name="rio_agua_irrigacao")
	private Boolean rioAguaIrrigacao;

	@Column(name="rio_dess_animais")
	private Boolean rioDessAnimais;

	@Column(name="status_questionario")
	private String statusQuestionario;

	@Column(name="tanque_septico_esgoto")
	private Boolean tanqueSepticoEsgoto;

	@Column(name="tempo_reside_propriedade")
	private String tempoResidePropriedade;

	@Column(name="tipo_casa")
	private String tipoCasa;
	
	@Column(name="utiliza_agua_poco_propriedade")
	private Boolean utilizaAguaPocoPropriedade;

	@Column(name="vazao_poco")
	private BigDecimal vazaoPoco;

	public Questionario() {
	}

	public Integer getIdQuestionario() {
		return this.idQuestionario;
	}

	public void setIdQuestionario(Integer idQuestionario) {
		this.idQuestionario = idQuestionario;
	}

	public Boolean getAcessoAguaEncanada() {
		return this.acessoAguaEncanada;
	}

	public void setAcessoAguaEncanada(Boolean acessoAguaEncanada) {
		this.acessoAguaEncanada = acessoAguaEncanada;
	}

	public Boolean getAcessoRedeEletrica() {
		return this.acessoRedeEletrica;
	}

	public void setAcessoRedeEletrica(Boolean acessoRedeEletrica) {
		this.acessoRedeEletrica = acessoRedeEletrica;
	}

	public Boolean getAcessoTelefone() {
		return this.acessoTelefone;
	}

	public void setAcessoTelefone(Boolean acessoTelefone) {
		this.acessoTelefone = acessoTelefone;
	}

	public Boolean getAguaSalobraDiminuicao() {
		return this.aguaSalobraDiminuicao;
	}

	public void setAguaSalobraDiminuicao(Boolean aguaSalobraDiminuicao) {
		this.aguaSalobraDiminuicao = aguaSalobraDiminuicao;
	}

	public BigDecimal getAltitude() {
		return this.altitude;
	}

	public void setAltitude(BigDecimal altitude) {
		this.altitude = altitude;
	}

	public Boolean getAltualmenteIrrigaCultivo() {
		return this.altualmenteIrrigaCultivo;
	}

	public void setAltualmenteIrrigaCultivo(Boolean altualmenteIrrigaCultivo) {
		this.altualmenteIrrigaCultivo = altualmenteIrrigaCultivo;
	}

	public Boolean getAnaliseFertilidadeSolo() {
		return this.analiseFertilidadeSolo;
	}

	public void setAnaliseFertilidadeSolo(Boolean analiseFertilidadeSolo) {
		this.analiseFertilidadeSolo = analiseFertilidadeSolo;
	}

	public Boolean getAnaliseQualidadeAguaPoco() {
		return this.analiseQualidadeAguaPoco;
	}

	public void setAnaliseQualidadeAguaPoco(Boolean analiseQualidadeAguaPoco) {
		this.analiseQualidadeAguaPoco = analiseQualidadeAguaPoco;
	}

	public Integer getAnoPerfuradoPoco() {
		return this.anoPerfuradoPoco;
	}

	public void setAnoPerfuradoPoco(Integer anoPerfuradoPoco) {
		this.anoPerfuradoPoco = anoPerfuradoPoco;
	}

	public Boolean getAnormalidadeSoloAnos() {
		return this.anormalidadeSoloAnos;
	}

	public void setAnormalidadeSoloAnos(Boolean anormalidadeSoloAnos) {
		this.anormalidadeSoloAnos = anormalidadeSoloAnos;
	}

	public BigDecimal getAreaPlantadaCultivo() {
		return this.areaPlantadaCultivo;
	}

	public void setAreaPlantadaCultivo(BigDecimal areaPlantadaCultivo) {
		this.areaPlantadaCultivo = areaPlantadaCultivo;
	}

	public BigDecimal getAreaPlantadaLavoura() {
		return this.areaPlantadaLavoura;
	}

	public void setAreaPlantadaLavoura(BigDecimal areaPlantadaLavoura) {
		this.areaPlantadaLavoura = areaPlantadaLavoura;
	}

	public BigDecimal getAreaPlantadaMata() {
		return this.areaPlantadaMata;
	}

	public void setAreaPlantadaMata(BigDecimal areaPlantadaMata) {
		this.areaPlantadaMata = areaPlantadaMata;
	}

	public Boolean getCacimbaAbastecHumano() {
		return this.cacimbaAbastecHumano;
	}

	public void setCacimbaAbastecHumano(Boolean cacimbaAbastecHumano) {
		this.cacimbaAbastecHumano = cacimbaAbastecHumano;
	}

	public Boolean getCacimbaAguaIrrigacao() {
		return this.cacimbaAguaIrrigacao;
	}

	public void setCacimbaAguaIrrigacao(Boolean cacimbaAguaIrrigacao) {
		this.cacimbaAguaIrrigacao = cacimbaAguaIrrigacao;
	}

	public Boolean getCacimbaDessAnimais() {
		return this.cacimbaDessAnimais;
	}

	public void setCacimbaDessAnimais(Boolean cacimbaDessAnimais) {
		this.cacimbaDessAnimais = cacimbaDessAnimais;
	}

	public String getCasoSimDiagnosticoAguaPoco() {
		return this.casoSimDiagnosticoAguaPoco;
	}

	public void setCasoSimDiagnosticoAguaPoco(String casoSimDiagnosticoAguaPoco) {
		this.casoSimDiagnosticoAguaPoco = casoSimDiagnosticoAguaPoco;
	}

	public String getCasoSimDiagnosticoAnalise() {
		return this.casoSimDiagnosticoAnalise;
	}

	public void setCasoSimDiagnosticoAnalise(String casoSimDiagnosticoAnalise) {
		this.casoSimDiagnosticoAnalise = casoSimDiagnosticoAnalise;
	}

	public Boolean getCasoSimPerenes() {
		return this.casoSimPerenes;
	}

	public void setCasoSimPerenes(Boolean casoSimPerenes) {
		this.casoSimPerenes = casoSimPerenes;
	}

	public String getCasoSimQuaisTecnicas() {
		return this.casoSimQuaisTecnicas;
	}

	public void setCasoSimQuaisTecnicas(String casoSimQuaisTecnicas) {
		this.casoSimQuaisTecnicas = casoSimQuaisTecnicas;
	}

	public String getCasoSimTempoPeriodosSeca() {
		return this.casoSimTempoPeriodosSeca;
	}

	public void setCasoSimTempoPeriodosSeca(String casoSimTempoPeriodosSeca) {
		this.casoSimTempoPeriodosSeca = casoSimTempoPeriodosSeca;
	}

	public Boolean getCelularRuralTelefone() {
		return this.celularRuralTelefone;
	}

	public void setCelularRuralTelefone(Boolean celularRuralTelefone) {
		this.celularRuralTelefone = celularRuralTelefone;
	}

	public Boolean getCelularTelefone() {
		return this.celularTelefone;
	}

	public void setCelularTelefone(Boolean celularTelefone) {
		this.celularTelefone = celularTelefone;
	}

	public Boolean getCeuAbertoEsgoto() {
		return this.ceuAbertoEsgoto;
	}

	public void setCeuAbertoEsgoto(Boolean ceuAbertoEsgoto) {
		this.ceuAbertoEsgoto = ceuAbertoEsgoto;
	}

	public Boolean getColetaPublicaResiduos() {
		return this.coletaPublicaResiduos;
	}

	public void setColetaPublicaResiduos(Boolean coletaPublicaResiduos) {
		this.coletaPublicaResiduos = coletaPublicaResiduos;
	}

	public Boolean getCompraAguaPropriedade() {
		return this.compraAguaPropriedade;
	}

	public void setCompraAguaPropriedade(Boolean compraAguaPropriedade) {
		this.compraAguaPropriedade = compraAguaPropriedade;
	}

	public String getComunidade() {
		return this.comunidade;
	}

	public void setComunidade(String comunidade) {
		this.comunidade = comunidade;
	}

	public String getCondicoesCasa() {
		return this.condicoesCasa;
	}

	public void setCondicoesCasa(String condicoesCasa) {
		this.condicoesCasa = condicoesCasa;
	}

	public Boolean getCorregoAbastecHumano() {
		return this.corregoAbastecHumano;
	}

	public void setCorregoAbastecHumano(Boolean corregoAbastecHumano) {
		this.corregoAbastecHumano = corregoAbastecHumano;
	}

	public Boolean getCorregoAguaIrrigacao() {
		return this.corregoAguaIrrigacao;
	}

	public void setCorregoAguaIrrigacao(Boolean corregoAguaIrrigacao) {
		this.corregoAguaIrrigacao = corregoAguaIrrigacao;
	}

	public Boolean getCorregoDessAnimais() {
		return this.corregoDessAnimais;
	}

	public void setCorregoDessAnimais(Boolean corregoDessAnimais) {
		this.corregoDessAnimais = corregoDessAnimais;
	}

	public Boolean getCultivo() {
		return this.cultivo;
	}

	public void setCultivo(Boolean cultivo) {
		this.cultivo = cultivo;
	}

	public Boolean getCultivoTecnicasPlantio() {
		return this.cultivoTecnicasPlantio;
	}

	public void setCultivoTecnicasPlantio(Boolean cultivoTecnicasPlantio) {
		this.cultivoTecnicasPlantio = cultivoTecnicasPlantio;
	}

	public Boolean getCultivouLavoura() {
		return this.cultivouLavoura;
	}

	public void setCultivouLavoura(Boolean cultivouLavoura) {
		this.cultivouLavoura = cultivouLavoura;
	}

	public String getCulturasCultivo() {
		return this.culturasCultivo;
	}

	public void setCulturasCultivo(String culturasCultivo) {
		this.culturasCultivo = culturasCultivo;
	}

	public String getCulturasLavoura() {
		return this.culturasLavoura;
	}

	public void setCulturasLavoura(String culturasLavoura) {
		this.culturasLavoura = culturasLavoura;
	}

	public Date getDataEntrevista() {
		return this.dataEntrevista;
	}

	public void setDataEntrevista(Date dataEntrevista) {
		this.dataEntrevista = dataEntrevista;
	}
	public Date getDataHoraSincronizacao() {
		return this.dataHoraSincronizacao;
	}
	
	public void setDataHoraSincronizacao(Date dataHoraSincronizacao) {
		this.dataHoraSincronizacao = dataHoraSincronizacao;
	}
	
	public Boolean getDescarteAbertoResiduos() {
		return this.descarteAbertoResiduos;
	}

	public void setDescarteAbertoResiduos(Boolean descarteAbertoResiduos) {
		this.descarteAbertoResiduos = descarteAbertoResiduos;
	}

	public Boolean getDiminuicaoVazaoPoco() {
		return this.diminuicaoVazaoPoco;
	}

	public void setDiminuicaoVazaoPoco(Boolean diminuicaoVazaoPoco) {
		this.diminuicaoVazaoPoco = diminuicaoVazaoPoco;
	}

	public Boolean getEmpregadosPertence() {
		return this.empregadosPertence;
	}

	public void setEmpregadosPertence(Boolean empregadosPertence) {
		this.empregadosPertence = empregadosPertence;
	}

	public Boolean getEnterraValaResiduos() {
		return this.enterraValaResiduos;
	}

	public void setEnterraValaResiduos(Boolean enterraValaResiduos) {
		this.enterraValaResiduos = enterraValaResiduos;
	}

	public Boolean getErosoesSolosPropriedade() {
		return this.erosoesSolosPropriedade;
	}

	public void setErosoesSolosPropriedade(Boolean erosoesSolosPropriedade) {
		this.erosoesSolosPropriedade = erosoesSolosPropriedade;
	}

	public String getEscolaridadeEntrevistado() {
		return this.escolaridadeEntrevistado;
	}

	public void setEscolaridadeEntrevistado(String escolaridadeEntrevistado) {
		this.escolaridadeEntrevistado = escolaridadeEntrevistado;
	}

	public Boolean getExistemDomiciliosEstab() {
		return this.existemDomiciliosEstab;
	}

	public void setExistemDomiciliosEstab(Boolean existemDomiciliosEstab) {
		this.existemDomiciliosEstab = existemDomiciliosEstab;
	}

	public Boolean getFazDesmatamento() {
		return this.fazDesmatamento;
	}

	public void setFazDesmatamento(Boolean fazDesmatamento) {
		this.fazDesmatamento = fazDesmatamento;
	}

	public Boolean getFazQueimadas() {
		return this.fazQueimadas;
	}

	public void setFazQueimadas(Boolean fazQueimadas) {
		this.fazQueimadas = fazQueimadas;
	}

	public Boolean getFazUsoCobMorta() {
		return this.fazUsoCobMorta;
	}

	public void setFazUsoCobMorta(Boolean fazUsoCobMorta) {
		this.fazUsoCobMorta = fazUsoCobMorta;
	}

	public Boolean getFilhaPertence() {
		return this.filhaPertence;
	}

	public void setFilhaPertence(Boolean filhaPertence) {
		this.filhaPertence = filhaPertence;
	}

	public Boolean getFilhoPertence() {
		return this.filhoPertence;
	}

	public void setFilhoPertence(Boolean filhoPertence) {
		this.filhoPertence = filhoPertence;
	}

	public Boolean getFixaTelefone() {
		return this.fixaTelefone;
	}

	public void setFixaTelefone(Boolean fixaTelefone) {
		this.fixaTelefone = fixaTelefone;
	}

	public Boolean getFossaNegraEsgoto() {
		return this.fossaNegraEsgoto;
	}

	public void setFossaNegraEsgoto(Boolean fossaNegraEsgoto) {
		this.fossaNegraEsgoto = fossaNegraEsgoto;
	}

	public Boolean getFossaSecaEsgoto() {
		return this.fossaSecaEsgoto;
	}

	public void setFossaSecaEsgoto(Boolean fossaSecaEsgoto) {
		this.fossaSecaEsgoto = fossaSecaEsgoto;
	}

	public Boolean getGenroNoraPertence() {
		return this.genroNoraPertence;
	}

	public void setGenroNoraPertence(Boolean genroNoraPertence) {
		this.genroNoraPertence = genroNoraPertence;
	}

	public Boolean getIncorporacaoEstrumeSolo() {
		return this.incorporacaoEstrumeSolo;
	}

	public void setIncorporacaoEstrumeSolo(Boolean incorporacaoEstrumeSolo) {
		this.incorporacaoEstrumeSolo = incorporacaoEstrumeSolo;
	}

	public Boolean getIrmaosPertence() {
		return this.irmaosPertence;
	}

	public void setIrmaosPertence(Boolean irmaosPertence) {
		this.irmaosPertence = irmaosPertence;
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

	public Boolean getMaleficiosExtAreiaAmbiente() {
		return this.maleficiosExtAreiaAmbiente;
	}

	public void setMaleficiosExtAreiaAmbiente(Boolean maleficiosExtAreiaAmbiente) {
		this.maleficiosExtAreiaAmbiente = maleficiosExtAreiaAmbiente;
	}

	public Boolean getMataCiliarNascentes() {
		return this.mataCiliarNascentes;
	}

	public void setMataCiliarNascentes(Boolean mataCiliarNascentes) {
		this.mataCiliarNascentes = mataCiliarNascentes;
	}

	public Boolean getMataNativa() {
		return this.mataNativa;
	}

	public void setMataNativa(Boolean mataNativa) {
		this.mataNativa = mataNativa;
	}

	public Boolean getNascentesCorregosPropriedade() {
		return this.nascentesCorregosPropriedade;
	}

	public void setNascentesCorregosPropriedade(Boolean nascentesCorregosPropriedade) {
		this.nascentesCorregosPropriedade = nascentesCorregosPropriedade;
	}

	public String getNomeEntrevistado() {
		return this.nomeEntrevistado;
	}

	public void setNomeEntrevistado(String nomeEntrevistado) {
		this.nomeEntrevistado = nomeEntrevistado;
	}

	public String getNumeroFormulario() {
		return this.numeroFormulario;
	}

	public void setNumeroFormulario(String numeroFormulario) {
		this.numeroFormulario = numeroFormulario;
	}

	public String getOcupacaoEntrevistado() {
		return this.ocupacaoEntrevistado;
	}

	public void setOcupacaoEntrevistado(String ocupacaoEntrevistado) {
		this.ocupacaoEntrevistado = ocupacaoEntrevistado;
	}

	public Boolean getOutrosAbastecHumano() {
		return this.outrosAbastecHumano;
	}

	public void setOutrosAbastecHumano(Boolean outrosAbastecHumano) {
		this.outrosAbastecHumano = outrosAbastecHumano;
	}

	public Boolean getOutrosAguaIrrigacao() {
		return this.outrosAguaIrrigacao;
	}

	public void setOutrosAguaIrrigacao(Boolean outrosAguaIrrigacao) {
		this.outrosAguaIrrigacao = outrosAguaIrrigacao;
	}

	public Boolean getOutrosDessAnimais() {
		return this.outrosDessAnimais;
	}

	public void setOutrosDessAnimais(Boolean outrosDessAnimais) {
		this.outrosDessAnimais = outrosDessAnimais;
	}

	public String getOutrosMoradia() {
		return this.outrosMoradia;
	}

	public void setOutrosMoradia(String outrosMoradia) {
		this.outrosMoradia = outrosMoradia;
	}

	public Boolean getOutrosPertence() {
		return this.outrosPertence;
	}

	public void setOutrosPertence(Boolean outrosPertence) {
		this.outrosPertence = outrosPertence;
	}

	public String getOutrosQuaisAbastecHumano() {
		return this.outrosQuaisAbastecHumano;
	}

	public void setOutrosQuaisAbastecHumano(String outrosQuaisAbastecHumano) {
		this.outrosQuaisAbastecHumano = outrosQuaisAbastecHumano;
	}

	public String getOutrosQuaisAguaIrrigacao() {
		return this.outrosQuaisAguaIrrigacao;
	}

	public void setOutrosQuaisAguaIrrigacao(String outrosQuaisAguaIrrigacao) {
		this.outrosQuaisAguaIrrigacao = outrosQuaisAguaIrrigacao;
	}

	public String getOutrosQuaisDessAnimais() {
		return this.outrosQuaisDessAnimais;
	}

	public void setOutrosQuaisDessAnimais(String outrosQuaisDessAnimais) {
		this.outrosQuaisDessAnimais = outrosQuaisDessAnimais;
	}

	public Boolean getPaisSogroPertence() {
		return this.paisSogroPertence;
	}

	public void setPaisSogroPertence(Boolean paisSogroPertence) {
		this.paisSogroPertence = paisSogroPertence;
	}

	public Boolean getPeriodosSeca() {
		return this.periodosSeca;
	}

	public void setPeriodosSeca(Boolean periodosSeca) {
		this.periodosSeca = periodosSeca;
	}

	public Boolean getPocoAbastecHumano() {
		return this.pocoAbastecHumano;
	}

	public void setPocoAbastecHumano(Boolean pocoAbastecHumano) {
		this.pocoAbastecHumano = pocoAbastecHumano;
	}

	public Boolean getPocoAguaIrrigacao() {
		return this.pocoAguaIrrigacao;
	}

	public void setPocoAguaIrrigacao(Boolean pocoAguaIrrigacao) {
		this.pocoAguaIrrigacao = pocoAguaIrrigacao;
	}

	public Boolean getPocoColetivoMoradia() {
		return this.pocoColetivoMoradia;
	}

	public void setPocoColetivoMoradia(Boolean pocoColetivoMoradia) {
		this.pocoColetivoMoradia = pocoColetivoMoradia;
	}

	public Boolean getPocoDessAnimais() {
		return this.pocoDessAnimais;
	}

	public void setPocoDessAnimais(Boolean pocoDessAnimais) {
		this.pocoDessAnimais = pocoDessAnimais;
	}

	public Boolean getPocoIndividualMoradia() {
		return this.pocoIndividualMoradia;
	}

	public void setPocoIndividualMoradia(Boolean pocoIndividualMoradia) {
		this.pocoIndividualMoradia = pocoIndividualMoradia;
	}

	public BigDecimal getPrecoAgua() {
		return this.precoAgua;
	}

	public void setPrecoAgua(BigDecimal precoAgua) {
		this.precoAgua = precoAgua;
	}

	public BigDecimal getProfundidadePoco() {
		return this.profundidadePoco;
	}

	public void setProfundidadePoco(BigDecimal profundidadePoco) {
		this.profundidadePoco = profundidadePoco;
	}

	public Integer getQtdCriacaoAves() {
		return this.qtdCriacaoAves;
	}

	public void setQtdCriacaoAves(Integer qtdCriacaoAves) {
		this.qtdCriacaoAves = qtdCriacaoAves;
	}

	public Integer getQtdCriacaoBovina() {
		return this.qtdCriacaoBovina;
	}

	public void setQtdCriacaoBovina(Integer qtdCriacaoBovina) {
		this.qtdCriacaoBovina = qtdCriacaoBovina;
	}

	public Integer getQtdCriacaoCaprina() {
		return this.qtdCriacaoCaprina;
	}

	public void setQtdCriacaoCaprina(Integer qtdCriacaoCaprina) {
		this.qtdCriacaoCaprina = qtdCriacaoCaprina;
	}

	public Integer getQtdCriacaoOvina() {
		return this.qtdCriacaoOvina;
	}

	public void setQtdCriacaoOvina(Integer qtdCriacaoOvina) {
		this.qtdCriacaoOvina = qtdCriacaoOvina;
	}

	public Integer getQtdCriacaoSuina() {
		return this.qtdCriacaoSuina;
	}

	public void setQtdCriacaoSuina(Integer qtdCriacaoSuina) {
		this.qtdCriacaoSuina = qtdCriacaoSuina;
	}

	public String getQuaisUsosAguaPoco() {
		return this.quaisUsosAguaPoco;
	}

	public void setQuaisUsosAguaPoco(String quaisUsosAguaPoco) {
		this.quaisUsosAguaPoco = quaisUsosAguaPoco;
	}

	public Boolean getQueimaResiduos() {
		return this.queimaResiduos;
	}

	public void setQueimaResiduos(Boolean queimaResiduos) {
		this.queimaResiduos = queimaResiduos;
	}

	public Boolean getRedePublicaMoradia() {
		return this.redePublicaMoradia;
	}

	public void setRedePublicaMoradia(Boolean redePublicaMoradia) {
		this.redePublicaMoradia = redePublicaMoradia;
	}

	public String getRendaMensalFamilia() {
		return this.rendaMensalFamilia;
	}

	public void setRendaMensalFamilia(String rendaMensalFamilia) {
		this.rendaMensalFamilia = rendaMensalFamilia;
	}

	public Boolean getReservatorioAbastecHumano() {
		return this.reservatorioAbastecHumano;
	}

	public void setReservatorioAbastecHumano(Boolean reservatorioAbastecHumano) {
		this.reservatorioAbastecHumano = reservatorioAbastecHumano;
	}

	public Boolean getReservatorioAguaIrrigacao() {
		return this.reservatorioAguaIrrigacao;
	}

	public void setReservatorioAguaIrrigacao(Boolean reservatorioAguaIrrigacao) {
		this.reservatorioAguaIrrigacao = reservatorioAguaIrrigacao;
	}

	public Boolean getReservatorioDessAnimais() {
		return this.reservatorioDessAnimais;
	}

	public void setReservatorioDessAnimais(Boolean reservatorioDessAnimais) {
		this.reservatorioDessAnimais = reservatorioDessAnimais;
	}

	public String getResponsavelEstabelecimento() {
		return this.responsavelEstabelecimento;
	}

	public void setResponsavelEstabelecimento(String responsavelEstabelecimento) {
		this.responsavelEstabelecimento = responsavelEstabelecimento;
	}

	public Boolean getRioAbastecHumano() {
		return this.rioAbastecHumano;
	}

	public void setRioAbastecHumano(Boolean rioAbastecHumano) {
		this.rioAbastecHumano = rioAbastecHumano;
	}

	public Boolean getRioAguaIrrigacao() {
		return this.rioAguaIrrigacao;
	}

	public void setRioAguaIrrigacao(Boolean rioAguaIrrigacao) {
		this.rioAguaIrrigacao = rioAguaIrrigacao;
	}

	public Boolean getRioDessAnimais() {
		return this.rioDessAnimais;
	}

	public void setRioDessAnimais(Boolean rioDessAnimais) {
		this.rioDessAnimais = rioDessAnimais;
	}

	public String getStatusQuestionario() {
		return this.statusQuestionario;
	}

	public void setStatusQuestionario(String statusQuestionario) {
		this.statusQuestionario = statusQuestionario;
	}

	public Boolean getTanqueSepticoEsgoto() {
		return this.tanqueSepticoEsgoto;
	}

	public void setTanqueSepticoEsgoto(Boolean tanqueSepticoEsgoto) {
		this.tanqueSepticoEsgoto = tanqueSepticoEsgoto;
	}

	public String getTempoResidePropriedade() {
		return this.tempoResidePropriedade;
	}

	public void setTempoResidePropriedade(String tempoResidePropriedade) {
		this.tempoResidePropriedade = tempoResidePropriedade;
	}

	public String getTipoCasa() {
		return this.tipoCasa;
	}

	public void setTipoCasa(String tipoCasa) {
		this.tipoCasa = tipoCasa;
	}
	
	public Boolean getUtilizaAguaPocoPropriedade() {
		return this.utilizaAguaPocoPropriedade;
	}

	public void setUtilizaAguaPocoPropriedade(Boolean utilizaAguaPocoPropriedade) {
		this.utilizaAguaPocoPropriedade = utilizaAguaPocoPropriedade;
	}

	public BigDecimal getVazaoPoco() {
		return this.vazaoPoco;
	}

	public void setVazaoPoco(BigDecimal vazaoPoco) {
		this.vazaoPoco = vazaoPoco;
	}

}