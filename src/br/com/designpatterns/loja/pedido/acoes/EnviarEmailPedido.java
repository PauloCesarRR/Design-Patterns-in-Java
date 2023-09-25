package br.com.designpatterns.loja.pedido.acoes;

import br.com.designpatterns.loja.pedido.AcaoAposGerarPedido;
import br.com.designpatterns.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando e-mail com dados de pedido");
	}
}
