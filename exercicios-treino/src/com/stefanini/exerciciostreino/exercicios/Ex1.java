package com.stefanini.exerciciostreino.exercicios;

/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.*/

public class Ex1 {
	static int dias(int anos, int meses, int dias){
		return (anos * 365) + (meses * 30) + dias;
	}
	

	public static void main(String[] args){
   System.out.println(dias(24, 2, 15) + " dias");		
		
	}
	
}

