package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the tipo_manancial database table.
 * 
 */
@Entity
@Table(name="tipo_manancial")
@NamedQuery(name="TipoManancial.findAll", query="SELECT t FROM TipoManancial t")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TipoManancial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_manancial")
	private Integer idTipoManancial;

	@Column(name="nome_manancial")
	private String nomeManancial;

	public TipoManancial() {
	}

	public Integer getIdTipoManancial() {
		return this.idTipoManancial;
	}

	public void setIdTipoManancial(Integer idTipoManancial) {
		this.idTipoManancial = idTipoManancial;
	}

	public String getNomeManancial() {
		return this.nomeManancial;
	}

	public void setNomeManancial(String nomeManancial) {
		this.nomeManancial = nomeManancial;
	}

}