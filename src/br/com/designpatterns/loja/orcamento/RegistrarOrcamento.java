package br.com.designpatterns.loja.orcamento;

import java.util.Map;

import br.com.designpatterns.loja.DomainException;
import br.com.designpatterns.loja.http.HttpAdapter;

public class RegistrarOrcamento {
	
	private HttpAdapter http;
		
	public RegistrarOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if (orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado!");
		}
		
		String url = "http//api.externa/orcamento";
		Map<String, Object> dados = Map.of(
		                              "valor", orcamento.getValor(),
		                              "quantidadeItens", orcamento.getQuantidadeItens()
		                              );
		http.post(url, dados);
	}
}
