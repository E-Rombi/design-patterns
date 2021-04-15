package br.com.erombi.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new IllegalArgumentException("Orçamento nao pode ser Aprovado !");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new IllegalArgumentException("Orçamento nao pode ser Aprovado !");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new IllegalArgumentException("Orçamento nao pode ser Finalizado !");
	}
}
