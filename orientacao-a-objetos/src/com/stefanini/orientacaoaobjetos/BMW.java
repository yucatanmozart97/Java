package com.stefanini.orientacaoaobjetos;

public class BMW extends Carro {
	 
	public BMW() {
		super();
	} 

	@Override
	double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Sobrescrita");
		return velocidadeFinal / tempoFinal;
	}
	
}
