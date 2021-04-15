package br.com.erombi.loja.pedido.acao;

import br.com.erombi.loja.pedido.Pedido;

public class SalvarPedidoBD implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Salvar no banco de dados");
	}
}
