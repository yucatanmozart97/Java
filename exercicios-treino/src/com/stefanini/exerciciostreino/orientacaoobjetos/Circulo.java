package com.stefanini.exerciciostreino.orientacaoobjetos;

public class Circulo extends Figura{

	private double raio;
	
	public Circulo(){
		
	}
	
	public Circulo(double raio, String cor){
		this.raio = raio;
		this.setCor(cor);
	}
	
	public double getRaio(){
		return this.raio;
	}
	
	public void setRaio(double raio){
		this.raio = raio;
	}
	
	
	double getArea() {
		return raio * 3.14 * 2;
	}
	
	double getDiametro() {
		return this.getRaio() * 2; 
	}
	
	
	@Override
	public String getCor() {
		return super.getCor();
	}
	
	@Override
	public void setCor(String cor) {
		super.setCor(cor);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circulo [raio= " + raio + " ,cor= " + super.getCor() + "]";
	}
	
}
