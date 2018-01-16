package br.edu.ifpe.recife.labgeo.util;

import java.io.Serializable;

public class Mensagem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5469866276187815794L;
	public String mensagem;

	public Mensagem(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
}