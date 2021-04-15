package br.com.erombi.loja.desconto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		return (deveAplicar(orcamento)) ? efetuarCalculo(orcamento) : proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract Boolean    deveAplicar   (Orcamento orcamento);
	
}
