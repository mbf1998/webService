package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the denuncia_historico database table.
 * 
 */
@Entity
@Table(name="denuncia_historico")
@NamedQuery(name="DenunciaHistorico.findAll", query="SELECT d FROM DenunciaHistorico d")
public class DenunciaHistorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="data_modificacao")
	private Timestamp dataModificacao;

	private String justificativa;

	@Column(name="login_usuario")
	private String loginUsuario;

	@Column(name="status_anterior")
	private Integer statusAnterior;

	@Column(name="status_posterior")
	private Integer statusPosterior;

	//bi-directional many-to-one association to DenunciasFeature
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_denuncia")
	private Denuncia denuncia;

	public DenunciaHistorico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDataModificacao() {
		return this.dataModificacao;
	}

	public void setDataModificacao(Timestamp dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public String getLoginUsuario() {
		return this.loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public Integer getStatusAnterior() {
		return this.statusAnterior;
	}

	public void setStatusAnterior(Integer statusAnterior) {
		this.statusAnterior = statusAnterior;
	}

	public Integer getStatusPosterior() {
		return this.statusPosterior;
	}

	public void setStatusPosterior(Integer statusPosterior) {
		this.statusPosterior = statusPosterior;
	}

	public Denuncia getDenuncia() {
		return this.denuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

}