package br.com.designpatterns.loja.imposto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public interface ITipoImposto {
	BigDecimal calcular(Orcamento orcamento);
}
