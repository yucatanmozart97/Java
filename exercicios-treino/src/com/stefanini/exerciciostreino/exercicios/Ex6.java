package com.stefanini.exerciciostreino.exercicios;

import java.util.Scanner;



public class Ex6 {

	/*1) Fazer uma classe Ex1Primos para:
		• Receber um inteiro N do usuário
		• Testar se este inteiro é primo ou não e informar 
	*/
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		int numeroEscolhido;
		int primo = 0;
		
		System.out.println("Digite um numero inteiro: ");
		numeroEscolhido = entrada.nextInt();
		
	for (int i = 1; i <= numeroEscolhido; i++) {
		if (numeroEscolhido % i == 0) {
			primo++;
		}
	}
	if (primo == 2) {
		System.out.println("Numero primo");
	} else {
		System.out.println("Numero nao eh primo");
	}
primo = 0;
		
	}	
	
}
