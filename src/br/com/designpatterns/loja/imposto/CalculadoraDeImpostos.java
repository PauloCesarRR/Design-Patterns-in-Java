package br.com.designpatterns.loja.imposto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}
}
