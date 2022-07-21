package com.stefanini.exerciciostreino.exercicios;

import java.util.Scanner;

public class Ex10 {

	/*Fazer um programa que receba uma string do usuário e mostre o conteúdo desta
	string de forma invertida.*/ 
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String textoUsuario;
		System.out.println("Insira um texto:");
		textoUsuario = entrada.nextLine();
		
		for (int i = textoUsuario.length(); i > 0; i-- ) {
			System.out.print(textoUsuario.charAt(i - 1));
		}
		
	}
	
}
