package com.stefanini.exerciciostreino.orientacaoobjetos;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public Triangulo() {
		
	}
	
	public Triangulo(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.setCor(cor);
	}
	
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getArea() {
		return (this.base * this.altura) / 2;
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
		return "Triangulo [base= " + base + " ,altura= " + altura + " ,cor= " + super.getCor() + "]";
	}
	
}
