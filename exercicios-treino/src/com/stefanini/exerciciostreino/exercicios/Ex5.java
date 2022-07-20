package com.stefanini.exerciciostreino.exercicios;

/*5. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.*/

public class Ex5 {

	public static int numeroEscolhido(int a) {
	   int numeros[] = new int[] {a - 1, a + 1};
	 for (int numero : numeros) {
		 System.out.println(numero);
	 }
	 return a;
	}
	
	public static void main(String[] args){
		
		
		System.out.println("Numero escolhido " + numeroEscolhido(13));
	}
	
}
