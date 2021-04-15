package br.com.erombi.loja.desconto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public class DescontoMaisDeCincoItens extends Desconto {

	public DescontoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
