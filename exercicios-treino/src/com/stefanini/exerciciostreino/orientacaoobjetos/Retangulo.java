package com.stefanini.exerciciostreino.orientacaoobjetos;

public class Retangulo extends Figura{

	private double lado1;
	private double lado2;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double lado1, double lado2, String cor) {
	this.lado1 = lado1;
	this.lado2 = lado2;
	setCor(cor);
	}
	
	public double getLado1() {
		return this.lado1;
	}
	
	public void setLado1(double lado1){
		this.lado1 = lado1;
	}
	
	public double getLado2() {
		return this.lado2;
	}
	
	public void setLado2(double lado2){
		this.lado2 = lado2;
	}
	
	public double getArea() {
		return this.lado1 * this.lado2;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Retangulo [lado1= " + lado1 + " ,lado2= " + lado2 + " ,cor= " + super.getCor() + "]";
	}
}
