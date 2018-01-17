package br.edu.ifpe.recife.labgeo.repository;

public interface DenunciaView {
	
	Integer getGdbArchiveOid();
	String  gettitulo();
	String  getDescricao();
	Integer getStatus();
	String  getEndereco();
}
