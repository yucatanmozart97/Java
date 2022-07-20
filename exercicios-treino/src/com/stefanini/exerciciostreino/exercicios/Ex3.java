package com.stefanini.exerciciostreino.exercicios;

/*3. Informar um saldo e imprimir o saldo com reajuste de 1%.*/



public class Ex3 {

	static double reajusteSaldo(double saldo){
		return saldo * 0.99; 
	}
	
	public static void main(String[] args){
		
		System.out.println(reajusteSaldo(1000000));
	}
	
}
