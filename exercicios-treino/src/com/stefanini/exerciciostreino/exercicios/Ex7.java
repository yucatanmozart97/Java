package com.stefanini.exerciciostreino.exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args){
		/*2) Fazer uma classe Ex2Sorteio para:
			• Sortear um número de 0 a 1000 (dica: usar Math.random())
			• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
			menor do que o número sorteado.
			• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
			quantas tentativas ele acertou. */
		
		int numeroAleatorio = (int)(Math.random() * 1000);
		int contador = 1;
		int acertou = 0;
		int palpiteUsuario;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um numero entre 0 a 1000");
		palpiteUsuario = entrada.nextInt();
		
		for (;acertou < 1;) {
			if (palpiteUsuario == numeroAleatorio) {
				  System.out.println("Voce acertou em " + contador + " tentativas");
				  acertou = 1;
			} else if(palpiteUsuario > numeroAleatorio) {
				 System.out.println("Palpite maior do que numero sorteado");
			} else {
				System.out.println("Palpite menor do que o numero sorteado");
			}
			System.out.println("Escolha outro numero entre 0 a 1000");
			palpiteUsuario = entrada.nextInt();
			contador++;
		}
		
		
		
	}
	
}
