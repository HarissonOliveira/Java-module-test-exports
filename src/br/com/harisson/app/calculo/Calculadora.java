package br.com.harisson.app.calculo;

import br.com.harisson.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
	
}