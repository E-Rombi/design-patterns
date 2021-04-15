package br.com.erombi.loja.pedido.acao;

import br.com.erombi.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executar(Pedido pedido) {
		System.out.println("Enviar email");
	}
	
}
