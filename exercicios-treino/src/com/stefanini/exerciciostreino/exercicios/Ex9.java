package com.stefanini.exerciciostreino.exercicios;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Ex9 {

	/*Faça um programa que receba um nome completo na forma de uma String e
	mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
	menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
	Almeida Prado. Abreviatura: P. J. de A. P. */
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = entrada.nextLine();
		
		String[] nomeSeparado = nomeCompleto.split("\\s+");
		
		System.out.println(nomeSeparado);
	
		
		for (int i = 0; i < nomeSeparado.length; i++) {
			if (nomeSeparado[i].length() == 2) {
				nomeSeparado[i] = nomeSeparado[i].toLowerCase();
				System.out.print(nomeSeparado[i] + " ");
			} else {
				nomeSeparado[i] = nomeSeparado[i].toUpperCase();
				System.out.print(nomeSeparado[i].charAt(0) + ". ");
			}
		}
		
		
	}
	
}
