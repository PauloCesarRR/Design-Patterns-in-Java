package br.com.designpatterns.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
	
}
