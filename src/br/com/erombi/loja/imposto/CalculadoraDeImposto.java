package br.com.erombi.loja.imposto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public class CalculadoraDeImposto {

	public BigDecimal valorImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
	
}
