package br.com.erombi.loja;

import java.math.BigDecimal;

import br.com.erombi.loja.desconto.CalculadoraDeDesconto;
import br.com.erombi.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);		
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);		
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		
		System.out.println(calculadoraDeDesconto.calcular(orcamento));
		System.out.println(calculadoraDeDesconto.calcular(orcamento2));
	}

}
