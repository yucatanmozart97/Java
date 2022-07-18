package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Mercedes extends Carro {

	public Mercedes() {
		this.setMarca("Mercedes");
	}
	
	@Override
	public String acelerar() {
		return "A mercedes pode fazer de 0 a " + this.getVelocidade() + " em 3s";
	}
}
