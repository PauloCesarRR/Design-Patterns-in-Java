package br.com.designpatterns.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.designpatterns.loja.pedido.GeraPedido;
import br.com.designpatterns.loja.pedido.GeraPedidoHandler;
import br.com.designpatterns.loja.pedido.acoes.EnviarEmailPedido;
import br.com.designpatterns.loja.pedido.acoes.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarEmailPedido(),
				new SalvarPedidoNoBancoDeDados()));
		handler.execute(gerador);
	}
	
}
