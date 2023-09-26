package br.com.designpatterns.loja;

import java.math.BigDecimal;

import br.com.designpatterns.loja.imposto.CalculadoraDeImpostos;
import br.com.designpatterns.loja.imposto.ICMS;
import br.com.designpatterns.loja.imposto.ISS;
import br.com.designpatterns.loja.orcamento.Orcamento;

public class TesteImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 10);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
		
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));

	}
}
