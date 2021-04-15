package br.com.erombi.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.erombi.loja.pedido.GeraPedido;
import br.com.erombi.loja.pedido.GeraPedidoHandler;
import br.com.erombi.loja.pedido.acao.EnviarEmailPedido;
import br.com.erombi.loja.pedido.acao.SalvarPedidoBD;

public class TestesPedidos {

	public static void main(String[] args) {
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido geraPedido = new GeraPedido(valorOrcamento, cliente, quantidadeItens);
		 new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBD(), new EnviarEmailPedido())).executa(geraPedido);
		
	}
}
