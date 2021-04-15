package br.com.erombi.loja.imposto;

import java.math.BigDecimal;

import br.com.erombi.loja.orcamento.Orcamento;

public interface Imposto {
	
	
	BigDecimal calcular(Orcamento orcamento);

}
