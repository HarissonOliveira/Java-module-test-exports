package br.com.harisson.app.calculo;

import br.com.harisson.app.calculo.interno.OperacoesAritmeticas;
import br.com.harisson.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}