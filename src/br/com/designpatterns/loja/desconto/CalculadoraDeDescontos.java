package br.com.designpatterns.loja.desconto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal desconto = new DescontoMaiorQueCincoItens().calcular(orcamento);
		if (desconto == BigDecimal.ZERO) {
			desconto = new DescontoValorMaiorQue500().calcular(orcamento);
		}
		return BigDecimal.ZERO;

	}
}
