package br.com.erombi.loja.desconto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisDeCincoItens(new DescontoValorMaiorQueQuinhentos(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
