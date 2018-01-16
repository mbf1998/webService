package br.edu.ifpe.recife.labgeo.odt;

import java.util.Date;

import br.edu.ifpe.recife.labgeo.domain.StatusDenuncia;

public class DenunciaDTO {

	private Integer id;
	private String detalhe;
	
	private StatusDenuncia statusDenuncia;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDetalhe() {
		return detalhe;
	}
	
	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	
	
	
	public StatusDenuncia getStatusDenuncia() {
		return statusDenuncia;
	}
	
	public void setStatusDenuncia(StatusDenuncia statusDenuncia) {
		this.statusDenuncia = statusDenuncia;
	}
	
	

}
