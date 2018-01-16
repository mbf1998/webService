package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transicao_denuncia database table.
 * 
 */
@Entity
@Table(name="transicao_denuncia")
@NamedQuery(name="TransicaoDenuncia.findAll", query="SELECT t FROM TransicaoDenuncia t")
public class TransicaoDenuncia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transicao")
	private Integer idTransicao;

	@Column(name="id_de")
	private Integer idDe;

	@Column(name="id_para")
	private Integer idPara;

	private String nome;

	public TransicaoDenuncia() {
	}

	public Integer getIdTransicao() {
		return this.idTransicao;
	}

	public void setIdTransicao(Integer idTransicao) {
		this.idTransicao = idTransicao;
	}

	public Integer getIdDe() {
		return this.idDe;
	}

	public void setIdDe(Integer idDe) {
		this.idDe = idDe;
	}

	public Integer getIdPara() {
		return this.idPara;
	}

	public void setIdPara(Integer idPara) {
		this.idPara = idPara;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}