package com.stefanini.cursojavabasico.vetor;

public class Vetor {

	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas[0] = 1;
		notas[1] = 2;
		notas[2] = 3;
		notas[3] = 4;
		notas[4] = 5;
		notas[9] = 10;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		String[] testes = new String[] {"Testando1", "Testando2", "Testando3", "Testando4"};
		
		for (String teste : testes) {
			System.out.println(teste);
		}
	}
}
