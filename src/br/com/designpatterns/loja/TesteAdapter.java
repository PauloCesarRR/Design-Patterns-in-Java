package br.com.designpatterns.loja;

import java.math.BigDecimal;

import br.com.designpatterns.loja.http.JavaHttpClient;
import br.com.designpatterns.loja.orcamento.Orcamento;
import br.com.designpatterns.loja.orcamento.RegistrarOrcamento;

public class TesteAdapter {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("500"), 10);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistrarOrcamento registroOrcamento = new RegistrarOrcamento(new JavaHttpClient());
		registroOrcamento.registrar(orcamento);
	}	
}
