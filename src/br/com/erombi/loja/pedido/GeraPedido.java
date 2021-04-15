package br.com.erombi.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {
	
	private BigDecimal valorOrcamento;
	private String cliente;
	private int quantidadeItens ;
	
	public GeraPedido(BigDecimal valorOrcamento, String cliente, int quantidadeItens) {
		this.valorOrcamento = valorOrcamento;
		this.cliente = cliente;
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
	
}
