package br.edu.ifpe.recife.labgeo.domain;

public enum StatusDenuncia {
	ANALISAR(1), INVALIDAR(2), EXECUTAR(3), REANALIZAR(4), CANCELAR(5), SUSPENDER(6), CONCLUIR(7), REANALISAR(8), REEXECUTAR(9);
	
	private final int valor;

	StatusDenuncia(int valor) {
		this.valor = valor;
    }

    public int valor() {
        return valor;
    }
}
