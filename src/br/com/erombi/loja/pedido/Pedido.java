package br.com.erombi.loja.pedido;

import java.time.Instant;

import br.com.erombi.loja.orcamento.Orcamento;

public class Pedido {
	
	private String cliente;
	private Instant data;
	private Orcamento orcamento;
	
	public Pedido(String cliente, Instant data, Orcamento orcamento) {
		this.cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public Instant getData() {
		return data;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}
	
	
	
}
