package com.stefanini.exerciciostreino.orientacaoobjetos2;

public class Onibus extends Veiculo{

	private int assentos;
	
	public Onibus(){
		
	}
	
	public Onibus(String placa, int ano, int assentos){
		super(placa, ano);
		this.assentos = assentos;
	}
	
	public int getAssentos(){
		return this.assentos;
	}
	
	public void setAssentos(int assentos){
		this.assentos = assentos;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Placa do veiculo: " + super.getPlaca() + " ,e foi fabricado em: " + super.getAno() + " , e tem " + assentos + " assentos");
	}
	
}
