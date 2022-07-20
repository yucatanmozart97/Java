package com.stefanini.orientacaoaobjetos;

public class Tesla extends Carro {

	private boolean dirigeSozinho;
	
	public Tesla(){
		super();
	}
	@Override
	double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla Sobrescrita");
		return velocidadeFinal * tempoFinal;
	}
	
	
	public boolean isDirigeSozinho() {
		return this.dirigeSozinho;
	}
	
	public void setDirigeSozinho(boolean dirigeSozinho){
		this.dirigeSozinho = dirigeSozinho;
	}
	
	@Override
	public void piscarAlertar() {
		System.out.println("Tesla piscando alerta...");
		
	}
	
}
