package br.com.designpatterns.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {
	
	public BigDecimal  calcularDescontoExtra(Orcamento orcamento) {
		 return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
