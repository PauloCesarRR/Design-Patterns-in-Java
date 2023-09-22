package br.com.designpatterns.loja.desconto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoMaiorQueCincoItens(
				new DescontoValorMaiorQue500(
						new SemDesconto()
				)
		);
		
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
