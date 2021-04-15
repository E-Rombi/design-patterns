package br.com.erombi.loja;

import java.math.BigDecimal;

import br.com.erombi.loja.imposto.CalculadoraDeImposto;
import br.com.erombi.loja.imposto.ICMS;
import br.com.erombi.loja.imposto.ISS;
import br.com.erombi.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);		
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		System.out.println(calculadoraDeImposto.valorImposto(orcamento, new ICMS()));
		System.out.println(calculadoraDeImposto.valorImposto(orcamento, new ISS()));
		
		
	}

}
