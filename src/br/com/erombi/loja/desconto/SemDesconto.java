package br.com.erombi.loja.desconto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
