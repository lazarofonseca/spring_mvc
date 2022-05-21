package com.devlazaro.cobranca.model.enun;

public enum StatusTitulo {
	
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private String descricao;
	
	private StatusTitulo(String decricao) {
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
