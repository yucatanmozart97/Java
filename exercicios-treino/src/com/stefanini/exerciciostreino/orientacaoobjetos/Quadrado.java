package com.stefanini.exerciciostreino.orientacaoobjetos;

public class Quadrado extends Figura{

	private double lado;
	
	public Quadrado(){
		
	}
	
	public Quadrado(double lado, String cor){
		this.lado = lado;
		setCor(cor);
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	

	@Override
	public String getCor() {
		// TODO Auto-generated method stub
		return super.getCor();
	}
	
	@Override
	public void setCor(String cor) {
		// TODO Auto-generated method stub
		super.setCor(cor);
	}
	
}
