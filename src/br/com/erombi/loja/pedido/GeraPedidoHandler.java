package br.com.erombi.loja.pedido;

import java.time.Instant;
import java.util.List;

import br.com.erombi.loja.orcamento.Orcamento;
import br.com.erombi.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());		
		Pedido pedido = new Pedido(dados.getCliente(), Instant.now(), orcamento);
		
		acoes.forEach(a -> a.executar(pedido));
		
	}
}
