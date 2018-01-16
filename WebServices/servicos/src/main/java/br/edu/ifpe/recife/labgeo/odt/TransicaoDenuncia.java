package br.edu.ifpe.recife.labgeo.odt;

public class TransicaoDenuncia {

	private Integer id;
	private Integer novoStatus;
	private Integer statusAtual;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getNovoStatus() {
		return novoStatus;
	}
	
	public void setNovoStatus(Integer novoStatus) {
		this.novoStatus = novoStatus;
	}
	
	public Integer getStatusAtual() {
		return statusAtual;
	}
	
	public void setStatusAtual(Integer statusAtual) {
		this.statusAtual = statusAtual;
	}

}
