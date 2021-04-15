package br.com.erombi.loja.desconto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public class DescontoValorMaiorQueQuinhentos extends Desconto {

	public DescontoValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.15"));
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return (orcamento.getValor().compareTo(new BigDecimal(500.0)) > 0);
	}
}
