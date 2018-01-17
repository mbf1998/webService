package br.edu.ifpe.recife.labgeo.odt;

import br.edu.ifpe.recife.labgeo.domain.StatusDenuncia;

public class DenunciaDTO {

	private Integer id;
	private String detalhe;
	private String tit; //titulo
	
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
	
	public String gettitulo() {
		return tit;
	}
	public void settitulo(String tit) {
		this.tit = tit;
	}
	
	
	public StatusDenuncia getStatusDenuncia() {
		return statusDenuncia;
	}
	
	public void setStatusDenuncia(StatusDenuncia statusDenuncia) {
		this.statusDenuncia = statusDenuncia;
	}
	
	

}
