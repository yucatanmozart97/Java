package com.stefanini.exerciciostreino.exercicios;

import java.util.Scanner;
import java.lang.*;

public class Ex8 {

	/*4) Fazer um programa para medir os reflexos do usu�rio. O programa deve:
		� Mostrar a palavra �Agora!� ap�s um tempo aleat�rio e um n�mero,
		tamb�m aleat�rio
		� Contar o tempo at� que o usu�rio digite o n�mero pedido e mostrar esse
		tempo. */
	
	public static void main(String[] args) throws InterruptedException{
		int tempoInicio = (int)(Math.random()* 9) + 1;
		int numeroParaUsuario = (int)(Math.random() * 1000);
		int numeroDigitado;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = tempoInicio; i >= 0; i--) {
			Thread.sleep(1000);
			if (i == 0) {
				System.out.println("Now");	
			}else {
			System.out.println(i);}
		}
		System.out.println("Digite este numero: " + numeroParaUsuario);
		double inicioDigitacao = System.nanoTime();
		numeroDigitado = entrada.nextInt();
		if (numeroDigitado == numeroParaUsuario) {
			double fimDigitacao = System.nanoTime();
			double tempoNanoSegundos = fimDigitacao - inicioDigitacao;
			double tempoSegundos = tempoNanoSegundos / 1000000000;
			System.out.printf("Voce demorou " + "%.2f" + " segundos para digitar %n", (tempoSegundos));
		} else {
			System.out.println("Tente nao querer fazer em 0 segundos rsrs");	
		}
		
     		
	}
	
	
}
