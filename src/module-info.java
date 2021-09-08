module app.calculo {
	requires transitive app.logging;
	exports br.com.harisson.app.calculo;
	
	exports br.com.harisson.app.calculo.interno
		to app.financeiro;
}