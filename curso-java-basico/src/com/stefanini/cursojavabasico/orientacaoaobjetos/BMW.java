package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class BMW extends Carro {

	public BMW() {
		this.setMarca("BMW");
	}
	
	@Override
	public String acelerar() {
		return "A BMW pode fazer de 0 a " + this.getVelocidade() + " em 5s";
	}
	
}
