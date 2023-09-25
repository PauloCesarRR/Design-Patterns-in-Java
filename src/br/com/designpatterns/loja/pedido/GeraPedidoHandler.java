package br.com.designpatterns.loja.pedido;

import java.time.LocalDateTime;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	public void execute(GeraPedido dados) {
		
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
	}
	
}
