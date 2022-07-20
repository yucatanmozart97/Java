package com.stefanini.exerciciostreino.orientacaoobjetos;

public class Executor {

	public static void main(String[] args){
		Circulo circulo1 = new Circulo(2, "azul");
		
		System.out.println(circulo1.getRaio());
		System.out.println(circulo1.getCor());
		System.out.println(circulo1.getArea());
		
		System.out.println(circulo1.toString());
		
		
		Retangulo retangulo1 = new Retangulo(5, 10, "verde");
		Retangulo retangulo2 = new Retangulo(10, 20, "azul");
		
		System.out.println(retangulo1.toString());
		System.out.println(retangulo2.toString());
		
		
		
		Triangulo triangulo1 = new Triangulo(5, 10, "amarelo");
		
		System.out.println(triangulo1.toString());
		
		System.out.println(circulo1);
	}
	
	
}
