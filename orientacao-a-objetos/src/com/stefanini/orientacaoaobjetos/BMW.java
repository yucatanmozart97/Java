package com.stefanini.orientacaoaobjetos;

public class BMW extends Carro implements Conversivel, Utilitario {
	 
	public BMW() {
		super();
	}

	@Override
	double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Sobrescrita");
		return velocidadeFinal / tempoFinal;
	}
	
	@Override
	public void piscarAlertar() {
	System.out.println("bMW piscando alerta...");	
	}
	
	@Override
	public void acionarTurbo() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}
	
}
